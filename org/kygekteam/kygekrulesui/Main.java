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
import cn.nukkit.plugin.PluginBase;
import ru.nukkitx.forms.elements.SimpleForm;

import java.io.File;
import java.util.ArrayList;

public class Main extends PluginBase {

    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        if (this.getConfig().get("config-version", 1.1) != 1.2) {
            this.getLogger().notice("Your configuration file is outdated, updating the config.yml...");
            this.getLogger().notice("The old configuration file can be found at config_old.yml");
            this.renameConfig();
            this.saveDefaultConfig();
            this.reloadConfig();
        }
        ArrayList cmdAliases = (ArrayList) this.getConfig().get("command-aliases");
        this.getServer().getCommandMap().register("KygekRulesUI", new Commands(
            this, this.getConfig().get("command-desc").toString(),
                (String[]) cmdAliases.toArray(new String[0])
        ));
    }

    private void renameConfig() {
        File oldConfig = new File(this.getDataFolder() + "/config.yml");
        File newConfig = new File(this.getDataFolder() + "/config-old.yml");

        if (newConfig.exists()) newConfig.delete();

        oldConfig.renameTo(newConfig);
    }

    public void kygekRulesUI(Player player) {
        String title = this.getConfig().get("title").toString().replace("{player}", player.getName());
        String content = this.getConfig().get("content").toString().replace("{player}", player.getName());
        String button = this.getConfig().get("button").toString().replace("{player}", player.getName());

        SimpleForm form = new SimpleForm(title).setContent(content).addButton(button);

        form.send(player, (targetPlayer, targetForm, data) -> {
            if (data == -1) return;
        });
    }

}
