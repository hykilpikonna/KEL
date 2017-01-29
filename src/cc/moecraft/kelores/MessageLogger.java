package cc.moecraft.kelores;

import static cc.moecraft.kelores.KELores.debug;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

/**
 * @author Kilpikonna
 */
public class MessageLogger {
    public static void log(String s)
    {
        Bukkit.getConsoleSender().sendMessage("[KELores] " + s);
    }
    
    public static void log(String s, ChatColor c)
    {
        Bukkit.getConsoleSender().sendMessage(c + "[KELores] " + s);
    }
    
    public static void logC(String s)
    {
        Bukkit.getConsoleSender().sendMessage("[KELores][Config] " + s);
    }
    
    public static void logCI(String s)
    {
        Bukkit.getConsoleSender().sendMessage("[KELores][Config][Items] " + s);
    }
    
    public static void logCA(String s)
    {
        Bukkit.getConsoleSender().sendMessage("[KELores][Config][APIs] " + s);
    }
    
    public static void logCR(String s)
    {
        Bukkit.getConsoleSender().sendMessage("[KELores][Config][Recipes] " + s);
    }
    
    public static void logA(String s)
    {
        Bukkit.getConsoleSender().sendMessage("[KELores][APIs] " + s);
    }
    
    public static void logCP(String s)
    {
        Bukkit.getConsoleSender().sendMessage("[KELores][Config][Permissions] " + s);
    }
    
    public static void logCW(String s)
    {
        Bukkit.getConsoleSender().sendMessage("[KELores][Config][Worlds] " + s);
    }
    
    public static void logCM(String s)
    {
        Bukkit.getConsoleSender().sendMessage("[KELores][Config][Messages] " + s);
    }
    
    public static void logI(String s)
    {
        Bukkit.getConsoleSender().sendMessage("[KELores][Items] " + s);
    }
    
    public static void logE(String s)
    {
        Bukkit.getConsoleSender().sendMessage("[KELores][Effects] " + s);
    }
    
    public static void Debug(String s)
    {
        if (debug){
            Bukkit.getConsoleSender().sendMessage("[KELores][DEBUG] " + s);
        }
    }
}
