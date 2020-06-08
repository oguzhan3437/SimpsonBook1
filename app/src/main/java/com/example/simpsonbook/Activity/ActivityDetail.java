package com.example.simpsonbook.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.simpsonbook.Model.Simpson;
import com.example.simpsonbook.R;

public class ActivityDetail extends AppCompatActivity {
    private TextView textViewJob,textViewName;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        textViewJob = findViewById(R.id.textView_job);
        textViewName = findViewById(R.id.textView_name);
        imageView = findViewById(R.id.imageView);

        Intent intent = getIntent();
        Simpson simpson = (Simpson) intent.getSerializableExtra("selectedSimpson");

        Bitmap bitmap = BitmapFactory.decodeResource(getApplicationContext().getResources(),simpson.getPictureInt());

        textViewName.setText(simpson.getName());
        textViewJob.setText(simpson.getJob());
        imageView.setImageBitmap(bitmap);
    }
}