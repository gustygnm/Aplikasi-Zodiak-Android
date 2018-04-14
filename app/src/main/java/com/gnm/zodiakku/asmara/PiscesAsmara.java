package com.gnm.zodiakku.asmara;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.gnm.zodiakku.MainActivity;
import com.gnm.zodiakku.R;
import com.gnm.zodiakku.keuangan.AriesKeuangan;
import com.gnm.zodiakku.keuangan.PiscesKeuangan;

public class PiscesAsmara extends AppCompatActivity {
    Button btnBack, btnNext;
    TextView txtTitleBar, txtJudul, txtIsi, txtAsmaraPria_Judul, txtAsmaraPria_isi, txtAsmaraWanita_judul, txtAsmaraWanita_isi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zodiak_asmara);

        //menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar toolbar = (Toolbar) findViewById(R.id.asmara_toolbar);
        setSupportActionBar(toolbar);

        init();
        txtTitleBar.setText("Asmara Pisces");
        txtJudul.setText("Jodoh dan Cinta Zodiak Pisces");
        txtIsi.setText("Untuk zodiak Pisces, Cinta adalah segalanya. Menjadikan sifat pisces yang romantis dan menghanytkan. Mereka cenderung untuk merenung dan menjadikan diri menjadi melankolis. Masalah terbesar untuk Asmara pisces adalah sering salah memiih pasangan yang berakhir pada pencarian orang ketiga untuk memenuhi kebutuhan.");
        txtAsmaraPria_Judul.setText("Asmara Pria Pisces");
        txtAsmaraPria_isi.setText("Kamu berhasrat dan sensitif, meskipun sedikit kurang stabil. Kamu dapat menarik banyak perhatian wanita. Kamu dapat dengan mudah di ubah, berkata satu hal pada kekasih dan berbalik dan mengerjakan hal yang berbeda. Kamu sangat mengetahui kelebihan pasangan namun dibutakan dengan keburukan orang yang kamu cintai. Kamu mencintai pergi dengan kelas nomor satu dan akan memberikan hadiah yang mahal untuk pasangan kamu.");
        txtAsmaraWanita_judul.setText("Asmara Wanita Pisces");
        txtAsmaraWanita_isi.setText("Kamu feminim, intuitif, responsif dan sensual. Kamu tertarik dengan hal yang kreatif. Kamu empati terhadap mereka yang dirundung masalah, maka itu kamu sering digunakan. Kamu salah satu yang terbaik dalam berfantasi dan mengeluarkan hasrat kamu. Masalah terbesar kamu adalah kamu cenderung salah memilih pasangan, yang berakhir pada pencarian orang ketiga untuk memenuhi kebutuhan kamu. Kamu juga mudah menangis dan bisa mengeluarkan emosi.");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PiscesAsmara.this, PiscesKeuangan.class));
            }
        });

//        if (getSupportActionBar() != null) {
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//            getSupportActionBar().setDisplayShowHomeEnabled(true);
//        }
    }

    void init() {
        btnBack = (Button) findViewById(R.id.asmara_btnBack);
        btnNext = (Button) findViewById(R.id.asmara_btnNext);
        txtTitleBar = (TextView) findViewById(R.id.asmara_titleBar);
        txtJudul = (TextView) findViewById(R.id.asmara_txtJudul);
        txtIsi = (TextView) findViewById(R.id.asmara_isi);
        txtAsmaraPria_Judul = (TextView) findViewById(R.id.asmara_txtJudulAsmara_pria);
        txtAsmaraPria_isi = (TextView) findViewById(R.id.asmara_txtJudulAsmara_pria_isi);
        txtAsmaraWanita_judul = (TextView) findViewById(R.id.asmara_txtJudulAsmara_wanita);
        txtAsmaraWanita_isi = (TextView) findViewById(R.id.asmara_txtJudulAsmara_wanita_isi);
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
                startActivity(new Intent(PiscesAsmara.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

