package com.gnm.zodiakku.sekilas;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.gnm.zodiakku.MainActivity;
import com.gnm.zodiakku.R;
import com.gnm.zodiakku.cewek.AriesCewek;
import com.gnm.zodiakku.cewek.CancerCewek;

public class CancerSekilas extends AppCompatActivity {
    Button btnBack, btnNext;
    TextView tittleBar, txtKarakter, txtSifatUtama;
    ImageView imgCover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zodiak_sekilas);

        CancerSekilas.this.setTitle("Karakter Cancer");
        //menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar toolbar = (Toolbar) findViewById(R.id.sekilas_toolbar);
        setSupportActionBar(toolbar);

        init();
        txtKarakter.setText("Nah karena Cancer memiliki karakteristik yang emosional dan juga intuitif, karakter tersebut kemudian melahirkan beberapa sifat yang umumnya dimiliki oleh pemiliknya seperti halnya sifat perasa dan penolong. Seorang Cancer sangat simpatik. Ia yang mudah mengenali perasaan orang lain menjadi mudah iba dan ikut merasa sedih ketika melihat orang lain mengalami kesulitan sehingga ia pun menjadi pribadi yang suka menolong.\n" +
                "Di samping itu, karakter ini juga membawanya menjadi orang yang moody atau mudah sekali berubah-ubah suasana hatinya. Untuk itu, bagi kamu yang memiliki teman berzodiak Cancer, pandai-pandailah menjaga perasaannya agar tidak merusak suasana hatinya. Karena jika tidak, maka ia akan sangat sensitive dan mudah marah. Atau mungkin kamu sendiri merasakannya? Selain itu, seorang Cancer juga umumnya memiliki beberapa sifat lain seperti pemalu, tertutup dan terkadang menjadi seorang yang periang dan juga murah senyum.\n" +
                "Nah dari sini bisa diketahui juga bahwa seorang Cancer juga memiliki beberapa hal yang disukai seperti lebih suka menghabiskan waktunya di rumah dengan berkumpul dan bercengkrama bersama keluarga, membuat makanan bersama teman dan juga mendengarkan musik yang lembut. Di samping itu, dalam berbusana seorang Cancer memiliki selera yang cenderung sederhana seperti baju longar berwarna gelap dengan kain yang natural karena sejatinya ia lebih suka busana sederhana yang tidak merepotkan. Sedangkan hal-hal yang sangat tidak disukai oleh seorang berzodiak Cancer adalah film keras, diteriaki atau dibentak orang lain, apalagi dikecewakan orang yang sangat ia sayangi.");
        txtSifatUtama.setText("Setiap zodiak atau bintang umumnya memang memiliki karakter atau ciri dan sifat yang berbeda yang menjadi bawaan pemiliknya. Begitu pula dengan orang yang berzodiak cancer memiliki beberapa karakter dan sifat khusus yang tampak dalam dirinya. Diantara karakteristiknya yang menonjol adalah karakter emosional. Cancer sangat mudah terbawa emosi sehingga ia pun menjadi pribadi yang sangat sensitive dan perasa. Dan karena karakternya ini, ia pun kemungkinan dapat merasakan perasaan yang mungkin tidak dirasakan oleh zodiak lain.\n" +
                "Dan seperti halnya seekor kepiting, hal ini melambangkan karakter yang cenderung protektif dan memiliki kemampuan yang kuat untuk mempertahankan dirinya. Dan dari sensitifitas Cancer yang tinggi, ia pun dibekali dengan intuisi yang kuat sehingga orang yang memiliki zodiak cancer ini biasanya bisa mengenali karakter orang lain dengan mudah bahkan juga bisa membaca pikiran ataupun perasaan dari orang lain. Cancer juga memiliki karakter yang sangat agresif jika terusik atau ada yang menantangnya. Untuk itu, jangan macam-macam dengan kepiting jika tidak ingin dicapit oleh mereka.");
        imgCover.setImageResource(R.drawable.cancer2);
        imgCover.setBackgroundColor(Color.parseColor("#96cb57"));

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CancerSekilas.this, CancerCewek.class));
            }
        });

//        if (getSupportActionBar() != null) {
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//            getSupportActionBar().setDisplayShowHomeEnabled(true);
//        }
    }

    void init() {
        btnBack = (Button) findViewById(R.id.sekilas_btnBack);
        btnNext = (Button) findViewById(R.id.sekilas_btnNext);
        txtKarakter = (TextView) findViewById(R.id.sekilas_txtKarakter);
        txtSifatUtama = (TextView) findViewById(R.id.sekilas_txtSifatUtama);
        imgCover = (ImageView) findViewById(R.id.sekilas_imgCover);
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
                startActivity(new Intent(CancerSekilas.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

