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

public class AriesSekilas extends AppCompatActivity {
    Button btnBack, btnNext;
    TextView tittleBar, txtKarakter, txtSifatUtama;
    ImageView imgCover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zodiak_sekilas);

        AriesSekilas.this.setTitle("Karakter Aries");
        //menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar toolbar = (Toolbar) findViewById(R.id.sekilas_toolbar);
        setSupportActionBar(toolbar);

        init();
        txtKarakter.setText("Jika kamu lahir pada tanggal 21 maret hingga 20 april, maka kamu adalah orang-orang yang berada dibawah naungan zodiak aries. Berdasarkan ramalan bintang, aries merupakan pribadi yang dikenal karena kecerobohan yang mereka miliki. Selain itu, sifat aries juga meliputi ambisius, nakal, dan juga kompetitif. Mereka yang berzodiak aries biasanya selalu ingin menjadi yang nomor satu dalam segala hal. Orang-orang ini akan mencoba untuk mendapatkan semuanya dengan cara mereka sendiri bahkan mereka akan rela berbuat apapun dan hal tersebut sering membuatnya berhasil. Selain itu, sifat dan karakter aries adalah pribadi yang cukup menderita dalam urusan percintaan. Mereka umumnya jarang sekali menjalin hubungan dan juga sering melakukan kesalahan dalam hubungan asmara.");
        txtSifatUtama.setText("Selain itu, aries juga cukup sulit untuk ditaklukkan hatinya namun jika ada orang yang berusaha untuk menaklukkan tersebut adalah yang dihormati atau disukai, maka orang-orang yang berzodiak aries cukup mudah untuk takluk. Jadi, jika aries sulit diatur oleh orang-orang pada umumnya, maka ia hanya bisa diatur oleh seseorang yang benar-benar ia cintai. Sehingga, anda tidak perlu ragu jika kamu mempunyai pasangan berzodiak aries namun terkesan tidak macam-macam dan menurut.\n\nHal ini berarti ia sangat mencintai kamu sebagai pasangannya. Di lingkungan keluarga, aries cukup sulit untuk mengalah khususnya saat terjadi perbedaan pendapat. Mereka akan selalu ingin menang, suka memerintah namun tidak begitu suka jika ia diperintah apalagi jika anggota yang memerintah merupakan orang yang tidak terlalu berpengaruh dalam keluarganya. Keberanian aries saat menghadapi bahaya tidak membuatnya untuk berpikir dua kali saat ia membela orang lain. Hal tersebut akan ia jalani meskipun menjadikannya di posisi yang terancam dan berbahaya.");
        imgCover.setImageResource(R.drawable.aries2);
        imgCover.setBackgroundColor(Color.parseColor("#00a8e6"));

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AriesSekilas.this, AriesCewek.class));
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
                startActivity(new Intent(AriesSekilas.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

