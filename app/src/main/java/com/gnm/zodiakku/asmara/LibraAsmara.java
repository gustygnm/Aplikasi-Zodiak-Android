package com.gnm.zodiakku.asmara;

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
import com.gnm.zodiakku.keuangan.AriesKeuangan;
import com.gnm.zodiakku.keuangan.LibraKeuangan;

public class LibraAsmara extends AppCompatActivity {
    Button btnBack, btnNext;
    TextView txtTitleBar, txtJudul, txtIsi, txtAsmaraPria_Judul, txtAsmaraPria_isi, txtAsmaraWanita_judul, txtAsmaraWanita_isi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zodiak_asmara);

        //menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar toolbar = (Toolbar) findViewById(R.id.asmara_toolbar);
        setSupportActionBar(toolbar);

        init();
        txtTitleBar.setText("Asmara Libra");
        txtJudul.setText("Jodoh dan Cinta Zodiak Libra");
        txtIsi.setText("Sebagai pecinta mereka adalah orang yang paling romantis dan bersifat klasik dibandingkan dengan zodiak lainnya. Planet venus yang berkuasa untuk bintang libr membuat mereka memiliki pandangan idealis cinta dan kebersamaan. Setelah Libra jatuh cinta mereka mulai langsung untuk memikirkan pernikahan. Libra jarang menemukan kebahagiaan dalam perkawinan. Hal ini lantaran terlalu banyak hal yang perlu di seimbangkan.");
        txtAsmaraPria_Judul.setText("Asmara Pria Libra");
        txtAsmaraPria_isi.setText("Kamu membuat waktu di ranjang menjadi pengalaman tak terlupakan. Kamu merasa perlu memuaskan pasangan kamu walaupun dibutuhkan sepanjang malam untuk itu. Kamu mencintai kecantikan di segala aspek kehidupan - termasuk wanita. Kamu menggunakan wibawa dan kepandaian luar biasa sebagai senjata dan kamu ahlinya dalam menjalankan peran. Ketika datang waktunya untuk mengambil tindakan, sikap yang tidak bisa memutuskan kamu sering muncul. Kamu mulai mempertimbangkan pro dan kotra dan jika memiliki keraguan kamu mulai bermain seakan-akan menjadi korbannya. Kamu sangat tidak suka menyakiti orang lain dengan sengaja yang menaruh kamu dalam belas kasihan pasangan. Kamu akan merespon dengan pujian. Kamu menyukai wanita di umur yang muda. Kamu biasanya memilih wanita dengan buasana menarik, berambut panjang dan berbibir basah.");
        txtAsmaraWanita_judul.setText("Asmara Wanita Libra");
        txtAsmaraWanita_isi.setText("Kamu diperhatikan karena kecantikan kamu. Kamu selalu memperhatikan busana, sikap dan memberikan sentuhan elegan di sekeliling kamu. Tujuan kamu adalah lebih di puja oleh pria namun jika dia meneruskan menaikan egomu, kamu akan menunjukan kepadanya seberapa terlatihnya kamu dalam bercinta. Kamu cenderung memilih pria artistik, namun pasangan kamu harus pandai melumas kamu dengan pujian untuk membuat kamu tetap bahagia.");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LibraAsmara.this, LibraKeuangan.class));
            }
        });

//        if (getSupportActionBar() != null) {
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//            getSupportActionBar().setDisplayShowHomeEnabled(true);
//        }
    }

    void init() {
        btnBack = (Button) findViewById(R.id.asmara_btnBack);
        btnNext = (Button) findViewById(R.id.asmara_btnNext);
        txtTitleBar = (TextView) findViewById(R.id.asmara_titleBar);
        txtJudul = (TextView) findViewById(R.id.asmara_txtJudul);
        txtIsi = (TextView) findViewById(R.id.asmara_isi);
        txtAsmaraPria_Judul = (TextView) findViewById(R.id.asmara_txtJudulAsmara_pria);
        txtAsmaraPria_isi = (TextView) findViewById(R.id.asmara_txtJudulAsmara_pria_isi);
        txtAsmaraWanita_judul = (TextView) findViewById(R.id.asmara_txtJudulAsmara_wanita);
        txtAsmaraWanita_isi = (TextView) findViewById(R.id.asmara_txtJudulAsmara_wanita_isi);
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
                startActivity(new Intent(LibraAsmara.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

