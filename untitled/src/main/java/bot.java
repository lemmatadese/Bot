import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class bot extends TelegramLongPollingBot {
    public void onUpdateReceived (Update update){

        String command= update.getMessage().getText();
        if (command.equals("/hello")) {
            String message="how are you?";

            SendMessage response= new SendMessage();
            response.setChatId(update.getMessage().getChatId().toString());
            response.setText(message);
            try{
                execute(response);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String getBotUsername() {

        return "LemichoBot";
    }

    @Override
    public String getBotToken() {

        return "5561891268:AAGVVU54zT-W4OgAAmFwACSW6ceZWQJ8tN0";
    }
}