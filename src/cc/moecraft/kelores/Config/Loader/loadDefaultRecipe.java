package cc.moecraft.kelores.Config.Loader;

import cc.moecraft.kelores.KELores;
import static cc.moecraft.kelores.KELores.bigPickaxe;
import static cc.moecraft.kelores.KELores.bpr;
import static cc.moecraft.kelores.KELores.eBow;
import static cc.moecraft.kelores.KELores.er;
import static cc.moecraft.kelores.KELores.lightBow;
import static cc.moecraft.kelores.KELores.lightr;
import static cc.moecraft.kelores.KELores.nWater;
import static cc.moecraft.kelores.KELores.nr;
import static cc.moecraft.kelores.KELores.swichBow;
import static cc.moecraft.kelores.KELores.swichr;
import static cc.moecraft.kelores.KELores.tpBow;
import static cc.moecraft.kelores.KELores.tpr;
import cc.moecraft.kelores.KERecipe;
import static cc.moecraft.kelores.MessageLogger.logCR;

/**
 *
 * @author Kilpikonna
 */
public class loadDefaultRecipe extends ConfigLoader{
    public static void loadDefaultRecipe()
    {
        //SwichBow
        swichr = new KERecipe(KERecipe.toMaterial(KELores.getInstance().getConfig().getStringList("Items.SwichBow.Recipe.Material")), swichBow);
        swichr.addRecipe();
        
        //TPBow
        tpr = new KERecipe(KERecipe.toMaterial(KELores.getInstance().getConfig().getStringList("Items.TpBow.Recipe.Material")), tpBow);
        tpr.addRecipe();
        //LightningBow
        lightr = new KERecipe(KERecipe.toMaterial(KELores.getInstance().getConfig().getStringList("Items.LightningBow.Recipe.Material")), lightBow);
        lightr.addRecipe();
        //ExplosiveBow
        er = new KERecipe(KERecipe.toMaterial(KELores.getInstance().getConfig().getStringList("Items.ExplosiveBow.Recipe.Material")), eBow);
        er.addRecipe();
        //BigPickaxe
        bpr = new KERecipe(KERecipe.toMaterial(KELores.getInstance().getConfig().getStringList("Items.BigPickaxe.Recipe.Material")), bigPickaxe);
        bpr.addRecipe();
        //NetherWater
        nr = new KERecipe(KERecipe.toMaterial(KELores.getInstance().getConfig().getStringList("Items.NetherWater.Recipe.Material")), nWater);
        nr.addRecipe();
            logCR("合成表加载完成!");
    }
}
