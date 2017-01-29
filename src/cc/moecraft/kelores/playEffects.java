package cc.moecraft.kelores;
import org.bukkit.Effect;
/**
 * @author Kilpikonna
 */
public enum playEffects {
    ENDER(Effect.ENDER_SIGNAL),  POTION(Effect.POTION_BREAK);

    private final Effect effect;

    private playEffects(Effect effect)
    {
        this.effect = effect;
    }

    public Effect getEffectByName()
    {
        return this.effect;
    }
}
