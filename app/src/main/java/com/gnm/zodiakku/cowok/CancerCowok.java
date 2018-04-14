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
import com.gnm.zodiakku.asmara.CancerAsmara;

public class CancerCowok extends AppCompatActivity {
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
        txtTitleBar.setText("Pria Cancer");
        txtKarakterCowok.setText("Karakter Seorang Pria Zodiak Cancer");
        txtKarakterCowok_isi.setText(" Pria paling sensitif dan paling lemah secara emosi dari semua zodiak yang ada. Sebagian besar pekerja seni adalah Cancer. Cancer dikendalikan oleh \"bulan\" dan bulan menampilkan wajah berbeda setiap hari, maka mood dan emosi pria Cancer juga akan berubah tiap hari. Loe akan sangat dibingungkan olehnya, tetapi perubahan yang selalu terjadi inilah yang \"mempesona\" loe. Ia tidak pernah berusaha mendapatkan apa yang dia mau secara langsung, tetapi ia akan menunggu kesempatan yang pas untuk mendapatkan apa yang ia mau. Sekali ia mendapatkannya, ia tidak akan mau kehilangan hal itu, kecuali jika ia bosan dengan apa yang ia mau itu.\n" +
                "\n" +
                "    Pria paling sensitif, yang tidak akan tahan ditolak. Ia sangat peduli dengan perasaan orang lain, atau memikirkan perasaan mereka. Ia sangat tidak suka dipermalukan, dan cenderung terlalu melindungi diri sehingga banyak orang merasa ia adalah orang yang dingin. Kreatif, berbakat, imajinatif, adalah karakter pria Cancer.\n" +
                "\n" +
                "    Misteri dan kerumitan memainkan perananan penting dalam kehidupan pria Cancer. Ia dapat menjadi sangat lucu, sangat pendiam, dan kemudian secara mendadak sangat sedih. Hidup dengannya dapat menjadi kejutan besar, loe mendapat cowok yang pas, dan tidak akan pernah merasa bosan. Ia merasa rumah adalah \"sarang\", dan adalah tempat paling aman baginya.\n" +
                "\n" +
                "    Jika ia merasa dilukai atau tertekan, ia akan tinggal dalam rumah dengan membutuhkan ketenangan. Begitu ia merasa lebih baik, ia akan keluar dari 'tempat persembunyiannya' dan akan kembali menjalani kehidupan normal. Ia bukanlah tipe orang lemah.\n" +
                "\n" +
                "    Begitu mudah untuk jatuh cinta pada cowok cancer ini, karena ia begitu lembut dan sopan. Kecerdikan dan pemikiran kreatifnya dapat memenangkan hati loe dengan mudah. Ia akan rela keluar dari tempat persembunyiannya untuk melindungi loe walaupun mungkin ia tidak akan membuka dirinya kepada orang lain. Tidak banyak orang akan memenangkan hatinya. Rasa aman pada dirinya hanyalah pada saat ia memiliki uang dalam kantongnya.\n" +
                "\n" +
                "    Ketika ia mulai merasa mapan, maka ia akan berpikir untuk membina keluarga. Walaupun ia suka mencari dan menyimpan uang, ia bukan orang pelit. Membelanjakan uang adalah bagian dari citra positif dirinya, maka ia akan dengan senang membelanjakan uangnya untuk mengajak loe pergi ke restoran mahal atau membeli perhiasan untuk loe. Tentunya pada saat ia memiliki cukup uang. Ia sangat posesif terhadap semua barang yang dianggap miliknya.\n" +
                "\n" +
                "    Jangan pernah coba membicarakan mengenai cowok lain didepannya, atau kalau tidak, dia akan curiga. Karena ia tidak begitu percaya diri mengenai kompetisi seperti ini. Begitu loe saling mengenal terlalu jauh, ia akan segera mencari hal lain yang lebih menarik, tapi jangan kuatir, ia akan selalu memikirkan loe. Jika dia berpikir bahwa loe adalah cinta sejatinya, dan cobalah untuk menghilang sebentar. Dia pasti akan segera mencari loe.\n" +
                "\n" +
                "    Dia adalah pria pemalu, tetapi jika ia menyukai anda, maka tiap kali anda bangun, anda akan melihatnya didepan rumah anda tiap hari sampai akhirnya anda mau keluar bersamanya, seorang cowok yang teguh. Ia menyukai cewek yang mandiri, ceria dan aktif, percaya diri, tetapi selalu berlaku sopan dan layak. Ia menyukai wanita yang mandiri, tetapi juga mampu menghadapi perubahan cepat.\n" +
                "\n" +
                "    Tipe wanita yang sangat sulit dicari. Pada awalnya, loe dan dia akan sangat manis dan dia hanya akan memikirikan mengenai diri loe. Hal \"super romantis\" ini tidak akan berlangsung selamanya, maka jangan lepaskan kesempatan ini. Jika loe menginginkan perhatiannya, maka buatlah diri loe menarik. Jadilah orang yang selalu mendukung, dan terkadang berilah dia pujian, tetapi jangan terlalu banyak, tinggalkan kesan bahwa loe tulus.\n" +
                "\n" +
                "    Tidak seperti Zodiak lainnya, jika ia marah, maka lebih baik loe tinggalkan dia sendiri. Ia akan tenang dengan sendirinya. Memberikan sentuhan lembut pada bahunya, atau memberikan ekspresi yang memperlihatkan bahwa loe khawatir sudah cukup. Ia mencintai ibunya, maka usahakanlah menjadi favorit ibunya, tetapi jangan bertingkah seperti ibunya.");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CancerCowok.this, CancerAsmara.class));
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
                startActivity(new Intent(CancerCowok.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

