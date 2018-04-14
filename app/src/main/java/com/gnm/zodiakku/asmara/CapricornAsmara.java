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
import com.gnm.zodiakku.keuangan.CapricornKeuangan;

public class CapricornAsmara extends AppCompatActivity {
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
        txtTitleBar.setText("Asmara Capricorn");
        txtJudul.setText("Jodoh dan Cinta Zodiak Capricorn");
        txtIsi.setText("Meskipun pencemburu dan suka mencurigai pasangannya, mereka adalah sosok yang perhatian dan mempunyai kasih sayang yang sangat dalam. Jika mereka menyukai pasangannya maka ia akan setia, namun jika ia tidak menyukai maka ia akan meninggalkannya begitu saja. Capricorn cocok dengan TAurus, virgo, pisces dan aquarius.");
        txtAsmaraPria_Judul.setText("Asmara Pria Capricorn");
        txtAsmaraPria_isi.setText("Kamu paling memiliki sensualitas yang tertinggi di antara semua bintang. Kamu jarang menolak jika menghadapi pertanyaan. Kamu akan mematahkan halangan dari siapapun yang kamu dekati dan kamu jarang pulang dengan tangan hampa. Cinta adalah kebutuhan dalam pikiran kamu. Kecenderungan liar kamu akan muncul di ranjang. Kamu bukan pecinta yang kasar, hanya penuh enerjik. Kamu memilih orang yang lebih muda, wanita naif dan kamu menikmati permainan sebagai pengajar seks. Tidak seperti pria lain, ketika kamu menjadi Kambing Tua kamu akan memiliki nafsu seks yang kuat dan akan melanjutkan mencari pasangan yang lebih muda. Kamu mengharapkan wanita melayani kamu, tidak hanya diranjang tapi juga di area lain. Kamu mengharapkan pasangan menjadi teman yang setia, tapi tidak pernah menerima kritikan dari mereka. Kamu akan terus mencari cinta melalui nafsu fisik.");
        txtAsmaraWanita_judul.setText("Asmara Wanita Capricorn");
        txtAsmaraWanita_isi.setText("Kamu cenderung menarik perhatian pria yang lemah. Kamu tidak mudah ditebak dan kamu cenderung sering semangat dan tidak dalam waktu seketika. Dalam kenyataan kamu adalah tipe wanita yang takut jatuh cinta dengan orang yang salah, Ketika kamu menemukan Mr. Right kamu akan menjadi pasangan dengan tingkat emosi yang tinggi. Kamu akan lakukan apapun untuk kekasih, namun dia harus memuaskan semua kebutuhan kamu. Kamu suka menyubukan diri dan kamu melihat hidup secara serius. Kamu juga merawat diri dengan serius. Kamu berbusana dengan gaya, kelas, rapih dan formal. Kamu senang di puja oleh pasangan hidup.");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CapricornAsmara.this, CapricornKeuangan.class));
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
                startActivity(new Intent(CapricornAsmara.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

