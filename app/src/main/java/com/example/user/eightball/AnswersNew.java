package com.example.user.eightball;

import java.util.ArrayList;

/**
 * Created by user on 17/08/2016.
 */
public class AnswersNew extends Answers {

    public AnswersNew(){
        super();
    }

    public AnswersNew(ArrayList<String>answers){
        super(answers);

    }

    @Override
    public void setupAnswers(){
        String[] answers = {
                "HEY CHRIS! Cool story bro. In what chapter do you shut the f*ck up?",
                "HEY CHRIS! Is your ass jealous of the amount of shit that just came out of your mouth?",
                "HEY CHRIS! I'm not saying I hate you, but I would unplug your life support to charge my phone.",
                "HEY CHRIS! Your birth certificate is an apology letter from the condom factory.",
                "HEY CHRIS! I’m jealous of all the people that haven't met you!",
                "HEY CHRIS! You bring everyone a lot of joy, when you leave the room.",
                "HEY CHRIS! I'd like to see things from your point of view but I can't seem to get my head that far up my ass."
        };

        for(String answer: answers){
            mAnswers.add(answer);
        }

    }
}
