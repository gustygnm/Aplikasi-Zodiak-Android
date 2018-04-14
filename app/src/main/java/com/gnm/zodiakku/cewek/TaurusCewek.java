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
import com.gnm.zodiakku.cowok.TaurusCowok;

public class TaurusCewek extends AppCompatActivity {
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
        txtTitleBar.setText("Wanita Taurus");
        txtKarakterCewek.setText("Karakter Seorang Wanita Zodiak Taurus");
        txtKarakterCewek_isi.setText("Wanita yang bisanya cukup langsing. Wanitya Taurus umumnya lucu dan menyenangkan, dengan struktur wajah persegi, dan tulang pipi tinggi. Matanya yang bundar memancarkan sinar kecerdasan dan keingintahuan. Anda tidak akan banyak melihat wajah bundar di kalangan kaum wanita Taurus, dan umumnya mereka memiliki garis wajah yang kuat.\n" +
                "\n" +
                "Ia adalah orang yang selalu berubah. Jika dia marah, ia tidak akan memperlihatkannya, dan akan memendamnya sendiri untuk waktu lama, dan akan mengingatnya satu persatu dengan tajam. Jika dia benar benar marah kepada anda, anda akan menjadi orang yang benar-benar asing untuk anda.\n" +
                "Ia adalah orang yang sabar, tetapi selalu membutuhkan hal baru yang dapat menarik perhatiannya. Ia sangat tidak suka rapat berlama-lama. Ia mungkin saja jatuh cinta kepada anda hari ini, dan di hari berikutnya ia dapat bertindak seakan-akan tidak pernah mencintai anda sama sekali. Ia memiliki kesabaran denan apa yang ia ingin lakukan dan tidak akan pernah menyerah sampai ia berhasil mencapainya.\n" +
                "\n" +
                "Ia akan sangat terfokus akan pekerjaannya sampai ia memiliki alasan kuat untuk menghentikan proyek yang ditanganinya. Uang bagi wanita Taurus bukanlah faktor paling penting dalam kehidupan. Ia berpikir bahwa uang hanyalah cara untuk mendapatkan kehidupan yang layak. Ia merasa lebih puas ketika berhasil mencapai tujuannya daripada hidup ditengah kemewahan dan baju indah.\n" +
                "\n" +
                "Jika anda menyukai wanita yang banyak berpikir mengenai cinta dan romansa, maka anda memilih cewek yang salah. Anda tidak akan pernah dapat menahannya dirumah, ia suka bekerja dan tidak suka bekerja di dalam rumah. Ia suka hewan dan suka dikelilingi hewan.\n" +
                "\n" +
                "Cinta ada dikepalanya, tetapi Kebebasan ada dalam jiwanya. Ia memiliki ide sendiri mengenai cinta dan takut untuk menunjukkan perasaannya yang paling dalam karena takut ditolak. Ia bukan tipe yang suka berbicara mengenai cinta, tetapi ia memiliki cara yang khusus untuk menunjukkannya. Ia tidak pandai menunjukkan kapan ia jatuh cinta, tetapi jika ia mencintai anda, ia akan benar-benar jujur kepada anda, lebih jujur daripada wanita lainnya.\n" +
                "\n" +
                "Ia akan jujur kepada orang yang dicintainya, tetapi pada saat itu juga ia kelihatan seakan menjauh. Anda akan memiliki hubungan baik dengannya, jika anda memberikan kebebasan. Jangan paksa dia untuk bermain dalam permainan poker yang ia benci, tapi biarkan dia pergi bersama teman-temannya jika ia memang ingin.\n" +
                "\n" +
                "Ia akan sangat berbeda dengan kebanyakan cewek, dan dia berpikir bahwa berbeda adalah salah satu keunikan dia. Ia adalah figur publik, tetapi tidak dimiliki oleh siapapun. Ia tidak akan bersama dengan anda jika dipikirnya anda tidak tulus. Ia menyukai tipe cowok yang memiliki karakter, tetapi bukan karakter yang menyaingi dirinya.\n" +
                "\n" +
                "Cintailah dirinya, tapi jangan keterlaluan, karena ia takut bahwa hal itu akan membatasi kemerdekaannya. Ia selalu mencolok dikeramaian karena sesuatu yang digunakannya untuk 'menantang' anda. Ia bisa saja berdandan macam petani miskin untuk menikmati makan malam di restoran mewah, atau berdandan bagaikan seorang biarawati dalam suatu pesta koktil.\n" +
                "\n" +
                "Jika anda seoran politikus yang sedang mencari istri, ia akan sangat cocok, karena ia cerdas dan dapat bergaul dengan baik dengan berbagai lapisan masyarakat. Ia juga bukan tipe pencemburu, karena ia harus tahu secara menyeluruh sebelum menerima anda dalam kehidupannya. Ia memiliki keingin tahuan yang lebih hebat mengenai kehidupan daripada sekedar bertanya tanya apakah anda sekarang sedang main mata dengan orang lain.\n" +
                "\n" +
                "Jika anda menjaga jarak darinya, atau pergi selama beberapa hari, ia akan lebih tidak memperdulikan anda. Bahkan ketika sedang berpacaran dengan anda, ia juga dapat menyukai orang lain, jika anda tidak memiliki sesuatu yang ia cari. Ia tidak akan pernah mengecewakan anda atau bersembunyi di belakang anda untuk mempermalukan anda, tetapi ia adalah tipe yang akan mengatakan langsung kepada anda \"Kita lebih baik putus.\"\n" +
                "\n" +
                "Ia akan selalu ingat cinta pertamanya. Wanita Taurus memegang rekor terhebat mengenai perceraian, karena dia tidak perduli mengenai apa yang dipikirkan orang lain mengenai dirinya, tetapi ia berpikir bahwa segala sesuatu harus dilakukan demi \"Kebahagiaan\". Ia memiliki banyak teman yang sesuai dan ia yakin dengan kemampuan dirinya sendiri, maka anda akan sangat sering melihat dia berhenti untuk berpikir sebelum melakukan sesuatu.\n" +
                "\n" +
                "Jika ia memikirkan masalah sesuatu, ia akan segera melakukannya. Ia memiliki banyak penggemar yang siap melamarnya, karena tantangan pada dirinya yang selalu berubah. Ia dapat menjadi orang yang manis dan lucu, tetapi kemudian menjadi dingin dan keras. Dia memiliki gaya sendiri dalam berdandan.\n" +
                "\n" +
                "Anda dapat melihatnya berdandan seperti orang kuno, tapi besok ia tampil bagaikan berasal dari planet Mars. Ia akan mengatur rambutnya dengan cara yang unik, demikian pula dengan busana dan dandanannya. Ia suka mempelajari mimpi dan pemikiran anda. Ia suka menggoda anda dan bercanda dengan anda. Jika ia melakukan sesuatu yang salah, maka ia tidak akan menyembunyikannya kepada anda.\n" +
                "\n" +
                "Tetapi jangan bertanya mengenai hal itu, jika ia sedang tidak berminat membicarakannya kepada anda. Ia tidak suka meminjam uang, dan menganggap semua janji serius. Jika anda berjanji akan membayar kembali, sebaiknya anda melakukannya. Jika anda ingin berhasil dengan wanita Taurus, maka jangan pernah cemburuan atau posesif.\n" +
                "\n" +
                "Jangan berpikiran sempit, jangan mengkritik hal-hal remeh dan tidak penting. Cobalah menyukai semua temannya, dan biarkan dia memiliki saat pribadinya, maka ia akan menjadi sangat manis kepada anda.");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TaurusCewek.this, TaurusCowok.class));
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
                startActivity(new Intent(TaurusCewek.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

