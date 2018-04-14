package com.gnm.zodiakku.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.gnm.zodiakku.R;
import com.gnm.zodiakku.sekilas.AriesSekilas;
import com.gnm.zodiakku.sekilas.ScorpioSekilas;

public class ScorpioHome extends AppCompatActivity {
    Button btnLanjut;
    TextView titleBar, txtTglLahirZodiak, txtTglLahirZodiak_isi1, txtTglLahirZodiak_isi2, txtSifat, txtSekilas, txtJdlSekitarZodiak;
    ImageView img_Cover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zodiak_home);

        ScorpioHome.this.setTitle("");
        //menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_Home);
        setSupportActionBar(toolbar);
        init();

        titleBar.setText("Scorpio");
        txtTglLahirZodiak.setText("Lahir pada 23 Oktober - 21 November");
        txtTglLahirZodiak_isi1.setText("Simbol : Kalajengking\n" +
                "Elemen : Air\n" +
                "Planet : Mars\n" +
                "Batu : topaz, opal\n" +
                "Mineral : besi\n" +
                "Warna : ungu");
        txtTglLahirZodiak_isi2.setText("Simbol Scorpio adalah kalajengking, binatang yang mematikan dan memiliki senjata di ekor dan di kedua tangannya. Mereka adalah sosok yang penuh emosi dan pendendam. Mereka juga sosok yang berani dan penuh kekuasaan.");
        txtSifat.setText("penuh gairah, posesif, fokus, sangat menggebu-gebu, memiliki rasa ingin tahu yang besar");
        txtJdlSekitarZodiak.setText("Sekilas tentang Scorpio");
        txtSekilas.setText("Para scorpio merupakan orang yang giat, emosional dan posesif. Mereka suka bekerja keras dan perfeksionis; mereka selalu melihat hidup dari sisi pahitnya. Mereka tidak menyukai kelemahan baik dalam diri mereka sendiri maupun dalam diri orang lain. Mereka sangat dermawan dan penuh kasih dan selalu membela kaum yang lemah. Mereka pKamui menyimpan rahasia dan memiliki insting yang kuat. Daya tariknya ada pada tatapan matanya yang dapat menarik orang dengan kekuatan magnetiknya.\n" +
                "Scorpio dapat menjadi orang yang setia, namun juga musuh yang berbahaya. Mereka pribadi yang penuh etika dan berpegang teguh pada peraturan yang mereka yakini dalam hidup mereka.\n" +
                "Sikapnya yang penolong, setia membuat orang yang mengenalnya merasa beruntung berada di pihaknya. Jika kamu berada di pihak yang berlawanan dengannya, maka ia akan menjadi musuh yang pendendam dan kejam.\n" +
                "Sedikit orang yang bisa menyadari kemampuan sejati scorpio karena sikapnya yang pendiam dan rendah hati terhadap apa yang telah mereka capai. Mereka orang yang selalu menepati janjinya dan jarang menarik kembali kata-kata yang telah terucap dari mulut mereka.\n" +
                "Mereka pengamat yang cermat dan pKamui mengukur situasi. Mereka tidak pernah terlibat dalam situasi tanpa persiapan yang matang, maka dari itu mereka selalu menjadi pesaing yang tangguh. Mereka selalu bersedia menolong yang lemah, penuh informasi dan pKamui menjaga rahasia.");
        img_Cover.setImageResource(R.drawable.cover_scorpio);

        btnLanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScorpioHome.this, ScorpioSekilas.class));
            }
        });
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }

    @Override
    public void onBackPressed() {
        finish();
    }

    void init() {
        btnLanjut = (Button) findViewById(R.id.btnLanjut);
        titleBar = (TextView) findViewById(R.id.home_titleBar);
        txtTglLahirZodiak = (TextView) findViewById(R.id.home_txtLahirZodiak);
        txtTglLahirZodiak_isi1 = (TextView) findViewById(R.id.home_txtLahirZodiak_Isi1);
        txtTglLahirZodiak_isi2 = (TextView) findViewById(R.id.home_txtLahirZodiak_isi2);
        txtSifat = (TextView) findViewById(R.id.home_ZodiaktxtSifat);
        txtSekilas = (TextView) findViewById(R.id.home_ZodiaktxtSekilas);
        txtJdlSekitarZodiak = (TextView) findViewById(R.id.home_txtjdlSekitarZodiak);
        img_Cover = (ImageView) findViewById(R.id.home_img);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.close, menu);
//        return true;
//    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

