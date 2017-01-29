/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc.moecraft.kelores;

import org.bukkit.entity.Player;

/**
 *
 * @author Kilpikonna
 */
public class perm {
    public static String cmd, help;
    public static String tbget, tbgive, tbuse;
    public static String sbget, sbgive, sbuse;
    public static String lbget, lbgive, lbuse;
    public static String bpget, bpgive, bpuse;
    public static String eget, egive, euse;
    public static String nget, ngive, nuse;
    
    public static boolean det(Player p, String t, String m)
    {
        if (p.hasPermission(get(t, m)))
        {
            return true;
        } else {
            Message.noPermMsg(p, get(t, m));
            return false;
        }
    }
    
    public static boolean det(Player p, String perm)
    {
        if (p.hasPermission(perm))
        {
            return true;
        } else {
            Message.noPermMsg(p, perm);
            return false;
        }
    }
    
    public static String get(String type, String motion)
    {
        if (motion.equalsIgnoreCase("get"))
        {
            if (type.equalsIgnoreCase("tb"))
            {
                return tbget;
            }
            else if (type.equalsIgnoreCase("sb"))
            {
                return sbget;
            }
            else if (type.equalsIgnoreCase("lb"))
            {
                return lbget;
            }
            else if (type.equalsIgnoreCase("bp"))
            {
                return bpget;
            }
            else if (type.equalsIgnoreCase("e"))
            {
                return eget;
            }
            else if (type.equalsIgnoreCase("n"))
            {
                return nget;
            }
        } 
        else if (motion.equalsIgnoreCase("give")) 
        {
            if (type.equalsIgnoreCase("tb"))
            {
                return tbgive;
            }
            else if (type.equalsIgnoreCase("sb"))
            {
                return sbgive;
            }
            else if (type.equalsIgnoreCase("lb"))
            {
                return lbgive;
            }
            else if (type.equalsIgnoreCase("bp"))
            {
                return bpgive;
            }
            else if (type.equalsIgnoreCase("e"))
            {
                return egive;
            }
            else if (type.equalsIgnoreCase("n"))
            {
                return ngive;
            }
        }
        else if (motion.equalsIgnoreCase("use"))
        {
            if (type.equalsIgnoreCase("tb"))
            {
                return tbuse;
            }
            else if (type.equalsIgnoreCase("sb"))
            {
                return sbuse;
            }
            else if (type.equalsIgnoreCase("lb"))
            {
                return lbuse;
            }
            else if (type.equalsIgnoreCase("bp"))
            {
                return bpuse;
            }
            else if (type.equalsIgnoreCase("e"))
            {
                return euse;
            }
            else if (type.equalsIgnoreCase("n"))
            {
                return nuse;
            }
        }
        return "";
    }
}
