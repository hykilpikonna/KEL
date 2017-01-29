package cc.moecraft.kelores.Config.Saver;

import static cc.moecraft.kelores.Config.Saver.saveDefaultConfig.saveDefaultConfig;
import cc.moecraft.kelores.KELores;
import static cc.moecraft.kelores.Libs.ConfigLoadingLibs.SaveChineseConfigLoadingLib;
import static cc.moecraft.kelores.Libs.ConfigLoadingLibs.SaveDefaultConfigLoadingLib;
import static cc.moecraft.kelores.Libs.ConfigLoadingLibs.SaveEnglishConfigLoadingLib;
import static cc.moecraft.kelores.Libs.ConfigSaver_saveDefaultConfig_MessageLib.SaveDefaultConfigLib;
import static cc.moecraft.kelores.Libs.ConfigSaver_saveDefaultConfig_MessageLib.SaveEnglishConfigLib;
import static cc.moecraft.kelores.Libs.ConfigSaver_saveDefaultConfig_MessageLib.SaveChineseConfigLib;
import static cc.moecraft.kelores.Libs.ConfigSavingLibs.SaveChineseConfigSavingLib;
import static cc.moecraft.kelores.Libs.ConfigSavingLibs.SaveDefaultConfigSavingLib;
import static cc.moecraft.kelores.Libs.ConfigSavingLibs.SaveEnglishConfigSavingLib;
import static cc.moecraft.kelores.MessageLogger.Debug;

/**
 *
 * @author Kilpikonna
 */
public class ConfigSaver {
    public static void checkConfig()
    {
        Debug("ConfigSaver.checkConfig() 已执行");
        if (KELores.getInstance().getConfig().getString("DefaultLanguage").equalsIgnoreCase("chinese"))
        {
            SaveChineseConfigLib();
            SaveChineseConfigLoadingLib();
            SaveChineseConfigSavingLib();
        } else if (KELores.getInstance().getConfig().getString("DefaultLanguage").equalsIgnoreCase("english")){
            SaveEnglishConfigLib();
            SaveEnglishConfigLoadingLib();
            SaveEnglishConfigSavingLib();
        } else {
            SaveDefaultConfigLib();
            SaveDefaultConfigLoadingLib();
            SaveDefaultConfigSavingLib();
        }
        if (KELores.getInstance().getConfig().getBoolean("DefaultConfig") == true /*|| !KELores.getInstance().getConfig().getString("ConfigVersion").equals(ConfigVersion)*/)
        {
            saveDefaultConfig();
        }
    }
}
