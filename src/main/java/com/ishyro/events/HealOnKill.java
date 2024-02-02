package com.ishyro.events;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class HealOnKill implements Listener {
    @EventHandler
    public void entityDeath(EntityDeathEvent e) {
        if (e.getEntity() != null && e.getEntity() instanceof Player) {
            Player k = e.getEntity().getKiller();
            assert k != null;
            k.setHealth(20);
        }
    }
    }
