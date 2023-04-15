package quiz;

import java.util.ArrayList;

public class quiz {
    public ArrayList<String> questions = new ArrayList<>();
    public quiz(){
        adding();
    }
    public void adding(){
        questions.add("И головной убор, и государство?");
        questions.add("Наибольший полуостров?");
        questions.add("Столица Ливии?");
        questions.add("Самая северная столица Европы?");
        questions.add("Как называют жителей Косово?");
        questions.add("Страна из тысячи островов?");
        questions.add("Столица Ямайки?");
        questions.add("Тут живут ехидны");
        questions.add("На каком языке говорят в Бразилии?");
        questions.add("Столица Турции?");

    }
}