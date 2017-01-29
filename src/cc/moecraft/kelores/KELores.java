package cc.moecraft.kelores;

/**
 * @author Kilpikonna
 */
import cc.moecraft.kelores.API.ActionBar;
import static cc.moecraft.kelores.Config.Loader.ConfigLoader.loadConfig;
import static cc.moecraft.kelores.Config.Saver.ConfigSaver.checkConfig;
import cc.moecraft.kelores.Items.Methods;
import static cc.moecraft.kelores.Items.Methods.giveItem;
import static cc.moecraft.kelores.Libs.ConfigLoadingLibs.Log_LoadConfig_Done;
import static cc.moecraft.kelores.Libs.ConfigLoadingLibs.Log_SaveConfig_Done;
import static cc.moecraft.kelores.MessageLogger.log;
import static cc.moecraft.kelores.MessageLogger.logC;
import static cc.moecraft.kelores.Setup.setup.setup;
import cc.moecraft.kelores.eventsListeners.BlockBreakListener;
import cc.moecraft.kelores.eventsListeners.EntityDamageByEntityListener;
import cc.moecraft.kelores.eventsListeners.PlayerInteractListener;
import cc.moecraft.kelores.eventsListeners.ProjectileHitListener;
import java.util.ArrayList;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.inventivetalent.rpapi.ResourcePackStatusEvent;
import org.inventivetalent.rpapi.Status;
import org.inventivetalent.rpapi.ResourcePackAPI;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class KELores extends JavaPlugin implements Listener
{  
    //物品 (ItemStack)
    public static ItemStack tpBow, swichBow, lightBow, bigPickaxe, eBow, nWater;
    //物品Lore (ArrayList)
    public static ArrayList<String> tpLore = new ArrayList(), swichLore = new ArrayList(), lightLore = new ArrayList(), bpLore = new ArrayList(), eLore = new ArrayList(), nLore = new ArrayList();
    //世界 (List<String>)
    public static List<String> tpWorlds, swichWorlds, lightWorlds, bpWorlds, eWorlds, nWorlds;
    //是否启用物品 (boolean)
    public static boolean enabletb, enablelb, enablesb, enablebp, enablee, enablen;
    //是否启用物品材质 (boolean)
    public static boolean tprp, swichrp, lightrp, bprp, erp, nrp;
    //物品名 (String)
    public static String tpName, swichName, lightName, bpName, eName, nName;
    //物品Material名字 (String)
    public static String tpMaterial, swichMaterial, lightMaterial, bpMaterial, eMaterial, nMaterial;
    //物品合成表 (KERecipe)
    public static KERecipe tpr, swichr, lightr, bpr, er, nr;
    //是否启用物品合成表 (boolean)
    public static boolean tper, swicher, lighter, bper, eer, ner;
    
    //最大高度和最小高度 (int)
    public static int tpMinY, swichMinY, lightMinY, bpMinY, eMinY, nMinY;
    public static int tpMaxY, swichMaxY, lightMaxY, bpMaxY, eMaxY, nMaxY;
    
    
    //BigPickaxe
        //BigPickaxe专属的一些开关 (boolean)
        public static boolean bpbedr, bpbarr, bpop;
        //BigPickaxe专属的一些值 (int)
        public static int bpRadius, bpopr, bpWastDurability;
    
    //EB和LB
        //EB和LB专属的一些开关 (boolean)
        public static boolean realLightning, realExplosion, setFire;
        //EB爆炸威力 (List<Float>)
        public static List<Float> ePower = new ArrayList<>();
        //EB轴偏移 (int)
        public static int exOffset, eyOffset, ezOffset;
        public static int lxOffset, lyOffset, lzOffset;
        
    //地狱水和超级水
        //地狱水 - 是否只允许地狱放水
        public static boolean nOnlyNether;
    
    //配置文件版本 (String)
    public static String ConfigVersion = "0.4.1t1";
    //消息 (ArrayList<String>[])
    public static ArrayList<String>[] ConfigedMessages;
    //是否启用默认帮助消息 (boolean)
    public static boolean useDefaultHelpMessages;
    
    //是否启用ResourcePackAPI (boolean)
    public static boolean rpapi = false, rpenable;
    //ResourcePackAPI的一些信息 (String)
    public static String rplink, rphash = "1", rpsMsg;
    //ResourcePackAPI的一些开关 (boolean)
    public static boolean kickIfFaildDownload, kickIfCancelledDownload;
    //ResourcePackAPI的一些消息 (String)
    public static String rpkMsgFailed, rpkMsgCancelled;
    
    //权限 (String) [其实这个是用不到的..............
    public static String permission;
    
    public static KELores instance = null;
    public static boolean debug = false;
    
    //是否启用双持 (boolean)
    public static boolean MultiHand;
    
    public static Plugin plugin;
//    org.bukkit.inventory.ItemStack aa = new org.bukkit.inventory.ItemStack(Material.WOOD_HOE, 1, (short)24);
    @Override
    public void onEnable()
    {
        getConfig().options().copyDefaults(true);
        saveConfig();
        
        instance = this;
        
        //Command a = this.getCommand("kel");
        //a.tabComplete(cs, tplore);
        debug = getConfig().getBoolean("DebugMode");
        
        checkConfig();
        saveConfig();
            logC(Log_SaveConfig_Done);
        loadConfig();
            logC(Log_LoadConfig_Done);
        
        if (rpenable && Bukkit.getServer().getPluginManager().getPlugin("ResourcePackApi") != null)
        {
            rpapi = true;
            log("检测到ResourcesPackAPI");
        }
        
        getServer().getPluginManager().registerEvents(this, this);
        
        setup();
        log("所有配置加载完成!");

        saveConfig();
        log("加载完成,插件作者: kilpikonna");
    }
    
    @Override
    public void onDisable()
    {
        log("卸载完成,插件作者: kilpikonna");
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if (cmd.getName().equalsIgnoreCase("kel"))
        {
            if (sender instanceof Player)
            {
                Player s = (Player) sender;
                if (sender.hasPermission(perm.cmd))
                {
                    if (args.length < 1)
                    {
                        Message.helpMsg(s);
                        return true;
                    }
                    if (args.length == 1)
                    {
                        if (args[0].equalsIgnoreCase("reload"))
                        {
                            PluginUtil.reload(Bukkit.getPluginManager().getPlugin("KELores"));
                            Message.reloadSuccessMsg(s);
                        } else {
                            Message.helpMsg(s);
                        }
                    } 
                    else if (args.length == 2)
                    {
                        if (args[0].equalsIgnoreCase("give"))
                        {
                            giveItem(s.getName(), s, args[1]);
                            return true;
                        } else {
                            Message.helpMsg(s);
                            return true;
                        }
                    }
                    if (args.length == 3)
                    {
                        if (args[0].equalsIgnoreCase("give"))
                        {
                            Player g = getServer().getPlayer(args[2]);
                            if(g != null)
                            {
                                giveItem(s.getName(), g, args[1]);
                            } else {
                                Message.noPlayerMsg(s);
                                return true;
                            }
                        } else {
                            Message.helpMsg(s);
                            return true;
                        }
                    }
                    if (args.length > 3)
                    {
                        Message.helpMsg(s);
                    }
                } else {
                    Message.noPermMsg(s, perm.cmd);
                    return true;
                }
            } else {
                if (args.length < 3)
                {
                    Message.helpConsole();
                    return true;
                }
                if (args.length == 3)
                {
                    if (args[0].equalsIgnoreCase("give"))
                    {
                        Player g = getServer().getPlayer(args[2]);
                        if(g != null)
                        {
                            Methods.giveItem("console", g, args[1]);
                        } else {
                            
                            Message.noPlayerConsole();
                        }
                    } else {
                        Message.helpConsole();
                    }
                }
            }
        }
        return true;
    }
    
    public static final List<playEffects> effects = new ArrayList();
    public static List<playEffects> getActiveEffects()
    {
        return effects;
    }
    
    @EventHandler
    public void SwichBowEventListener(EntityDamageByEntityEvent e)
    {
        EntityDamageByEntityListener.SwichBowEventRunner(e);
    }
    @EventHandler
    public void onBlockBreakListener(BlockBreakEvent e)
    {
        BlockBreakListener.onBlockBreakRunner(e);
    }
    @EventHandler
    public void TpLbBowEventListener(ProjectileHitEvent e)
    {
        ProjectileHitListener.TpLbBowEvent(e);
    }
    @EventHandler
    public void PlayerInteractEventListener(PlayerInteractEvent e)
    {
        PlayerInteractListener.PlayerInteractListener(e);
    }
    @EventHandler
    public void setResourcePack(PlayerJoinEvent e)
    {
        if (rpenable)
        {
            ResourcePackAPI.setResourcepack(e.getPlayer(), rplink, rphash);
        }
    }
    @EventHandler
    public void detectRP(ResourcePackStatusEvent e)
    {
        if (rpenable)
        {
            Player p = e.getPlayer();
            if (e.getStatus() == Status.SUCCESSFULLY_LOADED)
            {
                p.sendMessage(rpsMsg);
            }
            if (e.getStatus() == Status.DECLINED)
            {
                if (kickIfCancelledDownload){
                    p.kickPlayer(rpkMsgCancelled);
                }
            }
            if (e.getStatus() == Status.FAILED_DOWNLOAD)
            {
                if (kickIfFaildDownload){
                    p.kickPlayer(rpkMsgFailed);
                } else {

                }
            }
        }
    }
    
    public static KELores getInstance() {
        return instance;
    }
    
    private Map<UUID, Long> cooldowns = new HashMap();
    
    @EventHandler
    public void onMove(PlayerMoveEvent e)
    {
        if (this.cooldowns.get(e.getPlayer().getUniqueId()) != null)
        {
            if (!getTimeLeft(e.getPlayer()).equalsIgnoreCase("0"))
            {
                if (getConfig().getBoolean("use-ActionBarAPI")) 
                {
                    ActionBar.sendActionBar(e.getPlayer(), ChatColor.translateAlternateColorCodes('&', getConfig().getString("action-bar-message").replace("%time%", getTimeLeft(e.getPlayer()))));
                }
            }
        }
    }
    
    private String getTimeLeft(Player player)
    {
        long elapsed = System.currentTimeMillis() - (this.cooldowns.get(player.getUniqueId()));
        double timeLeft = getConfig().getInt("cooldown-seconds") - elapsed / 1000L;
        return timeLeft > 0.0D ? new DecimalFormat("##.#").format(timeLeft).replace("-", "") : "0";
    }
}
