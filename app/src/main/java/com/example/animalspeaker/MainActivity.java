package com.example.animalspeaker;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton imageButtonBrownhamster,imageButtonBrownroster,imageButtonCheetahlying,imageButtonLion,imageButtonRedparrots,imageButtonShark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButtonBrownhamster = findViewById(R.id.imgbrownhamster);
        imageButtonBrownroster= findViewById(R.id.imgbrownroster);
        imageButtonCheetahlying= findViewById(R.id.imgcheetahlying);
        imageButtonLion= findViewById(R.id.imglion);
        imageButtonRedparrots= findViewById(R.id.imgredparrots);
        imageButtonShark = findViewById(R.id.imgshark);

        imageButtonBrownhamster.setOnClickListener(this);
        imageButtonBrownroster.setOnClickListener(this);
        imageButtonCheetahlying.setOnClickListener(this);
        imageButtonLion.setOnClickListener(this);
        imageButtonRedparrots.setOnClickListener(this);
        imageButtonShark.setOnClickListener(this);

    }

    @Override
    public void onClick(View imageButtonView) {
        switch (imageButtonView.getId()){
            case R.id.imgbrownhamster:
                Toast.makeText(MainActivity.this,"Brown Hamster",Toast.LENGTH_SHORT).show();
                animalsSound(imageButtonView.getTag().toString());
                break;
            case R.id.imgbrownroster:
                Toast.makeText(MainActivity.this,"Brown Roster",Toast.LENGTH_SHORT).show();
                animalsSound(imageButtonView.getTag().toString());
                break;
            case R.id.imgcheetahlying:
                Toast.makeText(MainActivity.this,"Cheetah Lying",Toast.LENGTH_SHORT).show();
                animalsSound(imageButtonView.getTag().toString());
                break;
            case R.id.imglion:
                Toast.makeText(MainActivity.this,"Lion",Toast.LENGTH_SHORT).show();
                animalsSound(imageButtonView.getTag().toString());
                break;
            case R.id.imgredparrots:
                Toast.makeText(MainActivity.this,"Red Parrots",Toast.LENGTH_SHORT).show();
                animalsSound(imageButtonView.getTag().toString());
                break;
            case R.id.imgshark:
                Toast.makeText(MainActivity.this,"Shark",Toast.LENGTH_SHORT).show();
                animalsSound(imageButtonView.getTag().toString());
                break;
        }

    }

    public void animalsSound(String animalName){
        MediaPlayer animalsPlayer = MediaPlayer.create(this,getResources().getIdentifier(animalName,"raw",getPackageName()));
        animalsPlayer.start();
    }
}
