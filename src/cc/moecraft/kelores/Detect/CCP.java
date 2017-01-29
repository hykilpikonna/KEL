/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc.moecraft.kelores.Detect;

import cc.moecraft.kelores.perm;
import org.bukkit.entity.Player;

/**
 *
 * @author Kilpikonna
 */
public class CCP {
    public static String ccp(Player p, Player s, String type)
    {
        if (p.equals(s))
        {
            return perm.get(type, "get");
        } else {
            return perm.get(type, "give");
        }
    }
}
