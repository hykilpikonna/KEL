package cc.moecraft.kelores.Setup;

import static cc.moecraft.kelores.MessageLogger.logI;
import java.util.ArrayList;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 *
 * @author Kilpikonna
 */
public class setupItem extends setup{
    public static ItemStack setupItem(ItemStack item, ArrayList<String> lore, Material thing, ChatColor color, String name)
    {
        item = new ItemStack(thing);
        ItemMeta im = item.getItemMeta();
        im.setDisplayName(color + name);
        im.setLore(lore);
        item.setItemMeta(im);
            logI("物品ItemStack配置完成: " + name);
        return item;
    }
}
