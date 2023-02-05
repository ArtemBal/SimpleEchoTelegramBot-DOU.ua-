package simpleEchoBot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class SimpleEchoBot extends TelegramLongPollingBot {

    public void onUpdateReceived(Update update) {
    }

    public String getBotUsername() {
        return "your_bot_username ";
    }

    public String getBotToken() {
        return "bot_token";
    }
}
