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
import com.gnm.zodiakku.asmara.GeminiAsmara;

public class GeminiCowok extends AppCompatActivity {
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
        txtTitleBar.setText("Pria Gemini");
        txtKarakterCowok.setText("Karakter Seorang Pria Zodiak Gemini");
        txtKarakterCowok_isi.setText(" Seorang cowok dalam zodiak ini memiliki wajah yang proposional dan cenderung kurus panjang. Ia memiliki dahi yang tinggi dan sangat cerdas. Ia nampak seperti tidak akan pernah bisa duduk atau berdiri dengan tenang, orang yang sangat cepat. Hidungnya berukuran sangat pas, bibir tipis, berbicara dengan cepat dan sangat cerewet.\n" +
                "\n" +
                "    Ia dapat berpikir lebih cepat daripada kecepatan bicaranya, tapi begitu ia mulai berbicara, ia akan berbicara tanpa henti, rasanya Tuhan memang memberikan kemampuan khusus kepadanya, mulut 'mesin' yang mampu berbicara cepat. Ia suka memotong pendek rambutnya, dan ia sangat atletis.\n" +
                "\n" +
                "    Ia mencerminkan orang yang langsing, tinggi, dan \"Cepat\" dalam setiap gerakannya atau sampai dianggap \"hiperaktif\" . Ia memiliki jari yang panjang dan selalu mengetuk-ngetik meja atau menggerakkan jarinya seakan ia berusaha meraih sesuatu. Ia adalah tipe orang yang akan menulis atau mencoret- coret kertas, ia tidak pernah diam.\n" +
                "\n" +
                "    Rambutnya selalu tersisir rapi. Ia akan menghabiskan banyak waktu untuk menyisir rambutnya. Ia akan selalu menjaga kaki dan tangannya bersih. Ia tipe cowok yang berbaju rapi dan bersih, maka jika loe menyukai kerapian, loe akan mencintainya juga. Ia akan menyimpan semua bajunya dalam lemari besar. Dan tidak akan pernah dibuangnya walaupun ia tidak pernah memakainya lagi, tapi dia akan tetap membeli baju baru dan selalu berusaha nampak tidak ketinggalan jaman.\n" +
                "\n" +
                "    Ia tahu bagaimana cara nampak modis walaupun hanya dengan sedikit uang. Ia mudah bosan dengan baju dan minyak wangi favorit. Ia sangat pemilih, maka sabun dan minyak wanginya harus berada dalam trend yang sama, atau bau yang sama.\n" +
                "\n" +
                "    Jika loe berpacaran dengan tipe cowok ini, loe mungkin akan merasa berpacaran dengan 2 orang, loe harus mampu menebak perasaan dan emosinya. Apakah ia melakukan sesuatu karena memang tugasnya, atau karena ia memang sukarela melakukannya. Ia mengubah pikirannya secepat ia mengganti sepatu. Ia dapat memilih buku dan membaca secepat mungkin, tapi tetap mengerti isinya.\n" +
                "\n" +
                "    Jadi jika loe melihat seorang cowok Gemini membaca setiap kata dalam buku, maka ia pasti sedang berada dibawah pengaruh Zodiak lainnya. Ia benci menetapkan jadwal tetap, dan tidak menyukai pekerjaan rutin. Ia sangat sulit menepati waktu, dan hanya dapat menepati waktu perjanjian jika perjanjian itu sangat penting dan perlu. Ia tidak datang terlambat karena dia lupa, tetapi karena ia selalu tertarik dengan hal lain sepanjang perjalanannya.\n" +
                "\n" +
                "    Ia suka bertindak berlawanan dengan apa yang ia ingin lakukan. Ia adalah pembicara yang sangat baik, dan mampu menjadi politisi yang baik. Ia mampu dengan mudah membujuk seseorang, dan mampu menampilkan diri secara baik didepan publik, seorang yang benar-benar mampu mempesona. Jika ia adalah penulis, maka ia akan menulis buku yang akan laris.\n" +
                "\n" +
                "    Ia selalu mencari kebenaran dan selalu mempelajari diri sendiri. Ia tidak pernah merasa puas dengan ketenaran, reputasi atau uang, karena ia selalu berpikir bahwa ia layak mendapat lebih dari itu. Ia akan selalu mencari, karena ia sendiri tidak yakin apa kepuasan utamanya. Wanita yang sedang jatuh cinta pada umumnya ingin merasa aman dan merasakan kestabilan.\n" +
                "\n" +
                "    Tetapi jika loe jatuh cinta dengan tipe pria ini, bersiaplah merasa kesepian. Ia akan datang menemui loe hanya ketika ia ingin. Ia bahkan tidak tahu bagaimana waktunya bisa habis, maka cobalah menyesuaikan diri jika loe mencintainya. Berpacaran dengan cowok ini bagaikan berpacaran dengan 2 orang, hari ini ia dapat menelepon hanya sekedar mengatakan betapa ia mencintai loe, dan kemudian menelepon untuk membatalkan janji kencan.\n" +
                "\n" +
                "    Ketika marah, ia dapat mengatakan kepada loe betapa ia benci baju yang loe kenakan, walaupun baju itu adalah baju yang sama ketika loe pakai, ia berkata loe terlihat sexy. Jangan pernah tanyakan kenapa, karena ia juga tidak akan pernah dapat memiliki penjelasan juga. Ketika ia kembali kepada mood normalnya, ia akan kembali kepada loe\n" +
                "    dan melupakan apa yang baru saja terjadi.\n" +
                "\n" +
                "    Loe tidak dapat mengharapkannya menjadi orang yang sama, baik dahulu maupun sekarang. Perubahannya akan bergantung pada loe, apapun arah perubahannya. Jika loe penyuka resiko dan tantangan, loe akan sangat cocok dengannya. Ia akan menyembunyikan perasaannya dengan penuh rahasia, seakan-akan menyembunyikannya, maka loe tidak akan dapat mengerti apakah dia mencintai atau tergila-gila pada loe.\n" +
                "\n" +
                "    Ia juga bisa sama sekali tidak peduli apapun yang terjadi kepada loe sama sekali, ia hanya akan bersikap tenang dan sabar. Ia tidak akan pernah meninggalkan loe jika dia beranggapan bahwa loe adalah puzzle, dan ia akan lebih suka menghabiskan waktunya untuk menyusun puzzle miliknya.");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GeminiCowok.this, GeminiAsmara.class));
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
                startActivity(new Intent(GeminiCowok.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

