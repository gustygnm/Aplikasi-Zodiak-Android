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
import com.gnm.zodiakku.cowok.AquariusCowok;
import com.gnm.zodiakku.cowok.AriesCowok;

public class AquariusCewek extends AppCompatActivity {
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
        txtTitleBar.setText("Wanita Aquarius");
        txtKarakterCewek.setText("Karakter Seorang Wanita Zodiak Aquarius");
        txtKarakterCewek_isi.setText("Jika anda mencintai wanita tipe ini, anda harus bersiap-siap menjadi bahagia selamanya atau sangat bersedih. Ia adalah wanita supersibuk dengan masalah-masalahnya, persis seperti cowok dengan zodiak yang sama. Ia mampu hidup sendiri tanpa adanya pria dalam kehidupannya, orang yang benar-benar kuat. Bukan karena ia tidak dapat menemukan cowok impiannya, tetapi jika ia memang tidak dapat menemukan cowok demikian, apa boleh buat.\n" +
                "\n" +
                "Apalagi karena memang dia berpikir bahwa dia mampu melakukan apapun yang mampu dilakukan seorang pria. Ia adalah seorang pemimpin, tipe orang yang benar-benar penuh percaya diri. Ia suka melakukan segalanya sendiri, membuka pintu sendiri, melayani diri sendiri. Karena ia berpikir menunggu bantuan orang lain hanyalah membuang waktu saja, dan dia tidak cukup sabar menunggu orang lain melakukan hal itu.\n" +
                "\n" +
                "Jika ia duluan mengajak anda kencan, jangan pikir bahwa ia akan mulai menggoda anda duluan. Ia melakukannya karena dipikirnya menunggu anda mengajak kencan akan sangat membosankan dan membuang-buang waktu saja. Ia sangat menyukai cowok cool yang terkadang bertingkah seakan cuek terhadap dirinya, maka ia akan memiliki kesempatan untuk menunjukkan kepercayaan dirinya.\n" +
                "\n" +
                "Ia suka untuk menebak reaksi seseorang pria, tapi pada saat yang bersamaan ia suka sekali jika ada banyak pria menginginkan dirinya. Ia adalah tipe orang yang berani yang mampu melakukan banyak hal secara berbeda dari orang lain dalam lingkungan yang sama. Ia berani berjuang untuk mendapatkan apa yang ia pikir menjadi miliknya.\n" +
                "\n" +
                "Walaupun ia bertingkah penuh percaya diri, ia seringkali merasa kesepian dan sendiri. Jika ia putus dengan orang lain, ia tidak akan memperlihatkan emosi apapun, walaupun sebenarnya ia dipenuhi dengan rasa sakit dan penderitaan. Tidak lama kemudian, dia akan kembali menjadi orang yang cerah ceria, karena dia selalu melihat dunia secara positif dan memiliki \"Kepercayaan\" pada kata \"Cinta.\"\n" +
                "\n" +
                "Ia memiliki lebih banyak teman cowok daripada cewek, maka jika anda berpacaran dengan dia, jangan menjadi tipe pencemburu. Ia mungkin sedikit pencemburu, tapi ia sangat membenci tipe cowok pencemburu. Ia mencintai \"kebebasan\" baik sebelum dan sesudah menikah, kebebasan dia harus sama dan tidak boleh diikat.\n" +
                "\n" +
                "Ia ingin anda mempercayainya, bahkan mungkin jika ia tidak mempercayai anda. Ia suka menjadi pihak yang \"benar\", maka jika anda bertengkar dengannya, biarkan dia menang, jika memang hal yang dipertengkarkan bukan masalah besar.\n" +
                "\n" +
                "Ia adalah tipe orang yang langsung dan terbuka, maka jika ia tidak lagi mencintai anda, ia akan mengatakannya langsung kepada anda.\n" +
                "\n" +
                "Cinta dan hubungan yang dia bangun selalu nyata, maka jika ia mengatakan \"Kita bubar\" maka sudah saatnya anda bubar, dia tidak sedang menguji anda. Ia bukan tipe cewek yang mudah terluka, maka anda tidak perlu kuatir mengenai dirinya, ia mampu untuk bangkit sendiri. Jika ia bersama anda ketika anda sakit, maka dia akan merawat anda, bahkan merawat anda berarti \"pinjaman kecil\" baginya.\n" +
                "\n" +
                "Jangan pernah menyimpan rahasia dari dirinya, hal ini sangat dibencinya dan dapat membuatnya sangat marah. Ketika ia sedih, mengertilah dia. Ketika ia bahagia, bahagialah bersamanya, ia menyukainya. Anda tidak akan pernah bosan bersama cewek tipe ini. Mereka yang dekat dengannya akan tahu bahwa dibalik semua percaya diri dan sifatnya yang berdarah dingin, ia sama rentannya seperti semua wanita.\n" +
                "\n" +
                "Ia adalah orang yang menyenangkan dan banyak bicara, dan ia suka menggoda anda. Jangan biarkan dia berbicara sendiri, karena bila hal itu terjadi, ia akan meninggalkan anda. Ia memiliki banyak tipe pekerjan, karena ia percaya bahwa apa yang bisa dialakukan kaum pria, bisa juga dilakukannya. Jika anda ingin mempekerjakannya, jangan harap.\n" +
                "\n" +
                "Ketika ia sedang jatuh cinta, ia akan meninggalkan pekerjaannya di siang hari hanya untuk menemui anda, tetapi dia akan segera kembali ke pekerjaannya dan kembali serius bekerja. Jika anda mampu untuk hidup dan mencintai seorang \"wanita pekerja\", maka anda akan pas dengannya. Jika ia marah, carilah tempat berteduh dari \"badai\".\n" +
                "\n" +
                "Tapi kemarahannya hanya akan sebentar saja. Ia bukan tipe pembalas dendam, dan tidak akan memikirkan mengenai saat \"pembalasan\". Banyak orang berpikir bahwa dia benar-benar \"cowok hebat\", walaupun sebenarnya dia benar-benar 100% cewek. Ia mudah terluka, maka sebaiknya anda bersikap baik padanya.\n" +
                "\n" +
                "Jika ia benar-benar mencintai anda, maka anda beruntung, karena ia adalah orang yang jujur, tulus, dan tidak akan pernah membuat anda bosan. Anda harus mengerti bahwa terkadang ia akan menjadi terlalu percaya diri, dan terkadang cenderung bersikap ngeboss.");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AquariusCewek.this, AquariusCowok.class));
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
                startActivity(new Intent(AquariusCewek.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

