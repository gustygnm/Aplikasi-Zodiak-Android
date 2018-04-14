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

public class AriesHome extends AppCompatActivity {
    Button btnLanjut;
    TextView titleBar, txtTglLahirZodiak, txtTglLahirZodiak_isi1, txtTglLahirZodiak_isi2, txtSifat, txtSekilas, txtJdlSekitarZodiak;
    ImageView img_Cover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zodiak_home);

        AriesHome.this.setTitle("");
        //menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_Home);
        setSupportActionBar(toolbar);
        init();

        titleBar.setText("Aries");
        txtTglLahirZodiak.setText("Lahir pada 21 Maret - 20 April");
        txtTglLahirZodiak_isi1.setText("Simbol : Domba\nElemen : Api\nPlanet : Mars\nBatu : Amethyst, Berlian\nWarna : Merah");
        txtTglLahirZodiak_isi2.setText("Domba bertanduk adalah simbol yang mewakili Aries. Simbol tersebut mengandung artian, kesuburan, agresif dan serangan, serta keberanian. Tanduk yang ada di kepala domba mewakili ambisi Aries untuk memimpin. Untuk itulah Aries yang terkadang keras dan tak suka dibantah.");
        txtSifat.setText("Aktif, inisiatif, suka memimpin, mandiri, agresif, tidak sabaran, energik, pemula, asertif dan terkadang naif.");
        txtJdlSekitarZodiak.setText("Sekilas tentang Aries");
        txtSekilas.setText("Orang Aries menjadi pemimpin zodiak-zodiak lainnya, agresif dan penuh kreativitas yang memungkinkan mereka untuk berinisiatif dalam mengadakan perubahan. Selayaknya domba jantan, mereka selalu bertindak cepat tanpa berpikir panjang terlebih dahulu. mereka lebih senang mencari penghargaan daripada kekayaan dan biasanya lebih suka berbicara terus terang daripada berbasa-basi untuk mendapatkan apa yang diinginkannya.\n\nKebanyakan dari mereka sukses berkat sikap mereka yang pantang menyerah. Aries merupakan orang yang penuh energi, pandai beradaptasi dan cepat belajar. mereka memiliki banyak ide-ide cemerlang dan berambisi tinggi. Keras kepala, antusias dan penuh orientasi.\n\nBila mereka ingin sesuatu, tidak ada yang dapat menghalanginya. mereka siap mengambil tindakan tanpa memikirkan resiko yang dapat mencelakakan diri mereka sendiri. Aries bukan seorang pengikut yang baik. Mereka memiliki semua kemampuan yang dibutuhkan untuk menjadi seorang pemimpin yang baik, namun sikapnya yang suka memerintah membuat orang menjauhi dirinya.");
        img_Cover.setImageResource(R.drawable.cover_aries);

        btnLanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AriesHome.this, AriesSekilas.class));
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

