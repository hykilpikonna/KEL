/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc.moecraft.kelores.Config.Loader;

import static cc.moecraft.kelores.Config.Loader.setMessage.setMessage;
import static cc.moecraft.kelores.Convertion.stringConversion.convertName;
import cc.moecraft.kelores.KELores;
import static cc.moecraft.kelores.MessageLogger.log;
import static cc.moecraft.kelores.MessageLogger.logCM;
import cc.moecraft.kelores.Message;
import java.util.ArrayList;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import static cc.moecraft.kelores.Convertion.stringConversion.convertName;
import static cc.moecraft.kelores.Libs.ConfigLoadingLibs.Detect_AuthorString;
import static cc.moecraft.kelores.Libs.ConfigLoadingLibs.Detect_DefaultAuthor;
import static cc.moecraft.kelores.Libs.ConfigLoadingLibs.Log_Detect_DoNotChangeAuthorMessage;
import static cc.moecraft.kelores.Libs.ConfigLoadingLibs.Log_LoadMessage_ConfigList_Load_Finished;
import static cc.moecraft.kelores.Libs.ConfigLoadingLibs.Log_LoadMessage_Done;
import static cc.moecraft.kelores.Libs.ConfigLoadingLibs.Log_LoadMessage_LoadingConfig;
import static cc.moecraft.kelores.Libs.ConfigLoadingLibs.Log_LoadMessage_Start;
import static cc.moecraft.kelores.Libs.ConfigLoadingLibs.Log_NullOutput;
import static cc.moecraft.kelores.MessageLogger.Debug;

/**
 *
 * @author Kilpikonna
 */
public class loadMessages extends ConfigLoader{
    public static ArrayList<String>[] loadMessages()
    {
            logCM(Log_LoadMessage_Start);
        ArrayList<String>[] output = new ArrayList[6];
        List a = Message.configList();
            logCM(Log_LoadMessage_ConfigList_Load_Finished);
        int length = a.size();
        for (int i = 0; i < length; i++)
        {
            logCM(Log_LoadMessage_LoadingConfig + "(" + (i + 1) + "/" + length + ")");
            output[i] = convertName((ArrayList<String>) KELores.getInstance().getConfig().getStringList("Messages." + (String) a.get(i)));
            if (i == 0)
            {
                for (int j = 0; j < output[i].size(); j++)
                {
                    if (output[i].get(j).contains(Detect_AuthorString))
                    {
                        if (!output[i].get(j).equals(Detect_DefaultAuthor))
                        {
                            for (int k = 0; k < 10; k++)
                            {
                                log(Log_Detect_DoNotChangeAuthorMessage, ChatColor.RED);
                                log(Log_Detect_DoNotChangeAuthorMessage);
                            }
                            setMessage(0);
                            Bukkit.shutdown();
                        }
                    }
                }
            }
        }
        if (output == null){
            Debug(Log_NullOutput);
            return null;
        }
        logCM(Log_LoadMessage_Done);
        return output;
    }
}
