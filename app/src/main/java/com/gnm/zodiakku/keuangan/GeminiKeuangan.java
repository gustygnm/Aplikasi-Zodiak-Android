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

public class GeminiKeuangan extends AppCompatActivity {
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
        txtTitleBar.setText("Keuangan Gemini");
        txtJudul.setText("Karir dan Keuangan Gemini");
        txtIsi.setText("Ramalan karir dan keuangan zodiak bintang gemini terbaru hari ini November 2017 adalah kondisi karier kamu sedang tidak terlalu baik. kamu harus belajar lagi untuk lebih profesional. Jika memang sedang dalam kondisi kerja, jangan mencampur adukkan kepentingan pribadi dan kepentingan kantor donk. Untuk masalah keuangan zodiak gemini November 2017 adalah keuangan kamu sedang tiris nih. Hindari deh belanja besar besaran di awal tahun ini. Perketat semua pengeluaran kamu.");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GeminiKeuangan.this, Coment.class));
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
                startActivity(new Intent(GeminiKeuangan.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

