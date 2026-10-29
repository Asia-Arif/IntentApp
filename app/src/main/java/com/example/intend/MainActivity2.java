
package com.example.intend;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btnBack = findViewById(R.id.btnBack);

        btnBack.setOnClickListener(view -> {
            finish();
        });
    }
}
