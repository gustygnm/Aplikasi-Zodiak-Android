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
import com.gnm.zodiakku.cowok.GeminiCowok;

public class GeminiCewek extends AppCompatActivity {
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
        txtTitleBar.setText("Wanita Gemini");
        txtKarakterCewek.setText("Karakter Seorang Wanita Zodiak Gemini");
        txtKarakterCewek_isi.setText("Cewek yang berpenampilan menarik, dengan kepandaian hebat, wanita yang sangat menarik. Ia bergerak cepat dan ia tidak dapat duduk atau berdiri diam dalam jangka waktu lama. Ia mampu melakukan banyak hal dan melakukannya secepat mungkin. Jika anda berkencan dengannya, mungkin anda akan merasa merasa sedang berkencan dengan banyak wanita pada saat yang bersamaan.\n" +
                "\n" +
                "Anda tidak akan dapat mengikatnya dengan kata \"Cinta\", karena ia peduli dengan cinta, tetapi hal itu bukanlah faktor utama dalam kehidupannya. Anda harus dapat menyesuaikan diri denganya supaya anda dapat mengenal banyak karakter yang dimilikinya. Ia adalah wanita pemimpi yang memiliki banyak impian. Ia selalu ingin belajar mengenai sesuatu yang baru setiap saat.\n" +
                "\n" +
                "Walaupun dia memiliki karakter 2 in 1, ia cukup beruntung dalam hal cinta. Untuk mengejarnya, anda harus mengerahkan semua kemampuan anda. Bahkan ketika dia sudah menyukai anda dan terpesona oleh kemampuan anda, ia juga akan melihat dan menyelidiki sisi buruk anda, karena hal ini adalah sifat alaminya.\n" +
                "\n" +
                "Ia mampu menangani semua macam emosi yang campur aduk tanpa harus mengganggu atau memperlihatkannya kepada anda. Ia dapat membuat anda gembira dengan bersikap layaknya seekor burung kecil. Perbincangan dengannya tidak akan membosankan anda. Ia mampu berbicara dengan anda mengenai topik apapun.\n" +
                "\n" +
                "Dia akan mampu membuat anda merasa menjadi cowok paling beruntung di dunia. Dia mampu membuat anda merasa bahwa ia membutuhkan semua perhatian anda, tetapi begitu dia ingin sendrian, dia mampu berdiri teguh dan tenang. Ia dapat menjadi teman baik anda dan berbicara kepadanya mengenai apapun.\n" +
                "\n" +
                "Ia dapat mengikuti semua aktifitas anda dengan energi yang sama seperti yang anda punya. Ia adalah orang dengan pemikiran dan kemampuan belajar yang cepat. Ia dapat melihat arah proyek anda dan dia dapat memberi nasihat yang sangat baik. Jika dia berpikir bahwa anda tidak menginginkan dirinya hanya untuk anda, maka ia hanya akan bertindak layaknya teman baik anda saja, seorang wanita yang \"cool\".\n" +
                "\n" +
                "Ia dapat dengan mudah membuat seorang pria jatuh cinta kepadanya. Moodnya yang selalu berubah adalah \"pesona\" bagi banyak pria. Ia dapat saja tertawa terbahak-bahak selama 2 menit dan kemudian terdiam membisu. Ia ingin hanya menemukan 1 cinta sejati saja, dan ia ingin menemui pria idamannya. Ia berharap banyak, bahkan terkadang terlalu banyak.\n" +
                "\n" +
                "Ia selalu menunggu kedatangan seorgan \"kesatria tampan\" bahkan pada saat ia telah memiliki seorang pacar. Ia bisa saja jatuh cinta atau menyukai orang lain pada saat bersama dengan anda. Jika anda putus dengannya, ia tidak akan lupa dalam jangka waktu pendek, karena perubahan adalah sifat alaminya.\n" +
                "\n" +
                "Wanita gemini lebih banyak menyakiti hati pria daripada wanita zodiak lainnya. Karena dia seorang pemimpi dan selalu menunggu kedatangan kesatria tampannya, maka kehidupan cintanya benar-benar rumit atau bahkan berantakan. Ia tidak pernah suka menulis surat panjang lebar, jadi jika anda menulis surat, dan ingin mendapat jawaban secepatnya dari dia, jangan pernah berharap banyak.\n" +
                "\n" +
                "Karena dia memiliki kepribadian berganda dan banyak ide, maka ia tidak suka untuk menuliskannya. Karena ia tahu, bahwa ia berpikir, hari ini dan besok belum tentu sama. Ia dapat berkomunikasi dalam lebih dari 1 bahasa, seseorang dengan bakat linguistik luar biasa. Jika ia ingin mengatakan komentar buruk kepada anda, dia tidak akan mengatakannya langsung.\n" +
                "\n" +
                "Tetapi ia akan mengatakan kengenai banyak hal, dan secara tidak sengaja akan mencapai subyek yang ingin dicapainya tanpa menyinggung anda. Biasanya dia tidak akan berbohong. Ia akan bekerja keras dan sekali-kali akan mengambil istirahat panjang. Ia tidak pernah merasa puas dengan kondisi kerjanya sekarang, dengan uang, atau reputasinya sekarang, ia selalu ingin mendapat lebih lagi.\n" +
                "\n" +
                "Jangan pernah tanyakan dia, apa sebenarnya hal yang bisa-bisa memenuhi semua keinginannya, karena dia tidak akan pernah menjawab. Begitu anda mengenal dia, dia akan menjadi orang yang mendukung dan selalu siap disamping anda. Ia memiliki impian yang indah, dan ia menginginkan adanya orang yang memiliki keinginan dan kemampuan yang sama dengannya, yang akan selalu bersama mendampingi dia.");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GeminiCewek.this, GeminiCowok.class));
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
                startActivity(new Intent(GeminiCewek.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

