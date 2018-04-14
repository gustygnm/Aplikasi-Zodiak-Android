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

public class TaurusKeuangan extends AppCompatActivity {
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
        txtTitleBar.setText("Keuangan Taurus");
        txtJudul.setText("Karir dan Keuangan Taurus");
        txtIsi.setText("Pada tanggal 15 Mei, planet Uranus bergeser pada tanda bintag anda, dan Jupiter berada di sektor-8 pada zona rumah zodiak anda akan membuat anda menjadi sangat cerdik terkait dengan urusan keuangan. Anda mungkin memiliki ide yang memerlukan beberapa dana yang besar. Ini bagus, karena sekarang tampaknya Anda telah menemukan cara untuk menarik semuanya bersama-sama untuk membuat rencana keuangan Anda bergerak maju. Anda mungkin berurusan dengan re-distribusi properti karena pemisahan bisnis, warisan, atau perceraian. Atau Anda dapat bernegosiasi untuk bonus atau komisi yang terlambat; mungkin Anda sedang bernegosiasi untuk pekerjaan baru. Hati-hati menyerahkan uang Anda kepada orang lain, Anda memiliki kemungkinan untuk tertipu atau bahkan mungkin dikendalikan oleh seseorang jika Anda meminjamkan uang ke mereka.\nTahun ini diprediksi bukan sebagai tahun utama untuk perkembangan karir Taurus. Tahun 2018 mungkin anda dapat melakukan perjalanan atau pindah untuk memeperoleh pengetahuan atau melakukan tugas. Tahun ini mungkin ada kewajiban dan hambatan karena aturan atau hukum. Prediksi juga menunjukkan bahwa planet Uranus akan berada di dalam rumah pertama Anda. Ketika planet berbenturan dengan Uranus, Anda tampil sebagai sosok yang lebih kacau, keras kepala, dan memberontak. Ketika planet bekerja dengan baik dengan Uranus, Anda datang lebih dari pemain tim, kreatif, dan cerdas. Uranus menambahkan pengaruh lebih keras kepala, lebih banyak inovasi, pendekatan yang lebih kewirausahaan, lebih saing, dan lebih stamina untuk semua aktivitas Anda. Meski terkadang membantu bekerja sama dengan pasangan, tahun ini, pria Taurus dan wanita Taurus akan lebih baik bekerja sendiri. Mungkin lebih sulit pada awalnya, tapi akan bagus dalam jangka panjang. Ini juga lebih bebas dalam memamerkan keahlian Anda kepada atasan.");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TaurusKeuangan.this, Coment.class));
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
                startActivity(new Intent(TaurusKeuangan.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

