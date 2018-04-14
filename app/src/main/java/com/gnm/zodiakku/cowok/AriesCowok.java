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

public class AriesCowok extends AppCompatActivity {
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
        txtTitleBar.setText("Pria Aries");
        txtKarakterCowok.setText("Karakter Seorang Pria Zodiak Aries");
        txtKarakterCowok_isi.setText("Pria dengan tanggal zodiak Aries adalah orang yang suka berpetualang dan menikmati tantangan. Boys ini sangat berhati-hati dalam rintangan sekecil apapun bahkan pria Aries berpikir bahwa hidup adalah masalah serius.\n\nCowok aries dapat terlihat lembut, tetapi didalam hatinya cowok aries adalah orang yang sekeras baja. Begitu cowok aries ingin melakukan sesuatu, cowok aries akan melakukannya secara serius.\n\nPria Aries selalu menghormati orang yang lebih tua dan senior. Maka anda akan melihat bahwa boys ini adalah tipe orang yang akan secara teratur atau sering mengunjungi orang tuanya. Cowok Aries peduli apa yang orang lain pikirkan mengenai dirinya, dan selalu ingin mendapat komentar atau pujian baik mengenai dirinya.\n\nCowok Aries memang orang yang sedikit pemalu, tetapi juga orang yang keras kepala. Cowok Aries akan menemukan berbagai cara untuk membuat anda bahagia ketika anda berada bersamanya, sampai akhirnya anda sadar bahwa cowok Aries adalah orang yang penting bagi anda.\n\nPria Aries adalah pemimpin yang baik dan “Kelembutan” adalah salah satu metodenya yang paling efektif untuk menggunakan kemampuannya. Hal ini dilakukan selayaknya dia memang dilahirkan sebagai pemimpin. Pria Aries tidak pernah menyembunyikan ambisinya, dan dia adalah seorang pekerja keras.");

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AriesCowok.this, AriesAsmara.class));
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
                startActivity(new Intent(AriesCowok.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

