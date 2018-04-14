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
import com.gnm.zodiakku.cowok.PiscesCowok;

public class PiscesCewek extends AppCompatActivity {
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
        txtTitleBar.setText("Wanita Pisces");
        txtKarakterCewek.setText("Karakter Seorang Wanita Zodiak Pisces");
        txtKarakterCewek_isi.setText("Ia suka berada dalam dunia mimpi daripada dalam dunia nyata. Ia lemah dan sensitif untuk urusan \"cinta\". Ia dapat menangis jika sahabat baiknya putus, dan ia dapat merasa sangat bahagia jika teman baiknya mendapat pacar baru yang ganteng, dan kaya, walaupun hal itu sama sekali tidak berhubungan dengan dia.\n" +
                "\n" +
                "Anda mungkin terkejut karena tahu bahwa dia menjadi pemalu ketika sedang jatuh cinta. Lebih kurangnya itulah wanita Pisces. Ia menyukai hewan-hewan kecil dan berbakat melatih hewan. Ia memiliki indra keenam dan ia dapat menebak apa yang akan terjadi kemudian, hal itu adalah sifat alaminya. Walaupun ia memiliki indra keenam yang bagus, ia tidak dapat memilih atau meramalkan kekasih pilihannya.\n" +
                "\n" +
                "Ia tidak dapat membedakan antara seorang pria yang tulus dan seorang pria yang hanya ingin datang dan pergi.\n" +
                "\n" +
                "Ia suka membeli dan memilih pakaiannya. Ia suka berdandan manis dan tampak manis. Wanita Pisces cenderung cantik dan memiliki kulit yang bagus. Tangan dan kakinya kecil dan lembut. Wanita Pisces suka berbelanja sepatu layaknya mengkoleksi mereka.\n" +
                "\n" +
                "Ia adalah wanita yang \"hot\", semua orang menginginkannya. Entah dia memiliki pria tertentu dalah hidupnya atau tidak, ia akan selalu mencoba untuk tidak berada dibawah kaum pria. Hanya berpikir begitupun ia tidak akan mau. Ia percaya bahwa kaum pria dapat melakukan banyak hal lebih baik, dan ia akan membuat pria dalam hidupnya merasakan hal itu.\n" +
                "\n" +
                "Ia adalah tipe wanita yang tidak terlalu rumit dan sederhana, maka, demikianlah juga untuk hidup bersama dirinya. Ia adalah wanita yang penuh percaya diri dan suka membuat siapapun yang ada disekitarnya merasa bahagia. Ia tahu bagaimana cara menyenangkan dan menghibur seorang pria.\n" +
                "\n" +
                "Jika sesuatu berjalan tidak benar, ia akan berusaha untuk membuat orang lain percaya bahwa hal itu semua terjadi karena orang lain, bukan karena orang yang dicintainya. Ia tidak akan mendorong pria-nya menjadi ambisius, tetapi lebih cenderung akan membuatnya merasa bahagia dengan apa yang ia miliki sekarang. Ia bahagia dengan anda karena apa adanya anda.\n" +
                "Wanita Pisces, jika memiliki masa kecil yang buruk, akan selalu mengingatnya, dan hal itu akan membuat dirinya menjadi wanita yang sangat tidak berbahagia. Ia akan selalu mengasihani dirinya dan merasa kasihan dengan dirinya sendiri. Ia cenderung akan menyakiti diri sendiri tanpa menyadarinya dan menjadi sangat mudah terseret dalam dunia obat-obatan (baik narkoba maupun pil penenang).\n" +
                "\n" +
                "Ia memiliki banyak sekali pilihan dan anda tidak dapat pernah meramalkan jalan mana yang akan ia tempuh. Jika anda mencintainya, maka peluk dia erat-erat, karena dia tidak akan pernah tahu apa, bagaimana, dan mengapa ia akan melakukan sesuatu.\n" +
                "\n" +
                "Ia memiliki karakter yang kompleks. Anda akan berpikir, bahwa ia adalah orang yang lugu dan pemalu, yang tidak akan dapat menyakiti siapapun, dan ternyata anda salah. Anda kemudian berpikir bahwa ia adalah orang lemah yang membutuhkan perlindungan, salah lagi. Ia telah banyak makan asam garam kehidupan.\n" +
                "\n" +
                "Ia adalah seorang pemimpi, dan menyukai kata-kata \"cinta\", jadi ia adalah tipe orang yang akan memberi hadiah bagi siapapun di acara apapun, terutama jika hadiah ini dikhususkan untuk acara pernikahan atau ulang tahun pernikahan, bahkan untuk seseorang yang belum tentu ia kenal dengan baik.\n" +
                "\n" +
                "Berhati-hatilah jika anda jatuh cinta pada wanita Pisces. Ia dapat menjadi orang yang benar-benar berbeda sebelum dan setelah anda berpacaran dengannya. Ia dapat nampak bagaikan malaikat sebelumnya, dan ketika telah berpacaran, ia dapat nampak bagaikan nenek sihir, tetapi memang tidak ada yang sempurna, bukan? Ia akan menjadi orang yang lembut dan baik, maka anda tidak perlu kuatir.\n" +
                "\n" +
                "Ia adalah orang yang emosional dan sangat sensitif ketika ia sering disakiti. Ia adalah tipe orang yang akan menangis tersedu-sedu untuk melegakan perasaan hatinya. Ia memiliki perasaan ketakutan yang dipendam dalam hatinya, walaupun ia mengatakan ia tidak memerlukan siapapun dalam hidupnya.\n" +
                "\n" +
                "Ia sangat membutuhkan seseorang untuk melindunginya, tetapi terkadang ia menyembunyikan perasaannya dengan bertingkah keras kepala. Ia suka menyembunyikan perasaan malunya, dan kelemahannya dari musuhnya. Ia tidak suka mengikuti aturan tetap. Ia akan dapat menjadi ibu rumah tangga yang baik jika anda tahu bagaimana menanganinya. Banyak pria akan memintanya menikahinya karena ia sepenuhnya wanita. ");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PiscesCewek.this, PiscesCowok.class));
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
                startActivity(new Intent(PiscesCewek.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

