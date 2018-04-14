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
import com.gnm.zodiakku.keuangan.LeoKeuangan;

public class LeoAsmara extends AppCompatActivity {
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
        txtTitleBar.setText("Asmara Leo");
        txtJudul.setText("Jodoh dan Cinta Zodiak Leo");
        txtIsi.setText("Kamu memilih pasangan yang kurang terkenal dibandingkan kamu, karena kamu tidak perlu takut untuk mencuri perhatian kamu. Kamu seorang extrovert, suka tertawa, murah hati dan menyukai semua hal yang terbaik. Kamu memiliki opini tinggi terhadap diri sendiri dan ingin pasangan kamu menafkahi egomu. ");
        txtAsmaraPria_Judul.setText("Asmara Pria Leo");
        txtAsmaraPria_isi.setText("Kamu sangat menarik buat para wanita. Kamu dengan mudah diperhatikan di keramaian dan biasanya menerima banyak perhatian. Kamu adalah flamboyan, bersinar dan showman. Kamu dapat tidak peduli di beberapa waktu, namun kamu juga adalah masternya dalam hal menutupi kesalahan atau segala hal. Kamu cinta dan mengagumi wanita cantik, namun pasangan kamu harus tidak lebih bersinar dari kamu di segala hal. Kamu memilih wanita kamu lebih tidak tenar sehingga tidak mencuri kilat kamu. Kamu seorang extrovert, suka tertawa, murah hati dan kamu menyukai yang terbaik di segala hal. Kamu memiliki opini tinggi terhadap diri sendiri dan ingin pasangan kamu menafkahi egomu.");
        txtAsmaraWanita_judul.setText("Asmara Wanita Leo");
        txtAsmaraWanita_isi.setText("Kamu perlu di puja dan di anggap. Sayangnya kamu cenderung membuat kesalahan dalam memilih pasangan. Kamu menuntut terlalu banyak ketika sedang bermain cinta. Kebutuhan dicintai kamu tidak sebanyak kebutuhan kamu untuk di puja dan di manjakan dengan segala hal baik dalam hidup. Kamu cenderung menjadi malas jika terlalu nyaman dengan kekasih kamu. Meskipun kamu memiliki harga diri kamu lebih memilih merasa nyaman. Kamu bisa menjadi setia selama pasangan menunjukan perhatiannya dengan sungguh sungguh.");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LeoAsmara.this, LeoKeuangan.class));
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
                startActivity(new Intent(LeoAsmara.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

