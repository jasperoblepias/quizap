package com.example.quizap;

public class questionsHistoryGradeSchool {
    public String mQuestions [] = {
            "The building of the pyramids, the Roman Empire and the Dark Ages are all considered to be...",
            "Events have happened in history ____ I was born.",
            "Events such as the two World Wars and the Industrial Revolution are all part of..",
            "The Roman Empire, The Aztecs and The Incas are all considered to be...",
            "Most peoples' lives can be measured in...",
            "History is about things which have happened in the past, sometimes very...",
            "Christopher Columbus was a great explorer noted for discovering what?",
            "In the middle ages, most roads were tracks. How did most people get around?",
            "By the 18th Century, most wealthy people traveled in what?",
            "What is the name given to people who dig to find old things in the ground?",

    };

    private String mChoices [][] = {
            {"Modern history","Recent history","Ancient history","Events from the future"},
            {"not long after","around the time","soon after","long before  "},
            {"ancient history","modern history","events which happened last week","things which may happen  " + "\n in the future"},
            {"ancient civilizations","modern people","people from recent history","groups we would never \n learn about"},
            {"decades","centuries","weeks","minutes"},
            {"long ago","much into the future","far into next year","soon"},
            {"Potatoes","America","Cheese","Italy"},
            {"In a car","On horseback","By train","On roller skates"},
            {"A broken hand cart","A comfortable horse-drawn coach","A rickshaw","A miniature steam engine"},
            {"Architects","Archaeologists","Historians","Gardeners"},

    };

    private String mAnswers [] = {
            "Ancient history",
            "long before  ",
            "modern history",
            "ancient civilizations",
            "decades",
            "long ago",
            "America",
            "On horseback",
            "A comfortable horse-drawn coach",
            "Archaeologists"
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
