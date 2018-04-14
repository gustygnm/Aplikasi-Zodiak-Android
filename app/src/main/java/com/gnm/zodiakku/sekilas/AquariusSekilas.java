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
import com.gnm.zodiakku.cewek.AquariusCewek;
import com.gnm.zodiakku.cewek.AriesCewek;

public class AquariusSekilas extends AppCompatActivity {
    Button btnBack, btnNext;
    TextView tittleBar, txtKarakter, txtSifatUtama;
    ImageView imgCover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zodiak_sekilas);

        AquariusSekilas.this.setTitle("Karakter Aquarius");
        //menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar toolbar = (Toolbar) findViewById(R.id.sekilas_toolbar);
        setSupportActionBar(toolbar);

        init();
        txtKarakter.setText("Secara umum memiliki sifat cenderung merasa sangat kesepian dalam hidup, suka sensitif dan mudah terluka perasaannya. Memiliki keinginan yang besar dalam keuntungan materi tetapi tidak serakah. Seorang pekerja yang tidak kenal lelah dan bersedia bekerja untuk apa yang di inginkan. sering kehilangan kontrol dalam bertindak berucap walaupun menyesal kemudia. Mereka adalah orang yang memiliki pemikiran yang baik dan sangat berhasil ketika berdebat ataupun berargumentasi dan sulit untuk meyakinkannya. ");
        txtSifatUtama.setText("Menjadi pribadi yang baik atau buruk adalah pilihan masing-masing namun memang ada Sifat pemilik zodiak ini yang mendasar sehingga mudah untuk dianalisis atau disimpulkan. Anda yang sedang menganalisis sifat seseorang bisa mencoba untuk mencocokkan sifat sifat yang telah dibahas diatas kepada aquarius. Artikel ini akan sangat bermanfaat bagi yang sedang ingin saling berkenalan. Sifat ini juga bisa menjadi motifasi bagi wanita yang memiliki zodiak aquarius agar lebih manfaatkan sifat yang telah dianugerahkan oleh tuhan.\n" +
                "Sifat Aquarius untuk wanita dan laki laki tentu berbeda. Karakter wanita cenderung lebih halus namun untuk laki laki juga ada beberapa kesamaan sifat dengan wanita. Anda bisa mencocokkan sifat dari aquarius laki laki dan juga perempuan. Kelahiran memang tidak bisa diprediksi karena semuanya adalah kehendak Tuhan. Apabila Tuhan telah menentukan tanggal kelahiran seseorang maka orang tersebut sebaiknya selalu menerima dan bersyukur dengan apa yang tuhan berikan. Semakin pandai seseorang untuk bersyukur kepada Tuhan maka hidup akan semakin baik. Sifat yang dimiliki juga akan ditempatkan pada hal hal yang baik seperti contoh sifat yang cerdas dan kreatif. Kreatifitas untuk hal yang baik akan membawa kesuksesan dan kebahagiaan namun jika dijadikan untuk membuat hal buruk maka akan sangat merugikan baik diri sendiri maupun orang lain.");
        imgCover.setImageResource(R.drawable.aquarius2);
        imgCover.setBackgroundColor(Color.parseColor("#a6af52"));

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AquariusSekilas.this, AquariusCewek.class));
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
                startActivity(new Intent(AquariusSekilas.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

