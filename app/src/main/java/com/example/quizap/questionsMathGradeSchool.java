package com.example.quizap;

public class questionsMathGradeSchool {
    public String mQuestions [] = {
            "Order from greatest to least the fractions 1/3 , 1/6 , 1/2 , 1/7.",
            "If 6 children share 145 sweets equally, how many sweets will remain?",
            "Round 312.92 to the nearest whole number.",
            "If you add 1,000 to 29,898, you obtain",
            "There are 61 boxes of pencils and there are 14 pencils in each box. How many pencils are there?",
            "Six tenths is the same as",
            "Three hundredths is the same as",
            "1/10 =",
            "Order from greatest to least the numbers 9.29 , 9.39 , 9.28, 9.91",
            "Linda cut 12.65 cm from a stick that was 15.5 cm long. How long is the stick now?",
    };

    private String mChoices [][] = {
            {"1/2 , 1/3 , 1/6 , 1/7","1/2 , 1/6 , 1/7,  1/3 ","1/2 , 1/2 , 1/6 , 1/7","1/7 , 1/6 , 1/3 , 1/2"},
            {"4","3","1","2"},
            {"312","313","312.50","312.90"},
            {"30,889","30,899","30,900","30,898"},
            {"856 pencils","850 pencils","854 pencils","900 pencils"},
            {"0.6","60","6.0","0.06"},
            {"0.03","300","300.0","0.3"},
            {"10.1","0.01","1.0","0.1"},
            {"9.91 , 9.39 , 9.29 , 9.28","9.29 , 9.28 , 9.91 , 9.39","9.39 , 9.91 , 9.28 , 9.29","9.28 , 2.29 , 9.39 , 1.91"},
            {"2.60cm","2.85 inch","2.85 cm","2.80 cm"}

    };

    private String mAnswers [] = {
            "1/2 , 1/3 , 1/6 , 1/7",
            "1",
            "313",
            "30,898",
            "854 pencils",
            "0.6",
            "0.03",
            "0.1",
            "9.91 , 9.39 , 9.29 , 9.28",
            "2.85 cm"
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
