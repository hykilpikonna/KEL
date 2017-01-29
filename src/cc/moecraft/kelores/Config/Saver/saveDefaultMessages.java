/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc.moecraft.kelores.Config.Saver;

import cc.moecraft.kelores.KELores;
import static cc.moecraft.kelores.Libs.ConfigLoadingLibs.Log_LoadMessage_ConfigList_Load_Finished;
import static cc.moecraft.kelores.Libs.ConfigSavingLibs.Log_SavingConfig_DefaultMessages;
import static cc.moecraft.kelores.MessageLogger.logCM;
import cc.moecraft.kelores.Message;
import java.util.List;

/**
 *
 * @author Kilpikonna
 */
public class saveDefaultMessages extends ConfigSaver{
    public static void saveDefaultMessages()
    {
        List a = Message.configList();
            logCM(Log_LoadMessage_ConfigList_Load_Finished);
        int length = a.size();
        for (int i = 0; i < length; i++)
        {
            KELores.getInstance().getConfig().addDefault("Messages." + (String) a.get(i), Message.getDefaultMessage((String) a.get(i)));
                logCM(Log_SavingConfig_DefaultMessages + " (" + (i + 1) + "/" + length + ")");
        }
    }
}
