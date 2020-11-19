package com.example.quizap;

public class questionsHistoryHighSchool {
    public String mQuestions [] = {
            "An Ancient Greek, Alexander, was known as Alexander the what?",
            "Mahatma Gandhi was an Indian politician who protested in a particular way. What was it?",
            "Wolfgang Amadeus Mozart had a huge influence on music. How many pieces did he write?",
            "Nelson Mandela was a politician who spent 20 years in prison for what?",
            "Guru Nanak was a spiritual man from India. Which religion did he found?",
            "Joan of Arc changed the history of France by leading armies into battle. How did she die?",
            "In 1928, Alexander Flemming discovered penicillin. How is it used?",
            "Pablo Picasso, a famous Spanish artist, painted in an abstract style. This was called:",
            "What did the United States Constitution replace?",
            "World War I began in which year?",
    };

    private String mChoices [][] = {
            {"Alexander the Magnificent","Alexander the Mighty","Alexander the Great","Alexander the Awesome"},
            {"Without violence or anger","With lots of slogans \n and signs","By advertising on TV","By writing letters to \n the Queen"},
            {"More than 600","Less than 60","Exactly 27","More than 2000"},
            {"Robbing a bank","Opposing apartheid","Fraud","Internet scams"},
            {"Hinduism","Sikhism","Christianity","Judaism"},
            {"Decapitated","She died in her sleep","She drowned in a lake","She was burnt at \n the stake"},
            {"As a cough medicine","As an antibiotic","As a foot powder","As a treatment for lice"},
            {"cubism","squarism","trianglism","circlism"},
            {"The Mayflower Compact.", "An older version \n of itself.","The Articles of \n Confederation.","The Declaration of \n  Independence."},
            {"1923","1954","1911","1914"},

    };

    private String mAnswers [] = {
            "Alexander the Great",
            "Without violence or anger",
            "More than 600",
            "Opposing apartheid",
            "Sikhism",
            "She was burnt at the stake",
            "As an antibiotic",
            "cubism",
            "The Articles of Confederation.",
            "1914",

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
