package cs10.discord.bot.v2021.command.preference;

import cs10.discord.bot.v2021.command.BotCommand;
import cs10.discord.bot.v2021.io.UserPreferences;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

/**
 * Comandos que requieren modificar las preferencias de usuario (archivos de configuración)
 */
public interface PreferenceCommand extends BotCommand {
    String PREFIX = "&";

    void execute(UserPreferences preferences, GuildMessageReceivedEvent event);
}
