package com.example.simpsonbook.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.simpsonbook.Adapter.CustomAdapter;
import com.example.simpsonbook.Model.Simpson;
import com.example.simpsonbook.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = findViewById(R.id.listView);

        Simpson homer = new Simpson("homer","Nuclear",R.drawable.homer);
        Simpson lisa = new Simpson("Lisa","Student",R.drawable.simpson);
        Simpson bart = new Simpson("bart","Student",R.drawable.bart);

        final ArrayList<Simpson> simpsons = new ArrayList<>();
        simpsons.add(homer);
        simpsons.add(lisa);
        simpsons.add(bart);

        CustomAdapter customAdapter = new CustomAdapter(simpsons,MainActivity.this);
        listView.setAdapter(customAdapter);

       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Intent intent = new Intent(MainActivity.this, ActivityDetail.class);
               intent.putExtra("selectedSimpson",simpsons.get(position));
               startActivity(intent);
           }
       });


    }
}