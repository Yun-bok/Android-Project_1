package com.example.buttonproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnNaver,btnPhone,btnGallery,btnClose,btnColor;

        btnNaver = (Button)findViewById(R.id.btnNaver);
        btnPhone = (Button)findViewById(R.id.btnPhone);
        btnGallery = (Button)findViewById(R.id.btnGallery);
        btnClose = (Button)findViewById(R.id.btnClose);
        btnColor = (Button)findViewById(R.id.btnColor);

        btnNaver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.naver.com/"));
                startActivity(mIntent);
            }
        });

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("content://media/internel/images/media"));
                startActivity(mIntent);

            }
        });
        btnColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnPhone.setBackgroundColor(Color.DKGRAY);
            }
        });

        btnPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/911"));
                startActivity(mIntent);
            }
        });
    }
}