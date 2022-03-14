package com.example.applocationvoiture;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class VoitureDetail extends AppCompatActivity {
    private ImageView iv;
    private TextView title,description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voiture_detail);
        title = findViewById(R.id.title);
        description = findViewById(R.id.Description1);

        iv = findViewById(R.id.imageView);

        Intent intent=this.getIntent();
        String title1=intent.getStringExtra("nom");
        int imageView1=Integer.valueOf(intent.getStringExtra("photo"));
        String Description1=intent.getStringExtra("desc");

        title.setText(title1);
        description.setText(Description1);
        iv.setImageResource(imageView1);
    }

}
