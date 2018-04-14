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
import com.gnm.zodiakku.sekilas.GeminiSekilas;

public class GeminiHome extends AppCompatActivity {
    Button btnLanjut;
    TextView titleBar, txtTglLahirZodiak, txtTglLahirZodiak_isi1, txtTglLahirZodiak_isi2, txtSifat, txtSekilas, txtJdlSekitarZodiak;
    ImageView img_Cover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zodiak_home);

        GeminiHome.this.setTitle("");
        //menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_Home);
        setSupportActionBar(toolbar);
        init();

        titleBar.setText("Gemini");
        txtTglLahirZodiak.setText("Lahir pada 23 Mei - 21 Juni");
        txtTglLahirZodiak_isi1.setText("Simbol : Anak kembar\nElemen : Udara\nPlanet : Merkuri\nBatu : Agate (akik)\nWarna : Kuning");
        txtTglLahirZodiak_isi2.setText("Simbol anak kembar dikenal sejak dahulu kala, menunjukkan adanya dua sisi dalam satu tubuh yang sama. Di mana juga melambangkan sebuah perubahan yang bisa terjadi dalam waktu yang sangat cepat, sebuah komunikasi, transaksi dan ide baru. Transisi tercipta di dalam simbol kembar ini, dengan demikian yang mempunyai zodiak ini sangat mudah berubah dan beradaptasi terhadap hal atau sesuatu yang baru.");
        txtSifat.setText("Lincah, Pandai berbicara, Tidak Stabil, Mudah Berubah-Ubah, Mudah Gugup, Sangat Peka");
        txtJdlSekitarZodiak.setText("Sekilas tentang Gemini");
        txtSekilas.setText("Gemini adalah simbol kecerdasan, memiliki banyak akal. Komunikasi dan bahasa sangat penting bagi mereka. Mereka memiliki kemampuan berkembang dan belajar yang tinggi. Umumnya para Gemini tidak stabil, reaksi terhadap situasi ditentukan oleh mood mereka.\n" +
                "Bagi Gemini, keragaman adalah penyedap kehidupan. Mereka menikmati hasil yang mereka capai lewat kerja keras mereka sendiri. Gemini tidak menyukai rutinitas. Pengetahuan, pikiran yang cepat dan kepKamuian jelas terlihat pada zodiak ini. Mereka mudah berubah-ubah.\n" +
                "Simbol ini memiliki pesona alami dan energi karisma yang menarik semua zodiak. Mereka memiliki banyak ide yang dapat membuat kita tertarik, namun mereka cenderung cepat bosan jika mereka berada di sekitar orang yang tidak dapat mengikuti jalan pikiran mereka, dana cepat berpindah ke suatu tempat dimana orang di sekitarnya dapat mengikuti jalan pikiran mereka.\n" +
                "Mereka biasa menikmati hidup mereka dan jarang melihat kembali kebelakang. Gemini dikenal dengan spontanitasnya dan kemampuan mereka berbicara mengenai segala hal. Mereka energik dan murah hati. Sikap plin plan mereka terkadang menyulitkan. Kamu tidak akan pernah tahu apa yang mereka pikirkan dan apa yang akan mereka lakukan.\n" +
                "Cobalah bertanya pertanyaan yang sama pada hari berikutnya, maka kamu akan mendapatkan jawaban yang berbeda setiap harinya. Terkadang hal ini dapat membuatmu putus asa, namun dapat juga mempesonamu.");
        img_Cover.setImageResource(R.drawable.cover_gemini);

        btnLanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GeminiHome.this, GeminiSekilas.class));
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

