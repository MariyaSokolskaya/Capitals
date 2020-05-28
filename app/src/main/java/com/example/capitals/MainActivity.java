package com.example.capitals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SimpleAdapter;

public class MainActivity extends AppCompatActivity {

    Button single, friends, howPlay, aboutCountries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        single = findViewById(R.id.single);
        friends = findViewById(R.id.friends);
        howPlay = findViewById(R.id.howPlay);
        aboutCountries = findViewById(R.id.aboutCountries);

        View.OnClickListener singleOCL = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent singleI = new Intent(MainActivity.this, SInglePlayer.class);
                startActivity(singleI);
            }
        };
        singleOCL.onClick(single);
    }
}
