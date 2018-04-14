package com.gnm.zodiakku.sekilas;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.gnm.zodiakku.MainActivity;
import com.gnm.zodiakku.R;
import com.gnm.zodiakku.cewek.AriesCewek;
import com.gnm.zodiakku.cewek.TaurusCewek;

public class TaurusSekilas extends AppCompatActivity {
    Button btnBack, btnNext;
    TextView tittleBar, txtKarakter, txtSifatUtama;
    ImageView imgCover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zodiak_sekilas);

        TaurusSekilas.this.setTitle("Karakter Taurus");
        //menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar toolbar = (Toolbar) findViewById(R.id.sekilas_toolbar);
        setSupportActionBar(toolbar);

        init();
        txtKarakter.setText("Bagi anda yang lahir pada bulan 21 April – 20 Mei ini merupakan orang yang lahir dibawah bintang taurus. Adapun beberapa sifat taurus yang perlu anda ketahui. Taurus digambarkan dengan seekor banteng. Ciri khas zodiak taurus adalah orang yang bersemangat, ramah walaupun dia tidak pernah menunjukkan hal tersebut. ia suka dandan, jika saat dandan betah berlama-lama dalam menata diri atau berhias. Kepribadian taurus dilihat dari sifat dan karakter memiliki kesamaan dengan rasi bintang lainnya seperti Aries dan juga Capricorn");
        txtSifatUtama.setText("Adapun sifat umum taurus yang biasa ditemukan adalah orang ini termasuk orang yang sabar dan juga pintar dalam menyesuaikan diri. Taurus merupakan orang kuat yang tahan ujian. Masalah sebesar apapun bisa dihadapinya dengan kelembutan dan sikap yang lunak. Sehingga tidak sedikit orang taurus yang sukses dan menonjol dibidangnya dan bahkan banyak yang terkenal.\n\nHal ini karena taurus memiliki sifat lunak dalam menghadapi setiap masalah dan juga pandai mencari solusi terbaik sehingga kita bisa meniru dan tidak mengutamakan kekerasan atau emosi ketika ada masalah. Dalam memperjuangkan kepentingan umum, maka taurus sangat bijaksana dalam mengambil keputusan. Dengan sifat taurus yang lembut makan akan membuat urusannya mendapatkan hasil terbaik untuk semua pihak. Sehingga dalam lingkungan masyarakat taurus banyak disukai dan pendapat tidak jarang yang mudah diterima oleh orang lain.\n\nUntuk penampilan luar, taurus memang terlihat kalem dan juga tenang. Terutama ketika menghadapi masalah yang berbahaya sekalipun. Masalah berat bahkan berbahaya akan dilalui dengan penuh kesabaran dan terkesan mudah sekali bagi orang taurus ini. Orang taurus memiliki bahkan kesanggupan melebihi keinginan atau cita-citanya sehingga jika ia mempunyai keinginan yang sangat besar atau sangat sulit diwujudkan, kemungkinan besar ia akan berhasil.");
        imgCover.setImageResource(R.drawable.taurus2);
        imgCover.setBackgroundColor(Color.parseColor("#f25a4f"));

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TaurusSekilas.this, TaurusCewek.class));
            }
        });

//        if (getSupportActionBar() != null) {
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//            getSupportActionBar().setDisplayShowHomeEnabled(true);
//        }
    }

    void init() {
        btnBack = (Button) findViewById(R.id.sekilas_btnBack);
        btnNext = (Button) findViewById(R.id.sekilas_btnNext);
        txtKarakter = (TextView) findViewById(R.id.sekilas_txtKarakter);
        txtSifatUtama = (TextView) findViewById(R.id.sekilas_txtSifatUtama);
        imgCover = (ImageView) findViewById(R.id.sekilas_imgCover);
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
                startActivity(new Intent(TaurusSekilas.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

