package com.example.kittens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

   private  ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.ib_enter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                goToRvActivity();
            }
        });


    }

    public void goToRvActivity(){

        Intent intent = new Intent(this, Main2Activity.class);

        startActivity(intent);

    }
}
