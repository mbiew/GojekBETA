package com.example.gojekbeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imgFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgFood = (ImageView) findViewById(R.id.food);
        imgFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.food:
                        Intent foodIntent = new Intent(MainActivity.this, MainGoFood.class);
                        startActivity(foodIntent);
                    default:
                        break;
                }

            }
        });

    }

    @Override
    public void onClick(View view) {

    }
}


