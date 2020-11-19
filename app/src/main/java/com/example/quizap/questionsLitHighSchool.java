package com.example.quizap;

public class questionsLitHighSchool {
    public String mQuestions [] = {
            "What do transitional words do in an essay?",
            "Which of these words would be best for a transition of addition?",
            "When citing a web page, which is listed first?",
            "If citing a video clip on the Internet, what is cited last?",
            "What group of people were said to be descendants of Aeneas?",
            "What is the Japanese word for \"gods\"?",
            "Who was the jackal-headed god of ancient Egypt?",
            "What does the title \"Utopia\" mean?",
            "Who wrote \"Dracula\"?",
            " Who wrote the novel \"The Prince and the Pauper\"?",
    };

    private String mChoices [][] = {
            {"Stop Action", "Emphasize Differences" , "Slow The Reader" , "Help Ideas Flow"},
            {"Otherwise","Chiefly","Above All","Also"},
            {"Author Or Originator","Date Downloaded","Title Of Web Page","Web Address"},
            {"File Name","Author","Date Downloaded","URL"},
            {"Romans","Greeks","Persian","Spartans"},
            {"Sado","Awazi","Zen","Kami"},
            {"Anubis","Horus","Set","Osiris"},
            {"A City Beneath \nThe Sea","An Average Society","A Perfect Society","A Terrible Society"},
            {"Stephen King","Bram Stoker","John Grisham","Mary Shelley"},
            {"Aldous Huxley","Sinclair Lewis","John Steinbeck","Mark Twain"},
    };

    private String mAnswers [] = {
            "Help Ideas Flow",
            "Also",
            "Author Or Originator",
            "URL",
            "Romans",
            "Kami",
            "Anubis",
            "A Perfect Society",
            "Bram Stoker",
            "Mark Twain",

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
