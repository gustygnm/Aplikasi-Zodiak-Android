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

public class LeoKeuangan extends AppCompatActivity {
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
        txtTitleBar.setText("Keuangan Leo");
        txtJudul.setText("Karir dan Keuangan Leo");
        txtIsi.setText("Ramalan Keuangan Leo 2017 menyatakan bahwa pada tahun 2017 ini kamu harus berhati hati. Kamu harus pintar dan seksama dalam mengatur perencanaan keuangan kamu. Sangat di sarankan untuk menghindari pengeluaran pengeluaran besar yang sebenarnya tidak dibutuhkan. Cobalah untuk ditabung karena mungkin nanti di pertengahan tahun 2017 akan ada pengeluaran yang tidak terduga.\n" +
                "Ramalan karier Zodiak Leo tahun 2017\n" +
                "Peruntungan ramalan karier leo 2017 menyatakan bahwa kamu sadar dan tahu bahwa sebenarnya masih banyak pekerjaan yang belum bisa kamu selesaikan. Hal terpenting adalah kamu tidak menyerah dan selalu mencoba untuk menyelesaikan pekerjaan yang telah kamu terima. Berkumpul bersama teman sejenak untuk mengembalikan motivasi ataupun mood kerja adalah hal yang perlu kamu lakukan. Sementara untuk kamu yang telah memiliki usaha, peruntungan ramalan karir menyatakan bahwa kamu akan disibukkan pada periode pertengahan tahun sehingga tidak ada waktu santai untuk kamu. Kamu harus pintar untuk menentukan prioritas kamu.");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LeoKeuangan.this, Coment.class));
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
                startActivity(new Intent(LeoKeuangan.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

