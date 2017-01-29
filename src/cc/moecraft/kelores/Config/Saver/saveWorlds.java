package cc.moecraft.kelores.Config.Saver;

import cc.moecraft.kelores.KELores;
import static cc.moecraft.kelores.Libs.ConfigSavingLibs.Log_SavingConfig_Worlds;
import static cc.moecraft.kelores.Libs.ConfigSavingLibs.Log_Worlds_Save_Complete;
import static cc.moecraft.kelores.MessageLogger.logCW;
import java.util.ArrayList;
import org.bukkit.Bukkit;

/**
 *
 * @author Kilpikonna
 */
public class saveWorlds extends ConfigSaver{
    public static void saveWorlds()
    {
        ArrayList<String> worlds1 = new ArrayList();
        Bukkit.getWorlds().stream().forEach((world) -> {
            worlds1.add(world.getName());
        });
            logCW(Log_SavingConfig_Worlds + " (1/6)");
        ArrayList<String> worlds2 = new ArrayList();
        Bukkit.getWorlds().stream().forEach((world) -> {
            worlds2.add(world.getName());
        });
            logCW(Log_SavingConfig_Worlds + " (2/6)");
        ArrayList<String> worlds3 = new ArrayList();
        Bukkit.getWorlds().stream().forEach((world) -> {
            worlds3.add(world.getName());
        });
            logCW(Log_SavingConfig_Worlds + " (3/6)");
        ArrayList<String> worlds4 = new ArrayList();
        Bukkit.getWorlds().stream().forEach((world) -> {
            worlds4.add(world.getName());
        });
            logCW(Log_SavingConfig_Worlds + " (4/6)");
        ArrayList<String> worlds5 = new ArrayList();
        Bukkit.getWorlds().stream().forEach((world) -> {
            worlds5.add(world.getName());
        });
            logCW(Log_SavingConfig_Worlds + " (5/6)");
        ArrayList<String> worlds6 = new ArrayList();
        Bukkit.getWorlds().stream().forEach((world) -> {
            worlds6.add(world.getName());
        });
            logCW(Log_SavingConfig_Worlds + " (6/6)");
        KELores.getInstance().getConfig().addDefault("Items.SwichBow.Worlds", worlds1);
        KELores.getInstance().getConfig().addDefault("Items.TpBow.Worlds", worlds2);
        KELores.getInstance().getConfig().addDefault("Items.LightningBow.Worlds", worlds3);
        KELores.getInstance().getConfig().addDefault("Items.BigPickaxe.Worlds", worlds4);
        KELores.getInstance().getConfig().addDefault("Items.ExplosiveBow.Worlds", worlds5);
        KELores.getInstance().getConfig().addDefault("Items.NetherWater.Worlds", worlds6);
            logCW(Log_Worlds_Save_Complete);
    }
}
