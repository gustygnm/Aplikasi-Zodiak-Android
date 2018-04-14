package com.gnm.zodiakku.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.gnm.zodiakku.R;
import com.gnm.zodiakku.sekilas.TaurusSekilas;

public class TaurusHome extends AppCompatActivity {
    Button btnLanjut;
    TextView titleBar, txtTglLahirZodiak, txtTglLahirZodiak_isi1, txtTglLahirZodiak_isi2, txtSifat, txtSekilas, txtJdlSekitarZodiak;
    ImageView img_Cover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zodiak_home);

        TaurusHome.this.setTitle("");
        //menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_Home);
        setSupportActionBar(toolbar);
        init();

        titleBar.setText("Taurus");
        txtTglLahirZodiak.setText("Lahir pada 21 April – 22 Mei");
        txtTglLahirZodiak_isi1.setText("Simbol : Banteng\nElemen : Tanah\nPlanet : Venus\nBatu : Emerald\nMineral : Tembaga\nWarna : Hijau");
        txtTglLahirZodiak_isi2.setText("Banteng adalah simbol dari zodiak ini yang melambangkan kekuatan, kekerasan hati, kejantanan dan kekuasaan. Pada umumnya mereka hidup sendiri, namun terkadang berkelompok. Mereka adalah sosok yang cinta damai, namun bisa seketika marah jika ada yang memancing emosinya.");
        txtSifat.setText("Keras Kepala, Materialistis, Pasif, Ramah dan Sabar, Praktis dan Setia, Memiliki Jiwa Toleransi");
        txtJdlSekitarZodiak.setText("Sekilas tentang Taurus");
        txtSekilas.setText("Taurus biasanya berjuang untuk mendapatkan rasa aman batiniah dan jasmaniah. Mereka memiliki selera tinggi pada pakaian, lukisan, barang-barang antik dan barang-barang mewah lainnya.\n\nCita rasa Taurus sangat tinggi, namun cenderung konservatif. Mereka sangat menikmati alunan melodi dan musik yang indah. Taururs suka menolong orang lain dan tidak mudah marah.\n\nMereka tidak suka didesak dan cenderung keras kepala bila terus menerus didesak. Para Taurus cenderung setia, stabil dan sabar, meskipun kadang mereka keras kepala.\n\nMereka memiliki pKamungan yang baik untuk meraih tujuan mereka sehingga mereka cukup berhasil.\n\nMereka gigih pada keputusan yang telah diambil dan tidak ada seorangpun yang dapat merubah pendiriannya.\n\nKarena Taururs tidak suka didesak, maka banyak yang menjulukinya si Lamban. Namun demikian, kamu dapat mempercayakannya dalam membantumu keluar dari masalah. Mereka bukan tipe orang yang mudah melanggar janji dan mundur dari suatu keyakinan, dan mereka memiliki stamina dan ketekunan untuk bertahan dari lawan-lawannya. Kekuasaan Taurus sangat hebat sehingga mereka tidak mudah gagal dalam hidupnya.");
        img_Cover.setImageResource(R.drawable.cover_taurus);

        btnLanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TaurusHome.this, TaurusSekilas.class));
            }
        });
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }

    @Override
    public void onBackPressed() {
        finish();
    }

    void init() {
        btnLanjut = (Button) findViewById(R.id.btnLanjut);
        titleBar = (TextView) findViewById(R.id.home_titleBar);
        txtTglLahirZodiak = (TextView) findViewById(R.id.home_txtLahirZodiak);
        txtTglLahirZodiak_isi1 = (TextView) findViewById(R.id.home_txtLahirZodiak_Isi1);
        txtTglLahirZodiak_isi2 = (TextView) findViewById(R.id.home_txtLahirZodiak_isi2);
        txtSifat = (TextView) findViewById(R.id.home_ZodiaktxtSifat);
        txtSekilas = (TextView) findViewById(R.id.home_ZodiaktxtSekilas);
        txtJdlSekitarZodiak = (TextView) findViewById(R.id.home_txtjdlSekitarZodiak);
        img_Cover = (ImageView) findViewById(R.id.home_img);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.close, menu);
//        return true;
//    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

