package exercise1;

import java.security.SecureRandom;

public class Test {
    // random-number generation
    private final SecureRandom randomNumbers = new SecureRandom();
    private int rightAnswers, wrongAnswers = 0;

    //set of questions
    private final String[] questions = {"The object is created with new keyword:",
                                        "These are rules that must be followed when writing a program:",
                                        "The java compiler generates:",
                                        "Which keyword is used to declare a named constant?",
                                        "Every complete statement ends with:"};

    //options for each questions
    private final String[] options = {"a) at compile-time \nb) at run-time\nc) depends on code \nd) none",
                                        "a) syntax \nb)punctuation \nc) keywords \nd) operators",
                                        "a) machine code \nb) byte code \nc) source code \nd) HTML",
                                        "a) constant \nb) namedConstant \nc) final \nd)concrete",
                                        "a) period \nb) parenthesis \nc) semicolon \nd)ending brace"};


    //array containing answers
    private final String[] answerKey={"b","a","b","c","c"};
    

}