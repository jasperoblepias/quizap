package com.example.quizap;

public class questionsMathCollege {
    public String mQuestions [] = {
            "Simplify: 9log9^(4) =",
            "Simplify: 3log3^(-5) =",
            "If f(x) = -2x2 + 8x - 4, which of the following is true?",
            "If f(x) = 5 - 2^x, then f^-1 (- 3) =",
            "If logx(3) = 1/4, then x =",
            "If f(x) = -x^2 + 1, then f(x + 1) =",
            "If f(x) = x - 4, then (f o f)(3) = =",
            "If ln(3x - 2) = 1, then x =",
            "The number of solutions of (x^2 + 1)^2 + 2(x^2 + 1) - 3 = 0 is equal to",
            "The number of points of intersections of the graphs of y = 2^x and y = -x^2 + 2 is equal to",
    };

    private String mChoices [][] = {
            {"3","4","9","81"},
            {"-5","3","9","undefined"},
            {"The maximum value \nof f(x) is - 4.","The graph of f opens upward.","The graph of f has \nno x-intercept","f is not a one to \none function."},
            {"8/39","-3","3","32"},
            {"81","1/81","3","9"},
            {"-x^2 + 1","-x^2 - 2x","-x^2","-x^2 -2x – 2"},
            {"1","-1","-5","5"},
            {"2/3","(2 + e)/3","3/2","e/3"},
            {"1","2","3","4"},
            {"0","1","2","3"},


    };

    private String mAnswers [] = {
            "4",
            "undefined",
            "f is not a one to one function.",
            "3",
            "81",
            "-x^2 - 2x",
            "-5",
            "(2 + e)/3",
            "1",
            "3",

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
