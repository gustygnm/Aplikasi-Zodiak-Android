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
import com.gnm.zodiakku.keuangan.CancerKeuangan;

public class CancerAsmara extends AppCompatActivity {
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
        txtTitleBar.setText("Asmara Cancer");
        txtJudul.setText("Jodoh dan Cinta Zodiak Cancer");
        txtIsi.setText("Sifat alami yang sensitif bisa menjadi masalah yang perlu dihadapi dikemudian hari. Kamu adalah orang yang sering salah tangkap dalam level emosional. Kamu membutuhkan pasangan yang dapt mengerti kebutuhan kasih sayang kamu. Hubungan asmara kamu dengan cocok nya dengan yang berzodiak sama dengan kamu.");
        txtAsmaraPria_Judul.setText("Asmara Pria Cancer");
        txtAsmaraPria_isi.setText("Dalam hubungan cinta kamu mudah terjebak dalam mimpi dan kamu bisa terlalu idealistis dalam peran yang kamu mainkan. Kamu memang mencintai wanita cantik namun kamu juga memaksa bahwa orang yang kamu cintai dalam hidup harus menjadi lawan bicara yang baik juga. Kamu sangat posesif begitu jaduh cinta dan kamu mengharapkan hasil yang besar dari pasangan. Kamu selalu ingat dengan Kenangan, kebiasaan dan teman lama dan kamu menolak terjadinya perubahan. Kamu biasanya beruntung dalam hal cinta dan biasanya bisa menarik wanita yang cantik dan seksi.");
        txtAsmaraWanita_judul.setText("Asmara Wanita Cancer");
        txtAsmaraWanita_isi.setText("Kamu perlu ditangani oleh orang yang mampu memberikan rasa cinta yang memanjakan dan kamu akan pergi menjauh dari orang yang terlalu agresif. Kamu adalah tupe wanita yang akan mengorbankan segalanya dan apapun yang ada dalam keluarga dan kamu akan all out untuk melayani sang kekasih. Kamu suka dalam suasana romantis dan suka dipuji untuk setiap aksi yang kamu lakukan. Kamu senang di dekap dan di peluk dan tidak bisa bahagia dengan orang yang dingin, dan tidak tertarik berkontribusi dalam keluarga.");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CancerAsmara.this, CancerKeuangan.class));
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
                startActivity(new Intent(CancerAsmara.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

