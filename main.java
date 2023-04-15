package main;

import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import createbot.createbot;

public class main {
    public static void main(String[] args) {
        try{
            createbot.create();
        } catch (TelegramApiException e){
            e.printStackTrace();
        }
    }
}
