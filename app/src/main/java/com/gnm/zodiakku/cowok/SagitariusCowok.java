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
import com.gnm.zodiakku.asmara.SagitariusAsmara;

public class SagitariusCowok extends AppCompatActivity {
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
        txtTitleBar.setText("Pria Sagitarius");
        txtKarakterCowok.setText("Karakter Seorang Pria Zodiak Sagitarius");
        txtKarakterCowok_isi.setText(" Seorang cowok zodiak sagitarius yang menyukai kehidupan sosial dan selalu ingin tahu mengenai berbagai perkembangan baru, untuk selelu menjada dirinya tetap trendi dan memiliki informasi paling up to date. Ia suka mengetahui trend busana terbaru dan selalu berusaha tidak ketinggalan mode. Anda dapat dengan mudah melihatnya di pembukaan pub baru, restoran baru. Ini karena ia suka berpartisipasi dalam berbagai aktifitas sosial.\n" +
                "\n" +
                "Ada juga beberapa orang cowok zodiak sagitarius yang cenderung menjadi orang yang private, tetapi ia akan selalu didepan teman yang lain mengenai informasi. Ia selalu tahu buku paling laris, 10 lagu paling top dalam minggu ini, film paling gress yang sedang tayang, ia selalu sudah menontonnya. Ia benci rutinitas, karena hal itu membosankan baginya. Ia suka mencapai tujuannya, dan sukses dalam hal ini adalah penghargaan yang sebenarnya ia cari. Uang memang OK, tetapi ia tidak menganggap uang sebagai sumber kebahagiaan sebenarnya, karena ia dapat menghabiskannya dengan mudah dalam waktu singkat.\n" +
                "\n" +
                "Banyak orang bilang, jika anda ingin mengetahui tentang kebenaran, maka tanyakanlah pada Sagitarius. Mereka benar, anda dapat bertanya kepada cowok zodiak sagitarius, dan dia akan segera mempaparkan jawaban yang benar dan apa adanya. Walaupun dia berbicara dengan gaya seperti itu, teman-temannya menyukainya. Jika anda memiliki masalah, semua teman anda akan merasa simpati kepada anda, tetapi sagitarius adalah orang pertama yang akan memberikan bantuan tanpa pamrih apapun kepada anda.\n" +
                "\n" +
                "Maka dari itu, walaupun terkadang mulut besar, tetapi ia benar-benar mempesona. Ketika marah, ia terkadang dapat menjadi begitu ganas, tetapi akan segera padam, dan segera melupakannya. Ia bukanlah orang yang akan membalas dendam, walaupun ia mengatakan bahwa ia akan membakar rumah anda, anda dapat tetap tenang. Ia suka pujian dan kata-kata manis, maka anda dapat memanipulasinya dengan mudah. Jika dia tahu bahwa anda tidak tulus, maka anda tidak akan berarti apa-apa baginya.\n" +
                "\n" +
                "Beberapa cowok zodiak sagitarius adalah musisi atau penyanyi berbakat. Ia adalah jiwa yang berbahagia, memiliki humor yang baik dan menyimpan banyak sekali lelucon. Ia menyukai kebebasan, sangat enerjik dan sangat hidup. Jika bekerja, ia akan selalu mengerjakannya dengan serius. Ia suka bepergian, suka melihat tempat-tempat menarik. Keluar bertamasya akan menbuatnya merasa nyaman. Cowok zodiak sagitarius bagaikan seekor burung yang bebas. Tiap hari dalam hidupnya serasa hari Minggu. Ia jarang sekali berada dalam mood yang buruk, dan jika ia sedang dalam mood yang buruk ini, lebih baik anda segera menghilang dari pandangannya.\n" +
                "\n" +
                "cowok sagitarius membenci kewajiban, maka kata-kata \"pernikahan\" akan membuat dia seakan tercekik. Jika anda membiarkan dia memiliki kebebasan, maka ia tidak akan pergi kemana-mana. Ia jatuh cinta semudah ia sakit flu, terutama jika cewek yang ditaksirnya manis, lucu dan memiliki kepribadian yang kuat. Tidak ada orang yang dapat mengerti berapa lama ia akan jatuh cinta. Jika anda memang benar ingin memegang seorang cowok Sagitarius, anda lebih baik berusaha seperti dalam film-film petualangan. Anda lebih baik berusaha membuat hubungan anda selalu hidup dengan menceritakan berbagai lelucon, selalu tampil manis, karena hal ini akan membantu dia dalam menghadapi alergi \"wanita cantik\"nya .");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SagitariusCowok.this, SagitariusAsmara.class));
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
                startActivity(new Intent(SagitariusCowok.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

