package com.example.tomandjerry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageViewTom;
    ImageView imageViewJerry;

    boolean a = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewTom = (ImageView)findViewById(R.id.imageViewTom);
        imageViewJerry = (ImageView)findViewById(R.id.imageViewJerry);
    }

    public void animateTomJerry(View view) {

        if (a == true){
            imageViewTom.animate().rotation(imageViewTom.getRotation()+3600).scaleX(0.0f).scaleY(0.0f).alpha(0).setDuration(3000);
            imageViewJerry.animate().rotation(imageViewJerry.getRotation()+3600).scaleX(1.0f).scaleY(1.0f).alpha(1).setDuration(3000);
        }else {
            imageViewJerry.animate().rotation(imageViewJerry.getRotation()+3600).scaleX(0.0f).scaleY(0.0f).alpha(0).setDuration(3000);
            imageViewTom.animate().rotation(imageViewTom.getRotation()+3600).scaleX(1.0f).scaleY(1.0f).alpha(1).setDuration(3000);
        }
        a = !a;
    }
}
