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
import com.gnm.zodiakku.cewek.LeoCewek;

public class LeoSekilas extends AppCompatActivity {
    Button btnBack, btnNext;
    TextView tittleBar, txtKarakter, txtSifatUtama;
    ImageView imgCover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zodiak_sekilas);

        LeoSekilas.this.setTitle("Karakter Leo");
        //menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar toolbar = (Toolbar) findViewById(R.id.sekilas_toolbar);
        setSupportActionBar(toolbar);

        init();
        txtKarakter.setText("Dikatakan bahwa Singa lebih dari sekedar mengaum. Mereka agung dalam arti sebenarnya. Namun, kemegahan dan kebesaran hati Leo tidak dapat diukur hanya dengan mudah bergaul dan hati yang besar. Kekuatan yang nyata mereka terletak pada kemampuan untuk menampilkan keberanian besar dalam ujian waktu.\n" +
                "Tanda zodiak kelima adalah Leo. Memiliki unsur api dan diperintah oleh Matahari. Dalam mitologi Mesir, Singa merupakan “pemberi kehidupan” karena rasi bintang ini memiliki Matahari selama musim hujan deras. Dalam mitologi Yunani, Singa merupakan representasi dari Nemean, Singa yang menewaskan Hercules. Zodiak mewakili kekuatan, semangat, dan ekspansi.\n" +
                "Untuk Leo, cinta selalu paling utama karena hati memerintah mereka. Mereka terlahir beruntung dan seperti angin yang melalui badai kehidupan. Karismatik dan optimis, Leo dikenal populer dan memiliki banyak teman. Singa sering berkomitmen untuk hubungan. Mereka setia dan memegang janji tetapi sekali kepercayaan mereka disalahgunakan atau hati mereka sakit, itu akan sulit untuk mendapatkan pengampunan mereka. Dalam hal ini mereka tetap memaafkan dan melupakan masalah. Leo dikenal menjauhi dari hubungan yang gagal dan juga dapat meninggalkan teman atau pasangannya ketika berada dalam kesukaran.\n" +
                "Di sisi lain, Leo tegas, ambisius, membesarkan hati, percaya diri, setia, bertanggung jawab, dan murah hati. Mereka cukup ramah dan mandiri. Mereka suka tersanjung namun mereka memperlakukan orang lain dengan kesetaraan dan hormat. Sifat-sifat negatifnya, Leo dikenal sombong, sok, dominan, boros, dan keras kepala. Mereka memiliki hal yang tinggi dari diri mereka sendiri dan berpikir mereka terhormat dan layak dihargai. Mereka menginginkan yang terbaik dari segala sesuatunya. Leo sangat bangga dan arogan.");
        txtSifatUtama.setText("Karakteristik orang yang berzodiak Leo ternyata tidak dapat dipisahkan dengan lambang zodiak itu sendiri yaitu seekor singa, yang juga dikenal sebagai raja hutan. Leo memiliki jiwa kepemimpinan yang tinggi, bahkan ia menganggap bahwa ia dilahirkan sebagai pemimpin sebagaimana singa sebagai raja hutan. Kepribadian bintang Leoyang tegas dan berwibawa sangat mencerminkan sifat si raja hutan.\n" +
                "\n" +
                "Leo juga merupakan pribadi yang berani dan juga giat. Ia berani untuk mengambil resiko dan juga akan berusaha sekuat tenaga untuk mencapai apa yang menjadi tujuannya.Jiwa kepemimpinannya yang kuat membuat Leo sangat ingin untuk diperhatikan. Sehingga dalam segi penampilan, orang berzodiak Leo biasanya akan tampil lebih sempurna.");
        imgCover.setImageResource(R.drawable.leo2);
        imgCover.setBackgroundColor(Color.parseColor("#ca6c38"));

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LeoSekilas.this, LeoCewek.class));
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
                startActivity(new Intent(LeoSekilas.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

