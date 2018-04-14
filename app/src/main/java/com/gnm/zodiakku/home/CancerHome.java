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
import com.gnm.zodiakku.sekilas.AriesSekilas;
import com.gnm.zodiakku.sekilas.CancerSekilas;

public class CancerHome extends AppCompatActivity {
    Button btnLanjut;
    TextView titleBar, txtTglLahirZodiak, txtTglLahirZodiak_isi1, txtTglLahirZodiak_isi2, txtSifat, txtSekilas, txtJdlSekitarZodiak;
    ImageView img_Cover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zodiak_home);

        CancerHome.this.setTitle("");
        //menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_Home);
        setSupportActionBar(toolbar);
        init();

        titleBar.setText("Cancer");
        txtTglLahirZodiak.setText("Lahir pada 22 Juni - 22 Juli");
        txtTglLahirZodiak_isi1.setText("Simbol : Kepiting\nElemen : Air\nPlanet : Bulan\nBatu : Mutiara, opal\nWarna : Putih, kuning");
        txtTglLahirZodiak_isi2.setText("Kepiting adalah binatang yang berjalan miring, demikian simbol ini melambangkan zodiak Cancer yang memiliki kecenderungan sikap yang sangat berbeda dan unik. Mereka selalu menyelesaikan masalah dengan caranya sendiri. Tergolong orang-orang yang melindungi diri sendiri, egois, sensitif dan tertutup. Mereka tak begitu suka akan perubahan, dan merasa nyaman dengan lingkungan yang sudah ada sejak lama.");
        txtSifat.setText("Suasana Hati Tidak Menentu, Sentimentil, Setia, Penuh Perhatian, Sulit Memaafkan, Memiliki Daya Ingat Yang Kuat");
        txtSekilas.setText("Cancer adalah pribadi yang penuh emosi, sensitif. Selayaknya kepiting mereka sangat protektif dan memiliki pertahanan diri yang tinggi. Mereka takut pada cemoohan, dan akan bekerja dengan diam-diam dibelakang layar untuk mendapatkan apa yang telah mereka rencanakan. Mereka tidak mau mengambil resiko dalam hidupnya dan selalu konsisten membayar hutang mereka.\n" +
                "Cancer sangat mendambakan kerapian dan kebersihan. Cancer sangat simpatik terhadap orang lain oleh karena itu sulit mengerti seperti apa sebenarnya pribadi mereka.\n" +
                "Cancer memiliki intuisi yang kuat dan dapat mengetahui pikiran-pikiran dan perasaan yang ada pada orang-orang yang dijumpai. Mereka bisa menjadi sangat agresif jika seseorang menantang mereka, maka dari itu jangan main-main dengan kepiting kecuali kamu siap untuk dicapit oleh mereka.");
        txtJdlSekitarZodiak.setText("Sekilas tentang Cancer");
        img_Cover.setImageResource(R.drawable.cover_cancer);

        btnLanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CancerHome.this, CancerSekilas.class));
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

