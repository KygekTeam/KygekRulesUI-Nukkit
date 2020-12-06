### NOTICE: This is the Nukkit version of KygekRulesUI. Please see [here](https://github.com/KygekTeam/KygekRulesUI) for PocketMine-MP version.

# KygekRulesUI

A plugin that will show your server rules in UI form. To open KygekRulesUI, simply type `/rules` in the chat.

# Features

- Easy to use (you can set the `title`, `content` and `button` in the `config.yml`)
- No need to restart, config will automatically get reloaded every time the `/rules` command gets executed!
- Use `{player}` to display player name
- Use `§` as formatting codes
- Use `\n` to break into a new line
- Change command description to suit your server
- Supports command aliases
- FormAPI plugin is not required

# How to Install

1. Download the latest version (It is recommended to always download the latest version for the best experience, except you're having compatibility issues).
2. Put the `KygekRulesUI.jar` file into the `plugins` folder.
3. Restart or start the server.
4. Open the `config.yml` file in the `plugins/KygekRulesUI` folder and edit the `title`, `content` and `button` (NEVER TOUCH THE `config-version`!).
5. Join the server and execute `/rules` command.
6. Done!

# Commands & Permissions

| Command | Default Description | Permission | Default |
| --- | --- | --- | --- |
| `/rules` | Server rules in UI form | `kygekrulesui.rules` | true |

Command description can be changed in `config.yml`. You can also add command aliases in `config.yml`.  

# Upcoming Features

- Automatic plugin update checker on server startup

# Additional Notes

KygekRulesUI plugin is made by KygekTeam and licensed under GPL-3.0.

- Join our Discord server <a href="https://discord.gg/CXtqUZv">here</a> for latest updates from KygekTeam.
- If you found bugs or want to give suggestions, please visit <a href="https://github.com/KygekTeam/KygekRulesUI-Nukkit/issues">here</a> our join our Discord server.
- We accept all contributions! If you want to contribute please make a pull request in <a href="https://github.com/KygekTeam/KygekRulesUI-Nukkit/pulls">here</a>.
