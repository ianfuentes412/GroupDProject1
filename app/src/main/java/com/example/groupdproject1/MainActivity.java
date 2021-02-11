package com.example.groupdproject1;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public Button d_button;
    public Button r_button;
    public Button s_button;
    public Button i_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        d_button = (Button) findViewById(R.id.dwaine_profile_);
        r_button = (Button) findViewById(R.id.ryan_profile_);
        s_button = (Button) findViewById(R.id.sandeep_profile_);
        i_button = (Button) findViewById(R.id.ian_profile_);

        d_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, dwaine_profile.class);
                startActivity(intent);

            }
        });

        r_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ryan_profile.class);
                startActivity(intent);

            }
        });

        s_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, sandeep_profile.class);
                startActivity(intent);

            }
        });

        i_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ian_profile.class);
                startActivity(intent);

            }
        });
    }
}