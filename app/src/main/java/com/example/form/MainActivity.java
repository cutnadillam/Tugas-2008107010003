package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView tvjd;
EditText etnm;
EditText etem;
EditText etvm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvjd = findViewById(R.id.tvjd);
        etnm = findViewById(R.id.etnm);
        etem = findViewById(R.id.etem);
        etvm = findViewById(R.id.etvm);
    }

    public void Simpan(View view) {
    }
}