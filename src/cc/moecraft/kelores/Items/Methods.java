/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc.moecraft.kelores.Items;

import static cc.moecraft.kelores.Detect.CCP.ccp;
import static cc.moecraft.kelores.KELores.bigPickaxe;
import static cc.moecraft.kelores.KELores.bpName;
import static cc.moecraft.kelores.KELores.eBow;
import static cc.moecraft.kelores.KELores.eName;
import static cc.moecraft.kelores.KELores.lightBow;
import static cc.moecraft.kelores.KELores.lightName;
import static cc.moecraft.kelores.KELores.nName;
import static cc.moecraft.kelores.KELores.nWater;
import static cc.moecraft.kelores.KELores.swichBow;
import static cc.moecraft.kelores.KELores.swichName;
import static cc.moecraft.kelores.KELores.tpBow;
import static cc.moecraft.kelores.KELores.tpName;
import cc.moecraft.kelores.Message;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 *
 * @author Kilpikonna
 */
public class Methods {
    public static void giveItem(String ss, Player g, String arg)
    {
        Player s = Bukkit.getPlayer(ss);
        if (s != null)
        {
            if (arg.equalsIgnoreCase("tpbow"))
            {
                if (s.hasPermission(ccp(s, g, "tb")))
                {   
                    g.getInventory().addItem(new ItemStack[] { tpBow });
                    Message.sMsg(ss);
                    Message.bowMsg(g, tpName);
                } else {
                    Message.noPermMsg(s, ccp(s, g, "tb"));
                }
            } else if (arg.equalsIgnoreCase("swichbow")) {
                if (s.hasPermission(ccp(s, g, "sb")))
                {
                    g.getInventory().addItem(new ItemStack[] { swichBow });
                    Message.sMsg(ss);
                    Message.bowMsg(g, swichName);
                } else {
                    Message.noPermMsg(s, ccp(s, g, "sb"));
                }
            } else if (arg.equalsIgnoreCase("lightbow")) {
                if (s.hasPermission(ccp(s, g, "lb")))
                {
                    g.getInventory().addItem(new ItemStack[] { lightBow });
                    Message.sMsg(ss);
                    Message.bowMsg(g, lightName);
                } else {
                    Message.noPermMsg(s, ccp(s, g, "lb"));
                }
            } else if (arg.equalsIgnoreCase("bigpickaxe")) {
                if (s.hasPermission(ccp(s, g, "bp")))
                {
                    g.getInventory().addItem(new ItemStack[] { bigPickaxe });
                    Message.sMsg(ss);
                    Message.bowMsg(g, bpName);
                } else {
                    Message.noPermMsg(s, ccp(s, g, "bp"));
                }
            } else if (arg.equalsIgnoreCase("explosivebow")) {
                if (s.hasPermission(ccp(s, g, "e")))
                {
                    g.getInventory().addItem(new ItemStack[] { eBow });
                    Message.sMsg(ss);
                    Message.bowMsg(g, eName);
                } else {
                    Message.noPermMsg(s, ccp(s, g, "e"));
                }
            } else if (arg.equalsIgnoreCase("netherwater")) {
                if (s.hasPermission(ccp(s, g, "n")))
                {
                    g.getInventory().addItem(new ItemStack[] { nWater });
                    Message.sMsg(ss);
                    Message.bowMsg(g, nName);
                } else {
                    Message.noPermMsg(s, ccp(s, g, "n"));
                }
            } else {
                Message.helpMsg(s);
            }
        } else if (ss.equals("console")){
            Bukkit.getConsoleSender().sendMessage("[KELores]暂时不支持后台指令");
        }
    }
}
