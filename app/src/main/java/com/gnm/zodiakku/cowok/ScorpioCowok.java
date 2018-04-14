package com.gnm.zodiakku.cowok;

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
import com.gnm.zodiakku.asmara.AriesAsmara;
import com.gnm.zodiakku.asmara.ScorpioAsmara;

public class ScorpioCowok extends AppCompatActivity {
    Button btnBack, btnNext;
    TextView txtTitleBar, txtKarakterCowok, txtKarakterCowok_isi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zodiak_cowok);

        //menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar toolbar = (Toolbar) findViewById(R.id.cowok_toolbar);
        setSupportActionBar(toolbar);

        init();
        txtTitleBar.setText("Pria Scorpio");
        txtKarakterCowok.setText("Karakter Seorang Pria Zodiak Scorpio");
        txtKarakterCowok_isi.setText(" Seorang pria dengan kabut yang menyelimuti diriya. Ia sangat sensitif dan mudah terluka, dan selalu merasa kesepian. Ia tidak pernah mempercayai siapapun, kecuali dirinya. Walaupun terdengar sangat negatif, ia memiliki kharisma yang luar biasa. Ia adalah orang yang sangat berbelas kasih. Ia mampu menyerap semua perasaan sentimental dan rasa sakit orang lain.\n" +
                "\n" +
                "    Ia adalah seorang \"dokter jiwa\" yang baik, dan ia mampu mengerti perasan yang rumit dan bingung. Ia memiliki kemampuan tersembunyi yang dapat ia gunakan untuk membuat semua hal terjadi dan membuat semua hal berjalan dengan baik. Ia tidak suka orang yang selalu meminta bantuan orang lain untuk melakukan sesuatu sebelum ia mencoba melakukannya sendiri.\n" +
                "\n" +
                "    Ia adalah tipe cowok yang sebagaian besar tujuannya tercapai dalam kehidupannya. Sekali ia menetapkan pikiran kepada sesuatu, maka ia akan menaruh semua tenaga dan kemampuannya dalam hal itu, entah hal itu hanya proyek kecil atau proyek raksasa. Mereka adalah kaum paling sukses diantara semua Zodiak.\n" +
                "\n" +
                "    Ia adalah orang yang sangat sabar dan dapat menunggu beberapa tahun untuk dapat mencapai tujuannya. Ia tidak menyukai orang yang perasaannya terlalu mudah patah. Ia tidak suka beristirahat terlalu lama, karena ia beranggapan bahwa hidup memiliki banyak pertanyaan dan jawaban yang mengunggu untuk digali.\n" +
                "\n" +
                "    Jika ia sedang jatuh cinta, loe akan menerima banyak sekali cinta darinya, terkadang bahkan terlalu banyak. Ia sangat serius mengenai cinta dan hubungan dan tidak akan mau membuang-buang waktu dengan seseorang yang tidak ia cintai, secantik apapun wanita itu. Ia sangat jarang membuat kesalahan.\n" +
                "\n" +
                "    Ia dapat mengerti dengan mudah bahwa loe memiliki pikiran buruk, dan tidak akan pernah ragu untuk mengatakannya kepada loe. Jika loe tidak suka tipe cowok tulus yang blak-blakan, maka lebih baik loe menjauh darinya. Jika loe adalah orang yang terlalu sensitif, maka usahakan jangan meminta komentar darinya. Ia akan mengatakan semuanya dengan apa adanya, dan mungkin loe tidak akan dapat menerimanya.\n" +
                "\n" +
                "    Misalnya, jika loe bertanya kepadanya apakah loe gemuk (dan memang kenyataannya gemuk), maka, dia akan berkata \"ya, sebesar balon\". Ia mengeluarkan komentar seperti itu karena ia peduli dan menyayangi loe, oleh karena itu, maka lakukanlah sesuatu kepada badan loe dan jangan marah.\n" +
                "\n" +
                "    Jika ia berkata \"kamu tampak cantik\", maka loe berhak bangga, karena ia mengatakannya secara sungguh-sungguh. Orang pada umumnya akan memiliki reaksi berbeda mengenai dirinya, sebagian membencinya, sebagaian yang lain menyukainya. Jika loe mencintai cowok ini, maka percayalah dan yakinlah dengan semua keputusan loe, jangan menjadi orang yang rapuh.\n" +
                "\n" +
                "    Ia selalu mengingat semua kemarahannya, dan akan menunggu waktu yang tepat untuk membalas dendam. Ia adalah orang yang sangat serius mengenai janji-janji, maka jangan pernah janjikan hal-hal yang tidak akan dapat loe penuhi. Ia menyukai semua temannya, dan akan melakukan apapun untuk semua teman baiknya.\n" +
                "\n" +
                "    Ia berharap agar loe dapat merawat dirinya, tetapi tidak didepan teman-temannya. Ia adalah tipe cowok yang kompleks dan loe tidak akan pernah mengerti sampai loe sendiri dapat mengenal dirinya. Ia bahagia mengetahui bahwa dia adalah orang yang kompleks.\n" +
                "\n" +
                "    Ketika ia memikirkan atau ia membutuhkan privasi, maka sebaiknya loe memberi sedikit ruang. Ia mampu mengingat banyak hal. Loe mungkin tidak sengaja telah mengatakan sesuatu yang telah loe lupakan, tetapi dia akan mengingat semua kata-kata loe itu. Ia ingin dihargai dan dikagumi, tetapi dia tidak ingin orang menguasai dia. Ketika dia jatuh cinta, dia akan jatuh cinta sangat dalam.\n" +
                "\n" +
                "    Cowok dalam zodiak ini, begitu jatuh cinta, akan Lebih manis daripada gula. Ia tidak suka wanita yang biasa dan sederhana. Wanita yang menarik dia adalah wanita yang kompleks dan unik. Selalu bisa menarik dan mampu ngobrol mengenai apapun dengan dia. Ia tidak suka wanita yang hanya duduk dan menunggu ditelepon saja.");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScorpioCowok.this, ScorpioAsmara.class));
            }
        });

//        if (getSupportActionBar() != null) {
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//            getSupportActionBar().setDisplayShowHomeEnabled(true);
//        }
    }

    void init() {
        btnBack = (Button) findViewById(R.id.cowok_btnBack);
        btnNext = (Button) findViewById(R.id.cowok_btnNext);
        txtTitleBar = (TextView) findViewById(R.id.cowok_titleBar);
        txtKarakterCowok = (TextView) findViewById(R.id.cowok_karakterCowok);
        txtKarakterCowok_isi = (TextView) findViewById(R.id.cowok_karakterCowok_isi);
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
                startActivity(new Intent(ScorpioCowok.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

