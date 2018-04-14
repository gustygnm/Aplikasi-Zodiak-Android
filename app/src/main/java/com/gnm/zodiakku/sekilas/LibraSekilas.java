package com.gnm.zodiakku.sekilas;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.gnm.zodiakku.MainActivity;
import com.gnm.zodiakku.R;
import com.gnm.zodiakku.cewek.AriesCewek;
import com.gnm.zodiakku.cewek.LibraCewek;

public class LibraSekilas extends AppCompatActivity {
    Button btnBack, btnNext;
    TextView tittleBar, txtKarakter, txtSifatUtama;
    ImageView imgCover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zodiak_sekilas);

        LibraSekilas.this.setTitle("Karakter Libra");
        //menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar toolbar = (Toolbar) findViewById(R.id.sekilas_toolbar);
        setSupportActionBar(toolbar);

        init();
        txtKarakter.setText("Karakter yang di miliki zodiak Libra adalah mampu untuk menyelesaikan masalah yang terjadi antara 2 orang teman, dia mampu untuk menjadi penengah yang baik sampai tercapainya solusi dan jalan keluar atas permasalahan antar keduanya. Mereka juga memiliki hati yang bersih dan lembut. Sangat tidak menyukai menyakiti orang lain apalagi mengeluarkan kata-kata serta perilaku yang buruk. Mereka selalu berusaha menjaga dirinya dari hal-hal yang bisa merugikan orang lain. Namun zodiak Libra juga memiliki keahlian bermuka dua.\n" +
                "\n" +
                "Dia bisa mengatakan yang berbeda dengan apa yang ada di dalam hatinya sehingga bisa membuat Anda merasa terkecoh atas apa yang menjadi sikapnya. Itulah beberapa arti zodiak Libra yang bisa kita gunakan untuk memahami mereka dengan baik.");
        txtSifatUtama.setText("Zodiak Libra memiliki sifat dan karakter yang sangat di sukai banyak orang. Tak heran banyak orang yang ingin selalu berdekatan dengannya. Mereka memiliki sifat pandai dan adil. Sehingga banyak orang yang selalu meminta pendapatnya untuk sesuatu hal yang menyangkut urusan orang banyak.\n" +
                "\n" +
                "Mereka juga memiliki sifat yang sabar serta bisa menjadi pendengar yang baik untuk Anda. Meski begitu, pemilik zodiak Libra cenderung memiliki kendala untuk memutuskan suatu keputusan yang sulit. Oleh karena itulah, untuk bisa memahami zodiak Libra kita benar-benar harus bisa mengenali watak dan sifat zodiak Libra dengan baik.");
        imgCover.setImageResource(R.drawable.libra2);
        imgCover.setBackgroundColor(Color.parseColor("#ffc24d"));

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LibraSekilas.this, LibraCewek.class));
            }
        });

//        if (getSupportActionBar() != null) {
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//            getSupportActionBar().setDisplayShowHomeEnabled(true);
//        }
    }

    void init() {
        btnBack = (Button) findViewById(R.id.sekilas_btnBack);
        btnNext = (Button) findViewById(R.id.sekilas_btnNext);
        txtKarakter = (TextView) findViewById(R.id.sekilas_txtKarakter);
        txtSifatUtama = (TextView) findViewById(R.id.sekilas_txtSifatUtama);
        imgCover = (ImageView) findViewById(R.id.sekilas_imgCover);
    }

    @Override
    public void onBackPressed() {
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.close, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_close:
                startActivity(new Intent(LibraSekilas.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

