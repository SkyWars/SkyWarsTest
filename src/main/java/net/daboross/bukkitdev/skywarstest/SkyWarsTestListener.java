/*
 * Copyright (C) 2013 Dabo Ross <http://www.daboross.net/>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.daboross.bukkitdev.skywarstest;

import java.util.logging.Level;
import net.daboross.bukkitdev.skywars.api.events.ArenaPlayerDeathEvent;
import net.daboross.bukkitdev.skywars.api.events.ArenaPlayerKillPlayerEvent;
import net.daboross.bukkitdev.skywars.api.events.GameEndEvent;
import net.daboross.bukkitdev.skywars.api.events.GameStartEvent;
import net.daboross.bukkitdev.skywars.api.events.LeaveGameEvent;
import net.daboross.bukkitdev.skywars.api.events.PlayerEnterQueueEvent;
import net.daboross.bukkitdev.skywars.api.events.PlayerLeaveQueueEvent;
import net.daboross.bukkitdev.skywars.api.events.RespawnAfterLeaveGameEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class SkyWarsTestListener implements Listener {

    private final SkyWarsTestPlugin plugin;

    public SkyWarsTestListener(final SkyWarsTestPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onArenaPlayerDeath(ArenaPlayerDeathEvent evt) {
        plugin.getLogger().log(Level.INFO, "ArenaPlayerDeath event called. ({0})", evt);
    }

    @EventHandler
    public void onArenaPlayerKillPlayer(ArenaPlayerKillPlayerEvent evt) {
        plugin.getLogger().log(Level.INFO, "ArenaPlayerKillPlayer event called. ({0})", evt);
    }

    @EventHandler
    public void onGameEnd(GameEndEvent evt) {
        plugin.getLogger().log(Level.INFO, "GameEnd event called. ({0})", evt);
    }

    @EventHandler
    public void onGameStart(GameStartEvent evt) {
        plugin.getLogger().log(Level.INFO, "GameStart event called. ({0})", evt);
    }

    @EventHandler
    public void onLeaveGame(LeaveGameEvent evt) {
        plugin.getLogger().log(Level.INFO, "LeaveGame event called. ({0})", evt);
    }

    @EventHandler
    public void onPlayerEnterQueue(PlayerEnterQueueEvent evt) {
        plugin.getLogger().log(Level.INFO, "PlayerEnterQueue event called. ({0})", evt);
    }

    @EventHandler
    public void onPlayerLeaveQueue(PlayerLeaveQueueEvent evt) {
        plugin.getLogger().log(Level.INFO, "PlayerLeaveQueue event called. ({0})", evt);
    }

    @EventHandler
    public void onRespawnAfterLeaveGame(RespawnAfterLeaveGameEvent evt) {
        plugin.getLogger().log(Level.INFO, "RespawnAfterLeaveGame event called. ({0})", evt);
    }
}
