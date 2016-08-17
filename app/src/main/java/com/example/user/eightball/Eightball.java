package com.example.user.eightball;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by user on 16/08/2016.
 */
public class Eightball extends AppCompatActivity{

    EditText mQuestionEditText;
//    TextView mAnswerText;
    Button mShakeButton;

    Answers mAnswers;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mQuestionEditText = (EditText) findViewById(R.id.question_text);
//        mAnswerText = (TextView) findViewById(R.id.answer_text);
        mShakeButton = (Button) findViewById(R.id.shake_button);

        mAnswers = new AnswerShakespeare();

        mShakeButton.setOnClickListener(new View.OnClickListener(){
            @Override
        public void onClick(View view){
                String question = mQuestionEditText.getText().toString();
                Log.d("Eightball:", "Shake button clicked!");
                Log.d("Eightball:", "The question asked was'" + question + "'");
//                String answer = answer();
                String answer = mAnswers.getAnswer();

                Intent intent = new Intent(Eightball.this, AnswerActivity.class);
                intent.putExtra("answer", answer);
                intent.putExtra("question", question);
                Log.d("Eightball:", "passing through'" + answer + "'");
                startActivity(intent);
            }
        });

    }

//    public String answer() {
//
//        String[] answers = new String[5];
//
//        answers[0] = "Yes!";
//        answers[1] = "Maybe!";
//        answers[2] = "No!";
//        answers[3] = "If you try...";
//        answers[4] = "In good time";
//
//        Random rand = new Random();
//        int index = rand.nextInt(answers.length);
//
//        return answers[index];
//
//
//    }
}
