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
import com.gnm.zodiakku.keuangan.VirgoKeuangan;

public class VirgoAsmara extends AppCompatActivity {
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
        txtTitleBar.setText("Asmara Virgo");
        txtJudul.setText("Jodoh dan Cinta Zodiak Virgo");
        txtIsi.setText("Cinta bagi mereka adalah pengabdian dan akan mencakup kasih keluarga, teman dan mereka yang kurang beruntung dari dia. Tidak ada unsur kepura puraan yang terlibat dalam cara mereka bertindak atauapa yang mereka katakan. Perkawinan merupakan komitmen utama dan kemitraan kerja. Orang yang lahir di bawah naungan virgo pada dasarnya mereka baik dan sangat setia. ");
        txtAsmaraPria_Judul.setText("Asmara Pria Virgo");
        txtAsmaraPria_isi.setText("Kamu memiliki rasa ingin tahu yang besar terhadap wanita. Makhluk sempurna ini adalah sesuatu untuk kamu melakukan eksperimen dan mempelajari segala hal tentangnya. Dari sisi seks, ini adalah pengalaman yang tidak boleh terlewatkan, kamu menyediakan waktu dan hasrat untuknya. Kamu tertarik di segala hal yang dapat mengembangkan karir. Kamu sangat tertarik dengan berapa banyak uang yang dapat dibuat pasangan kamu. Kamu dapat menjadi figur ayah jika pasangan kamu membiarkan kamu terlalu melindungi. kamu hanya melamar atau berkomitmen lebih jauh setelah waktu yang cukup lama dan jika kamu yakin 100% hubungan akan bertahan. Kamu merasa perlu agar pasangan dapat mendukung dan meningkatkan karir dan membuat rumah sebagai tempat yang bersih dan nyaman. Kamu tawarkan keamanan, kepercayaan dan kesetiaan.");
        txtAsmaraWanita_judul.setText("Asmara Wanita Virgo");
        txtAsmaraWanita_isi.setText("Kamu memiliki standard yang tinggi terhadap pria idaman dalam hidup kamu. Kamu memaksa pasangan kamu untuk super bersih dan praktikal serta memiliki tujuan. Standard kamu cukup tinggi dan oleh karena itu kamu membutuhkan waktu cukup lama dalam mencari seseorang yang kamu rasa cukup berharga untuk diajak berkomitmen. Kamu cenderung menikah di usia yang dewasa dan hanya jika si ksatria datang dengan senjata yang mengkilap. Kamu adalah ibu rumah tangga yang sempurna, orang tua yang tegas dan pasangan yang baik. Kamu juga menarik di tahun pertengahan dan biasanya menarik banyak pria di usia tersebut.");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VirgoAsmara.this, VirgoKeuangan.class));
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
                startActivity(new Intent(VirgoAsmara.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

