/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc.moecraft.kelores.Config.Loader;

import cc.moecraft.kelores.KELores;
import static cc.moecraft.kelores.MessageLogger.logCM;
import cc.moecraft.kelores.Message;
import java.util.List;

/**
 *
 * @author Kilpikonna
 */
public class setMessage extends loadMessages{
    public static void setMessage(int i)
    {
        List a = Message.configList();
        KELores.getInstance().getConfig().set("Messages." + (String) a.get(i), Message.getDefaultMessage((String) a.get(i)));
            logCM("消息读取完成");
    }
}
