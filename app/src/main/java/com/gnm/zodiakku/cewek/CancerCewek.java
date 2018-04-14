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
import com.gnm.zodiakku.cowok.CancerCowok;

public class CancerCewek extends AppCompatActivity {
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
        txtTitleBar.setText("Wanita Cancer");
        txtKarakterCewek.setText("Karakter Seorang Wanita Zodiak Cancer");
        txtKarakterCewek_isi.setText("Ketika dia jatuh cinta, ia akan bertingkah seakan tidak pasti. Pertama, malu-malu dan sok sopan didekat anda. Kedua, dia akan lengket bagaikan lem ke anda dan akan berusaha selalu berada didekat anda setiap saat. Ia akan berusaha untuk pulang bersama, atau makan siang dengan anda. Sebenarnya hal ini cukup OK, jika anda menyukainya juga.\n" +
                "\n" +
                "Tapi jika tidak, tentunya anda akan luar biasa terganggu. Ia benci dibicarakan dan digosipkan oleh orang lain. Jika tahu, maka ia akan sangat terluka. Sebetulnya ia adalah tipe pemalu, kecuali jika ia dipengaruhi zodiak lainnya. Ia bukan tipe berani atau penantang, maka jika anda menyukainya, lebih baik anda mulai duluan.\n" +
                "\n" +
                "Ia menyukai musik dengan nada yang selalu berubah, maka pada saat tertentu ia bisa lucu dan ceria, kemudian tiba-tiba dapat berubah menjadi sedih dan terkesan depresi. Bagi orang tertentu, ia dapat terlihat \"over akting\" atau \"over reakting\" Ketika ia depresi, ia akan pergi keluar dan mencari hal-hal yang membuatnya merasa sedikit lega.\n" +
                "\n" +
                "Ia cinta uang, dan ia menganggap uang sebagai \"bahagia\"dan bukannya \"Tuhan.\" Ia tidak akan pernah meremehkan anda walaupun anda tidak punya uang, dia akan membantu anda untuk mencari uang, dan menabung. Ia bukan orang yang suka dengan kemewahan dan terkadang akan melarang anda membelikan hadiah yang mahal dan tidak terlalu berguna.\n" +
                "\n" +
                "Ia adalah tipe orang yang menikmati berjalan-jalan dengan tenang dan damai. Wanita cancer juga dipengaruhi oleh bulan, maka dibawah sinar bulan dia akan tampil mempesona. Ia selalu takut akan banyak hal. Ia takut karena kurang pandai, kurang cantik. Walaupun ia tidak gemuk, ia tetap tidak akan puas.\n" +
                "\n" +
                "Meyakinkan bahwa ia tampak cantik akan sangat membantu, karena mood-nya dapat berubah sampai 4 kali dalam satu hari. Ia bukannya pelit, tapi anda akan terkejut melihat koleksi barang-barang kuno rusak miliknya. Ia melihat bahwa semua hal berguna baginya. Ia akan menemukan cara untuk menggunakan mereka kembali, suatu saat nanti. Ia bukan tipe pencemburu, tapi cenderung posesif.\n" +
                "\n" +
                "Hal terbaik dari dirinya adalah ia akan mengorbankan apapun bagi orang yang dicintainya tanpa adanya batasan. Jangan tinggalkan dia pada saat dia bermasalah, ia tidak akan pernah melupakannya. Ia bukan tipe lemah, walaupun ia nampak seperti mereka, contohnya adalah pada saat anda bertengkar dengannya, ia mungkin akan menangis luar biasa.\n" +
                "\n" +
                "Begitu anda meninggalkannya, ia akan segera menghapus air matanya, dan akan membenahi tempat tinggalnya seperti tidak terjadi apa-apa. Ia adalah ibu yang sangat berhati-hati dan akan selalu menjaga anaknya di tiap langkahnya. Jika ia adalah istri anda, tidak akan menjadi masalah, tetapi jika ia adalah ibu mertua anda, nah.. itu baru masalah.\n" +
                "\n" +
                "Tapi jangan kuatir, tipe ibu mertua seperti ini tidak akan menjadikan anaknya sebagai \"teman masa tua.\" Ia dapat berubah menjadi sangat mudah marah, dan dapat bertengkar mengenai hal sekecil apapun dengan anda seperti kebanyakan wanita, tetapi ia akan selalu rela menunggui dan merawat anda.\n" +
                "\n" +
                "Jika anda menghilang selama beberapa hari, ia akan menunggui anda, tetapi tidak untuk waktu lama. Ujian semacam ini sangat beresiko, dan lebih baik tidak dilakukan. Wanita Cancer membutuhkan 2 hal untuk dapat merasa bahagia, mereka adalah \"Kerja\" dan \"Cinta\". Ia dapat tinggal dalam rumah berdebu, tetapi ia tidak dapat tinggal di dalamnya tanpa cinta. ");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CancerCewek.this, CancerCowok.class));
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
                startActivity(new Intent(CancerCewek.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

