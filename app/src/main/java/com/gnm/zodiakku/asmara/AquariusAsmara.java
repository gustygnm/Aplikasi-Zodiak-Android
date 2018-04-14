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
import com.gnm.zodiakku.keuangan.AquariusKeuangan;
import com.gnm.zodiakku.keuangan.AriesKeuangan;

public class AquariusAsmara extends AppCompatActivity {
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
        txtTitleBar.setText("Asmara Aquarius");
        txtJudul.setText("Jodoh dan Cinta Zodiak Aquarius");
        txtIsi.setText("Horoskop tahun 2018 untuk sektor cinta Aquarius meramalkan bahwa di masa lalu, Anda mungkin merasa kehidupan cinta Anda sedikit basi. Namun, tahun ini dipersiapkan untuk gairah asmara yang menggelora. Akan ada percikan ekstra dalam hubungan Anda tahun ini. Percikan ini sebagian besar untuk hubungan lama, tapi hubungan baru pun bisa menimbulkan percikan yang mengasyikkan. Bicarakan perasaan Anda dan katakan apa yang Anda inginkan dari hubungan cinta tersebut sehingga pasangan Anda dapat memahami kebutuhan Anda. Pastikan juga untuk mendengarkan kebutuhan mereka. Meneropong hubungan teman dan keluarga, kompatibilitas Aquarius akan lebih harmonis di tahun 2018 ini.");
        txtAsmaraPria_Judul.setText("Asmara Pria Aquarius");
        txtAsmaraPria_isi.setText("Kamu perlu secara mental yakin sebelum kamu mengambil keputusan untuk mengikuti petunjuk pasangan. Kontak batin dibutuhkan untuk memenuhi kebutuhan seksual. Kamu murah hati, terbuka dan peduli dengan orang yang kamu sayangi. Kamu senang terlibat dalam hobi pasangan. Kamu akan mencari jawaban dan kebenaran di setiap hubungan. Kamu sedikit pemalu dan sering menunggu orang lain yang mengambil tindakan. Kamu tidak bisa hidup dalam relasi yang terlalu membatasi segala hal. Meskipun kamu secara luar dingin, sebenarnya kamu cukup emosional dan penyayang. Di hubungan seksual kamu imajinatif, meskupun kamu juga sering memimpikan fantasi erotis. Kamu mencari pasangan yang mau memuaskan pengalaman seksual. Kamu jatuh cinta dengan cepat namun kamu ragu untuk berkomitmen sepenuhnya dengan orang lain.");
        txtAsmaraWanita_judul.setText("Asmara Wanita Aquarius");
        txtAsmaraWanita_isi.setText("Kamu memiliki standar tinggi dan kamu memaksa di perlakukan dengan hormat. Tidak ada cara berkompromi dengan kamu. Kamu sensitif, intelektual dan kamu menyukai pesta dan bergaul. Kamu jujur, langsung dan akan mengorbankan jiwa demi orang yang kamu sayang. Kamu suka memberi, selalu menawarkan nasihat untuk mereka yang ada dalam masalah, Kamu cukup mampu mengerjakan pekerjaan pria dan jarang memilih pasangan berdasarkan apa yang bisa mereka lakukan untuk kamu. Kamu mencintai perjalanan dan harus merasa mandiri. Kamu membutuhkan cinta yang besar, meskipun kamu tidak sesemangat itu jika harus berkomitmen atau menikah.");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AquariusAsmara.this, AquariusKeuangan.class));
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
                startActivity(new Intent(AquariusAsmara.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

