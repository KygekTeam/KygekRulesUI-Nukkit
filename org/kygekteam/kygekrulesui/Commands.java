/*
 * A UI-based rules plugin for Nukkit
 * Copyright (C) 2020 KygekTeam
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 */

package org.kygekteam.kygekrulesui;

import cn.nukkit.Player;
import cn.nukkit.command.CommandSender;
import cn.nukkit.command.PluginCommand;

public class Commands extends PluginCommand<Main> {

    private final Main main;

    public Commands(Main main, String desc, String[] aliases) {
        super("rules", main);
        this.main = main;
        this.setPermission("kygekrulesui.rules");
        this.setAliases(aliases);
        this.setUsage("/rules");
        this.setDescription(desc.isEmpty() ? "Server rules in UI form" : desc);
    }

    private Main getMain() {
        return this.main;
    }

    @Override
    public boolean execute(CommandSender sender, String commandLabel, String[] args) {
        if (!(sender instanceof Player))
            sender.sendMessage("[KygekRulesUI] This command only works in game!");
        else {
            if (!sender.hasPermission("kygekrulesui.rules"))
                sender.sendMessage("[KygekRulesUI] You do not have permission to use this command!");
            else {
                this.getMain().reloadConfig();
                this.getMain().kygekRulesUI((Player) sender);
            }
        }
        return true;
    }
}
