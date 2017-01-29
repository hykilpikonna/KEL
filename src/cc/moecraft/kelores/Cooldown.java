package cc.moecraft.kelores;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
/**
 * @author Kilpikonna
 */

public class Cooldown extends JavaPlugin implements Listener
{ 
    private static Map<String, Cooldown> cooldowns = new HashMap<String, Cooldown>();
    private long start;
    private final int timeInSeconds;
    private final UUID id;
    private final String cooldownName;
 
    @Override
    public void onEnable()
    {
        getServer().getPluginManager().registerEvents(this, this);
    }
    
    public Cooldown(UUID id, String cooldownName, int timeInSeconds)
    {
        this.id = id;
        this.cooldownName = cooldownName;
        this.timeInSeconds = timeInSeconds;
    }
 
    public static boolean isInCooldown(UUID id, String cooldownName)
    {
        if(getTimeLeft(id, cooldownName)>=1)
        {
            return true;
        } else {
            stop(id, cooldownName);
            return false;
        }
    }
 
    private static void stop(UUID id, String cooldownName)
    {
        Cooldown.cooldowns.remove(id+cooldownName);
    }
 
    private static Cooldown getCooldown(UUID id, String cooldownName)
    {
        return cooldowns.get(id.toString()+cooldownName);
    }
 
    public static int getTimeLeft(UUID id, String cooldownName)
    {
        Cooldown cooldown = getCooldown(id, cooldownName);
        int f = -1;
        if(cooldown!=null){
            long now = System.currentTimeMillis();
            long cooldownTime = cooldown.start;
            int totalTime = cooldown.timeInSeconds;
            int r = (int) (now - cooldownTime) / 1000;
            f = (r - totalTime) * (-1);
        }
        return f;
    }
 
    public void start(){
        this.start = System.currentTimeMillis();
        cooldowns.put(this.id.toString()+this.cooldownName, this);
    }
 
}
