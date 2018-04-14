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
import com.gnm.zodiakku.asmara.PiscesAsmara;

public class PiscesCowok extends AppCompatActivity {
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
        txtTitleBar.setText("Pria Pisces");
        txtKarakterCowok.setText("Karakter Seorang Pria Zodiak Pisces");
        txtKarakterCowok_isi.setText(" Cowok Pisces adalah tipe orang yang senang berpikir. Kadang mereka tidak dapat dengan mudah mengerti atau mencoba memahami beberapa hal dengan cara yang mudah. Selau dipikirkan lebih rumit dari yang sebenarnya. Mereka juga tipe yang moody, sering uring-uringan dan tidur nyenyak adalah solusi untuk mendapatkan mood yang baik untuk mereka.\n" +
                "\n" +
                "    Jika loe memperhatikannya secara seksama, maka loe dapat dengan mudah mengerti mood apa yang sedang menimpanya. Tipe pemikirnya membuat mereka dapat melakukan banyak hal dengan baik pada pekerjaanya, dan umumnya selalu sukses. Tingkah normal yang ditunjukkannya adalah bahwa ia akan selalu mencari kesalahan orang, tetapi tidak akan membicarakan mengenai hal itu kepada orang lain.\n" +
                "\n" +
                "    Mereka memiliki kemampuan untuk mengenali pikiran loe dan dapat mengatakan kepada loe apa yang sedang anda pikirkan. Ia hampir dapat mengingat semua kemarahan dan cintanya. Hal-hal itu adalah rahasia pentingnya, dan mereka akan menyimpannya sendiri tanpa pernah membukanya bagi diri . Dan mereka bukanlah orang yang sangat ambisius dan tidak terlalu mementingkan posisinya di dalam masyarakat.\n" +
                "\n" +
                "    Kekayaan bukanlah tujuan utamanya, karena mereka bukanlah orang yang rakus, dan mereka berpikir bahwa uang tidaklah abadi. Mereka dapat menjadi orang yang sangat ceroboh dalam merencanakan masa depannya. Mereka tidak suka melawan arus, dan lebih memilih untuk ikut arah jaman, dan hidup lebih mudah. Hanya karena ingin mengambil jalan pintas inilah yang terkadang menyebabkan masa depannya tidak terlalu jelas.\n" +
                "\n" +
                "    Mereka umumnya baik dan sedikit malas, mereka membenci aturan dan tata tertib. Mereka tidak pernah meremehkan orang lain dan mereka adalah orang yang sopan, tetapi dapat menjadi begitu agresif pada saat marah. Mereka suka berpikir bahwa mereka hidup di dunia yang indah dan dikelilingi oleh orang baik, maka jika ketika mereka mengetahui bahwa dunianya kejam dan tidak seperti apa yang diharapkannya, maka mereka akan hidup di dunianya sendiri.\n" +
                "\n" +
                "    Pesonanya yang lain adalah bahwa mereka adalah seorang yang lucu, dan itulah senjatanya yang utama. Ketika mereka pengen nembak loe mereka membuatnya hanya seperti sedang bercanda saja. Bahkan ketika mereka sedih, mereka masih mempertahankan wajahnya yang lucu, maka sangat susah untuk melihat apakah mereka marah atau sedang depresi. Mereka suka menyembunyikan perasaannya dan menolong orang lain, terutama mereka yang membutuhkan teman,atau sedang kesepian.\n" +
                "\n" +
                "    Mereka dapat menjadi semua yang loe inginkan, dan juga semua yang tidak loe inginkan. Mereka memiliki kesempatan untuk berhasil sebanyak kesempatan yang sama untuk gagal. Mereka dapat memaksa dirinya untuk mengerjakannya dan dapat melakukannya dengan baik, kecuali jika mereka sering menggunakan terlalu banyak tenaga untuk mengurusi hal tetek bengek lainnya yang menyebabkan mereka kehilangan banyak kesempatan.\n" +
                "\n" +
                "    Mereka dapat menjadi bahagia dan merasa puas dengan apa yang mereka punya dan memiliki banyak cinta untuk loe. Mereka adalah orang yang pandai berbicara, sekaligus pendengar yang baik. Ketika mereka bersama loe, mereka ingin loe bahagia. Dan mereka mengerti keadaan emosional pasangannya.\n" +
                "\n" +
                "    Jika mereka ingin sendiri, lebih baik loe tidak mengganggunya. Mereka adalah orang yang sensitif, pendiam, pemalu, dan mudah terluka. Mereka selalu ingin untuk merasa berharga. Kadang mereka dapat menjadi pemarah dan ribut, tetapi begitu sadar dan tidak se'panas' tadi, mereka akan kembali menjadi manusia bahagia . Mereka bukan tipe orang pencemburu atau posesif, dan jika mereka merasa cemburu, jangan harap loe dapat mengetahuinya.\n" +
                "\n" +
                "    Dalam pergaulan mereka memiliki banyak teman baik cewek maupun cowok, dan mereka sangat perhatian kepada teman-temannya. Karena memiliki banyak teman, janganlah loe jadi cemburuan ngga menentu , atau kalau tidak loe akan kehilangan dirinya. Mereka juga menyukai hal-hal indah, jadi jika ada cewek cantik berjalan dan mereka memandanginya, jangan marah karena loe mengetahuinya. Karena mereka hanya sekedar mengagumi keindahan.\n" +
                "\n" +
                "    Teman-temannya kadang menjadi penghambat bagi cinta loe, karena mereka seakan lebih memperhatikan temannya dari pada loe dan lebih punya banyak waktu buat temannya dari pada buat loe. Tapi percayalah hal itulah yang bisa membuat mereka bahagia. So loe emang mencintai cowok ini maka loe harus lebih mengerti sifat mereka.\n" +
                "\n" +
                "    Ketika mereka sendirian atau merasa sedih, dekatilah dia untuk menghiburnya. Mereka tidak suka dinasehati, jadi jika loe ingin didengarkan, atau loe ingin mereka mengikuti nasehat loe, maka loe harus menjadi contoh yang baik bagi dirinya dulu. Mereka menyukai wanita yang ceria dan cerdas. Kalau loe memperlakukannya layaknya seseorang yang sangat spesial, maka mereka juga akan menjadi sespesial itu pula bagi loe.\n" +
                "\n" +
                "    Mereka akan mempercayai loe jika jatuh cinta, Tetapi usahakan jangan memaksakan kesempatan yang ada, dan akhirnya malah terlalu memanjakannya. Loe juga harus kasih pengertian ama mereka bahwa kehadiran loe bagi mereka juga berharga dan mereka juga harus menghargai loe");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PiscesCowok.this, PiscesAsmara.class));
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
                startActivity(new Intent(PiscesCowok.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

