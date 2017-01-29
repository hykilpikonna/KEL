package cc.moecraft.kelores.Setup;

import static cc.moecraft.kelores.Config.Loader.loadDefaultRecipe.loadDefaultRecipe;
import static cc.moecraft.kelores.KELores.bigPickaxe;
import static cc.moecraft.kelores.KELores.bpLore;
import static cc.moecraft.kelores.KELores.bpMaterial;
import static cc.moecraft.kelores.KELores.bpName;
import static cc.moecraft.kelores.KELores.eBow;
import static cc.moecraft.kelores.KELores.eLore;
import static cc.moecraft.kelores.KELores.eMaterial;
import static cc.moecraft.kelores.KELores.eName;
import static cc.moecraft.kelores.KELores.lightBow;
import static cc.moecraft.kelores.KELores.lightLore;
import static cc.moecraft.kelores.KELores.lightMaterial;
import static cc.moecraft.kelores.KELores.lightName;
import static cc.moecraft.kelores.KELores.nLore;
import static cc.moecraft.kelores.KELores.nMaterial;
import static cc.moecraft.kelores.KELores.nName;
import static cc.moecraft.kelores.KELores.nWater;
import static cc.moecraft.kelores.KELores.swichBow;
import static cc.moecraft.kelores.KELores.swichLore;
import static cc.moecraft.kelores.KELores.swichMaterial;
import static cc.moecraft.kelores.KELores.swichName;
import static cc.moecraft.kelores.KELores.tpBow;
import static cc.moecraft.kelores.KELores.tpLore;
import static cc.moecraft.kelores.KELores.tpMaterial;
import static cc.moecraft.kelores.KELores.tpName;
import static cc.moecraft.kelores.MessageLogger.logI;
import static cc.moecraft.kelores.Setup.setupEffects.setupEffects;
import static cc.moecraft.kelores.Setup.setupItem.setupItem;
import org.bukkit.ChatColor;
import org.bukkit.Material;

/**
 *
 * @author Kilpikonna
 */
public class setup {
    public static void setup()
    {
        swichBow = setupItem(swichBow, swichLore, Material.getMaterial(swichMaterial), ChatColor.LIGHT_PURPLE, swichName);
        tpBow = setupItem(tpBow, tpLore, Material.getMaterial(tpMaterial), ChatColor.LIGHT_PURPLE, tpName);
        lightBow = setupItem(lightBow, lightLore, Material.getMaterial(lightMaterial), ChatColor.LIGHT_PURPLE, lightName);
        bigPickaxe = setupItem(bigPickaxe, bpLore, Material.getMaterial(bpMaterial), ChatColor.LIGHT_PURPLE, bpName);
        eBow = setupItem(eBow, eLore, Material.getMaterial(eMaterial), ChatColor.LIGHT_PURPLE, eName);
        nWater = setupItem(nWater, nLore, Material.getMaterial(nMaterial), ChatColor.LIGHT_PURPLE, nName);
        
        loadDefaultRecipe();
            logI("物品ItemStack全部配置完成");
        setupEffects();
    }
}
