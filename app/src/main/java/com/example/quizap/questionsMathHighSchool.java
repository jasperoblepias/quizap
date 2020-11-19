package com.example.quizap;

public class questionsMathHighSchool {
    public String mQuestions [] = {
            "Write 4×10^-2 as a decimal.",
            "For what value of k is the point (-2, k) on the line with equation -3 x + 3 y = 4?",
            "Simplify (-a^2 b^3)^2 (c^2)^0  ",
            "Which property is used to write a(x + y) = a x + a y",
            "Write 0.12×10^-3 as a decimal",
            "If (x^2 - y^2) = 10 and (x + y) = 2, find x and y.",
            "What is the degree of 7x + 1?",
            "What is the solution to the system x + y = 5 and 3x - y = 3?",
            "How many ways can a group of 12 choose a committee of 9?",
            "How do you write an algebraic equation for \"the opposite of a number added to 3 is 16\"?",
    };

    private String mChoices [][] = {
            {"0.04","0.004","00.04","4"},
            {"k = 3/4","k = -3/4", "k = -2/3","k = 2/3"},
            {"a^8 b^2","a^4 b^6","a^6 b^4","none of the above"},
            {"Commutative","Distributive ", "Associative","Identity"},
            {"0.00000012","0.012","0.000012", "0.00012",},
            {"x = 7/2 , y =  3/2", "x = 7/2 , y = -3/2" , "x = -7/2 , y = -3/2","x = -7/2 , y = 3/2"},
            {"1","7","2","0"},
            {"(2, -3)","(-2, 3)","(-2, -3)","(2, 3)"},
            {"220","21","108","200"},
            {"N + 3 = 16","-(n + 3) = 16","-(n) + 3 = 16","-n + 3 = -16"},


    };

    private String mAnswers [] = {
            "0.04",
            "k = -2/3",
            "a^4 b^6",
            "Distributive",
            "0.00012",
            "x = 7/2 , y = -3/2",
            "1",
            "(2, 3)",
            "220",
            "-(n) + 3 = 16",

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
