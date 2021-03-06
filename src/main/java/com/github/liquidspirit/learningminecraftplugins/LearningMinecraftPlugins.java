package com.github.liquidspirit.learningminecraftplugins;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.Game;

import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartingServerEvent;
import org.spongepowered.api.plugin.Plugin;

import com.github.liquidspirit.learningminecraftplugins.Commands.CommandManager;

@Plugin(
        id = "learningminecraftplugins",
        name = "LearningMinecraftPlugins",
        description = "Learning Minecraft Plugins",
        url = "https://github.com/LiquidSpirit",
        authors = {
                "LiquidSpirit"
        },
        version = "1.0.0"
)
public class LearningMinecraftPlugins {

    @Inject
    private Logger logger;
    private Game game;
    private CommandManager cmdManager;


    @Listener
    public void onServerStarting(GameStartingServerEvent event) {
        this.logger.info("Loading...");

        this.cmdManager = new CommandManager(game, this);
        this.logger.info("Loaded!");
    }
}
