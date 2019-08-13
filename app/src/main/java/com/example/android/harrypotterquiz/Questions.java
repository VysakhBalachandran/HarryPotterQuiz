package com.example.android.harrypotterquiz;

import static android.R.attr.name;

/**
 * Created by ACER on 12-08-2019.
 */

public class Questions {

    public  String ques[]={"Which of the Deathly Hallows does Harry receive as a Christmas gift?",
            "What profession are Hermione Granger's Muggle parents?",
            "What is the name of the ancient Weasley family owl?",
            "Which language, like Voldemort, is Harry able to speak?",
            "Which animal is the house emblem for Gryffindor?",
            "What is the potion Harry and Ron use to transform into Crabbe and Goyle?",
            "How many brothers and sisters does Ron have?",
            "Which professor teaches History of Magic classes at Hogwarts?",
            "What is the name of Hagrid's giant brother?",
            "In what month is Harry Potter's birthday?"};

    public  String opt[][]={{"Resurrection Stone","Elder Wand","Cloak of Invisibility"},
            {"Chefs","Dentists","Artists"},
            {"Errol","Fluffy","Hedwig"},
            {"Mermish","Parseltongue","Elfish"},
            {"Griffin","Snake","Lion"},
            {"Mandrake Potion","Polyjuice Potion","Elixir of Life"},
            {"2","6","8",},
            {"Professor Flitwick","Professor Binns","Professor Trelawney"},
            {"Gawp","Karkus","Grawp"},
            {"March","June","July"}};

    public  String ans[]={"Cloak of Invisibility",
            "Dentists",
            "Errol",
            "Parseltongue",
            "Lion",
            "Polyjuice Potion",
            "6",
            "Professor Binns",
            "Grawp",
            "July"};

    public  String getQuestion(int a){
        String question=ques[a];
        return question;
    }

    public  String getOption1(int a){
        String option1=opt[a][0];
        return option1;
    }

    public  String getOption2(int a){
        String option2=opt[a][1];
        return option2;
    }

    public  String getOption3(int a){
        String option3=opt[a][2];
        return option3;
    }

    public  String getAnswer(int a){
        String answer=ans[a];
        return answer;
    }
}
