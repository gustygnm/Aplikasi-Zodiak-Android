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
import com.gnm.zodiakku.sekilas.LeoSekilas;

public class LeoHome extends AppCompatActivity {
    Button btnLanjut;
    TextView titleBar, txtTglLahirZodiak, txtTglLahirZodiak_isi1, txtTglLahirZodiak_isi2, txtSifat, txtSekilas, txtJdlSekitarZodiak;
    ImageView img_Cover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zodiak_home);

        LeoHome.this.setTitle("");
        //menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_Home);
        setSupportActionBar(toolbar);
        init();

        titleBar.setText("Leo");
        txtTglLahirZodiak.setText("Lahir pada 23 Juli - 22 Agustus");
        txtTglLahirZodiak_isi1.setText("Simbol : Singa\n" +
                "Elemen : Api\n" +
                "Planet : Matahari\n" +
                "Batu : Ruby\n" +
                "Mineral : Emas\n" +
                "Warna : Oranye, emas");
        txtTglLahirZodiak_isi2.setText("Leo memiliki simbol singa disebut-sebut sebagai raja hutan yang ditakdirkan menjadi pemimpin, demikian pula disimbolkan, karakter mereka yang bernaung di bawah zodiak Leo suka memerintah dan tak suka dikalahkan. Keberanian menjadi salah satu karakter dirinya, kekuatan dan kekuasaan selalu ada di dalam benak Leo.");
        txtSifat.setText("Murah hati, suka menolong, perhatian, aktif, hangat, terbuka dan suka memerintah");
        txtJdlSekitarZodiak.setText("Sekilas tentang Leo");
        txtSekilas.setText("Leo adalah anggota kerajaan segala zodiak. Mereka bermartabat tinggi dan sangat dramatis, mereka sangat gagah dan penuh warna, dan suka menjadi pusat perhatian.\n" +
                "Mereka bekerja giat di dalam susunan organisasi dan pKamui membagi tugas. Rencana mereka jarang terdengar namun selalu menakjubkan. Mereka penuh percaya diri dan terus terang dalam menyatakan apa yang mereka rasakan, namun terkadang mereka mudah sekali marah.\n" +
                "Mereka memiliki keberanian dan tidak pernah berbuat curang. Leo mempunyai pembawaan diri yang mengagumkan sehingga menarik perhatian banyak orang. Orang leo sangat terbuka,sulit bagi mereka menyembunyikan perasaan dan diri mereka sendiri.\n" +
                "Mereka pKamui beradaptasi dan perhatian pada segala hal. Mereka dilahirkan untuk menjadi pemimpin dan akan sangat kecewa bila mereka tidak memiliki kekuasaan untuk mendelegasikan tugasnya.\n" +
                "Mereka suka hidup seperti layaknya anggota kerajaan dan bersedia melakukan apa saja yang dibutuhkan untuk mendapatkan gaya hidup yang diinginkannya. Mereka tahu apa yang harus mereka lakukan untuk membujuk orang disekitarnya melakukan apa yang diinginkan.\n" +
                "Leo suka melakukan perbuatan yang besar dan terkenal dengan kedermawanannya. Mereka tidak pernah mundur dari suatu pertempuran dan selalu membela hak mereka dan kepercayaan mereka.\n" +
                "Asmara Para Leo: Leo selalu membanggakan dirinya sebagai pecinta yang hangat. Prilaku mereka nampak dengan sikapnya yang sombong dan sok kuasa tetapi sifat inilah yang membuat mereka menjadi sangat terkenal di dalam hal bercinta. Mereka tidak suka pasangan yang melebihi dirinya.\n" +
                "Leo cenderung dermawan, pandai beradaptasi dan penuh perhatian. Mereka selalu menyenangkan pasangannya sehingga pasangannya selalu senang berada di dekatnya. Leo juga mudah cemburu bila pasangannya lebih memperhatikan orang lain daripada dirinya.");
        img_Cover.setImageResource(R.drawable.cover_leo);

        btnLanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LeoHome.this, LeoSekilas.class));
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

