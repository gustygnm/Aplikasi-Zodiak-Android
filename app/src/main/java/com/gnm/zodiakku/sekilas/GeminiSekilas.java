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
import com.gnm.zodiakku.cewek.GeminiCewek;

public class GeminiSekilas extends AppCompatActivity {
    Button btnBack, btnNext;
    TextView tittleBar, txtKarakter, txtSifatUtama;
    ImageView imgCover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zodiak_sekilas);

        GeminiSekilas.this.setTitle("Karakter Gemini");
        //menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar toolbar = (Toolbar) findViewById(R.id.sekilas_toolbar);
        setSupportActionBar(toolbar);

        init();
        txtKarakter.setText("orang orang yang dibawah pengaruh dari zodiak Gemini yang disimbolkan dengan sosok kembaran. Orang yang lahir pada periode ini secara luas dikenal karena mempunyai kepribadian ganda dan kemampuan untuk mengubah suasana hati dari waktu ke waktu. Meskipun mereka benci untuk hidup terikat, tapi mereka dapat menghibur pasangan dan berlaku romantis bahkan kadang mereka bisa berubah ubah jika bosan.");
        txtSifatUtama.setText("Mempunyai sifat sosial yang cukup tinggi namun memiliki pendirian yang tidak tetap. Sering memiliki cara berpikir yang berbeda-beda untuk setiap keadaan. Namun meski begitu, Gemini memiliki cara berpikir yang luas, atas dasar itulah gemini sering mengalami perubahan pikiran.\n" +
                "\n" +
                "Gemini termasuk Orang yang cerdas dan bisa memikirkan kemungkinan-kemungkinan yang akan terjadi. Jika terus diasah, gemini bisa memprediksi hal yang akan terjadi dan itu bisa membuatnya memiliki resiko yang kecil akan adanya resiko yang buruk. Hal ini juga yang bisa membuatnya berubah pikiran seketika. Ketika dalam keadaan panik mengambil keputusan namun ketika dipikir lagi ternyata ada hal lain yang memaksa Dia untuk merubah keputusannya.\n" +
                "\n" +
                "Memiliki bayangan pikiran yang berbeda. Saat memulai suatu tujuan, hal baru yang didapat telah memberinya gambaran baru tentang suatu kejadian. Sehingga gemini memiliki keraguan terhadap pemikiran atau gagasannya sendiri sebelum melangkah.\n" +
                "\n" +
                "Gemini termasuk Orang yang bisa melihat lawan bicaranya. Cerminan dari lawan bicaranya akan tetapi lebih sopan. Jika lawannya bersikap sopan maka Dia bisa lebih sopan dari itu. Bisa menjaga tata krama, sopan santun, dan tidak begitu ceplas ceplos. Meski begitu, Gemini bukan tipe Orang yang bisa begitu saja mengalah. Jika diserang Dia bisa melawan sesuai dengan serangannya. Jika merasa disindir, Dia bisa membalas sindiran itu lebih pedas, lebih menyakitkan, dan yang pasti lebih tepat sasaran.\n" +
                "\n" +
                "Karena kecerdasaanya, Gemini sering melakukan hal atau pekerjaan yang sifatnya sementara dengan tujuan hanya ingin tahu. Sehingga banyak gemini yang melakukan banyak hal tidak sampai selesai. Jika keinginannya sudah tercapai Dia bisa berpindah pekerjaan atau melakukan hal lain yang membuatnya merasa penasaran.\n" +
                "\n" +
                "Jangan memberikan tanggung jawab yang besar pada Orang Gemini. Karena pada umumnya gemini mudah berbuah pikiran. Apa yang sebelumnya dianggap baik bisa berubah dianggap buruk, begitu juga sebaliknya. Apalagi tanggung jawab tersebut diberikan disertai dengan suatu tekanan atau paksaan. Jangan memaksakan kehendak pada Orang gemini, itu penting.\n" +
                "\n" +
                "Orang gemini termasuk Orang yang banyak bicara pada saat masih kecil. Dan juga suka menangis ketika usia belia dan saat Dewasa suka dengan anak kecil yang menurutnya lucu atau menggemaskan. Jika menolong, Orang gemini kadang tidak hitung-hitungan. Jika menolong Orang yang disayang kadang berlebihan dan bisa merugikan diri sendiri atau menyulitkan diri sendiri.\n" +
                "Hal baik pada orang gemini adalah bisa menghargai dan menghormati suatu perbedaan dalam hal apapun. Pekerjaan yang cocok adalah pekerjaan yang langsung menghasilkan tanpa proses atau tanpa keuntungan jangka panjang.");
        imgCover.setImageResource(R.drawable.gemini2);
        imgCover.setBackgroundColor(Color.parseColor("#9c95c9"));

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GeminiSekilas.this, GeminiCewek.class));
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
                startActivity(new Intent(GeminiSekilas.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

