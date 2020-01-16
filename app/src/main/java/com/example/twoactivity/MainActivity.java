package com.example.twoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button toggleActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleActivityButton = findViewById(R.id.button);

        toggleActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SwitchToSecondActivity();
            }
        });
    }

    void SwitchToSecondActivity() {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
