package com.example.quizap;

public class questionsHistoryCollege {
    public String mQuestions [] = {
            "The Battle of Austerlitz took place during which war?",
            "Which Famous battle was fought in 1066?",
            "Approximately when did the Big Bang occur?",
            "During WWII, what was the Luftwaffe?",
            "In what year did Christopher Columbus land in North America?",
            "Roman Emperor Caligula made his what an official Senator?",
            "the death of what person triggered World War I?",
            "Rome was founded in which year?",
            "The Statue of Liberty was a gift from which country?",
            "What was the first colony established by the British in North America?",
    };

    private String mChoices [][] = {
            {"WW2" , "Napoleonic Wars" , "WW1" , "Seven Years war"},
            {"Battle of Hastings" , "Battle of Waterloo" , "Battle of Agincourt" , "Battle of Somme"},
            {"13.7 Billion years ago" , "12 thousand years ago" , "13 million years" , "8.8 billion years ago "},
            {"German Navy" , "German Airforce" , "German secret \n pilot force " , "German Panzer Tank"},
            {"1599" , "1692" , "1499" , "1492"},
            {"Cat" , "Horse" , "Unborn child" , "Dog"},
            {"Ludwig III" , "Franz Ferdinand" , "Charles I" , "Nicholas II"},
            {"251 BC" , "1 BC" , "753 BC " , "2000 BC "},
            {"France" , "UK" , "Netherlands" , "Australia "},
            {"Jamestown" , "New York" , "Prince Edward Island" , "Rupert’s Land"},
    };

    private String mAnswers [] = {
            "Napoleonic Wars",
            "Battle of Hastings",
            "13.7 Billion years ago",
            "German Airforce",
            "1492",
            "Horse",
            "Franz Ferdinand",
            "753 BC ",
            "France",
            "Jamestown ",
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
