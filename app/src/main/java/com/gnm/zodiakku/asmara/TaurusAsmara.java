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
import com.gnm.zodiakku.keuangan.TaurusKeuangan;

public class TaurusAsmara extends AppCompatActivity {
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
        txtTitleBar.setText("Asmara Taurus");
        txtJudul.setText("Jodoh dan Cinta Zodiak Taurus");
        txtIsi.setText("Para Taurus cenderung pendiam dan bergairah. Mereka berusaha untuk memberikan yang terbaik dalam hidup mereka seperti musik yang lembut, lampu yang redup, dan anggur terbaik untuk menemani mereka menghabiskan waktunya dengan orang yang mereka cintai. Taurus selalu mengutarakan hatinya secara langsung dan tidak suka bertele-tele bila menyangkut urusan cinta. Mereka berusaha menyenangkan hatimu dengan harapan mendapatkan balasan yang sama dari pasangannya.");
        txtAsmaraPria_Judul.setText("Asmara Pria Taurus");
        txtAsmaraPria_isi.setText("Kamu menikmati hasrat yang dimiliki. Musik lembut, lampu yang redup dan bir adalah keharusan. Kamu menyukai dikelilingi oleh objek cantik dan kamu mengharapkan kualitas di setiap aspek kehidupan, termasuk wanita. Kamu tidak menyukai wanita yang menghabiskan waktumu. Jika calon pasangan mau dengan kamu harusnya mereka tidak membutuhkan waktu lama untuk memutuskan. Kamu sabar tapi kemungkinan kamu akan tertidur jika dia tidak ambil tindakan. Kamu tidak menyukai pasangan yang membantah kamu, karena memang mereka tidak mungkin menang. Kamu juga menghindari wanita yang sulit dikejar, itu adalah permainan yang tidak mau kamu mainkan. Kamu adalah individu yang menyukai fisik, membumi, menyukai makanan, minum dan wanita. Ketika kamu mengajak seseorang kamu mau setiap rupiah yang dikeluarkan berarti dan kamu mengharapkan pasangan memperlakukan kamu dengan baik. Kamu berkemauan keras, emosional dan sangat menyukai seks. Kamu protektif terhadap wanita yang tahu bagaimana memuaskan kebutuhan seks kamu.");
        txtAsmaraWanita_judul.setText("Asmara Wanita Taurus");
        txtAsmaraWanita_isi.setText("Kamu adalah wanita yang kompleks. Kamu dikuasai oleh planet Venus yang membuat kamu sangat mengetahui seni menggoda. Kamu menyukai objek yang cantik dan akan menerima semua hadiah berkualitas yang dibelikan kekasihmu. Kamu sangat mengetahui apa keinginan kamu dan kamu akan sangat keras kepala jika tidak mendapatkannya. Selama pria berada di sisi baik kamu dan memperlakukan kamu dengan lembut kamu akan tergila-gila dan akan memberikan apapun yang dia inginkan. Kamu sangat ingin belajar mengenai kehidupan dan pria yang dapat mengajarkannya akan memenangkan hatimu. Kamu mencari kekasih yang baik, menghargai dan mengetahui mengenai mendapatkan barang berkualitas dengan harga yang tepat. Jika pasangan yang kamu pilih hidup sesuai standar kamu, kamu akan menjadi setia, mencintai dan menjadi pasangan ranjang yang terbaik.");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TaurusAsmara.this, TaurusKeuangan.class));
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
                startActivity(new Intent(TaurusAsmara.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

