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
import com.gnm.zodiakku.asmara.LibraAsmara;

public class LibraCowok extends AppCompatActivity {
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
        txtTitleBar.setText("Pria Libra");
        txtKarakterCowok.setText("Karakter Seorang Pria Zodiak Libra");
        txtKarakterCowok_isi.setText(" Sosok pria yang malah tidak memiliki keseimbangan simbol zodiaknya. Ia bukanlah tipe cowok gentle, cool, dan mempesona seperti yang loe lihat. Ia memiliki sisi gelapnya, keganasan, keras kepala, dan sering suka memulai pertengkaran. Terkadang ia dapat menjadi begitu tertekan dan tidak stabil. Keadaannya naik turun tidak menentu seakan ia sedang berusaha untuk menyeimbangkan diri.\n" +
                "\n" +
                "    Bagi banyak teman, ia adalah cowok yang ramah dan selalu tersenyum, bahkan pada saat marah. Suaranya selalu lembut dan tenang. Ia selalu merapikan dan menyisir rambutnya seakan-akan sedang berada dalam set iklan sampo. Sebagian besar cowok Libra berwajah ganteng, bahkan mereka yang paling jelekpun terlihat mempesona.\n" +
                "\n" +
                "    Ketika tersenyum, senyumnya sedemikian cerahnya, sampai seluruh dunia serasa tersenyum bersama dirinya. Ketika ia berada dalam mood yang pas, ia adalah tipe orang yang sangat menyenangkan. Sedangkan pada masa moodnya yang cenderung tidak stabil, ia suka membuat orang berdebat mengenai sesuatu, dan menontonnya dengan rasa tertarik dan puas.\n" +
                "\n" +
                "    Ia menunggu saat untuk muncul menjadi figur yang berusaha mencari kompromi dan akan memperjelas segala sesuatu. Ia suka berada dalam pebicaraan yang cenderung menjadi konfilik. Orang Libra, secara alami adalah pemalas.\n" +
                "\n" +
                "    Setelah capek seharian bekerja, ia akan suka Duduk tenang dan melihat- lihat dari jendela, atau membaca dengan tenang. Ia suka berada dalam dunianya sendiri. Setelah \"me-recharge\" baterainya sendiri, ia akan menjadi orang yang enerjik kembali dan bahkan dapat mengajak loe keluar di malam harinya. Cowok Libra pada umumnya tidak suka melakukan hal yang aneh-aneh. Ia suka berada di tengah kelompoknya, tetapi jika loe melihat dengan lebih teliti, maka loe akan melihat perbedaannya.\n" +
                "\n" +
                "    Jika ia memakai baju atau kemeja, maka ia akan mengenakan baju dengan resleting, bukan kancing, atau pengancing lainnya. Dari dirinya selalu ada sesuatu yang menyebabkan dirinya sedikit berbeda dari kelompoknya. Ia adalah cowok yang blak-blakan dan apa adanya. Ia teliti dan sangat berhati-hati dalam urusan detil. Ia suka menghabiskan waktu untuk melakukan sesuatu dengan benar, daripada kembali untuk memperbaiki lagi.\n" +
                "\n" +
                "    Ia benci orang yang menyombongkan diri, atau membesar-besarkan sesuatu. Ia tidak suka melihat wanita yang berdandan berlebihan atau wanita yang berusaha menjadi pusat perhatian. Ia suka membaca. Ia suka puisi dan seni. Ketika bekerja ia dapat bekerja bagaikan orang gila, tetapi setelah selesai, ia dapat bersikap santai, memutar musik yang jazzy dan memperlakukan loe dengan sangat lembut.\n" +
                "\n" +
                "    Ia suka memberi nasihat dan umumnya ia memberi nasihat yang baik. Jika loe menyukai mereka, loe akan tinggal layaknya terperangkap dalam sarang laba-laba. Jika loe ingin putus dengannya, ia akan berusaha membujuk loe ribuan kali supaya tidak putus. Dan loe tidak akan pernah dapat menghentikannya. Setelah ia membujuk agar loe tetap tidak putus, atau setelah pertengkaran besar-besaran, ia akan kembali bersikap manis kepada loe, layaknya ia tidak pernah melukai loe sebelumnya. Ia akan memiliki cara sendiri untuk mendapat cinta dan perhatian seorang wanita.\n" +
                "\n" +
                "    Sekali seorang wanita mengatakan ia, maka mereka akan bersiap santai dan berpikir apakah sebaiknya ia meneruskan hubungan atau mundur. Di masa remajanya, ia seringkali berganti pacar, karena ia tidak dapat membedakan antara cinta seorang teman atau seorang pacar. Ia akan selalu mengecek dan mengecek ulang apakah pasangannya cocok dan pas dengannya. Walaupun ia adalah cowok romantis, ia kesulitan mengerti emosi orang yang ia cintai.\n" +
                "\n" +
                "    Ia adalah orang yang pemurah, dan bahkan ia mengatur hidupnya secara sistematis. Ia tidak pernah tahu kapan membuat loe bersedih. Ia juga tidak tahu kapan ia membuat loe marah. Ia tidak tahu kapan berkata sesuatu yang salah. Jika loe adalah kekasihnya, bersiaplah untuk menghadapi hal ini.\n" +
                "\n" +
                "    Wanita yang tidak terlalu cantik, apalagi tanpa otak, bukanlah tipe cewek pilihannya. Jika loe kurang cantik, ia tidak akan keberatan berbicara dengan loe, tetapi dia tidak akan pernah peduli untuk mengenal loe lebih jauh. Cewek manapun, cantik atau jelek, dapat saja meminta pertolongannya, ia akan dengan senang hati menolong. Ia tidak suka bertengkar dengan saling berteriak satu sama lain.\n" +
                "\n" +
                "    Jadi loe akan cenderung melihatnya bertengkar dengan pacarnya secara serius, tetapi akan berusaha sebisa mungkin untuk tetap tidak ribut. Ia suka cara mendapat pacar dengan terlebih dahulu mengenalnya sebagai teman. Jika anda menginginkannya, loe juga harus mengambil langkah yang sama. Ia lebih menyukai tipe wanita yang cantik dan lembut dibanding dengan wanita yang cerdas namun kurang menarik.\n" +
                "\n" +
                "    Mereka suka dengan ketenangan dan akan berpikir berlarut-larut kalau ada masalah yang menimpa mereka. Dan mereka sering bingung menentukan jalan keluar apa yang harus ditempuh, walaupun mereka sudah punya jalan keluarnya mereka sering bimbang dan tidak percaya diri untuk mengambil langkah tersebut sehingga perlu bantuan seseorang untuk meyakinkan mereka. Nah disini lah peran utama loe kalau ingin menaklukan hati mereka\n" +
                "\n" +
                "    Loe harus mampu mengerti moodnya, terutama karena ia dapat memiliki berbagai mood yang berbeda. Ia adalah orang yang sangat pribadi, jadi terkadang jika ia ingin sendirian, biarkan dia sendirian.");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LibraCowok.this, LibraAsmara.class));
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
                startActivity(new Intent(LibraCowok.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

