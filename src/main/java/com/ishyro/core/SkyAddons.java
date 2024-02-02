package com.ishyro.core;
import com.ishyro.events.HealOnKill;
import com.ishyro.events.Trampolin;
import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class SkyAddons extends JavaPlugin {
    ConsoleCommandSender console = Bukkit.getConsoleSender();

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new HealOnKill(), this);
        getServer().getPluginManager().registerEvents(new Trampolin(), this);
        console.sendMessage("§3SkyAddon se acaba de activar con exito");

    }

    @Override
    public void onDisable() {
        console.sendMessage("§cSkyAddon se acaba de apagar con exito");
    }
}
