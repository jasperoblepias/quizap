package com.example.quizap;

public class questionsLitGradeSchool {
    public String mQuestions [] = {
            "We turned up the heat since it was getting cold",
            "Tommy and Matthew are good friends because they have many common interests and hobbies",
            "Anna practiced math during summer vacation, therefore, she finds math easy.",
            "I fell off my bike and scraped my knee.",
            "Our apartment is on the 11th floor , therefore, we have a great view of the city.",
            "What is the effect? Terry trained well for the track meet; therefore,",
            "Janice didn't eat her breakfast quickly, so she missed the school bus.",
            "It was pouring rain, so the football game was canceled.",
            "What is the cause?Jose drank two glasses of ice-cold water",
            "What is the cause? Melissa was promoted to a better-paying position at work"

    };

    private String mChoices [][] = {
            {"Cause","Effect","Not enough info","None of the above"},
            {"Cause","Effect","Not enough info","None of the above"},
            {"Cause","Effect","Not enough info","None of the above"},
            {"Cause","Effect","Not enough info","None of the above"},
            {"Cause","Effect","Not enough info","None of the above"},
            {"He decided not to \nrun in the race.","He became hungry, ate \n too much, and got sick","He won the 50-yard \ndash race","He had never trained \nso well before."},
            {"Cause","Effect","Not enough info","None of the above"},
            {"Cause","Effect","Not enough info","None of the above"},
            {"Because he had nothing \nelse to do.","Because he was extremely \nhot and thirsty","Because he was feeling cold.","Because he was going out \nwith his friends."},
            {"Because she was an \nexcellent worker.","Because she was often \nlate or absent.","Because she went on \nvacation to Europe.","Because she asked for \nhelp so often."},
    };

    private String mAnswers [] = {
            "Effect",
            "Effect",
            "Effect",
            "Cause",
            "Effect",
            "He won the 50-yard \ndash race",
            "Effect",
            "Cause",
            "Because he was extremely \nhot and thirsty",
            "Because she was an \nexcellent worker."
    };

    public String getQuestions(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice0 = mChoices [a] [0];
        return choice0;
    }

    public String getChoice2(int a){
        String choice1 = mChoices [a] [1];
        return choice1;
    }

    public String getChoice3(int a){
        String choice2 = mChoices [a] [2];
        return choice2;
    }

    public String getChoice4(int a){
        String choice3 = mChoices [a] [3];
        return choice3;
    }

    public String getCorrectAnswer(int a){
        String answer = mAnswers[a];
        return answer;
    }
}
