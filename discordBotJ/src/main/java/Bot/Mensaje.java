package Bot;

import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

/**
 *
 * @author Jefferson
 */
public class Mensaje implements MessageCreateListener {

    public void onMessageCreate(MessageCreateEvent event) {
        
        if (event.getMessageContent().equalsIgnoreCase("!manco")) {
            event.getChannel().sendMessage("Manco ese Junior :OdaClown:");
            
        }
    }
}
