package com.example.kittens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

   private  ImageButton button;

   private CircleImageView civMain;

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
