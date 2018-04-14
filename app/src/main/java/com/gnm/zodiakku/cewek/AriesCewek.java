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

public class AriesCewek extends AppCompatActivity {
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
        txtTitleBar.setText("Wanita Aries");
        txtKarakterCewek.setText("Karakter Seorang Wanita Zodiak Aries");
        txtKarakterCewek_isi.setText("Tipe karakter wanita yang memiliki tanggal zodiak Aries merupakan wanita yang sangat matang dalam berpikir dan menentukan arah hidupnya yang lebih baik dengan penuh ambisi.\n\nJika tidak ada cowok dalam hidupnya, cewek Aries akan berusaha sibuk sendiri. Wanita yang nampak biasa-biasa saja ini akan berusaha mendorong dirinya untuk mencapai tujuannya.\n\nUmumnya wajahnya akan tampak langsing dan panjang, tulang pipi yang tinggi, alis yang sedikit melengkung ke atas, lebih cenderung tinggi, bibir tipis dan cewek Aries akan memiliki campuran karakter yang cukup membingungkan.\n\nNamun dalam masa krisis, wanita Aries dapat menaruh pemikiriannya untuk memecahkan masalah dengan lebih baik jika dibandingkan dengan bintang lainnya. Begitu cewek Aries bermaksud melakukan sesuatu, tidak akan ada yang dapat menghentikannya. Wanita dalam bintang ini sangat berbeda dengan wanita lainnya.\n\nWanita Aries memang membutuhkan kasih sayang dari seorang laki-laki tapi girls ini tidak percaya akan cinta, cewek zodiak Aries lebih mementingkan keamanan dan perlindungan bagi dirinya dari seorang laki-laki.");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AriesCewek.this, AriesCowok.class));
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
                startActivity(new Intent(AriesCewek.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

