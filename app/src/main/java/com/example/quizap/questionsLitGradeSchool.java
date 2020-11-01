package com.example.quizap;

public class questionsLitGradeSchool {
    public String mQuestions [] = {
            "We turned up the heat since it was getting cold",
            "Tommy and Matthew are good friends because they have many common interests and hobbies.",
            "Anna practiced math during summer vacation, therefore, she finds math easy."
    };

    private String mChoices [][] = {
            {"Cause","Effect","All of the above","None of the above"},
            {"Cause","Effect","All of the above","None of the above"},
            {"Cause","Effect","All of the above","None of the above"}
    };

    private String mAnswers [] = {
            "Effect","Effect","Effect"
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
