/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc.moecraft.kelores.Config.Saver;

import static cc.moecraft.kelores.Libs.ConfigSaver_saveDefaultConfig_MessageLib.BigPickaxe_Lore;
import static cc.moecraft.kelores.Libs.ConfigSaver_saveDefaultConfig_MessageLib.BigPickaxe_Name;
import static cc.moecraft.kelores.Libs.ConfigSaver_saveDefaultConfig_MessageLib.ExplosiveBow_Lore;
import static cc.moecraft.kelores.Libs.ConfigSaver_saveDefaultConfig_MessageLib.ExplosiveBow_Name;
import static cc.moecraft.kelores.Libs.ConfigSaver_saveDefaultConfig_MessageLib.LightningBow_Lore;
import static cc.moecraft.kelores.Libs.ConfigSaver_saveDefaultConfig_MessageLib.LightningBow_Name;
import static cc.moecraft.kelores.Libs.ConfigSaver_saveDefaultConfig_MessageLib.Log_ActionBarAPI_Config_Save_Success_Message;
import static cc.moecraft.kelores.Libs.ConfigSaver_saveDefaultConfig_MessageLib.Log_All_Config_Save_Success_Message;
import static cc.moecraft.kelores.Libs.ConfigSaver_saveDefaultConfig_MessageLib.Log_BigPickaxe_Config_Save_Success_Message;
import static cc.moecraft.kelores.Libs.ConfigSaver_saveDefaultConfig_MessageLib.Log_Creating_Config_Message;
import static cc.moecraft.kelores.Libs.ConfigSaver_saveDefaultConfig_MessageLib.Log_ExplosiveBow_Config_Save_Success_Message;
import static cc.moecraft.kelores.Libs.ConfigSaver_saveDefaultConfig_MessageLib.Log_General_Config_Save_Success_Message;
import static cc.moecraft.kelores.Libs.ConfigSaver_saveDefaultConfig_MessageLib.Log_LightningBow_Config_Save_Success_Message;
import static cc.moecraft.kelores.Libs.ConfigSaver_saveDefaultConfig_MessageLib.Log_NetherWater_Config_Save_Success_Message;
import static cc.moecraft.kelores.Libs.ConfigSaver_saveDefaultConfig_MessageLib.Log_Permissions_Config_Save_Success_Message;
import static cc.moecraft.kelores.Libs.ConfigSaver_saveDefaultConfig_MessageLib.Log_ResourcePackAPI_Config_Save_Success_Message;
import static cc.moecraft.kelores.Libs.ConfigSaver_saveDefaultConfig_MessageLib.Log_SwichBow_Config_Save_Success_Message;
import static cc.moecraft.kelores.Libs.ConfigSaver_saveDefaultConfig_MessageLib.Log_TPBow_Config_Save_Success_Message;
import static cc.moecraft.kelores.Libs.ConfigSaver_saveDefaultConfig_MessageLib.NetherWater_Lore;
import static cc.moecraft.kelores.Libs.ConfigSaver_saveDefaultConfig_MessageLib.NetherWater_Name;
import static cc.moecraft.kelores.Libs.ConfigSaver_saveDefaultConfig_MessageLib.ResourcePackAPI_Link;
import static cc.moecraft.kelores.Libs.ConfigSaver_saveDefaultConfig_MessageLib.SwichBow_Lore;
import static cc.moecraft.kelores.Libs.ConfigSaver_saveDefaultConfig_MessageLib.SwichBow_Name;
import static cc.moecraft.kelores.Libs.ConfigSaver_saveDefaultConfig_MessageLib.TPBow_Lore;
import static cc.moecraft.kelores.Libs.ConfigSaver_saveDefaultConfig_MessageLib.TPBow_Name;
import static cc.moecraft.kelores.Config.Saver.saveDefaultMessages.saveDefaultMessages;
import static cc.moecraft.kelores.Config.Saver.saveWorlds.saveWorlds;
import cc.moecraft.kelores.KELores;
import static cc.moecraft.kelores.KELores.ConfigVersion;
import static cc.moecraft.kelores.MessageLogger.logC;
import static cc.moecraft.kelores.MessageLogger.logCA;
import static cc.moecraft.kelores.MessageLogger.logCI;
import static cc.moecraft.kelores.MessageLogger.logCP;
import static cc.moecraft.kelores.Setup.setupDefaultRecipe.setupDefaultRecipe;
import java.util.ArrayList;
import java.util.List;
import org.bukkit.ChatColor;

