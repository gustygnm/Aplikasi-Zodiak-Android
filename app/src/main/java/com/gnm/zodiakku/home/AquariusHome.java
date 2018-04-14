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
import com.gnm.zodiakku.sekilas.AquariusSekilas;
import com.gnm.zodiakku.sekilas.AriesSekilas;

public class AquariusHome extends AppCompatActivity {
    Button btnLanjut;
    TextView titleBar, txtTglLahirZodiak, txtTglLahirZodiak_isi1, txtTglLahirZodiak_isi2, txtSifat, txtSekilas, txtJdlSekitarZodiak;
    ImageView img_Cover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zodiak_home);

        AquariusHome.this.setTitle("");
        //menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_Home);
        setSupportActionBar(toolbar);
        init();

        titleBar.setText("Aquarius");
        txtTglLahirZodiak.setText("Lahir pada 21 Januari - 19 Febuari");
        txtTglLahirZodiak_isi1.setText("Simbol : Guci Air\nElemen : Udara\nPlanet : Uranus\nBatu : Amethyst\nWarna : Biru Langit");
        txtTglLahirZodiak_isi2.setText("Guci air adalah simbol dari Aquarius menandakan sosok yang sangat alami dan sangat spiritualis. Mereka mempunyaisifat dewasa yang cinta damai. Orientasi mereka adalah kemajuan dan perkembangan, untuk itu mereka adalah orang-orang yang gemar belajar dan sangat cerdas.");
        txtSifat.setText("Para Aquarius bersifat progresif, inovatif dan penuh gagasan. Individu ini sangat progresif dalam cara berpikir, cenderung individualistik dan enggan mengikuti keramaian.");
        txtJdlSekitarZodiak.setText("Sekilas tentang Aquarius");
        txtSekilas.setText("Walaupun pada dasarnya mereka tidak antusias untuk menjadi pemimpin, beberapa diantaranya berhasil menjadi pemimpin. Sikapnya eksentrik, penuh keyakinan, namun keras kepala. Mereka cenderung bersikap adil.\n" +
                "Dalam bekerja selalu penuh keseriusan, walaupun dari luar mereka nampak tenang, namun di dalam hatinya mereka sangat takut dan gugup. Aquarius suka barang-barang mewah, namun tidak serakah. Mereka tidak menyukai adat istiadat dan peraturan-peraturan kuno dalam keluarganya dan cenderung melanggar peraturan.\n" +
                "Mereka suka mengikuti kata hatinya bila menyangkut masalah perasaan. Mereka cenderung menyakiti dirinya sendiri daripada menyakiti orang lain. Aquarius dapat menyelesaikan masalah karena mereka mampu keluar dari dilema. Mereka peduli pada hal-hal besar dan sangat manusiawi.\n" +
                "Aquarius pribadi yang senang menyendiri, perlu banyak waktu untuk mengenal mereka karena mereka hanya membuka diri pada orang yang mereka percaya, hormati dan cintai.\n" +
                "Asmara Para Aquarius: Kaum Aquarius tertarik pada pasangan yang memiliki kepKamuian. Mereka senang mencoba termasuk mencoba hal baru dalam hal percintaan dan romantisme. Kaum Aquarius kadnag bersikap dingin dan acuh namun dibalik semuanya itu dia sangat pasangan yang penuh kasih yang selalu mencoba hal baru dan lain dari yang biasanya. Mereka cenderung perhatian dan setia bila kamu mulai mengenal Cancer.\n" +
                "Mereka berjiwa patriot dan sangat melindungi semua yang mereka sayangi. Mereka sangat membanggakan lingkungan tempat tinggalnya dan senang mengundang teman-temannya berkunjung di rumahnya.\n" +
                "Kegemarannya mengumpulkan barang-barang membuat orang menjulukinya gudang tikus. Mereka memiliki ingatan yang luar biasa dan akan selalu mengingatkanmu akan hal-hal yang telah kamu lakukan di masa yang lalu, terutama hal-hal yang ingin kamu lupakan. Para cancer merupakan orang yang penuh kasih, setia dan penuh welas asih. Kebutuhannya untuk mendapatkan rasa aman dan keseimbangan dalam hidup sangat didambakan.");
        img_Cover.setImageResource(R.drawable.cover_aquarius);

        btnLanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AquariusHome.this, AquariusSekilas.class));
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

