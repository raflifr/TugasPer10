package com.example.tugasper10;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Detail extends AppCompatActivity {


    private TextView tvJudul, tvWeapon, tvDescription;
    private ImageView photo;
    String judul;
    String senjata;
    String desc;
    int image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvJudul = findViewById(R.id.tvJudul);

        tvWeapon = findViewById(R.id.tvWeapon);
        tvDescription = findViewById(R.id.tvDescription);

        photo = findViewById(R.id.photo);

        judul = getIntent().getStringExtra("name");

        senjata = getIntent().getStringExtra("weapon");

        desc = getIntent().getStringExtra("detail");

        Hero heroan = getIntent().getParcelableExtra("hero_data");

        image = getIntent().getIntExtra("photo", 0);
        photo.setImageResource(image);
        tvJudul.setText(judul);
        tvWeapon.setText(senjata);
        tvDescription.setText(desc);



    }

}