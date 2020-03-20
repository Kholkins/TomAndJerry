package com.example.tomandjerry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean a = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void animateTomJerry(View view) {

        ImageView imageViewTom = (ImageView)findViewById(R.id.imageViewTom);
        ImageView imageViewJerry = (ImageView)findViewById(R.id.imageViewJerry);
        if (a == true){
            imageViewTom.animate().alpha(0).setDuration(3000);
            imageViewJerry.animate().alpha(1).setDuration(3000);
        }else {
            imageViewJerry.animate().alpha(0).setDuration(3000);
            imageViewTom.animate().alpha(1).setDuration(3000);
        }
        a = !a;
    }
}
