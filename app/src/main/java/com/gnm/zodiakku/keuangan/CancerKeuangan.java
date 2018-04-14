package com.gnm.zodiakku.keuangan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.gnm.zodiakku.Coment;
import com.gnm.zodiakku.MainActivity;
import com.gnm.zodiakku.R;

public class CancerKeuangan extends AppCompatActivity {
    Button btnBack, btnNext;
    TextView txtTitleBar, txtJudul, txtIsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zodiak_keuangan);

        //menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar toolbar = (Toolbar) findViewById(R.id.keuangan_toolBar);
        setSupportActionBar(toolbar);

        init();
        txtTitleBar.setText("Keuangan Cancer");
        txtJudul.setText("Karir dan Keuangan Cancer");
        txtIsi.setText("Seorang Cancer merupakan salah satu orang yang dianggap sebagai pemikir hebat sehingga menjadikannya sebagai orang yang termasuk ke dalam jajaran orang-orang sukses. Untuk itu, bisa dikatakan bahwa seorang Cancer dapat memiliki karir yang cemerlang dengan usaha yang ia lakukan. Sedangkan untuk tipe pekerjaan, ada beberapa profesi yang cenderung cocok untuk dilakukan oleh seorang Cancer seperti musisi, artis dan juga penulis.\n" +
                "\n" +
                "Bahkan seorang Cancer juga bisa menduduki tempat yang terkemuka jika ia bisa mengesampingkan sifat pemalu yang dimiikinya sehingga ia akan terus maju dengan percaya diri. Seorang Cancer juga memiliki jiwa kepemimpinan yang tinggi dan umumnya kesuksesan akan menghampirinya di usia yang sedikit lanjut. Selain pandai mencari uang, seorang Cancer juga sangat pandai dalam mengatur keuangan.");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CancerKeuangan.this, Coment.class));
            }
        });

//        if (getSupportActionBar() != null) {
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//            getSupportActionBar().setDisplayShowHomeEnabled(true);
//        }
    }

    void init() {
        btnBack = (Button) findViewById(R.id.keuangan_btnBack);
        btnNext = (Button) findViewById(R.id.keuangan_btnNext);
        txtTitleBar = (TextView) findViewById(R.id.keuangan_titleBar);
        txtJudul = (TextView) findViewById(R.id.keuangan_judul);
        txtIsi = (TextView) findViewById(R.id.keuangan_isi);
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
                startActivity(new Intent(CancerKeuangan.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

