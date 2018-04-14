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
import com.gnm.zodiakku.cewek.PiscesCewek;

public class PiscesSekilas extends AppCompatActivity {
    Button btnBack, btnNext;
    TextView tittleBar, txtKarakter, txtSifatUtama;
    ImageView imgCover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zodiak_sekilas);

        PiscesSekilas.this.setTitle("Karakter Pisces");
        //menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar toolbar = (Toolbar) findViewById(R.id.sekilas_toolbar);
        setSupportActionBar(toolbar);

        init();
        txtKarakter.setText("Zodiak yang dilambangkan dengan simbol ikan ini, menunjukkan kelembutan yang seolah olah tidak dapat menyakiti anda secara langsung. Mayoritas orang pisces adalah orang baik dan sering mudah ditipu. Ramalan Zodiak Pisces muda adalah tipikel petualang, ambisius, antusia dan penu energi. Sosok Pisces adalah pelopor yang baik dalam melakukan pemikiran dan tindakan, sangat terbuka untuk ide baru dan pencinta kebebasan. Orang yang berbintang Pisces memiliki pemahaman ataupun pemikiran yang aneh, yang tidak diperoleh dari buku ataupun pelajaran. Mereka dengan mudah memperoleh / menyerap pengetahuan terutama untuk masalah sejarah, perjalanan dan penelitian.\n" +
                "Zodiak pisces memiliki mental ambisius dan mereka mungkin tahu subjek dengan baik dalam pemikiran mereka. Tetapi terkadang mereka ragu dan meremehkan individualitas mereka sendiri. Tipikal yan gmelankolis, depresi dan suka merenung. Mereka akan melihat seluruh kehidupan secara mistis sehingga menganggap tanda tersebut jahat ataupun tidak benar");
        txtSifatUtama.setText("Seperti yang telah disebutkan sebelumnya bahwa sensitive, tidak egois, baik, imaginative, simpatik, dan intuitif merupakan ciri khas yang dimiliki oleh pisces. Zodiak berlambang ikan ini juga merupakan pribadi yang suka rahasia, idealistic, serta sangat mudah diatur. Dengan sifat pisces tersebut, perdagangan merupakan pekerjaan yang paling cocok. Faktanya, pisces bisa menjadi pribadi yang lebih baik dalam dunia kerja.\n" +
                "Namun, mereka merasa takut untuk mengatur karena adanya rasa khawatir akan adanya potensi kegagalan. Dalam hal pekerjaan, pisces adalah sekretaris yang baik dan banyak dari mereka yang menjadi pengacara ataupun arsitek. Orang yang mempunyai zodiak pisces sering bekerja lebih dari satu jenis pekerjaan bahkan dikerjakan secara bersamaan.\n" +
                "Beralih ke urusan percintaan, bagi pisces cinta adalah segalanya. Hal ini mungkin yang menjadikannya sebagai pribadi yang romantic serta menghanyutkan. Selain itu, sifat pisces dalam percintaan cenderung untuk merenung kemudian menjadikan diri mereka menjadi seseorang yang melankolis. Namun, ada masalah terbesar yang sering dialami oleh pisces yakni mereka sering salah dalam memilih pasangan bahkan tak jarang yang berakhir pada pencarian orang ketiga untuk memenuhi keinginan dan kebutuhannya.");
        imgCover.setImageResource(R.drawable.pisces2);
        imgCover.setBackgroundColor(Color.parseColor("#55c5d1"));

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PiscesSekilas.this, PiscesCewek.class));
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
                startActivity(new Intent(PiscesSekilas.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

