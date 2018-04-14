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
import com.gnm.zodiakku.cowok.SagitariusCowok;

public class SagitariusCewek extends AppCompatActivity {
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
        txtTitleBar.setText("Wanita Sagitarius");
        txtKarakterCewek.setText("Karakter Seorang Wanita Zodiak Sagitarius");
        txtKarakterCewek_isi.setText(" Wanita jangkung, langsing dan anggun, yang akan berjalan dengan penuh kebanggaan bagaikan sedang berjalan di panggung kontes kecantikan. Jika ia terpeleset, atau hampir jatuh, ia akan menutupinya dengan manis dan melanjutkan langkahnya dengan anggun dan meyakinkan.\n" +
                "\n" +
                "Ia pandai menggunakan make-up untuk mempercantik dirinya. Cewek Zodiak Sagitarius selalu b\n" +
                "isa melihat dunia secara positif, maka wajahnya selalu nampak bahagia. Cewek Zodiak Sagitarius tidak akan menyerah dengan mudah. Tipe wanita penuh percaya diri yang percaya pada penampilan dan gaya sendiri.\n" +
                "\n" +
                "Cewek Zodiak Sagitarius tidak akan mengikuti mode, tetapi selalu berusaha tampil dengan gaya yang berada diantara sederhana dan terlalu modern. Cewek Zodiak Sagitarius adalah orang yang sangat terbuka, bahkan terkadang terlalu apaadanya. Orangnya jujur, dan tidak pernah mencoba mencair masalah untuk orang lain. Ia terkadang mengatakan hal yang tidak semestinya anda ingin dengar.\n" +
                "\n" +
                "Tapi dia juga bisa mengatakan banyak hal yang menyenangkan pada saat yang sama. Misalnya, ia mungkin akan berkata \"Rasanya pengen deh kamu bisa dapet duit lebih banyak, jadi kamu bisa beli baju lebih bagusan, tapi mending tetep deh. Abis, kalau kamu terus mikirin dapet duit banyak, ntar malah jadi rakus.\"\n" +
                "\n" +
                "Anda mungkin akan bingung mendengar kata-kata ini, apakah anda akan marah atau anda akan malah semakinmenyatanginya. Cewek Zodiak Sagitarius juga memiliki jiwa yang bebas dan tidak suka tinggal di rumah. Ia suka dilindungi, tetapi bukan berarti dia mau diperintah-perintah. Ia tidak bisa menghargai pria lemah.\n" +
                "\n" +
                "Jika ia berusaha mengungguli anda, maka anda harus tenang dan mencoba mengendalikan dia dengan membatasinya, dengan cara melakukan hal yang sama kepadanya. Ia akan mau mendengar anda jika ia menghormati anda. Ia suka menjadi diri sendiri dan menyukai cowok yang menjadi dirinya sendiri.\n" +
                "\n" +
                "Cewek Zodiak Sagitarius adalah wanita yang tidak suka banyak tingkah, jadi anda tidak akan mendengar dia akan berkata \"Tebak, abis ini aku mau ngapain,\" atau \"tebak, aku lagi mikir apa\", karena ia selalu mengatakan apa yang ada dipikirannya secara terbuka. Jika anda tidak bisa mengerti dirinya mengenai hal ini, maka anda akan sangat mudah putus dengannya. Cewek Zodiak Sagitarius melihat masalah dalam hidupnya sebagai suatu episode lucu saja.\n" +
                "\n" +
                "Cewek Zodiak Sagitarius cenderung ceroboh, tetapi itu adalah sifat alaminya. Anda mungkin berpikir hal ini manis, tetapi mungkin bagi beberapa cowok tipe rapi, hal ini sangat mengesalkan. Ia sangat ramah, maka ia dapat dengan mudah membuat musuh menjadi teman akrab. Ia memiliki selera yang baik dalam hal makanan, pakaian, dan layanan-layanan kelas satu. Bahkan mereka yang tergolong miskin dalam zodiak ini, akan selalu berusahauntuk mendapat yang terbaik.\n" +
                "\n" +
                "Cewek Zodiak Sagitarius dapat membelanjakan uangnya seakan ia tidak mengerti susahnya mencari uang. Jika anda berpikir untuk meminjaminya uang, pikirkan ulang. Mereka cenderung paranoid. Jika anda merasa menyukainya, dia mungkin sudah berpikir bahkan mengenai pernikahan, kehilangan kebebasan, dan seterusnya. Cewek Zodiak Sagitarius adalah wanita yang sangat menyukai sport.\n" +
                "\n" +
                "Cewek Zodiak Sagitarius adalah wanita biasa yang mungkin saja berdandan seperti cewek tomboy. Ia memiliki lebih banyak teman cowok daripada teman cewek, dan terkadang bertingkah seperti cowok diantara temannya. Ia tidak memperdulikan gosip, maka ia terkadang pulang malam, dan tidak peduli apa yang digosipkanpeduli apa yang digosipkan tetangga mengenai dirinya.\n" +
                "\n" +
                "Karakter Cewek Zodiak Sagitarius berpikir mengenai kedua sisi dari segala permasalahan sekaligus, anda akan tahu sendiri, maka anda tidak perlu peduli apa yang dipikirkan orang. Penampilan yang polos dan kecerdikannya adalah pesona utamanya. Ia seringkali terluka oleh cinta, tetapi tidak pernah takut untuk mencari cinta yang baru, seakan ia menyanyikan \"Do that to me one more time.\"\n" +
                "\n" +
                "Karakter Cewek Zodiak Sagitarius suka jujur dan terbuka Ia tidak akan berputar- putar untuk mengatakan apa yang ia ingin katakan. Jika anda menemuinya dan mengatakan apa yang anda pikirkan langsung, maka ia akan mengagumi anda.");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SagitariusCewek.this, SagitariusCowok.class));
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
                startActivity(new Intent(SagitariusCewek.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

