package com.gnm.zodiakku.cowok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.gnm.zodiakku.MainActivity;
import com.gnm.zodiakku.R;
import com.gnm.zodiakku.asmara.AriesAsmara;
import com.gnm.zodiakku.asmara.TaurusAsmara;

public class TaurusCowok extends AppCompatActivity {
    Button btnBack, btnNext;
    TextView txtTitleBar, txtKarakterCowok, txtKarakterCowok_isi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zodiak_cowok);

        //menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar toolbar = (Toolbar) findViewById(R.id.cowok_toolbar);
        setSupportActionBar(toolbar);

        init();
        txtTitleBar.setText("Pria Taurus");
        txtKarakterCowok.setText("Karakter Seorang Pria Zodiak Taurus");
        txtKarakterCowok_isi.setText(" Cowok sederhana dan pendiam ini dapat melakukan sesuatu yang akan mengejutkan loe. Taurus pada umumnya berfisik tinggi-sedang, kuat dengan badan yang sehat. Ketika ia berbicara, ia cenderung memiringkan kepala atau menoleh. Tubuhnya cukup lurus, sruktur wajah cenderung kuat dan persegi.\n" +
                "\n" +
                "    Matanya bersinar dengan kehidupan. Bahkan ketika ia sedang jatuh cinta, ia tetap menjadi seekor burung lepas. Ia adalah sebutir pasir di telapak tangan loe, semakin loe ingin memegangnya, semakin mudah ia lepas. Jika loe bertahan dan mempertahankannya, maka ia akan tinggal dan menetap. Jangan membuat aturan buat dia, karena ia akan segera meninggalkan loe.\n" +
                "\n" +
                "    Ketika loe bersama dengan mereka, ia hanya akan memikirkan loe. Tetapi satu jam kemudian ia akan mengubah pikirannya. Ia sangat sabar terhadap orang lain, tetapi tidak sabar terhadap dirinya. Dunianya selalu berputar, dan hal itu tidak akan berhenti hanya karena dia mencintai loe. Jika ia jengkel, ia akan segera menunjukkannya. Jika ada yang salah, ia akan menyalahkan kelengahannya dan tidak menyalahkan orang lain.\n" +
                "\n" +
                "    Ia akan tulus kepada semua teman, bahkan kepada mereka yang tidak disukainya. Ia suka melakukan hal-hal ganjil dan mengkagetkan orang lain. Ia mungkin saja dengan jas lengkap dan indah akan menceburkan diri kedalam kolam. Ia mungkin saja menepuk punggung anda dengan keras, hanya supaya anda menoleh kearahnya yang sedang memegangi bunga. Ia tidak suka terlalu dekat dengan orang lain karena ia berpikir bahwa hidup di alam nyata adalah hidup sendiri.\n" +
                "\n" +
                "    Ia tidak pernah peduli apa yang dipikirkan orang ketika ia bertingkah aneh. Ia dapat saja berjalan telanjang kaki dan menertawai orang yang menertawai dia, dan berpikir bahwa orang yang menertawai dia berpikiran sempit.\n" +
                "\n" +
                "    Ia tidak suka mengikuti sesuatu yang umum, tetapi selalu berusaha mencari suatu pengalaman baru, suatu misteri baru. Ia tertarik dengan pola kehidupan seorang jutawan, dan juga kepada pak tua penjual koran di tepian jalan. Ia suka mencari dan menganalisa orang dan banyak hal. Ia akan menganalisa teman dan pacarnya, dan ketika ia berhasil melakukannya, dan misterinya hilang, maka ia akan mencari soal lain untuk dipecahkan.\n" +
                "\n" +
                "    Ia tidak terlalu mudah mengerti sesuatu, maka ia akan secara bertahap mempelajari loe sampai akhirnya semua pertanyaan akan terjawab. Ia kenal begitu banyak orang, tetapi hanya sedikit teman. Ia mencari teman berkualitas daripada kuantitas. Ia akan dekat dengan cepat dengan beberapa teman, dan akan terus bergerak. Ia selalu merasa kesepian walaupun banyak teman ada disekelilingnya.\n" +
                "\n" +
                "    Ia dapat menciptakan dunianya sendiri, dan tidak ada orang yang dapat mengerti dia. Ia hanya melihat masa depan dan ia memikirkan mengenai masa depan. Ia mungkin bertanya-tanya berapa banyak orang yang berpikir seperti dia, tetapi ia tidak ingin menjadi seperti orang lain.\n" +
                "\n" +
                "    Seseorang dengan kepribadian yang penuh konflik. Ia tampak cool, pengertian, mampu bekerja baik, dan sangat artistik. Cowok taurus dapat menjadi seorang artis. Ia dapat mengejutkan loe sebanyak ia dapat mengangkat mood loe ketika bete. Ia adalah jiwa bebas yang suka bertualang, tetapi ketika ingin sendirian, jangan sentuh dia, biarkan dia sendirian.\n" +
                "\n" +
                "    Ia tidak akan menghilang dari kelompoknya lama-lama, ia akan segera kembali. Ia akan memberi pendapat yang langusug terbuka dan blak-blakan kepada loe, tetapi tidak pernah akan memberikan nasehat mengenai apa yang seharusnya loe lakukan. Ia juga tidak suka mendengar pendapat orang tentang apa yang seharusnya ia lakukan. Ia berpikir bahwa mimpi dan pikiran tiap orang seharusnya sangat rahasia.\n" +
                "\n" +
                "    Ia akan menggunakan otaknya, bukan ototnya, maka ia akan membiarkan orang lain bersaing. Ia memiliki kepuasan tersendiri dalam hidupnyam dan benci untuk memaksa dirinya masuk dalam persaingan. Ia mungkin terlihat semrawut, tetapi sebenarnya ia adalah pemilikir dan orang yang keras kepala. Ia melihat segala sesuatu dengan detil dan tidak mudah mempercayai orang sampai ia berpikir bahwa ia telah mengenalnya sepenuhnya.\n" +
                "\n" +
                "    Mungkin saja loe sekedar tersenyum dan ia akan berpikir, mengapa dan apa yang menyebabkan loe tersenyum, atau mungkin loe hanya sekedar berpura-pura. Begitu ia mempercayai loe dan menganggap loe sebagai teman, tidak ada orang yang dapat mengubah pandangannya karena ia tidak akan mendengar mengenai gosip. Ia akan jujur dan tulus menghadapi teman-temannya.\n" +
                "\n" +
                "    Ia tidak suka berbohong, maka ia tidak akan berbohong kepada loe. Jika ia merasa butuh berbohong, ia akan berusaha mengatakannya dengan cara lain, atau berusaha tidak mengatakan apapun kepada loe. Jika ia harus terpaksa berbohong, maka loe tidak akan dapat membedakan apakah ia sedang berbohong atau tidak. Ia dapat menyimpan rahasia dengan baik, maka loe akan sangat sulit mengetahui bahwa sebenarnya ia kesepian.\n" +
                "\n" +
                "    Jika loe mengingini tipe orang seperti ini, loe haruslah menjadi orang yang menarik. Ia harus ingin tahu mengenai loe. Neraka baginya adalah \"Tidak ada kebebasan\", maka jika ia menikahi loe, hal itu adalah keputusan paling berat dalam hidupnya. Selalu berusaha menarik, maka dia akan betah disisi loe.");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TaurusCowok.this, TaurusAsmara.class));
            }
        });

//        if (getSupportActionBar() != null) {
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//            getSupportActionBar().setDisplayShowHomeEnabled(true);
//        }
    }

    void init() {
        btnBack = (Button) findViewById(R.id.cowok_btnBack);
        btnNext = (Button) findViewById(R.id.cowok_btnNext);
        txtTitleBar = (TextView) findViewById(R.id.cowok_titleBar);
        txtKarakterCowok = (TextView) findViewById(R.id.cowok_karakterCowok);
        txtKarakterCowok_isi = (TextView) findViewById(R.id.cowok_karakterCowok_isi);
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
                startActivity(new Intent(TaurusCowok.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

