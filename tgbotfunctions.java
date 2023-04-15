package tgbotfunctions;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import quiz.quiz;

import java.util.ArrayList;
import java.util.List;


public class tgbotfunctions extends TelegramLongPollingBot {

    //Аттрибуты класса
    ArrayList<String> ids = new ArrayList<>();
    quiz newQuiz = new quiz();

    //Переопределние метода для получения имени бота
    @Override
    public String getBotUsername() {
        return "Geo_Bot";
    }
    //Переопределение метода для получения уникального токена бота
    @Override
    public String getBotToken(){
        return "6072963935:AAF5YAakPxSNLyavzc3wJU9Q_F6FS6iY47k";
    }
    //Переопределение реакции бота на сообщение
    @Override
    public void onUpdateReceived(Update update) {


        //Определние основных параметров сообщения
        var msg = update.getMessage();
        var user = msg.getFrom();
        var id = msg.getChatId().toString();
        //Объявление письма
        SendMessage sm = new SendMessage();
        sm.setChatId(id);
        sm.enableMarkdown(true);
        //Если пользователь новый - добавление в ArrayList
        if (!ids.contains(id)){
            ids.add(id);
        }

        if(msg.getText().equals("/start")){
            sm.setText("Для начала игры пропиши /new");
            ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
            try{
                execute(sm);
            } catch (Exception e){
                e.printStackTrace();
            }
        }

        else if(msg.getText().equals("/new")){
            ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
            sm.setReplyMarkup(replyKeyboardMarkup);
            replyKeyboardMarkup.setSelective(true);
            replyKeyboardMarkup.setResizeKeyboard(true);
            replyKeyboardMarkup.setOneTimeKeyboard(false);
            List<KeyboardRow> keyboard = new ArrayList<>();
            sm.setText(newQuiz.questions.get(0));
            KeyboardRow keyboardFirstRow = new KeyboardRow();

            keyboardFirstRow.add("Панама");
            keyboardFirstRow.add("Самбреро");


            KeyboardRow keyboardSecondRow = new KeyboardRow();

            keyboardSecondRow.add("Панамка");
            keyboardSecondRow.add("Кепка");


            keyboard.add(keyboardFirstRow);
            keyboard.add(keyboardSecondRow);

            replyKeyboardMarkup.setKeyboard(keyboard);

            try{
                execute(sm);
            } catch (Exception e){
                e.printStackTrace();
            }

        }

        else if(msg.getText().equals("Панама")){
            ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
            sm.setReplyMarkup(replyKeyboardMarkup);
            replyKeyboardMarkup.setSelective(true);
            replyKeyboardMarkup.setResizeKeyboard(true);
            replyKeyboardMarkup.setOneTimeKeyboard(false);
            List<KeyboardRow> keyboard = new ArrayList<>();
            sm.setText(newQuiz.questions.get(1));
            KeyboardRow keyboardFirstRow = new KeyboardRow();

            keyboardFirstRow.add("Гренландия");
            keyboardFirstRow.add("Скандинавский");


            KeyboardRow keyboardSecondRow = new KeyboardRow();

            keyboardSecondRow.add("Аравийский");
            keyboardSecondRow.add("Юкотан");


            keyboard.add(keyboardFirstRow);
            keyboard.add(keyboardSecondRow);

            replyKeyboardMarkup.setKeyboard(keyboard);

            try{
                execute(sm);
            } catch (Exception e){
                e.printStackTrace();
            }

        }

        else if(msg.getText().equals("Аравийский")){
            ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
            sm.setReplyMarkup(replyKeyboardMarkup);
            replyKeyboardMarkup.setSelective(true);
            replyKeyboardMarkup.setResizeKeyboard(true);
            replyKeyboardMarkup.setOneTimeKeyboard(false);
            List<KeyboardRow> keyboard = new ArrayList<>();
            sm.setText(newQuiz.questions.get(2));
            KeyboardRow keyboardFirstRow = new KeyboardRow();

            keyboardFirstRow.add("Алжир");
            keyboardFirstRow.add("Триполи");


            KeyboardRow keyboardSecondRow = new KeyboardRow();

            keyboardSecondRow.add("Каир");
            keyboardSecondRow.add("Дакар");


            keyboard.add(keyboardFirstRow);
            keyboard.add(keyboardSecondRow);

            replyKeyboardMarkup.setKeyboard(keyboard);

            try{
                execute(sm);
            } catch (Exception e){
                e.printStackTrace();
            }

        }

        else if(msg.getText().equals("Триполи")){
            ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
            sm.setReplyMarkup(replyKeyboardMarkup);
            replyKeyboardMarkup.setSelective(true);
            replyKeyboardMarkup.setResizeKeyboard(true);
            replyKeyboardMarkup.setOneTimeKeyboard(false);
            List<KeyboardRow> keyboard = new ArrayList<>();
            sm.setText(newQuiz.questions.get(3));
            KeyboardRow keyboardFirstRow = new KeyboardRow();

            keyboardFirstRow.add("Рейкъявик");
            keyboardFirstRow.add("Осло");


            KeyboardRow keyboardSecondRow = new KeyboardRow();

            keyboardSecondRow.add("Москва");
            keyboardSecondRow.add("Стокгольм");


            keyboard.add(keyboardFirstRow);
            keyboard.add(keyboardSecondRow);

            replyKeyboardMarkup.setKeyboard(keyboard);

            try{
                execute(sm);
            } catch (Exception e){
                e.printStackTrace();
            }

        }

        else if(msg.getText().equals("Рейкъявик")){
            ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
            sm.setReplyMarkup(replyKeyboardMarkup);
            replyKeyboardMarkup.setSelective(true);
            replyKeyboardMarkup.setResizeKeyboard(true);
            replyKeyboardMarkup.setOneTimeKeyboard(false);
            List<KeyboardRow> keyboard = new ArrayList<>();
            sm.setText(newQuiz.questions.get(4));
            KeyboardRow keyboardFirstRow = new KeyboardRow();

            keyboardFirstRow.add("Косовары");
            keyboardFirstRow.add("Косовцы");


            KeyboardRow keyboardSecondRow = new KeyboardRow();

            keyboardSecondRow.add("Косовщики");
            keyboardSecondRow.add("Косовий");


            keyboard.add(keyboardFirstRow);
            keyboard.add(keyboardSecondRow);

            replyKeyboardMarkup.setKeyboard(keyboard);

            try{
                execute(sm);
            } catch (Exception e){
                e.printStackTrace();
            }

        }

        else if(msg.getText().equals("Косовары")){
            ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
            sm.setReplyMarkup(replyKeyboardMarkup);
            replyKeyboardMarkup.setSelective(true);
            replyKeyboardMarkup.setResizeKeyboard(true);
            replyKeyboardMarkup.setOneTimeKeyboard(false);
            List<KeyboardRow> keyboard = new ArrayList<>();
            sm.setText(newQuiz.questions.get(5));
            KeyboardRow keyboardFirstRow = new KeyboardRow();

            keyboardFirstRow.add("Филиппины");
            keyboardFirstRow.add("Папуа-новая Гвинея");


            KeyboardRow keyboardSecondRow = new KeyboardRow();

            keyboardSecondRow.add("Дания");
            keyboardSecondRow.add("Индонезия");


            keyboard.add(keyboardFirstRow);
            keyboard.add(keyboardSecondRow);

            replyKeyboardMarkup.setKeyboard(keyboard);

            try{
                execute(sm);
            } catch (Exception e){
                e.printStackTrace();
            }

        }

        else if(msg.getText().equals("Индонезия")){
            ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
            sm.setReplyMarkup(replyKeyboardMarkup);
            replyKeyboardMarkup.setSelective(true);
            replyKeyboardMarkup.setResizeKeyboard(true);
            replyKeyboardMarkup.setOneTimeKeyboard(false);
            List<KeyboardRow> keyboard = new ArrayList<>();
            sm.setText(newQuiz.questions.get(6));
            KeyboardRow keyboardFirstRow = new KeyboardRow();

            keyboardFirstRow.add("Кингстон");
            keyboardFirstRow.add("Дакар");


            KeyboardRow keyboardSecondRow = new KeyboardRow();

            keyboardSecondRow.add("Гвиана");
            keyboardSecondRow.add("Гавана");


            keyboard.add(keyboardFirstRow);
            keyboard.add(keyboardSecondRow);

            replyKeyboardMarkup.setKeyboard(keyboard);

            try{
                execute(sm);
            } catch (Exception e){
                e.printStackTrace();
            }

        }

        else if(msg.getText().equals("Кингстон")){
            ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
            sm.setReplyMarkup(replyKeyboardMarkup);
            replyKeyboardMarkup.setSelective(true);
            replyKeyboardMarkup.setResizeKeyboard(true);
            replyKeyboardMarkup.setOneTimeKeyboard(false);
            List<KeyboardRow> keyboard = new ArrayList<>();
            sm.setText(newQuiz.questions.get(7));
            KeyboardRow keyboardFirstRow = new KeyboardRow();

            keyboardFirstRow.add("Новая Зеландия");
            keyboardFirstRow.add("Алжир");


            KeyboardRow keyboardSecondRow = new KeyboardRow();

            keyboardSecondRow.add("Индия");
            keyboardSecondRow.add("Австралия");


            keyboard.add(keyboardFirstRow);
            keyboard.add(keyboardSecondRow);

            replyKeyboardMarkup.setKeyboard(keyboard);

            try{
                execute(sm);
            } catch (Exception e){
                e.printStackTrace();
            }

        }

        else if(msg.getText().equals("Австралия")){
            ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
            sm.setReplyMarkup(replyKeyboardMarkup);
            replyKeyboardMarkup.setSelective(true);
            replyKeyboardMarkup.setResizeKeyboard(true);
            replyKeyboardMarkup.setOneTimeKeyboard(false);
            List<KeyboardRow> keyboard = new ArrayList<>();
            sm.setText(newQuiz.questions.get(8));
            KeyboardRow keyboardFirstRow = new KeyboardRow();

            keyboardFirstRow.add("Португальский");
            keyboardFirstRow.add("Испанский");


            KeyboardRow keyboardSecondRow = new KeyboardRow();

            keyboardSecondRow.add("Бразильский");
            keyboardSecondRow.add("Аргентинский");


            keyboard.add(keyboardFirstRow);
            keyboard.add(keyboardSecondRow);

            replyKeyboardMarkup.setKeyboard(keyboard);

            try{
                execute(sm);
            } catch (Exception e){
                e.printStackTrace();
            }

        }

        else if(msg.getText().equals("Португальский")){
            ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
            sm.setReplyMarkup(replyKeyboardMarkup);
            replyKeyboardMarkup.setSelective(true);
            replyKeyboardMarkup.setResizeKeyboard(true);
            replyKeyboardMarkup.setOneTimeKeyboard(false);
            List<KeyboardRow> keyboard = new ArrayList<>();
            sm.setText(newQuiz.questions.get(9));
            KeyboardRow keyboardFirstRow = new KeyboardRow();

            keyboardFirstRow.add("Стамбул");
            keyboardFirstRow.add("Константинополь");


            KeyboardRow keyboardSecondRow = new KeyboardRow();

            keyboardSecondRow.add("Византия");
            keyboardSecondRow.add("Анкара");


            keyboard.add(keyboardFirstRow);
            keyboard.add(keyboardSecondRow);

            replyKeyboardMarkup.setKeyboard(keyboard);

            try{
                execute(sm);
            } catch (Exception e){
                e.printStackTrace();
            }

        }
        else if (msg.getText().equals("Анкара")){
            sm.setText("Поздравляем с успешным прохождением теста!");
            try{
                execute(sm);
            } catch (Exception e){
                e.printStackTrace();
            }
        }

        else {
            sm.setText("К сожалению, ты проиграл =(\nДля начала игры пропиши /new");
            try{
                execute(sm);
            } catch (Exception e){
                e.printStackTrace();
            }
        }


        for (int i = 0; i < ids.size(); i++) {
            System.out.println(ids.get(i));

        }



    }


}
