package com.example.quizap;

public class questionsLitCollege {
    public String mQuestions [] = {
            "Repetition of initial consonant sounds through a sequence of words (ie: nearly napping)",
            "Reference- to history, myth, literature, etc.- that suggests the meaning or generalized implication of details.",
            "A ______ is a leading character who is not perfect, but is a representative of an average person",
            "A ______ is a phrase or expression that is trite, threadbare, or otherwise overused.",
            "A ______ is the direct and specific meaning of a word.",
            "Literary usage so widely employed that it has become accepted or even expected by the audience",
            "_______ is the suggested meaning of a word, apart from what it explicitly describes",
            "Comparison based on certain resemblances between things that are otherwise not alike",
            "________ is narration that explains, defines, and interprets; also presents background information",
            "A ________ is a fictional character who is relatively simple and presented with having few traits.",
    };

    private String mChoices [][] = {
            {"Alliteration","Allusion","Denotation","Syntax"},
            {"Alliteration","Characterization","Syntax","Allusion"},
            {"Anti hero","Protagonist ","Antagonist","Role Model"},
            {"Cliché","Slogan","Stereotype ","Synonym"},
            {"Denotation","Connotation","Specific ","Title"},
            {"Denotation","Convention","Syntax","Antagonist"},
            {"Denotation","Connotation","Specific","Title"},
            {"Motif","Simile","Paradox","Analogy"},
            {"Exposition","Background","Setting","Plot"},
            {"Simple","Flat","Protagonist","hero"},
    };

    private String mAnswers [] = {
            "Alliteration",
            "Allusion",
            "Anti hero",
            "Cliché",
            "Denotation ",
            "Convention",
            "Connotation",
            "Analogy",
            "Exposition",
            "Flat",

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
