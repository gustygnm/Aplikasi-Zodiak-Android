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
import com.gnm.zodiakku.cowok.LeoCowok;

public class LeoCewek extends AppCompatActivity {
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
        txtTitleBar.setText("Wanita Leo");
        txtKarakterCewek.setText("Karakter Seorang Wanita Zodiak Leo");
        txtKarakterCewek_isi.setText("Ia akan nampak menonjol di antara kerumunan orang. Wanita Leo umumnya tinggi. Anda akan jarang menemui wanita Leo yang pendek dan agak \"tebal\". Ketika ia berjalan, ia berjalan layaknya seorang ratu, penuh percaya diri dan tidak menoleh ke mana-mana, bagaikan tidak ada orang sama sekali di sekitarnya. Ia akan berdandan dengan gayanya sendiri, dan tidak mengikuti mode.\n" +
                "\n" +
                "Ia percaya diri dengan apa yang dipilihnya untuk dipakainya. Jangan pernah membeli baju murah yang dijual lusinan sebagai hadiah untuknya, ia akan membencinya. Juga jangan membeli baju yang tidak mencerminkan kepribadiannya yang percaya diri. Ia menyukai baju dan asesoris yang unik dan 'aneh'. Ia suka sekali tampil berbeda.\n" +
                "\n" +
                "Jika anda ingin mengenal dia, sabar dan ambillah waktu sepanjang mungkin, karena ia sangat selektif mengenai orang yang berkenalan dengan dia. Ia berpikiran terbuka, tetapi ia tidak akan membiarkan orang terlalu dekat dengannya. Ia menyukai kata-kata manis dan pujuan, tetapi tidak terlalu banyak. Ia tersenyum kepada siapa saja, tetapi dalam hatinya, ia percaya bahwa ia dilahirkan sebagai pemimpin.\n" +
                "\n" +
                "Ia suka mengendalikan, karena hal itu adalah insting alaminya. Ia adalah wanita yang anggun, dan memiliki kharisma yang sangat kuat, maka anda harus siap menghadapi persaingan hebat. Dia adalah orang yang sangat bangga kepada diri sendiri, maka jangan pernah menantang kepercayaan dirinya.\n" +
                "\n" +
                "Mungkin saja ia akan marah dan bertingkah layaknya badai, dan kemudian layaknya anak kucing yang lucu dan tidak bersalah, tapi jangan pernah jatuh kedalam perangkapnya. Ia selalu mengingat semuanya, dan suka untuk mengingat-ingat kenangan manis, jadi jika anda menemukan album foto penuh dengan foto mantan, atau tumpukan surat cintanya yang membuat anda serasa ingin muntah, jangan anggap itu semua terlalu serius.\n" +
                "\n" +
                "Walaupun ia menyimpan semua memori manisnya, tidak berarti ia masih menyimpan perasaan lamanya, jadi anda tidak perlu panik. Ia dikelilingi oleh banyak cowok baik, maka jika anda memiliki latar belakang keluarga yang baik, atau keluarga yang terkenal, atau karir yang sukses, hal itu akan menguntungkan bagi anda.\n" +
                "\n" +
                "Ia benci hidup miskin, dan ia berpikir bahwa cinta tidak akan dapat membayar semua pengeluaran. Ia adalah tipe sporty dan suka sekali berolah raga. Jika anda ingin berkencan dengannya, bersiaplah untuk mengeluarkan duit banyak, karena makan malam dengannya tidak mungkin makan di stand burger atau hot dog, tetapi sebaiknya adalah resto terbaik di kota.\n" +
                "\n" +
                "Ia adalah orang pemurah, jadi jangan terkejut jika dia memberi hadiah yang lebih mahal daripada hadiah yang pernah anda berikan kepadanya. Ia suka hal yang bersifat extravaganza, bukan hadiah murah, Jadi jika anda tidak memiliki banyak uang, cobalah untuk kreatif dan membuat hadiah sendiri untuk dia.\n" +
                "\n" +
                "Hal ini membuat hadiah anda menjadi unik, dan waktu yang anda gunakan untuk membuatnya merupakan suatu penghargaan sendiri bagi dia. Anda dapat berpikir ekonomis, tapi jangan pelit. ");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LeoCewek.this, LeoCowok.class));
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
                startActivity(new Intent(LeoCewek.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

