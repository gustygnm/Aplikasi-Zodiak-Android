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

public class AriesAsmara extends AppCompatActivity {
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
        txtTitleBar.setText("Asmara Aries");
        txtJudul.setText("Jodoh dan Cinta Zodiak Aries");
        txtIsi.setText("Dalam urusan asmara, ramalan bintang Aries memprediksi bahwa kehadiran planet Jupiter pada sektor rumah asmara dan keuangan Anda akan memungkinkan Anda untuk mengambil giliran lebih hedonistik dan menyenangkan selama bulan-bulan ke depan. Zodiak yang berlambang kambing gunung ini juga merindukan kesetaraan dan keseimbangan dalam hubungan intim. Pada November 2017 Jupiter akan mulai memasuki rasi bintang Sagitarius dan Anda akan dapat mengambil stabilitas baru yang terjadi pada hubungan asmara Anda, termasuk juga urusan keuangan. Dengan Jupiter di area Sagitarius, Anda akan dapat mencapai kode baru seluruh hidup. Semua kemajuan dalam kehidupan spiritual dan filosofis Anda akan memungkinkan Anda untuk fokus dalam mengubah karir Anda setelah Jupiter bergerak ke Capricorn di tahun 2019.");
        txtAsmaraPria_Judul.setText("Asmara Pria Aries");
        txtAsmaraPria_isi.setText("Ketika bicara cinta kamu adalah orang yang agresif, menguasai, energik dan tidak kenal lelah. Kamu impulsive, senang berkhayaldan dinamis, seorang pelaku, selalu tidak yakin apa yang akan dikerjakan selanjutnya. Kamu bisa membuat pasangan tergila-gila jika dia tidak terbiasa dengan energi tinggi yang kamu miliki. Kamu mencari spontanitas dan partner yang imajinatif yang selalu bisa mencari perhatian kamu.Kamu bisa menjadi bed bouncer namun kamu selalu menuntu kesetiaan terhadap pasangan kamu. Kamu akan mudah marah jika sedikit saja ada kecurigaan di pasangan. Kamu cemburu dengan cepat dan perlu apresiasi terus menerus untuk menyelamatkan hubungan.");
        txtAsmaraWanita_judul.setText("Asmara Wanita Aries");
        txtAsmaraWanita_isi.setText("Kamu mungkin kelihatan tidak menyukai pria karena kebebasan yang terlalu ekstrim. Namun, tidak ada yang bisa lari dari kenyataan. Kamu energetik dan jika sudah terangsang, kamu akan agresif secara seksual. Kamu suka mengeluarkan suara ketika bercinta dan di beberapa kasus kamu menyukai binatang liar di ranjang, playful, dan tak kenal takut. Kamu suka menggunakan badan kamu dan cukup atletis baik di dalam atau di luar arena sexual. Kamu seorang romantis, jatuh cinta dengan cinta. Kamu mengakui cinta sebagai salahsatu kesenangan kecil seseorang dalam hidup. Kamu menyukai kebebasan, selalu mencari pecinta, bukan pengasuh. Kamu idealis. Selalu menjalankan apa yang kamu inginkan. Kamu tidak ada masalah menarik perhatian para pria karena kamu selalu tahu yang harus dilakukan. Kamu tidak menguasai uang kamu dengan baik yang dapat menyebabkan masalah terhadap pria yang jatuh cinta kepadamu. Namun kamuberharga untuk setiap rupiah yang dikeluarkan kekasih kamu karena kamu dapat merangsang dia dalam berbagai cara yang tidak bisa dilakukan orang lain.");

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AriesAsmara.this, AriesKeuangan.class));
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
                startActivity(new Intent(AriesAsmara.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

