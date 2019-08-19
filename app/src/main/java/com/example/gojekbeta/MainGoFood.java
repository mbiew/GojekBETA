package com.example.gojekbeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainGoFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_go_food);

        final EditText nama = (EditText)findViewById(R.id.inputNama);
        final EditText alamat = (EditText) findViewById(R.id.inputAlamat);
        final EditText pesanan = (EditText)findViewById(R.id.inputPesanan);

        Button btn = (Button) findViewById(R.id.btnOrder);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainGoFood.this, OrderSuccess.class);
                intent.putExtra("nama", nama.getText().toString());
                intent.putExtra("alamat", alamat.getText().toString());
                intent.putExtra("pesanan", pesanan.getText().toString());
                startActivity(intent);

            }
        });

    }
}
