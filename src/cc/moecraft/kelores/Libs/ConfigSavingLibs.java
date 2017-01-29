package cc.moecraft.kelores.Libs;

/**
 *
 * @author Kilpikonna
 */
public class ConfigSavingLibs {
    public static String Log_SavingConfig_Worlds;
    public static String Log_Worlds_Save_Complete;
    
    public static String Log_SavingConfig_DefaultMessages;
    
    
    public static void SaveDefaultConfigSavingLib()
    {
        SaveChineseConfigSavingLib();
    }
       
    public static void SaveEnglishConfigSavingLib()
    {
        Log_SavingConfig_Worlds = "Saving World Configs";
        Log_Worlds_Save_Complete = "Finished saving all world config";
        
        Log_SavingConfig_DefaultMessages = "Saving messages";
    }
    
    public static void SaveChineseConfigSavingLib()
    {
        Log_SavingConfig_Worlds = "正在存入世界";
        Log_Worlds_Save_Complete = "所有世界默认配置已存入缓存";
        
        Log_SavingConfig_DefaultMessages = "正在存入默认消息";
    }
}
