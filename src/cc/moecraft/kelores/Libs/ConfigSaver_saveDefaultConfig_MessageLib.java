/*
 * To change this license header; choose License Headers in Project Properties.
 * To change this template file; choose Tools | Templates
 * and open the template in the editor.
 */
package cc.moecraft.kelores.Libs;

import org.bukkit.ChatColor;

/**
 *
 * @author Kilpikonna
 */
public class ConfigSaver_saveDefaultConfig_MessageLib {
    public static String Log_Creating_Config_Message;
    public static String Log_General_Config_Save_Success_Message;
    
    public static String SwichBow_Lore;
    public static String SwichBow_Name;
    public static String Log_SwichBow_Config_Save_Success_Message;
    
    public static String TPBow_Lore;
    public static String TPBow_Name;
    public static String Log_TPBow_Config_Save_Success_Message;
    
    public static String LightningBow_Lore;
    public static String LightningBow_Name;
    public static String Log_LightningBow_Config_Save_Success_Message;
    
    public static String ExplosiveBow_Lore;
    public static String ExplosiveBow_Name;
    public static String Log_ExplosiveBow_Config_Save_Success_Message;
    
    public static String BigPickaxe_Lore;
    public static String BigPickaxe_Name;
    public static String Log_BigPickaxe_Config_Save_Success_Message;
    
    public static String NetherWater_Lore;
    public static String NetherWater_Name;
    public static String Log_NetherWater_Config_Save_Success_Message;
    
    public static String ResourcePackAPI_Link;
    public static String Log_ResourcePackAPI_Config_Save_Success_Message;
    
    public static String Log_ActionBarAPI_Config_Save_Success_Message;
    
    public static String Log_Permissions_Config_Save_Success_Message;
    
    public static String Log_All_Config_Save_Success_Message;
    
    
    public static void SaveDefaultConfigLib()
    {
        SaveChineseConfigLib();
    }
       
    public static void SaveEnglishConfigLib()
    {
        //General
        Log_Creating_Config_Message = "Detected this is the first time running this plugin, generating config.yml...";
        Log_General_Config_Save_Success_Message = "General config saved";

        //SwichBow
        SwichBow_Lore = ChatColor.GRAY + "Position Swiching I";
        SwichBow_Name = ChatColor.LIGHT_PURPLE + "Swich Bow";
        Log_SwichBow_Config_Save_Success_Message = "SwichBow config saved";

        //TPBow
        TPBow_Lore = ChatColor.GRAY + "Arrow Teleport I";
        TPBow_Name = ChatColor.LIGHT_PURPLE + "Teleport Bow";
        Log_TPBow_Config_Save_Success_Message = "TPBow config saved";

        //LightningBow
        LightningBow_Lore = ChatColor.GRAY + "Arrow Lightning I";
        LightningBow_Name = ChatColor.LIGHT_PURPLE + "Lightning Bow";
        Log_LightningBow_Config_Save_Success_Message = "LightningBow config saved";

        //ExplosiveBow
        ExplosiveBow_Lore = ChatColor.GRAY + "Arrow Explosion I";
        ExplosiveBow_Name = ChatColor.LIGHT_PURPLE + "Explosion Bow";
        Log_ExplosiveBow_Config_Save_Success_Message = "ExplosiveBow config saved";

        //BigPickaxe        
        BigPickaxe_Lore = ChatColor.GRAY + "Mining Assist I";
        BigPickaxe_Name = ChatColor.LIGHT_PURPLE + "Giant Pickaxe";
        Log_BigPickaxe_Config_Save_Success_Message = "BigPickaxe config saved";

        //NetherWater        
        NetherWater_Lore = ChatColor.GRAY + "Multiverse I";
        NetherWater_Name = ChatColor.LIGHT_PURPLE + "Nether Water Bucket";
        Log_NetherWater_Config_Save_Success_Message = "NetherWater config saved";

        //ResourcePackAPI        
        ResourcePackAPI_Link = "http://unsupported";
        Log_ResourcePackAPI_Config_Save_Success_Message = "ResourcePackAPI config saved (default NOT enabled)";
        
        //ActionBarAPI        
        Log_ActionBarAPI_Config_Save_Success_Message = "Built-in ActionBarAPI config saved (default enabled)";

        //Permissions
        Log_Permissions_Config_Save_Success_Message = "Default permissions saved";
                
        //All
        Log_All_Config_Save_Success_Message = "All config saved";
    }
    
    public static void SaveChineseConfigLib()
    {
        //General
        Log_Creating_Config_Message = "检测到为第一次加载本插件, 自动生成配置";
        Log_General_Config_Save_Success_Message = "General配置已存入缓存";

        //SwichBow
        SwichBow_Lore = ChatColor.GRAY + "相位转换 I";
        SwichBow_Name = ChatColor.LIGHT_PURPLE + "相位弓";
        Log_SwichBow_Config_Save_Success_Message = "SwichBow配置已存入缓存";

        //TPBow
        TPBow_Lore = ChatColor.GRAY + "弓箭传送 I";
        TPBow_Name = ChatColor.LIGHT_PURPLE + "传送弓";
        Log_TPBow_Config_Save_Success_Message = "TPBow配置已存入缓存";

        //LightningBow
        LightningBow_Lore = ChatColor.GRAY + "闪电附加 I";
        LightningBow_Name = ChatColor.LIGHT_PURPLE + "闪电弓";
        Log_LightningBow_Config_Save_Success_Message = "LightningBow配置已存入缓存";

        //ExplosiveBow
        ExplosiveBow_Lore = ChatColor.GRAY + "弓箭爆炸 I";
        ExplosiveBow_Name = ChatColor.LIGHT_PURPLE + "爆炸弓";
        Log_ExplosiveBow_Config_Save_Success_Message = "ExplosiveBow配置已存入缓存";

        //BigPickaxe        
        BigPickaxe_Lore = ChatColor.GRAY + "扩散挖掘 I";
        BigPickaxe_Name = ChatColor.LIGHT_PURPLE + "巨镐";
        Log_BigPickaxe_Config_Save_Success_Message = "BigPickaxe配置已存入缓存";

        //NetherWater        
        NetherWater_Lore = ChatColor.GRAY + "世界翻转 I";
        NetherWater_Name = ChatColor.LIGHT_PURPLE + "地狱水";
        Log_NetherWater_Config_Save_Success_Message = "NetherWater配置已存入缓存";

        //ResourcePackAPI        
        ResourcePackAPI_Link = "http://unsupported";
        Log_ResourcePackAPI_Config_Save_Success_Message = "ResourcePackAPI配置已存入缓存(默认不启用)";
        
        //ActionBarAPI        
        Log_ActionBarAPI_Config_Save_Success_Message = "内置ActionBarAPI配置已存入缓存(默认启用)";

        //Permissions
        Log_Permissions_Config_Save_Success_Message = "默认权限已存入缓存";
                
        //All
        Log_All_Config_Save_Success_Message = "所有默认配置已存入缓存";
    }
}
