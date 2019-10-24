package com.example.kittens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

import static com.example.kittens.Main2Activity.EXTRA_CREATOR;
import static com.example.kittens.Main2Activity.EXTRA_LIKES;
import static com.example.kittens.Main2Activity.EXTRA_URL;

public class DetailPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_page);

        Intent intent = getIntent();

        String imageUrl = intent.getStringExtra(EXTRA_URL);

        String creatorName = intent.getStringExtra(EXTRA_CREATOR);
        int likeCount = intent.getIntExtra(EXTRA_LIKES, 0);

        CircleImageView circleImageView = findViewById(R.id.civ_detail_image);
        TextView tvDetailCreator = findViewById(R.id.tv_detail_creator);
        TextView tvDetailLikes = findViewById(R.id.tv_detail_likes);

        Picasso.get().load(imageUrl).fit().centerCrop().into(circleImageView);
        tvDetailCreator.setText(creatorName);
        tvDetailLikes.setText("Likes: " + likeCount);
    }
}
