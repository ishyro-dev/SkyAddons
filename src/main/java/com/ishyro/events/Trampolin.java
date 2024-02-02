package com.ishyro.events;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class Trampolin implements Listener {
    @EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerMoveEvent(PlayerMoveEvent event){
        Player p = event.getPlayer();
        Location playerLocation = p.getLocation();
        Block blockBelow = playerLocation.getWorld().getBlockAt(playerLocation.getBlockX(), playerLocation.getBlockY() - 1, playerLocation.getBlockZ());
        if (blockBelow.getType() == Material.SLIME_BLOCK) {
            double velocity = 0.7;
            Vector impulseVector = new Vector(0, velocity, 0);
            p.setVelocity(p.getVelocity().setY(velocity));
            p.setVelocity(p.getVelocity().add(impulseVector));
        }
    }
}

