package com.gnm.zodiakku.cewek;

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
import com.gnm.zodiakku.cowok.AriesCowok;
import com.gnm.zodiakku.cowok.ScorpioCowok;

public class ScorpioCewek extends AppCompatActivity {
    Button btnBack, btnNext;
    TextView txtTitleBar, txtKarakterCewek, txtKarakterCewek_isi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zodiak_cewek);

        //menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar toolbar = (Toolbar) findViewById(R.id.cewek_toolbar);
        setSupportActionBar(toolbar);

        init();
        txtTitleBar.setText("Wanita Scorpio");
        txtKarakterCewek.setText("Karakter Seorang Wanita Zodiak Scorpio");
        txtKarakterCewek_isi.setText("Wanita sederhana yang selalu menunjukkan mood yang sedang dialaminya. Anda dapat dengan mudah mengetahui apakah dia sedang marah, atau sedang merayu anda. Ia menunjukkan dirinya lebih banyak melalui tingkah lakunya daripada apa yang dikatakannya, memang itulah karakter dia.\n" +
                "\n" +
                "Wanita Scorpio memiliki pembawaan yang misterius. Ia percaya diri, dan jauh di dalam dirinya, ia adalah orang yang bangga dengan dirinya. Ia tidak suka berpikir bahwa ia \"hanyalah\" wanita, sehingga ia harus terbatasi dengan beberapa aturan sosial yang selama ini diterima.\n" +
                "\n" +
                "Ia adalah wanita yang sesungguhnya, dan walaupun penampilannya yang nampak polos dan kekanakan, ia memiliki semangat jiwa yang bebas. Banyak cowok yang salah mengira bahwa cewek tipe ini adalah cewek yang bertipe \"pengikut\" yang baik. Cewek dalam zodiak ini berpikir bahwa ibu rumah tangga yang biasa akan sangat membosankan.\n" +
                "\n" +
                "Ia suka memiliki kendali atas orang lain, tetapi hal ini haruslah merupakan rahasia baginya, maka yang ia tampilkan kedepan adalah tipe cewek manis. Apapaun yang dilakukannya tampak baik, dan dia memiliki semua trik yang dimiliki cewek. Ia dapat dengan mudah memanipulasi pria tanpa si pria menyadari bahwa ia sedang dimanfaatkan.\n" +
                "\n" +
                "Jika anda berpikir bahwa ia akan melakukan apapun yang anda lakukan karena ia mencintai anda, maka anda akan kecewa. Ia mungkin sedikit tomboy tapi ia dapat mengerti anda hanya dengan memandang kedalam mata anda. Anda mungkin dapat menggunakan kata-kata manis yang dapat menjatuhkan semua wanita, tetapi tidak akan dapat berlaku bagi cewek scorpio.\n" +
                "\n" +
                "Ia dapat menggunakan pandangan \"sinar X\" miliknya untuk \"membaca\" pikiran anda mengenai apa yang baru saja atau apa yang akan anda katakan. Ia selalu tersenyum, dan benar-benar mampu menyembunyikan perasaannya.\n" +
                "\n" +
                "Ia selalu menunjukkan kepada anda bahwa ia mencintai kebebasan. Jika ia memiliki kebebasan, ia tidak akan meninggalkan anda, bahkan akan semakin mencintai anda. Jika ia menginginkan sesuatu, ia akan melakukan apapun untuk mendapatkannya. Ia memiliki semacam indra keenam dan anda seakan dapat merasakan umpan balik energi saat berada disekitar dia.\n" +
                "\n" +
                "Ia menyukai cowok yang dapat mendapatkan rasa hormat darinya, dan dia juga akan menghormati dan merasa bangga terhadap si cowok. Seorang cowok yang memiliki kekuasaan terhadap si cewek ini sebaiknya tidak menantang kepercayaan dirinya.\n" +
                "\n" +
                "Ia suka didampingi oleh cowok yang ganteng, kuat dan sehat, apalagi untuk dibandingkan dengan pacar-pacar temannya. Jika si cowok memiliki gelar atau karir yang bagus, maka hal ini akan menjadi nilai tambah yang baik. Seorang cowok yang memiliki kekuasaan diatasnya sebaiknya tidak menantang kepercayaan dirinya.\n" +
                "\n" +
                "Ia adalah seorang cewek yang \"hot\", dia suka musik yang berat. Ia hanya mengenal cinta dan benci, ia tidak mengenal \"suka\" atau \"tertarik\". Cinta, baginya tidak memiliki sikap \"mungkin\". Jika ia benar-benar marah, maka ia akan membuang dan membanting barang-barang. Kemarahannya dapat meyebabkan semua piring beterbangan, dan dapat menuju kepala anda jika anda tidak hati-hati.\n" +
                "\n" +
                "Tenanglah, karena ia tidak akan menghancurkan sembarangan, karena dia tahu membedakan barang. Terkadang ia akan menunjukkan kelemahannya, tetapi tidak untuk waktu yang lama. Ia akan segera menata diri kembali dan kembali menjadi cewek yang \"hot\". Jika ia mencintai anda, dia tidak akan memperdulikan apa kata orang.\n" +
                "\n" +
                "Hubungan yang dimilikinya dirasanya lebih penting daripada salah atau benar. Karena alasan inilah, anda dapat lebih mudah mengerti, bahwa beberapa wanita Scorpio rela menjadi istri kedua. Ia adalah orang yang manja, tetapi ia akan merelakan orang yang dia cintai untuk memiliki kekuasaan terhadap dirinya.\n" +
                "\n" +
                "Jika anda berpacaran dengan wanita ini, sebaiknya anda membuang semua surat cinta lama anda. Mungkin surat cinta anda sudah berumur 2 tahun, tetapi ia akan bertengkar mengenai hal ini karena hal ini adalah masalah yang sangat besar bagi wanita yang pencuriga. Jika anda mengajak perang dingin dengannya, ia akan menyambutnya, dan akan menggandakan apa yang anda lakukan terhadapnya.\n" +
                "\n" +
                "Jika anda membelanya sekali, maka ia akan membela anda 2-3 kali. Ia cukup fair dan adil, maka ia akan menerima permintaan maaf anda sebanyak dia dapat berpura-pura menerima semuanya untuk saat ini dan akan menunggu untuk waktu pembalasan dendam di masa mendatang.\n" +
                "Jika anda kedengaran manis, maka ia akan melakukan hal yang sama kepada anda, dua kali lipat. Benar-benar wanita yang fair. Ia suka mencari dan membelanjakan uang. Ia suka mendapat popularitas dan reputasi, dan tidak pernah membiarkan dirinya menjadi orang yang tidak punya apa-apa dan tidak punya nama.\n" +
                "\n" +
                "Ia terlalu bangga untuk menerima kenyataan bahwa ia \"miskin\". Ia suka dipandang orang, jadi jika anda adalah seorang manajer dengan gaji kecil, ia akan lebih bangga daripada menjadi istri seorang sopir truk dengan uang yang lebih banyak. Ia tidak suka berpikir dan tidak tahan menjadi orang yang \"bukan siapa-siapa.\"\n" +
                "\n" +
                "Jika anda menyukainya, coba sedikit jual mahal. Hal ini akan menggugahnya. Ketika anda berkencan, atur jadwal anda, tapi jangan sampai dia tahu bahwa anda sesungguhnya telah merencanakan hal ini selama berminggu-minggu. Jangan pernah lupa untuk menjemputnya tepat waktu, atau lebih baik anda datang 5-10 menit lebih awal. ");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScorpioCewek.this, ScorpioCowok.class));
            }
        });

//        if (getSupportActionBar() != null) {
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//            getSupportActionBar().setDisplayShowHomeEnabled(true);
//        }
    }

    void init() {
        btnBack = (Button) findViewById(R.id.cewek_btnBack);
        btnNext = (Button) findViewById(R.id.cewek_btnNext);
        txtTitleBar = (TextView) findViewById(R.id.cewek_titleBar);
        txtKarakterCewek = (TextView) findViewById(R.id.cewek_txtKarakterCewek);
        txtKarakterCewek_isi = (TextView) findViewById(R.id.cewek_txtKarakterCewek_isi);
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
                startActivity(new Intent(ScorpioCewek.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

