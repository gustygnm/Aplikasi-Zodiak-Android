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

public class VirgoKeuangan extends AppCompatActivity {
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
        txtTitleBar.setText("Keuangan Virgo");
        txtJudul.setText("Karir dan Keuangan Virgo");
        txtIsi.setText("Ramalan horoskop Virgo 2018 memperkirakan bahwa bidang pekerjaan di tahun ini akan berjalan dengan mudah. Anda cenderung memiliki atau mendapatkan posisi kerja yang lebih tinggi di mana tanggung jawab lebih pada Anda, tapi pada saat bersamaan Anda perlu bergantung pada orang lain untuk menyelesaikan pekerjaan Anda. Ini mungkin sedikit mengerikan bagi Anda karena kebanyakan Virgo suka mengendalikannya. Oleh karena itu, Anda perlu melatih kemampuan komunikasi agar bisa menyampaikan maksud kepada karyawan Anda dengan lebih baik.\nRamalan bintang Virgo 2018 meminta Anda untuk membelanjakan uang Anda untuk hal-hal yang Anda butuhkan tahun ini dan bekerja untuk menabung demi masa depan. Anda mungkin merasa ingin menghabiskan lebih banyak uang untuk tindakan pengamanan. Jangan membeli secara impulsif. Anda akan merasa tidak enak karenanya nanti. Di sisi lain, prediksi zodiak 2018 menunjukkan bahwa membelanjakan uang untuk orang-orang yang Anda cintai akan membuat Anda merasa lebih baik.");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VirgoKeuangan.this, Coment.class));
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
                startActivity(new Intent(VirgoKeuangan.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

