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
import com.gnm.zodiakku.cewek.SagitariusCewek;

public class SagitariusSekilas extends AppCompatActivity {
    Button btnBack, btnNext;
    TextView tittleBar, txtKarakter, txtSifatUtama;
    ImageView imgCover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zodiak_sekilas);

        SagitariusSekilas.this.setTitle("Karakter Sagitarius");
        //menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar toolbar = (Toolbar) findViewById(R.id.sekilas_toolbar);
        setSupportActionBar(toolbar);

        init();
        txtKarakter.setText(" Sebagai seorang yang fasih dalam berkomunikasi dengan kemampuan sosial yang baik, Anda memahami sifat-sifat manusia dan mampu bergaul dengan orang-orang dari berbagai macam profesi.\n" +
                "\n" +
                "Bakat bisnis dan pemahaman akan nilai-nilai menganugerahkan bakat kepemimpinan dan kemampuan untuk menilai dengan cepat motif-motif orang lain.\n" +
                "\n" +
                "Sebagai orang yang memiliki rasa bangga, penting bagi Anda untuk memperlihatkan citra yang baik, dan Anda tertarik pada orang-orang yang cerdas.\n" +
                "\n" +
                "Mencari variasi dan aktivitas untuk meredakan keresahan, Anda harus fokus dan gigih serta menumbuhkan kesadaran diri untuk mengatasi hambatan-hambatan. ");
        txtSifatUtama.setText(" Bersemangat dan ambisius, Anda mampu meraih tujuan dengan fokus dan tekun hingga tujuan tersebut tercapai. Bila Anda merasa selalu benar, sikap Anda akan menjadi keras kepala dan egois.\n" +
                "\n" +
                "Dengan kecerdasan dan kewaspadaan, Anda memiliki kepandaian dan insting kuat yang membantu Anda dalam mengembangkan cara pandang yang lebih luas dan bijaksana.\n" +
                "\n" +
                "Mampu berpikir mendalam dan memiliki ketahanan mental, Anda menerapkan pendekatan yang sistematis dan rasional sehingga menunjukkan bahwa Anda mampu menyelesaikan masalah dengan baik.\n" +
                "\n" +
                "Kendati selera humor yang unik menunjukkan bahwa Anda menyenangkan dan cerdik, namun Anda tidak sabar menghadapi orang-orang yang kemampuannya tidak setara dengan Anda, dan terkadang bersikap terus terang atau sangat jujur.\n" +
                "\n" +
                "Menurut perhitungan, Anda adalah orang yang ambisius dan pekerja keras, serta mampu menyelesaikan banyak hal melalui ekspresi diri yang kreatif.\n" +
                "\n" +
                "Anda harus menumbuhkan sikap pragmatis bila ingin mengubah bakat-bakat kreatif menjadi produk-produk yang berwujud.\n" +
                "\n" +
                "Anda akan sulit memutuskan apa yang Anda inginkan. Bila Anda melakukan terlalu banyak aktivitas, maka Anda hanya akan menghabiskan energi dan dikhawatirkan ada yang terlupakan.\n" +
                "\n" +
                "Anda orang yang ramah, optimis, dan bersemangat dalam menjalin kemitraan. Anda berpikir secara mandiri dan ingin tetap berkuasa dan bebas.\n" +
                "\n" +
                "Cerdas serta dinamis, Anda akan mendapatkan banyak manfaat dengan mengembangkan filosofi yang kuat atau melanjutkan pendidikan ke jenjang lebih tinggi. ");
        imgCover.setImageResource(R.drawable.sagittarius2);
        imgCover.setBackgroundColor(Color.parseColor("#949599"));

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SagitariusSekilas.this, SagitariusCewek.class));
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
                startActivity(new Intent(SagitariusSekilas.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

