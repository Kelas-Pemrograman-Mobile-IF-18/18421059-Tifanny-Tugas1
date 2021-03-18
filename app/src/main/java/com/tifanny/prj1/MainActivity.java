package com.tifanny.prj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtNama;
    TextView txtUmur;
    TextView txtHobby;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNama = (TextView) findViewById(R.id.txtNama);
        txtNama.setText("Tifanny Martavia ");
        txtUmur = (TextView) findViewById(R.id.txtUmur);
        txtUmur.setText("20 y.o ");
        txtHobby = (TextView) findViewById((R.id.txtHobby));
        txtHobby.setText("Membaca dan Menonton");
    }
}