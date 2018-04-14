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

public class ScorpioKeuangan extends AppCompatActivity {
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
        txtTitleBar.setText("Keuangan Scorpio");
        txtJudul.setText("Karir dan Keuangan Scorpio");
        txtIsi.setText("Tahun ini anda akan melihat bagaimana perbedaan pengelolaan keuangan yang anda lakukan masa lalu dengan pengelolaan keuangan saat ini. Dengan kehadiran Saturnus di zona keuangan anda, anda akan melihat dengan jelas bagaimana pilihan keuangan anda. Kabar baiknya, dengan kehadiran Saturnus di rumah ke 2 Scorpio, anda memiliki semua alat yang dibutuhkan untuk melakukan penyesuaian jangka panjang, baik dalam pengelelolaan, penyimpanan, maupun pengeluaran. Pada periode Oktober, ketika Jupiter memasuki daerah keuangan Scorpio, anda akan memiliki kondisi finansial yang baik.\nMoment terbaik bagi Scorpio dalam karir dan profesional di tahun ini terjadi mulai bulan Oktober ketika Jupiter transit ke rumah anda. Anda  hanya butuh sedikit keberanian untuk menempuh risiko demi mendapatkan hasil maksimal. Kehadiran Pluto di rumah ke 3 Scorpio mengharuskan anda untuk melakukan perjalanan ekstra.");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScorpioKeuangan.this, Coment.class));
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
                startActivity(new Intent(ScorpioKeuangan.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

