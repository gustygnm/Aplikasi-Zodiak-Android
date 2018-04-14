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
import com.gnm.zodiakku.keuangan.ScorpioKeuangan;

public class ScorpioAsmara extends AppCompatActivity {
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
        txtTitleBar.setText("Asmara Scorpio");
        txtJudul.setText("Jodoh dan Cinta Zodiak Scorpio");
        txtIsi.setText("Scorpio adalah zodiak yang paling perasa.Setia dan romantis. Mereka tidak akan terlibat dalam suatu hubungan tanpa penyelidikan terlebih dahulu untuk mengetahui apakah pilihannya itu merupakan pribadi yang setia dan jujur. Bila iya, maka ia akan menunjukkan sisi pribadi yang selama ini dia sembunyikan. Mereka sangat pencemburu jika menemukan sesuatu yang dicurigai tanpa alasan yang kuat. Tidak ada yang dapat menyakiti Scorpio kecuali perasaan dicurangi dan dikhianati oleh pasangannya.");
        txtAsmaraPria_Judul.setText("Asmara Pria Scorpio");
        txtAsmaraPria_isi.setText("Dalam hal bercinta kamu mampu memiliki tingkat hasrat di level tertinggi. Kamu persuasif dan tidak akan mengakui kekalahan jika pikiran kamu sudah tertuju di satu figur wanita. Kamu memilih untuk mengontrol emosi pasangan. Seperti hal lainyya, kamu selalu memberikan seratus persen perhatian dan juga kamu mengharapkan hal yang sama dari pasangan. Buat kamu, seks adalah permainan kompetitif, dan balas dendam serta cemburu adalah dua karakteristik yang akan muncul jika kamu tidak bisa menang.");
        txtAsmaraWanita_judul.setText("Asmara Wanita Scorpio");
        txtAsmaraWanita_isi.setText("Kamu tidak memiliki masalah menarik perhatian pria. Kamu berbusana untuk pasangan dan menggunakan daya goda, mata yang menghipnotis dan menangkap pasangan yang kamu pilih. Kamu adalah tipe wanita yang memiliki energi binatang luar biasa. Kamu sangat menuntut ketika sedang bercinta dan kamu kurang kesabaran jika pasangan tidak bisa memuaskan. Kamu akan setia selama kamu tidak mendeteksi kelemahan dari pasangan. ");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScorpioAsmara.this, ScorpioKeuangan.class));
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
                startActivity(new Intent(ScorpioAsmara.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

