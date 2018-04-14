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

public class SagitariusKeuangan extends AppCompatActivity {
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
        txtTitleBar.setText("Keuangan Sagitarius");
        txtJudul.setText("Karir dan Keuangan Sagitarius");
        txtIsi.setText("Dalam bidang karir dan profesional, horoskop zodiak Sagitarius mengindikasikan adanya hal sulit dan tantangan yang harus dihadapi. Saturnus telah berada di zona Sagitarius sejak tahun 2015 hingga pertengahan Desember 2017. Ada pelajaran berat yang harus anda lakoni bersama planet Saturnus. Anda telah mengambil tanggung jawab yang lebih berat dan mungkin agak terbebani, stress, kesepian, lebih lelah dari biasanya, kelelahan fisik atau bahkan sakit. Tapi lihatlah, ini hanya terjadi sekali setiap 28-30 tahun, dan hal tersebut dianggap sebagai siklus tumbuh atau tambah dewasa. Jadi, dengan datangnya Saturnus yang merupakan planet kedisiplinan, pada tahun 2017 Anda akan bekerja keras dan menuai hasilnya.\n" +
                "\n" +
                "Tahun ini mungkin tampak seperti banyak tanggung jawab dan kerja keras, tetapi Anda akan terkesan dengan hasilnya dan bangga dengan prestasi Anda. Bagaimana caranya agar para zodiak Sagitarius bisa tetap survive menjalani hidup di tahun 2017 yang penuh tantangan tersebut? Pertama, cari pekerjaan atau bisnis ekstra kemudian simpan setiap rupiah yang anda hasilkan. Kedua, lakukan evaluasi, bekerja keras, dan prediksi kemana arah hidup anda 15 tahun ke depan. Transit yang terjadi saat ini adalah untuk menyiapkan diri dari siklus 15 tahunan. Ini adalah waktu yang tepat untuk menetapkan dan merencanakan hidup anda 15 tahun ke depan. Horoskop 2017 menunjukkan bahwa orang-orang hebat dan bos besar mungkin akan datang dalam hidup anda untuk memberikan beberapa pelajaran sulit. Jangan menolak, lakukan tugas tersebut demi kemajuan anda.");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SagitariusKeuangan.this, Coment.class));
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
                startActivity(new Intent(SagitariusKeuangan.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

