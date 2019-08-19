package com.example.gojekbeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class OrderSuccess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_success);

        TextView nama = (TextView) findViewById(R.id.outputNama);
        Bundle bundle = getIntent().getExtras();
        String outputNama = bundle.getString("nama");
        nama.setText(outputNama);

        TextView alamat = (TextView) findViewById(R.id.outputAlamat);
        Bundle bundlee = getIntent().getExtras();
        String outputAlamat = bundlee.getString("alamat");
        alamat.setText(outputAlamat);

        TextView pesanan = (TextView) findViewById(R.id.outputPesanan);
        Bundle bundleee = getIntent().getExtras();
        String outputPesanan = bundleee.getString("pesanan");
        pesanan.setText(outputPesanan);

    }
}
