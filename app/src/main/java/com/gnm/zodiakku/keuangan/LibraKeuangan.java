package com.gnm.zodiakku.keuangan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.gnm.zodiakku.Coment;
import com.gnm.zodiakku.MainActivity;
import com.gnm.zodiakku.R;

public class LibraKeuangan extends AppCompatActivity {
    Button btnBack, btnNext;
    TextView txtTitleBar, txtJudul, txtIsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zodiak_keuangan);

        //menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar toolbar = (Toolbar) findViewById(R.id.keuangan_toolBar);
        setSupportActionBar(toolbar);

        init();
        txtTitleBar.setText("Keuangan Libra");
        txtJudul.setText("Karir dan Keuangan Libra");
        txtIsi.setText("Ramalan Zodiak Libra 2017 untuk permasalahan keuangan adalah kamu harus sedikit berpikir rasional. Jangan selalu memikirkan bagaimana untuk mendapatkan lebih banyak uang. Coba lebih fokus pada apa yang menjadi tujuan hidup kamu. Jangan terlalu mengambil resiko besar dalam hal keputusan keuangan kamu. Hati hati jika kamu sekarang di posisi baik dalam hal keuangan bisa saja sesuatu terjadi pada kamu dan mengubah keberuntungan kamu.\nRamalan Karier Libra 2017 menyatakan bahwa di awal tahun 2017 ini merupakan fase yang cukup menguras tenaga dan waktu kamu. Nah pada akhirnya atasan kamu menghargai usaha dari kerja keras kamu kan. Jika kamu bisa tekun dan juga pantang menyerah makan semua tujuan kamu akan segera tercapai kok. Ramalan Usaha Libra 2017 menyatakan untuk kamu yang telah memiliki usaha kamu harus mengerjakan banyak hal di tahun ini. Coba deh di susun lagi prioritas mana yang harus kamu dahulukan");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LibraKeuangan.this, Coment.class));
            }
        });

//        if (getSupportActionBar() != null) {
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//            getSupportActionBar().setDisplayShowHomeEnabled(true);
//        }
    }

    void init() {
        btnBack = (Button) findViewById(R.id.keuangan_btnBack);
        btnNext = (Button) findViewById(R.id.keuangan_btnNext);
        txtTitleBar = (TextView) findViewById(R.id.keuangan_titleBar);
        txtJudul = (TextView) findViewById(R.id.keuangan_judul);
        txtIsi = (TextView) findViewById(R.id.keuangan_isi);
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
                startActivity(new Intent(LibraKeuangan.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

