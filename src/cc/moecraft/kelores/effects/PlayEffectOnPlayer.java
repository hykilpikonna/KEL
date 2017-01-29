/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc.moecraft.kelores.effects;

import static cc.moecraft.kelores.KELores.getActiveEffects;
import cc.moecraft.kelores.playEffects;
import org.bukkit.entity.Player;

/**
 *
 * @author Kilpikonna
 */
public class PlayEffectOnPlayer {
    public static void playEffectOnPlayer(Player p)
    {
        for (playEffects aee : getActiveEffects()) {
            if (aee == playEffects.POTION) {
                p.getWorld().playEffect(p.getLocation().add(0.0D, 3.0D, 0.0D), aee.getEffectByName(), 10);
            } else {
                p.getWorld().playEffect(p.getLocation(), aee.getEffectByName(), 3);
            }
        }
    }
}
