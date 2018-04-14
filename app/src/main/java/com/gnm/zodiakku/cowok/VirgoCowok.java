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
import com.gnm.zodiakku.asmara.VirgoAsmara;

public class VirgoCowok extends AppCompatActivity {
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
        txtTitleBar.setText("Pria Virgo");
        txtKarakterCowok.setText("Karakter Seorang Pria Zodiak Virgo");
        txtKarakterCowok_isi.setText(" Bagi Pria Virgo, waktu sangat berharga, dan jika loe membuatnya harus menunggu, ia akan menganggap hal itu sebagai penghinaan. Ia tidak suka mendengar kritik, dan benci dikritik. Jika ia mengkritik oranglain, maka ia sedang berada dalam pengaruh zodiak lain. Ia memang seorang perfeksionsi dan suka kesempurnaan. Ia selalu berpikir bahwa dia telah melakukan segala sesuatu dengan benar, dan seringkali bahkan berpikir bahwa dia tidak pernah membuat kesalahan.\n" +
                "\n" +
                "    Dia adalah cowok yang cerdas dan dapat menerima komentar apapun yang dia anggap dapat membantu dirinya berkembang. Dia adalah tipe orang yang mampu beradaptasi dengan baik terhadap perubahan. Ia akan membelanjakan uangnya denagan hati-hati untuk pemakaian jangka panjang.\n" +
                "\n" +
                "    Ia hanya akan mengambil sifat ekstravagant untuk hiburan pribadinya saja. Ia cukup romantis, tipe cowok yang mau menempuh 100 mil hanya untuk mengatakan betapa ia kangen kepada loe. Jika ia tidak peduli kepada loe, ia bahkan tidak akan mau membelanjakan koin lima ratusan hanya untuk menelepon loe. Bahkan sekalipun ada diskon tarif SLJJ, ia tidak akan mau menggunakannya.\n" +
                "\n" +
                "    Dan dia akan melindungi loe bagaikan barang antik yang sangat berharga, kadang sifatnya jadi terlalu over protektif, dan umumnya mereka pencemburu berat sehingga sering membatasi gerak langkah loe dalam berteman, tp semua yang dilakunkannya adalah karena dia sangat mencintai loe.\n" +
                "\n" +
                "    Ia tidak suka orang yang kasar. Wanita pilihannya haruslah wanita yang rapi dan pandai berdandan. Ia akan mengawasi semua detil karena sifatnya yang perfeksionis, maka mungkin saja loe sedang berjemur dengan berbikini, dan walaupun tubuh loe nampak sempurna, tiba-tiba ia mengatakan kepada loe bahwa kaki loe tampak besar. Jika bobot loe naik 2pon, maka dia akan berkomentar bahwa loe terlalu gemuk.\n" +
                "\n" +
                "    Sebelum berkencan dengan tipe cowok ini, Sebaiknya loe harus mengamati penampilan loe dari ujung kepala sampai ujung jari kaki, dan bertanya kepada diri loe sendiri apakah loe telah sepenuhnya siap. Mungkin berkencan dengan model adalah satu-satunya cara meredam komentarnya.\n" +
                "\n" +
                "    Ia rapi dan teratur, maka hidupnya akan penuh dengan jadwal, waktu tertentu untuk makan siang, dan waktu yang sama untuk pulang. Ia cukup tahu tentang makanan, dan sadar nutrisi, maka tipe cowok ini tidak akan suka makan junk food, apalagi makanan eksotis asing. Loe hanya akan menemuinya di pesta-pesta atau acara social yang dianggapnya perlu.\n" +
                "\n" +
                "    Ia memiliki bakat akting, maka jika ia mengaku tidak dapat pergi kencan dengan loe karena sakit, loe akan dengan mudah percaya kepadanya. Ia cukup sulit merasa puas, apalagi mengenai makanan, cara kerja, dan wanita pilihan. Ia selalu rapi dan teratur setiap waktu, bahkan, mungkin jika ia bekerja sebagai tentara, maka ia dapat menjadi prajurit paling bersih di camp.\n" +
                "\n" +
                "    Ia suka berbicara dengan bahasa yang pantas dan sama sekali tidak menggunakan slang. Ia membenci kemalasan dan orang malas. Ia selalu bersikap seperti orang dewasa yang membosankan, tetapi begitu mengenal dia, loe akan mengerti daya tariknya sendiri. Ia selalu dapat melihat segala sesuatunya dengan jelas, dan hal ini membuatnya tidak dapat dibutakan oleh cinta.\n" +
                "\n" +
                "    Ia adalah cowok yang baik dan \"cool\", tetapi jika ia secara terus menerus diganggu oleh sesuatu yang \"kasar\", atau ketololan, maka ia akan memperlihatkan kepada loe bahwa ia benar-benar terganggu. Mungkin loe akan menemui cowok dalam zodiak ini mengenakan t-shirt lama dan jins lama, tetapi jika loe amati lebih teliti lagi, loe akan melihat betapa rapi tatanan rambutnya, dan secara tidak sadar akan sering sekali merapikan rambutnya.\n" +
                "\n" +
                "    Meja kerjanya selalu rapi dan jika ia melihat ada sobekan kertas di lantai, ia akan memungutnya dan membuangnya ke keranjang sampah. Banyak orang menganggapnya egois, karena pada saat dia menolak dan berkata \"Tidak\", dia memang benar-benar menolak. Apapun bantuan yang dibutuhkan dari dirinya, ia tidak akan menolak, selama ia mampu melakukannya.\n" +
                "\n" +
                "    Makin banyak ia melihat cacat pada orang lain, Semakin ia berusaha melindungi cacat dirinya. Jika loe ingin dia mengubah kesalahannya, maka coba katakana kepadanya dengan lembut, karena jika tidak, dia akan menganggap kritikan loe sebagai hinaan. Ia ingin cinta yang berkualitas, maka dari itu jumlah pacaranya juga tidak banyak.\n" +
                "\n" +
                "    Jika ia putus dengan wanita, ia akan juga berusaha menghindari semua teman dan lingkungan mantan pacarnya. Ia sangat pemilih dan setiap kali putus, ia akan dua kali lebih hati-hati. Ia dapat membuat seorang wanita terlena dengan kemampuannya, tetapi ia tetap menjaga hubungan dengannya hanya seperti teman. Ia suka wanita yang tulus dan percaya diri, rapi dan bersih, sempurna dan teratur. Zodiak yang benar-benar dua \"p\", pemilih dan perfeksionis.");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VirgoCowok.this, VirgoAsmara.class));
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
                startActivity(new Intent(VirgoCowok.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

