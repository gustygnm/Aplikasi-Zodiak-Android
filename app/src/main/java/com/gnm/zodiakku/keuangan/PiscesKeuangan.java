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

public class PiscesKeuangan extends AppCompatActivity {
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
        txtTitleBar.setText("Keuangan Pisces");
        txtJudul.setText("Karir dan Keuangan Pisces");
        txtIsi.setText("Untuk Ramalan Karier Zodiak Pisces tahun 2017 menyatakan bahwa kehidupan sosial dan lingkungan pekerjaan anda akan meningkat pesat. Hal ini membuka pintu untuk menggapai cita cita kamu. Saat yang tepat untuk kamu mendapatkan banyak pujian ataupun peningkatan karier sehingga berdampak pada kehidupan ekonomi kamu. Gunakan kesempatan yang ada sebaik mungkin. Jangan sampai kamu merasa kecewa dan mengalami keterpurukan. Untuk Warga Zodiak Pisces yang memiliki usaha menurut Ramalan Zodiak Pisces 2017 , kamu tidak perlu takut untuk mengambil keputusan. Apalagi untuk melebarkan usaha kamu melalui promosi. Ingat pada tahun ini kamu bisa mendapatkan hal yang lebih asalkan kamu mau berusaha dan tekun dalam meningkatkan usaha kamu.");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PiscesKeuangan.this, Coment.class));
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
                startActivity(new Intent(PiscesKeuangan.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

