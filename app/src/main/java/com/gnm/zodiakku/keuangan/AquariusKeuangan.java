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

public class AquariusKeuangan extends AppCompatActivity {
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
        txtTitleBar.setText("Keuangan Aquarius");
        txtJudul.setText("Karir dan Keuangan Aquarius");
        txtIsi.setText("sepertinya kerja keras kamu akhirnya telah membuahkan hasil di awal tahun 2017 ini. Terus pertahankan kinerja kerja kamu dan yakinkan pada diri sendiri bahwa apabila kamu telah berusaha pasti akan mendapatkan hasil yang baik.\n" +
                "Masalah keuangan zodiak aquarius pada bulan ini keuangan kamu perlu di benahi di awal tahun 2017. Hal ini dikarenakan pesta tahun baru membuat dompet kamu menjadi bolong.");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AquariusKeuangan.this, Coment.class));
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
                startActivity(new Intent(AquariusKeuangan.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

