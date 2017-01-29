package cc.moecraft.kelores;

import org.bukkit.inventory.ItemStack;

/**
 * @author Kilpikonna
 */
public class KEItem {
    public static int TotalItems;
    ItemStack Item;
    KERecipe Recipe;
    
    public KEItem (ItemStack i, KERecipe r)
    {
        Item = i;
        Recipe = r;
        TotalItems++;
    }
    
    
}
