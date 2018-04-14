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
import com.gnm.zodiakku.cewek.ScorpioCewek;

public class ScorpioSekilas extends AppCompatActivity {
    Button btnBack, btnNext;
    TextView tittleBar, txtKarakter, txtSifatUtama;
    ImageView imgCover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zodiak_sekilas);

        ScorpioSekilas.this.setTitle("Karakter Scorpio");
        //menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar toolbar = (Toolbar) findViewById(R.id.sekilas_toolbar);
        setSupportActionBar(toolbar);

        init();
        txtKarakter.setText("Zodiak Scorpio mempunyai karakter yang begitu rendah hati. Mereka begitu tidak ingin menonjolkan diri mereka sendiri walau waktu itu mereka mempunyai prestasi yang begitu gemilang dan membanggakan. Mereka juga begitu baik hati serta gampang membantu siapa saja yang dalam kesusahan. Mereka begitu pintar dalam melindungi rahasia. Kepribadian zodiak Scorpio mempunyai karakter yang begitu gampang terasa cemburu dan berprasangka buruk bakal suatu hal.\n" +
                "Walau itu berlangsung tanpa ada argumen meskipun. Mereka juga begitu tak gampang mengeluh, jadi dari itu mereka begitu tak suka pada orang yang gampang mengeluh mengenai suatu hal hal. Mereka juga berbentuk serakah serta begitu mementingkan dianya. Mereka dapat meninggalkan seseorang teman dekat yang di rasa banyak merugikan dianya.");
        txtSifatUtama.setText("Zodiak scorpio merupakan orang yang giat, berpegang teguh akan hal yang mereka yakini dalam kehidupannya dan juga rendah hati kadang juga bisa jadi orang yang pendiam,tapi tergantung sikonnya juga kapan waktunya diam dan kapan waktu berbicara,Dan mereka suka bekerja keras dan perfeksionis; mereka selalu melihat hidup dari sisi pahitnya terlebih dahulu baru manisnya. Mereka tidak menyukai kelemahan baik dalam dirinya  sendiri maupun dalam diri orang lain. Mereka sangat dermawan dan penuh kasih dan selalu membela kaum yang lemah. Mereka pandai menyimpan rahasia dan memiliki insting yang kuat. Daya tariknya ada pada tatapan matanya yang dapat menarik orang dengan kekuatan magnetiknya. Scorpio dapat menjadi orang yang setia, namun juga musuh yang berbahaya.Sikapnya yang penolong, setia membuat orang yang mengenalnya merasa beruntung berada di pihaknya. Jika kamu berada di pihak yang berlawanan dengannya, maka ia akan menjadi musuh yang pendendam dan kejam. Sedikit orang yang bisa menyadari kemampuan sejati scorpio karena sikapnya yang pendiam dan rendah hati terhadap apa yang telah mereka capai. Mereka orang yang selalu menepati janjinya dan jarang menarik kembali kata-kata yang telah terucap dari mulut mereka. Mereka pengamat yang cermat dan pandai mengukur situasi. Mereka tidak pernah terlibat dalam situasi tanpa persiapan yang matang, maka dari itu mereka selalu menjadi pesaing yang tangguh. Mereka selalu bersedia menolong yang lemah, penuh informasi dan pandai menjaga rahasia.");
        imgCover.setImageResource(R.drawable.scorpio2);
        imgCover.setBackgroundColor(Color.parseColor("#c87db6"));

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScorpioSekilas.this, ScorpioCewek.class));
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
                startActivity(new Intent(ScorpioSekilas.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

