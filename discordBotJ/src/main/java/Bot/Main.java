package Bot;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

/**
 *
 * @author Jefferson
 */
public class Main {

    public static void main(String[] args) {
        // Insert your bot's token here
        String token = "Token";

        DiscordApi api = new DiscordApiBuilder().setToken(token).login().join();
        /* Print the invite url of your bot : */
        System.out.println("You can invite the bot by using the following url: " + api.createBotInvite());

        api.addListener(new Mensaje()); 
    }
}