/**
 *
 * @author Kilpikonna
 */
public class saveDefaultConfig {
    public static void saveDefaultConfig()
    {
            logC(Log_Creating_Config_Message);
            KELores.getInstance().getConfig().addDefault("ConfigVersion", ConfigVersion);
            KELores.getInstance().getConfig().set("ConfigVersion", ConfigVersion);
            KELores.getInstance().getConfig().addDefault("DebugMode", false);
            
            KELores.getInstance().getConfig().addDefault("General.EnableMultiHand", true);
                logCI(Log_General_Config_Save_Success_Message);
                
            List<String> temp1 = new ArrayList();
            temp1.add(0, SwichBow_Lore);
            KELores.getInstance().getConfig().addDefault("Items.SwichBow.Lore", temp1);
            KELores.getInstance().getConfig().addDefault("Items.SwichBow.DisplayName", SwichBow_Name);
            KELores.getInstance().getConfig().addDefault("Items.SwichBow.Enable", true);
            KELores.getInstance().getConfig().addDefault("Items.SwichBow.Resource", true);
            KELores.getInstance().getConfig().addDefault("Items.SwichBow.Material", "BOW");
            KELores.getInstance().getConfig().addDefault("Items.SwichBow.Recipe.Enable", true);
                logCI(Log_SwichBow_Config_Save_Success_Message);
            
            List<String> temp2 = new ArrayList();
            temp2.add(0, TPBow_Lore);
            KELores.getInstance().getConfig().addDefault("Items.TpBow.Lore", temp2);
            KELores.getInstance().getConfig().addDefault("Items.TpBow.DisplayName", TPBow_Name);
            KELores.getInstance().getConfig().addDefault("Items.TpBow.Enable", true);
            KELores.getInstance().getConfig().addDefault("Items.TpBow.Resource", true);
            KELores.getInstance().getConfig().addDefault("Items.TpBow.Material", "BOW");
            KELores.getInstance().getConfig().addDefault("Items.TpBow.Recipe.Enable", true);
                logCI(Log_TPBow_Config_Save_Success_Message);
            
            List<String> temp3 = new ArrayList();
            temp3.add(0, LightningBow_Lore);
            KELores.getInstance().getConfig().addDefault("Items.LightningBow.Lore", temp3);
            KELores.getInstance().getConfig().addDefault("Items.LightningBow.DisplayName", LightningBow_Name);
            KELores.getInstance().getConfig().addDefault("Items.LightningBow.Enable", true);
            KELores.getInstance().getConfig().addDefault("Items.LightningBow.Resource", true);
            KELores.getInstance().getConfig().addDefault("Items.LightningBow.Material", "BOW");
            KELores.getInstance().getConfig().addDefault("Items.LightningBow.Lightning.RealLightning", false);
            KELores.getInstance().getConfig().addDefault("Items.LightningBow.Lightning.X-Offset", 0);
            KELores.getInstance().getConfig().addDefault("Items.LightningBow.Lightning.Y-Offset", 0);
            KELores.getInstance().getConfig().addDefault("Items.LightningBow.Lightning.Z-Offset", 0);
            KELores.getInstance().getConfig().addDefault("Items.LightningBow.Recipe.Enable", true);
                logCI(Log_LightningBow_Config_Save_Success_Message);
            
            List<String> temp4 = new ArrayList();
            temp4.add(0, ExplosiveBow_Lore);
            KELores.getInstance().getConfig().addDefault("Items.ExplosiveBow.Lore", temp4);
            KELores.getInstance().getConfig().addDefault("Items.ExplosiveBow.DisplayName", ExplosiveBow_Name);
            KELores.getInstance().getConfig().addDefault("Items.ExplosiveBow.Enable", true);
            KELores.getInstance().getConfig().addDefault("Items.ExplosiveBow.Resource", true);
            KELores.getInstance().getConfig().addDefault("Items.ExplosiveBow.Material", "BOW");
            KELores.getInstance().getConfig().addDefault("Items.ExplosiveBow.Explosion.BreakBlock", false);
            KELores.getInstance().getConfig().addDefault("Items.ExplosiveBow.Explosion.SetFire", false);
            List<Float> temp4f = new ArrayList();
            temp4f.add(0, 4.0f);
            KELores.getInstance().getConfig().addDefault("Items.ExplosiveBow.Explosion.Power", temp4f);
            KELores.getInstance().getConfig().addDefault("Items.ExplosiveBow.Explosion.X-Offset", 0);
            KELores.getInstance().getConfig().addDefault("Items.ExplosiveBow.Explosion.Y-Offset", 0);
            KELores.getInstance().getConfig().addDefault("Items.ExplosiveBow.Explosion.Z-Offset", 0);
            KELores.getInstance().getConfig().addDefault("Items.ExplosiveBow.Recipe.Enable", true);
                logCI(Log_ExplosiveBow_Config_Save_Success_Message);
            
            List<String> temp5 = new ArrayList();
            temp5.add(0, BigPickaxe_Lore);
            KELores.getInstance().getConfig().addDefault("Items.BigPickaxe.Lore", temp5);
            KELores.getInstance().getConfig().addDefault("Items.BigPickaxe.DisplayName", BigPickaxe_Name);
            KELores.getInstance().getConfig().addDefault("Items.BigPickaxe.Enable", true);
            KELores.getInstance().getConfig().addDefault("Items.BigPickaxe.Resource", true);
            KELores.getInstance().getConfig().addDefault("Items.BigPickaxe.Recipe.Enable", true);
            KELores.getInstance().getConfig().addDefault("Items.BigPickaxe.Break.Bedrock", true);
            KELores.getInstance().getConfig().addDefault("Items.BigPickaxe.Break.Barrier", true);
            KELores.getInstance().getConfig().addDefault("Items.BigPickaxe.Radius", 1);
            KELores.getInstance().getConfig().addDefault("Items.BigPickaxe.Material", "DIAMOND_PICKAXE");
            KELores.getInstance().getConfig().addDefault("Items.BigPickaxe.DurabilityWaste", 100);
            KELores.getInstance().getConfig().addDefault("Items.BigPickaxe.OP.Enable", false);
            KELores.getInstance().getConfig().addDefault("Items.BigPickaxe.OP.Radius", 10);
                logCI(Log_BigPickaxe_Config_Save_Success_Message);
                
            List<String> temp6 = new ArrayList();
            temp6.add(0, NetherWater_Lore);
            KELores.getInstance().getConfig().addDefault("Items.NetherWater.Lore", temp6);
            KELores.getInstance().getConfig().addDefault("Items.NetherWater.DisplayName", NetherWater_Name);
            KELores.getInstance().getConfig().addDefault("Items.NetherWater.Enable", true);
            KELores.getInstance().getConfig().addDefault("Items.NetherWater.Resource", true);
            KELores.getInstance().getConfig().addDefault("Items.NetherWater.Material", "WATER_BUCKET");
            KELores.getInstance().getConfig().addDefault("Items.NetherWater.NetherOnly", true);
            KELores.getInstance().getConfig().addDefault("Items.NetherWater.Recipe.Enable", true);
                logCI(Log_NetherWater_Config_Save_Success_Message);
            
            KELores.getInstance().getConfig().addDefault("APIs.ResourcePackApi.Enable", false);
            KELores.getInstance().getConfig().addDefault("APIs.ResourcePackApi.Kick.FailedToDownload", true);
            KELores.getInstance().getConfig().addDefault("APIs.ResourcePackApi.Kick.RefusedToDownload", true);
            KELores.getInstance().getConfig().addDefault("APIs.ResourcePackApi.Link", ResourcePackAPI_Link);
            KELores.getInstance().getConfig().addDefault("APIs.ResourcePackApi.Messages.Success", ChatColor.GREEN + "您成功安装资源包");
            KELores.getInstance().getConfig().addDefault("APIs.ResourcePackApi.Messages.KcikOnFailed", ChatColor.RED + "加载资源包失败,请重新进入服务器");
            KELores.getInstance().getConfig().addDefault("APIs.ResourcePackApi.Messages.KcikOnRefused", ChatColor.RED + "请打开资源包加载");
                logCA(Log_ResourcePackAPI_Config_Save_Success_Message);
                
            KELores.getInstance().getConfig().addDefault("APIs.ActionBarApi.EnableBuiltInCore", true);
            KELores.getInstance().getConfig().addDefault("APIs.ActionBarApi.OnCooldown", true);
            KELores.getInstance().getConfig().addDefault("APIs.ActionBarApi.OnUse", false);
                logCA(Log_ActionBarAPI_Config_Save_Success_Message);
                
            //Permissions Load
                KELores.getInstance().getConfig().addDefault("Permissions.Command", "kelores.cmd");
                KELores.getInstance().getConfig().addDefault("Permissions.Help.Click", "kelores.help.clickable");

                KELores.getInstance().getConfig().addDefault("Permissions.TpBow.get", "kelores.tb.get");
                KELores.getInstance().getConfig().addDefault("Permissions.TpBow.give", "kelores.tb.give");
                KELores.getInstance().getConfig().addDefault("Permissions.TpBow.use", "kelores.tb.use");
                
                KELores.getInstance().getConfig().addDefault("Permissions.SwichBow.get", "kelores.sb.get");
                KELores.getInstance().getConfig().addDefault("Permissions.SwichBow.give", "kelores.sb.give");
                KELores.getInstance().getConfig().addDefault("Permissions.SwichBow.use", "kelores.sb.use");
                
                KELores.getInstance().getConfig().addDefault("Permissions.LightningBow.get", "kelores.lb.get");
                KELores.getInstance().getConfig().addDefault("Permissions.LightningBow.give", "kelores.lb.give");
                KELores.getInstance().getConfig().addDefault("Permissions.LightningBow.use", "kelores.lb.use");
                
                KELores.getInstance().getConfig().addDefault("Permissions.BigPickaxe.get", "kelores.bp.get");
                KELores.getInstance().getConfig().addDefault("Permissions.BigPickaxe.give", "kelores.bp.give");
                KELores.getInstance().getConfig().addDefault("Permissions.BigPickaxe.use", "kelores.bp.use");
                
                KELores.getInstance().getConfig().addDefault("Permissions.ExplosiveBow.get", "kelores.eb.get");
                KELores.getInstance().getConfig().addDefault("Permissions.ExplosiveBow.give", "kelores.eb.give");
                KELores.getInstance().getConfig().addDefault("Permissions.ExplosiveBow.use", "kelores.eb.use");
                
                KELores.getInstance().getConfig().addDefault("Permissions.NetherWater.get", "kelores.nw.get");
                KELores.getInstance().getConfig().addDefault("Permissions.NetherWater.give", "kelores.nw.give");
                KELores.getInstance().getConfig().addDefault("Permissions.NetherWater.use", "kelores.nw.use");
                    logCP(Log_Permissions_Config_Save_Success_Message);
            //Permissions End
                
            KELores.getInstance().getConfig().addDefault("Messages.UseDefaultClickableHelpMessage", true);
            
            saveWorlds();
            saveDefaultMessages();
            setupDefaultRecipe();
            
                logC(Log_All_Config_Save_Success_Message);
            KELores.getInstance().getConfig().set("DefaultConfig", false);
    }
}
