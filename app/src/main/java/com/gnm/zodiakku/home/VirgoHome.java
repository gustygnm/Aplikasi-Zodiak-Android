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
import com.gnm.zodiakku.sekilas.VirgoSekilas;

public class VirgoHome extends AppCompatActivity {
    Button btnLanjut;
    TextView titleBar, txtTglLahirZodiak, txtTglLahirZodiak_isi1, txtTglLahirZodiak_isi2, txtSifat, txtSekilas, txtJdlSekitarZodiak;
    ImageView img_Cover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zodiak_home);

        VirgoHome.this.setTitle("");
        //menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_Home);
        setSupportActionBar(toolbar);
        init();

        titleBar.setText("Virgo");
        txtTglLahirZodiak.setText("Lahir pada 23 Agustus - 23 September");
        txtTglLahirZodiak_isi1.setText("Simbol : Bidadari\n" +
                "Elemen : tanah\n" +
                "Planet : Merkurius\n" +
                "Batu : safir\n" +
                "Mineral : air raksa\n" +
                "Warna : biru");
        txtTglLahirZodiak_isi2.setText("Simbol Virgo dilambangkan oleh bidadari, di mana karakteristik dasarnya adalah sosok pemalu, lembut, bijaksana, dan alami. Mereka memiliki kecenderungan lebih suka hidup sendiri.");
        txtSifat.setText("analitik, cerdas, kritis, suka menolong, teliti, pendiam");
        txtJdlSekitarZodiak.setText("Sekilas tentang Virgo");
        txtSekilas.setText("Virgo adalah penganalisa dan pengurus organisasi yang Kamul. Mereka ingin segala sesuatunya dikerjakan dengan sempurna, dan selalu mendapatkan perhatian dari sekelilingnya karena kesempurnaan dan keefisienannya. Mereka pKamui dalam hal mengkritik hasil kerja orang lain. Para virgo mengagumi perkembangan teknologi dan sangat gemar masakan yang lezat. Namun demikian mereka tidak lupa untuk berdiet.\n" +
                "Ketangkasan mereka dan kemampuan mengkoordinasi melebihi rata-rata. Sikapnya penuh emosi, namun terkadang baik. Virgo selalu tampil rapi, bersih dan prima. Mereka memiliki cita rasa tinggi namun konservatif. Virgo pKamui mengatur orang lain namun begitu ia tidak suka bersikap sombong terhadap orang lain.\n" +
                "Mereka berakal panjang, menyelesaikan masalah dengan cepat. Para virgo sangat perfeksionis dan ini membuat orang disekitarnya tidak nyaman. Jika segala sesuatunya tidak berjalan seperti yang diinginkan, ia akan marah. Namun demikian mereka selalu bersedia menolong orang lain.");
        img_Cover.setImageResource(R.drawable.cover_virgo);

        btnLanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VirgoHome.this, VirgoSekilas.class));
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

