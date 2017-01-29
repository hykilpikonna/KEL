package cc.moecraft.kelores;

import static cc.moecraft.kelores.KELores.useDefaultHelpMessages;
import static cc.moecraft.kelores.Libs.ConfigLoadingLibs.Detect_DefaultAuthor;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import pw.yumc.Yum.tellraw.FancyMessage;

/*
 * @author Kilpikonna
 */
public class Message {
    public static List<String> getDefaultMessage(String a)
    {
        List<String> b = configList();
        List<String> output = new ArrayList<String>();
        if (a.equals((String) b.get(0)))
        {
            output.add(ChatColor.GREEN + "---------------------------------------");
            output.add(ChatColor.DARK_AQUA + "/kel " + ChatColor.BLUE + "give " + ChatColor.GOLD + "[类型] " + ChatColor.YELLOW + "<玩家ID>");
            output.add(ChatColor.DARK_AQUA + "类型可以为" + ChatColor.GOLD + " tpbow, lightbow, swichbow, bigpickaxe");
            output.add(ChatColor.DARK_AQUA + "/kel" + ChatColor.BLUE + "reload");
            output.add(Detect_DefaultAuthor);
        } else if (a.equals((String) b.get(1))){
            output.add(ChatColor.GREEN + "成功");
        } else if (a.equals((String) b.get(2))){
            output.add(ChatColor.GREEN + "您成功获得一把" + "%s");
        } else if (a.equals((String) b.get(3))){
            output.add(ChatColor.RED + "未知玩家");
        } else if (a.equals((String) b.get(4))){
            output.add(ChatColor.RED + "缺少权限: " + "%s");
        } else if (a.equals((String) b.get(5))){
            output.add(ChatColor.GREEN + "重载成功");
        }
        if (output.isEmpty()){
            Bukkit.broadcastMessage("判定失败");
        }
        return output;
    }
    
    public static List<String> configList()
    {
        List<String> a = new ArrayList<String>();
        a.add("HelpMessage");
        a.add("SuccessMessage");
        a.add("ReceiveBowMessage");
        a.add("UnkownUsernameMessage");
        a.add("NoPermissionMessage");
        a.add("ReloadSuccessMessage");
        return a;
    }
    
    public static void helpMsg(Player p)
    {
        ArrayList<String> a = KELores.ConfigedMessages[0];
        int length = a.size();
        if (!useDefaultHelpMessages)
        {
            for (int i = 0; i < length; i++)
            {
                p.sendMessage((String) a.get(i));
            }
        } else {
            if (p.hasPermission(perm.help))
            {
                FancyMessage fm = FancyMessage.newFM(), fm1 = FancyMessage.newFM();
                p.sendMessage(ChatColor.GREEN + "---------------------------------------");
                p.sendMessage(ChatColor.DARK_AQUA + "/kel " + ChatColor.BLUE + "give " + ChatColor.GOLD + "[类型] " + ChatColor.YELLOW + "<玩家ID>");
                fm.text(ChatColor.DARK_AQUA + "类型可以为");
                fm.then(" ");
                fm.then("§7[§6TpBow§7]").command("/kel give tpbow");
                fm.then(" ");
                fm.then("§7[§6LightBow§7]").command("/kel give lightbow");
                fm.then(" ");
                fm.then("§7[§6SwichBow§7]").command("/kel give swichbow");
                fm.then(" ");
                fm.then("§7[§6BigPickaxe§7]").command("/kel give bigpickaxe");
                fm.then(" ");
                fm.then("§7[§6ExplosiveBow§7]").command("/kel give explosivebow");
                fm.then(" ");
                fm.then("§7[§6NetherWater§7]").command("/kel give netherwater");
                fm.send(p);
                fm1.text(ChatColor.DARK_AQUA + "/kel " + ChatColor.BLUE);
                fm1.then("§7[§6reload§7]").command("/kel reload");
                fm1.send(p);
                p.sendMessage(ChatColor.GRAY + "提示: 上面灰色中括号括起来的部分可以点哦!");
                p.sendMessage(ChatColor.GRAY + "插件作者: kilpikonna  (QQ: 871674895)");
            } else {
                noPermMsg(p, perm.help);
            }
        }
    }
    
    public static void sMsg(String s)
    {
        ArrayList<String> a = KELores.ConfigedMessages[1];
        int length = a.size();
        if (!s.equals("console"))
        {
            Player p = Bukkit.getPlayer(s);
            for (int i = 0; i < length; i++)
            {
                p.sendMessage((String) a.get(i));
            }
        } else {
            for (int i = 0; i < length; i++)
            {
                Bukkit.getConsoleSender().sendMessage((String) a.get(i));
            }
        }
    }
    
    public static void bowMsg(Player p, String bow)
    {
        ArrayList<String> a = KELores.ConfigedMessages[2];
        int length = a.size();
        String l = null;
        for (int i = 0; i < length; i++)
        {
            p.sendMessage(String.format((String) a.get(i), bow));
        }
    }
    
    public static void noPlayerMsg(Player p)
    {
        ArrayList<String> a = KELores.ConfigedMessages[3];
        int length = a.size();
        for (int i = 0; i < length; i++)
        {
            p.sendMessage((String) a.get(i));
        }
    }
    
    public static void noPlayerConsole()
    {
        ArrayList<String> a = KELores.ConfigedMessages[3];
        int length = a.size();
        for (int i = 0; i < length; i++)
        {
            Bukkit.getConsoleSender().sendMessage((String) a.get(i));
        }
    }
    
    public static void noPermMsg(Player p, String perm)
    {
        ArrayList<String> a = KELores.ConfigedMessages[4];
        int length = a.size();
        String l = null;
        for (int i = 0; i < length; i++)
        {
            p.sendMessage(String.format((String) a.get(i), perm));
        }
    }
    
    public static void helpConsole()
    {
        ArrayList<String> a = KELores.ConfigedMessages[0];
        int length = a.size();
        for (int i = 0; i < length; i++)
        {
            Bukkit.getConsoleSender().sendMessage((String) a.get(i));
        }
    }
    
    public static void reloadSuccessMsg(Player p)
    {
        ArrayList<String> a = KELores.ConfigedMessages[5];
        int length = a.size();
        for (int i = 0; i < length; i++)
        {
            p.sendMessage((String) a.get(i));
        }
    }
}
