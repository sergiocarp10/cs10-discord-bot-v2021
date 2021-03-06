package cs10.discord.bot.v2021.command.call;

import cs10.discord.bot.v2021.currency.usd.Dollar;
import cs10.discord.bot.v2021.io.UserPreferences;
import net.dv8tion.jda.api.entities.TextChannel;

public class DollarCommand implements CallCommand {
    private final Dollar dollar = new Dollar();

    @Override
    public void execute(UserPreferences preferences, TextChannel channel){
        channel.sendMessage(dollar.getCurrentInfo()).queue();
    }

    @Override
    public String getId() {
        return "usd";
    }
}
