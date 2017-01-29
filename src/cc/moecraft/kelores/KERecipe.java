package cc.moecraft.kelores;

import static cc.moecraft.kelores.MessageLogger.Debug;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;

/**
 * @author Kilpikonna
 */
public class KERecipe {
    private Material mat[];
    private String shape[];
    private ItemStack is;
    public static int Total;
    
    public KERecipe(Material mat1[], ItemStack is1)
    {
        mat = mat1;
        is = is1;
        Total++;
    }
    
    /*
        Int position;
        pos = 0 ~ 8 (1 ~ 9 in inventory)
        return Material (mat[pos])
    */
    public Material getMaterial(int pos)
    {
        return mat[pos];
    }
    
    public Material[] getMaterialList()
    {
        return mat;
    }
    
    public ShapedRecipe getRecipe()
    {
        ShapedRecipe recipe = new ShapedRecipe(is);
        recipe.shape(new String[] { "ABC", "DEF", "GHI" });
        for (int i = 0; i < 9; i++)
        {
            if (mat[i] != null)
            {
                recipe.setIngredient((char) (i + 65), mat[i]);
            }
        }
        return recipe;
    }
    
    public void addRecipe()
    {
        Bukkit.getServer().addRecipe(getRecipe());
    }
    
    public void addShapedRecipe()
    {
        addShapedRecipe(shape);
    }
    
    public void addShapedRecipe(String s[])
    {
        ShapedRecipe recipe = new ShapedRecipe(is);
        recipe.shape(new String[] { s[0], s[1], s[2] });
        recipe.setIngredient('a', mat[0]);
        recipe.setIngredient('b', mat[1]);
        recipe.setIngredient('c', mat[2]);
        recipe.setIngredient('d', mat[3]);
        recipe.setIngredient('e', mat[4]);
        recipe.setIngredient('f', mat[5]);
        recipe.setIngredient('g', mat[6]);
        recipe.setIngredient('h', mat[7]);
        recipe.setIngredient('i', mat[8]);
        Bukkit.getServer().addRecipe(recipe);
    }
    
    public void setMaterial(String m[])
    {
        Material matl[] = null;
        boolean save = true;
        if (m.length == 9)
        {
            for (int i = 0; i < 9; i++)
            {
                if (!m[i].equalsIgnoreCase("null"))
                {
                    matl[i] = Material.getMaterial(m[i]);
                } else {
                    matl[i] = null;
                    debug(ChatColor.RED + "(KERecipe)matl[" + i + "]为null");
                }
            }
        } else {
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "[KE Lores]图形读取错误(Material.length != 9), " + this);
        }
        if (save)
        {
            mat = matl;
        }
    }
    
    public static Material[] toMaterial(List<String> m)
    {
        Material[] matl = new Material[9];
        boolean save = true;
        if (m.size() == 9)
        {
            for (int i = 0; i < 9; i++)
            {
                if (!m.get(i).equalsIgnoreCase("null"))
                {
                    if (Material.getMaterial(m.get(i)) != null)
                    {
                        matl[i] = Material.getMaterial(m.get(i));
                            debug(ChatColor.GREEN + "(KERecipe)m.get(" + i + ")不为null: " + m.get(i));
                    } else {
                        debug(ChatColor.RED + "(KERecipe)Material.getMaterial(m.get(" + i + "))为null: " + m.get(i));
                    }
                } else {
                    matl[i] = null;
                        debug(ChatColor.RED + "(KERecipe)m.get(" + i + ")为null: " + m.get(i));
                }
            }
        } else {
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "[KE Lores]图形读取错误(Material.length != 9)");
            save = false;
        }
        debug(ChatColor.GOLD + "------------------------------");
        if (save)
        {
            return matl;
        } else {
            return null;
        }
    }
    
    public void setShape(String sp[])
    {
        boolean save = true;
        if (sp.length == 3)
        {
            for (int i = 0; i < 3; i++)
            {
                if (sp[i].length() != 3)
                {
                    Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "[KE Lores]图形读取错误(shape[" + i + "].length != 3), " + this);
                    save = false;
                }
            }
        } else {
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "[KE Lores]图形读取错误(shape.length != 3), " + this);
            save = false;
        }
        if (save)
        {
            shape = sp;
        }
    }
    
    public String[] getShape()
    {
        return shape;
    }

    public static void debug(String s){
        Debug(s);
    }
}
