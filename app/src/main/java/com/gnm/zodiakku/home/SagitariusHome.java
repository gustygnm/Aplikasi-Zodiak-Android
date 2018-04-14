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
import com.gnm.zodiakku.sekilas.SagitariusSekilas;

public class SagitariusHome extends AppCompatActivity {
    Button btnLanjut;
    TextView titleBar, txtTglLahirZodiak, txtTglLahirZodiak_isi1, txtTglLahirZodiak_isi2, txtSifat, txtSekilas, txtJdlSekitarZodiak;
    ImageView img_Cover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zodiak_home);

        SagitariusHome.this.setTitle("");
        //menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_Home);
        setSupportActionBar(toolbar);
        init();

        titleBar.setText("Sagitarius");
        txtTglLahirZodiak.setText("Lahir pada 22 November - 22 Desember");
        txtTglLahirZodiak_isi1.setText("Simbol : Archer / Pemanah\n" +
                "Elemen : api\n" +
                "Planet : Jupiter\n" +
                "Batu : topaz\n" +
                "Mineral : timah\n" +
                "Warna : Hijau Turquoise");
        txtTglLahirZodiak_isi2.setText("Archer atau pemanah adalah simbol dari Sagitarius ini adalah sosok Centaur, makhluk kuno setengah manusia dan berbadan kuda. Menunjukkan bahwa mereka adalah makhluk emosional yang penuh gairah, berani, bijaksana, dan selalu bergerak maju.");
        txtSifat.setText("optimis, antusias, jujur, pendiam, mandiri, bertanggungjawab, blak-blakan, petualang sejati");
        txtJdlSekitarZodiak.setText("Sekilas tentang Sagitarius");
        txtSekilas.setText("Para sagitarius merupakan sosok yang jujur, terus terang, energik dan pKamui membawa diri. Mereka mencapai tujuan karena memiliki pikiran yang positif, namun demikian ide-ide mereka sering kali sulit dimengerti.\n" +
                "Mereka suka mengambil kesimpulan tanpa mengumpulkan fakta terlebih dahulu. Mereka memiliki wawasan yang luas, flexibel dan diplomatis. Keinginannya untuk berpetualang membawanya ke tempat yang jauh. Kaum Sagitarius dapat menjadi teman perjalanan yang menyenangkan karena pKamui beradaptasi dengan lingkungan sekitar.\n" +
                "Mereka pribadi mandiri. Sebagai teman seperjalanan, mereka penuh pesona dan menyenangkan. Walaupun uang saku mereka habis, namun mereka tidak pernah menyesalinya karena mereka menikmati apa yang telah mereka dapatkan.\n" +
                "Sagitarius adalah pemula yang pandai membawa diri, selalu sedia menolong yang lain. Mereka membuat orang lain terinspirasi oleh antusiasme yang ada dalam pribadi mereka. Mereka suka menjadi pemimpin dan mudah tenar.\n" +
                "Kemampuannya dalam hal berencana, digabung dengan kekuatan, stamina dan etika kerja yang kuat selalu membawa mereka menjadi pemenang. Sikapnya yang persuasif memudahkannya mendapatkan dukungan dari orang lain. Sagitarius termasuk materialis, namun tidak suka hidup berlebihan.\n" +
                "Mereka suka bekerja di luar, asalkan nyaman dan penuh gaya. Mereka pesaing yang tangguh, suka bergabung di klub bergengsi. Sagitarius adalah jiwa yang bebas, menyenangkan dan mempunyai banyak teman.");
        img_Cover.setImageResource(R.drawable.cover_sagitarius);

        btnLanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SagitariusHome.this, SagitariusSekilas.class));
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

