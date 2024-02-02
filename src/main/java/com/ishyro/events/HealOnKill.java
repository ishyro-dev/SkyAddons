package com.ishyro.events;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class HealOnKill implements Listener {
    @EventHandler(priority= EventPriority.MONITOR, ignoreCancelled=true)
    public void onPlayerDeath(PlayerDeathEvent event){
        Player killer = event.getEntity().getKiller();
        if ( (killer != null)){
            killer.setHealth(20);
        }
    }
}

