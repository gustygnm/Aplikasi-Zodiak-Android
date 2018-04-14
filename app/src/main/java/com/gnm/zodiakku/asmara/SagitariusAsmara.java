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
import com.gnm.zodiakku.keuangan.SagitariusKeuangan;

public class SagitariusAsmara extends AppCompatActivity {
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
        txtTitleBar.setText("Asmara Sagitarius");
        txtJudul.setText("Jodoh dan Cinta Zodiak Sagitarius");
        txtIsi.setText("Para virgo senang menjalin kasih dengan orang yang dianggapnya membawa banyak keuntungan bagi dirinya. Mereka perlu jaminan dari pasangannya bahwa pasangannya akan bekerja sama giatnya dengan virgo.");
        txtAsmaraPria_Judul.setText("Asmara Pria Sagitarius");
        txtAsmaraPria_isi.setText("Kamu mencintai wanita, namun kamu biasanya sulit bahagia jika hanya satu. Kamu sulit berkomitmen dan tidak suka keterlibatan yang terlalu dekat. Kamu perlu merasa bebas dan menghilangkan rasa cemburu dari pasangan. Kamu memilih wanita dengan pengalaman, wanita yang akan membuat cinta seringan mungkin seperti kamu. Kamu memaksa pasangan memiliki selera humor karena kamu akan tertekan dengan partner yang terlalu serius dan mereka yang cenderung bicara mengenai diri sendiri. Kamu menikmati bercinta di bawah siraman cahaya bulan. Kamu bisa dibutakan dan tidak berkata-kata. Kamu tidak pernah melarang pasangan kamu dalam segala hal. Kamu memiliki rasa ingin tahu yang besar dengan pendidikan seksual dan kamu ingin berpengalaman diberbagai hal. ");
        txtAsmaraWanita_judul.setText("Asmara Wanita Sagitarius");
        txtAsmaraWanita_isi.setText("Kamu memiliki pendekatan yang santai terhadap seks. Kamu bisa menjaga hubungan sebagai teman dengan mantan pacar kamu. Kamu seorang filosofis dan jarang merasa sedih jika pasangan ranjang pergi meninggalkan kamu. Kamu cukup rasional bahwa akan ada kekasih baru dalam hidup kamu sebentar lagi. Kamu murah hati, terus terang dan baik. Kamu mencintai kebebasan dan harus dibolehkan untuk berpergian. Kamu tidak akan bahagia jika dipaksa diam di satu tempat. Kamu mudah berpindah dari pria, pekerjaan jika kamu merasa diri kamu tidak terstimulasi lagi. Kamu pastinya penggoda pria.");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SagitariusAsmara.this, SagitariusKeuangan.class));
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
                startActivity(new Intent(SagitariusAsmara.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

