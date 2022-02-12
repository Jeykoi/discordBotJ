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
        String token = "OTQyMDk1NjgwNzExODM1NzA4.Ygfg-Q.YwsF5Rd4-A3WaMdWL2YHBfyv5_0";

        DiscordApi api = new DiscordApiBuilder().setToken(token).login().join();
        /* Print the invite url of your bot : 
        https://discord.com/oauth2/authorize?client_id=942095680711835708&scope=bot&permissions=0
         */
        System.out.println("You can invite the bot by using the following url: " + api.createBotInvite());

        api.addListener(new Mensaje()); 
    }
}
