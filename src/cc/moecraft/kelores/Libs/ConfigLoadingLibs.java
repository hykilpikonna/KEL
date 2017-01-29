/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc.moecraft.kelores.Libs;

import org.bukkit.ChatColor;

/**
 *
 * @author Kilpikonna
 */
public class ConfigLoadingLibs {
    public static String Log_LoadConfig_Start;
    public static String Log_LoadConfig_FinishedLoading_ResourcePackAPI;
    public static String Log_LoadConfig_FinishedLoading_SwichBow;
    public static String Log_LoadConfig_FinishedLoading_TeleportBow;
    public static String Log_LoadConfig_FinishedLoading_LightningBow;
    public static String Log_LoadConfig_FinishedLoading_ExplosiveBow;
    public static String Log_LoadConfig_FinishedLoading_BigPickaxe;
    public static String Log_LoadConfig_FinishedLoading_NetherWater;
    public static String Log_LoadConfig_FinishedLoading_Permissions;
    public static String Log_LoadConfig_FinishedLoading_All;
    
    public static String Log_LoadMessage_Start;
    public static String Log_LoadMessage_ConfigList_Load_Finished;
    public static String Log_LoadMessage_LoadingConfig;
    public static String Detect_AuthorString;
    public static String Detect_DefaultAuthor;
    public static String Log_Detect_DoNotChangeAuthorMessage;
    public static String Log_NullOutput;
    public static String Log_LoadMessage_Done;
    
    public static String Log_SaveConfig_Done;
    public static String Log_LoadConfig_Done;
    
    public static void SaveDefaultConfigLoadingLib()
    {
        SaveChineseConfigLoadingLib();
    }
       
    public static void SaveEnglishConfigLoadingLib()
    {
        Log_LoadConfig_Start = "Starting to load config.yml";
        Log_LoadConfig_FinishedLoading_ResourcePackAPI = "ResourcePackAPI config finished loading";
        Log_LoadConfig_FinishedLoading_SwichBow = "SwichBow config finished loading";
        Log_LoadConfig_FinishedLoading_TeleportBow = "TpBow config finished loading";
        Log_LoadConfig_FinishedLoading_LightningBow = "LightningBow config finished loading";
        Log_LoadConfig_FinishedLoading_ExplosiveBow = "ExplosiveBow config finished loading";
        Log_LoadConfig_FinishedLoading_BigPickaxe = "BigPickaxe config finished loading";
        Log_LoadConfig_FinishedLoading_NetherWater = "NetherWater config finished loading";
        Log_LoadConfig_FinishedLoading_Permissions = "Permission finished loading";
        Log_LoadConfig_FinishedLoading_All = "All config finished loading";
        
        Log_LoadMessage_Start = "Starting to load messages.";
        Log_LoadMessage_ConfigList_Load_Finished = "Messages config list load conplete";
        Log_LoadMessage_LoadingConfig = "Loading messages";
        Detect_AuthorString = "Author";
        Detect_DefaultAuthor = ChatColor.GRAY + "Author: kilpikonna (MinecraftID: Hykilpikonna)";
        Log_Detect_DoNotChangeAuthorMessage = "DO NOT CHANGE THE AUTHOR LINE IN CONFIG!!!!!!!!!";
        Log_NullOutput = "output = null";
        Log_LoadMessage_Done = "Finished loading messages.";
        
        Log_SaveConfig_Done = "Finished checking & saving all config";
        Log_LoadConfig_Done = "Finished loading all config";
    }
    
    public static void SaveChineseConfigLoadingLib()
    {
        Log_LoadConfig_Start = "开始加载配置";
        Log_LoadConfig_FinishedLoading_ResourcePackAPI = "ResourcePackAPI配置加载完成";
        Log_LoadConfig_FinishedLoading_SwichBow = "SwichBow配置加载完成";
        Log_LoadConfig_FinishedLoading_TeleportBow = "TpBow配置加载完成";
        Log_LoadConfig_FinishedLoading_LightningBow = "LightningBow配置加载完成";
        Log_LoadConfig_FinishedLoading_ExplosiveBow = "ExplosiveBow配置加载完成";
        Log_LoadConfig_FinishedLoading_BigPickaxe = "BigPickaxe配置加载完成";
        Log_LoadConfig_FinishedLoading_NetherWater = "NetherWater配置加载完成";
        Log_LoadConfig_FinishedLoading_Permissions = "权限加载完成";
        Log_LoadConfig_FinishedLoading_All = "所有配置加载完成";
        
        Log_LoadMessage_Start = "开始加载消息";
        Log_LoadMessage_ConfigList_Load_Finished = "消息配置列表已加载完成";
        Log_LoadMessage_LoadingConfig = "正在加载消息";
        Detect_AuthorString = "作者";
        Detect_DefaultAuthor = ChatColor.GRAY + "插件作者: kilpikonna (QQ: 871674895)";
        Log_Detect_DoNotChangeAuthorMessage = "请不要更改作者名字!!!!!!!!!";
        Log_NullOutput = "output为空";
        Log_LoadMessage_Done = "消息加载完成";
        
        Log_SaveConfig_Done = "已写入配置";
        Log_LoadConfig_Done = "已加载配置";
    }
}
