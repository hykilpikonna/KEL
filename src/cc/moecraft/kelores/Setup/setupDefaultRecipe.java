package cc.moecraft.kelores.Setup;

import cc.moecraft.kelores.KELores;
import java.util.ArrayList;

/**
 *
 * @author Kilpikonna
 */
public class setupDefaultRecipe extends setup{
    public static void setupDefaultRecipe()
    {
        //SwichBow
            ArrayList<String> mat = new ArrayList<>();
            mat.add("STICK");
            mat.add("ENDER_PEARL");
            mat.add("ENDER_PEARL");
            mat.add("ENDER_PEARL");
            mat.add("BOW");
            mat.add("EYE_OF_ENDER");
            mat.add("ENDER_PEARL");
            mat.add("EYE_OF_ENDER");
            mat.add("CHORUS_FRUIT");
        KELores.getInstance().getConfig().addDefault("Items.SwichBow.Recipe.Material", mat);
        
        //TPBow
            ArrayList<String> mat2 = new ArrayList<>();
            mat2.add("STICK");
            mat2.add("ENDER_PEARL");
            mat2.add("ENDER_PEARL");
            mat2.add("ENDER_PEARL");
            mat2.add("BOW");
            mat2.add("EYE_OF_ENDER");
            mat2.add("ENDER_PEARL");
            mat2.add("EYE_OF_ENDER");
            mat2.add("null");
        KELores.getInstance().getConfig().addDefault("Items.TpBow.Recipe.Material", mat2);
    
        //LightningBow
            ArrayList<String> mat3 = new ArrayList<>();
            mat3.add("null");
            mat3.add("STICK");
            mat3.add("DIAMOND");
            mat3.add("STICK");
            mat3.add("BOW");
            mat3.add("REDSTONE");
            mat3.add("DIAMOND");
            mat3.add("REDSTONE");
            mat3.add("WATER_BUCKET");
        KELores.getInstance().getConfig().addDefault("Items.LightningBow.Recipe.Material", mat3);
        
        //ExplosiveBow
            ArrayList<String> mat4 = new ArrayList<>();
            mat4.add("null");
            mat4.add("STICK");
            mat4.add("TNT");
            mat4.add("STICK");
            mat4.add("BOW");
            mat4.add("SULPHUR");
            mat4.add("TNT");
            mat4.add("SULPHUR");
            mat4.add("FLINT_AND_STEEL");
        KELores.getInstance().getConfig().addDefault("Items.ExplosiveBow.Recipe.Material", mat4);
        
        //BigPickaxe
            ArrayList<String> mat5 = new ArrayList<>();
            mat5.add("DIAMOND_PICKAXE");
            mat5.add("DIAMOND_PICKAXE");
            mat5.add("DIAMOND_PICKAXE");
            mat5.add("DIAMOND_PICKAXE");
            mat5.add("DIAMOND");
            mat5.add("DIAMOND_PICKAXE");
            mat5.add("DIAMOND_PICKAXE");
            mat5.add("DIAMOND_PICKAXE");
            mat5.add("DIAMOND_PICKAXE");
        KELores.getInstance().getConfig().addDefault("Items.BigPickaxe.Recipe.Material", mat5);
        
        //NetherWater
            ArrayList<String> mat6 = new ArrayList<>();
            mat6.add("WATER_BUCKET");
            mat6.add("LAVA_BUCKET");
            mat6.add("WATER_BUCKET");
            mat6.add("LAVA_BUCKET");
            mat6.add("DIAMOND");
            mat6.add("LAVA_BUCKET");
            mat6.add("WATER_BUCKET");
            mat6.add("LAVA_BUCKET");
            mat6.add("WATER_BUCKET");
        KELores.getInstance().getConfig().addDefault("Items.NetherWater.Recipe.Material", mat6);
    }
}
