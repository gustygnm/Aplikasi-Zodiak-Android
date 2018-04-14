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
import com.gnm.zodiakku.keuangan.GeminiKeuangan;

public class GeminiAsmara extends AppCompatActivity {
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
        txtTitleBar.setText("Asmara Gemini");
        txtJudul.setText("Jodoh dan Cinta Zodiak Gemini");
        txtIsi.setText("Geminians (panggilan untuk orang yang berzodiak Gemini) bisa memainkan permainan dengan keji dengan menggunakan kepandaian dan daya tariknya. Mereka dengan mudah dapat merayu bintang lain utuk menjalankan hubungan dengan mereka, tetapi untuk hubungan jangka panjang adalah sebuah cerita yang beda. Kamu adalah tipikal orang yang tidak menyukai bertahan dalam hubungan yang membatasi kamu.");
        txtAsmaraPria_Judul.setText("Asmara Pria Gemini");
        txtAsmaraPria_isi.setText("Ketika bicara mengenai cinta kamu selalu menghindar, kamu tidak tahan dengan jadwal atau rutinitas di setiap aspek kehidupan. Kamu menolak untuk membuat komitmen. Kamu selalu mencoba untuk menjalani hidup ini sebaik mungkin. Kamu pandai, suka berkomunikasi dan secara ekstrim berpengetahuan tinggi. Kamu pembicara yang secara lembut dapat meyakinkan dan biasanya menangkap semua pasangan melalui komunikasi. Jiwa muda alami kamu sangat disukai banyak wanita. Pendekatan kamu yang menyenangkan, hasrat kamu terhadap pesta dan hiburan dan pencarian pengalaman terhadap sesuatu yang baru dan berbeda makin menambah daya tarik kamu. Kamu memiliki keingintahuan terhadap wanita dan akan mengejar seseorang meskipun banyak tantangan. Kekuatan kamu untuk menjaga hubungan tentunya sangat buruk. Kamu mudah putus dan akan dengan cepat mencari pengganti lain yang menarik jika kamu bosan.");
        txtAsmaraWanita_judul.setText("Asmara Wanita Gemini");
        txtAsmaraWanita_isi.setText("Kamu menggoda, menarik dan menyenangkan. Kamu sangat friendly dan mudah didekati tapi tidak semua tertarik memiliki hubungan jangka panjang dengan kamu. Kamu bukan kekasih yang mudah dibaca. Kamu mengharapkan kecocokan mental agar tertarik dengan seseorang dan kamu tidak mengijinkan orang lain berdansa dengan badan kamu jika mereka tidak dapat berdansa dengan pikiranmu. Kamu selamanya mencoba memperbaiki hal, bahkan pasangan sendiri. Perubahan adalah bagian besar dalam pola hidup dan kebutuhan untuk kehidupan emosional kamu. Kamu akan menggunakan daya tarik sex sebagai senjata jika dibutuhkan untuk mendapatkan apa yang kamu inginkan.");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GeminiAsmara.this, GeminiKeuangan.class));
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
                startActivity(new Intent(GeminiAsmara.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

