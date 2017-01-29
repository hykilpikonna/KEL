package cc.moecraft.kelores.Setup;

import cc.moecraft.kelores.KELores;
import static cc.moecraft.kelores.MessageLogger.logE;
import cc.moecraft.kelores.playEffects;

/**
 *
 * @author Kilpikonna
 */
public class setupEffects extends setup{
    public static void setupEffects()
    {
        KELores.effects.clear();
        KELores.effects.add(playEffects.ENDER);
        KELores.effects.add(playEffects.POTION);
            logE("特效配置完成");
    }
}
