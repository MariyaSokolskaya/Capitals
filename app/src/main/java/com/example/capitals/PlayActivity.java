package com.example.capitals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PlayActivity extends AppCompatActivity {

    TextView question;
    Button answer1, answer2, answer3, answer4;
    int numberQ, number1, number2, number3;
    Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Resources r = getResources();

        question = findViewById(R.id.question);
        answer1 = findViewById(R.id.answer1);
        answer2 = findViewById(R.id.answer2);
        answer3 = findViewById(R.id.answer3);
        answer4 = findViewById(R.id.answer4);


        InputStream question_stream = r.openRawResource(R.raw.question);
        InputStreamReader question_reader = new InputStreamReader(question_stream);
        Gson gson = new Gson();
        ArrayList questions = gson.fromJson(question_reader, ArrayList.class);

        numberQ = rand.nextInt(questions.size());
        question.setText(String.valueOf(questions.get(numberQ)));

        InputStream answer_stream = r.openRawResource(R.raw.question);
        InputStreamReader answer_reader = new InputStreamReader(answer_stream);
        Gson gson1 = new Gson();
        ArrayList answers = gson.fromJson(answer_reader, ArrayList.class);

        number1 = rand.nextInt(answers.size());
        number2 = rand.nextInt(answers.size());
        number3 = rand.nextInt(answers.size());

        ArrayList ans = new ArrayList();
        ans.add(questions.get(numberQ));
        ans.add(questions.get(number1));
        ans.add(questions.get(number2));
        ans.add(questions.get(number3));
        Collections.shuffle(ans);

        answer1.setText(String.valueOf(ans.get(0)));
        answer1.setText(String.valueOf(ans.get(1)));
        answer1.setText(String.valueOf(ans.get(2)));
        answer1.setText(String.valueOf(ans.get(3)));
    }
}
