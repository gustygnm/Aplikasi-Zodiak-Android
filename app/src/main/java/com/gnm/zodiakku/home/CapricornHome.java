package com.gnm.zodiakku.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.gnm.zodiakku.R;
import com.gnm.zodiakku.sekilas.AriesSekilas;
import com.gnm.zodiakku.sekilas.CapricornSekilas;

public class CapricornHome extends AppCompatActivity {
    Button btnLanjut;
    TextView titleBar, txtTglLahirZodiak, txtTglLahirZodiak_isi1, txtTglLahirZodiak_isi2, txtSifat, txtSekilas, txtJdlSekitarZodiak;
    ImageView img_Cover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zodiak_home);

        CapricornHome.this.setTitle("");
        //menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_Home);
        setSupportActionBar(toolbar);
        init();

        titleBar.setText("Capricorn");
        txtTglLahirZodiak.setText("Lahir pada 23 Desember - 20 Januari ");
        txtTglLahirZodiak_isi1.setText("Simbol : Kambing Jantan\nElemen : Tanah\nPlanet : Saturnus\nBatu : onyx, amber\nWarna : Cokelat");
        txtTglLahirZodiak_isi2.setText("Kambing jantan adalah simbol dari capricorn melambangkan kekeras kepalaan yang luar biasa, mereka cenderung egois dan nyaman hidup sendiri. Mereka adalah sosok yang tertutup dan jarang berbagi perasaan dengan orang lain. Mereka memiliki gairah dan ambisi untuk selalu mencapai posisi puncak dan mendapat yang terbaik.");
        txtSifat.setText("Pendiam, Rajin dan Ambisius, Materialis, Gengsi Tinggi, Suka Memerintah, Suka memperalat Orang Lain");
        txtJdlSekitarZodiak.setText("Sekilas tentang Capricorn");
        txtSekilas.setText("Kambing jantan selalu berkeinginan untuk mencapai dan mengusahakan sesuatu. Mereka memiliki keinginan yang kuat dan biasa digunakan untuk mencapai rasa aman. Mereka sangat mantap dalam mengambil langkah seperti layaknya Kambing Gunung. Kapasitas kerja dan keyakinannya sangat besar.\n" +
                "\n" +
                "Mereka penuh waspada dan jarang meminta bantuan dari orang lain. Mereka suka mengerjakan segala sesuatunya sendiri. Mereka suka menjadi budak bagi diri mereka sendiri dan tidak percaya dengan orang lain dalam mengerjakan tugasnya.\n" +
                "\n" +
                "Pribadinya sangat sensitif dan sangat membutuhkan penghargaan dari orang lain. Capricorn memiliki kemantapan untuk mencapai tujuan. Pantang menyerah sampai titik darah penghabisan.");
        img_Cover.setImageResource(R.drawable.cover_capricon);

        btnLanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CapricornHome.this, CapricornSekilas.class));
            }
        });
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }

    @Override
    public void onBackPressed() {
        finish();
    }

    void init() {
        btnLanjut = (Button) findViewById(R.id.btnLanjut);
        titleBar = (TextView) findViewById(R.id.home_titleBar);
        txtTglLahirZodiak = (TextView) findViewById(R.id.home_txtLahirZodiak);
        txtTglLahirZodiak_isi1 = (TextView) findViewById(R.id.home_txtLahirZodiak_Isi1);
        txtTglLahirZodiak_isi2 = (TextView) findViewById(R.id.home_txtLahirZodiak_isi2);
        txtSifat = (TextView) findViewById(R.id.home_ZodiaktxtSifat);
        txtSekilas = (TextView) findViewById(R.id.home_ZodiaktxtSekilas);
        txtJdlSekitarZodiak = (TextView) findViewById(R.id.home_txtjdlSekitarZodiak);
        img_Cover = (ImageView) findViewById(R.id.home_img);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.close, menu);
//        return true;
//    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

