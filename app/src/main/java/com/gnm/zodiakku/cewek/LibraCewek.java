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
import com.gnm.zodiakku.cowok.LibraCowok;

public class LibraCewek extends AppCompatActivity {
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
        txtTitleBar.setText("Wanita Libra");
        txtKarakterCewek.setText("Karakter Seorang Wanita Zodiak Libra");
        txtKarakterCewek_isi.setText("Umumnya wanita Libra memiliki bentuk wajah oval. Ia memiliki kulit yang bagus dan indah, dengan bentuk tubuh indah. Ia akan menghabiskan banyak tenaga utnuk menjaga agar kulitnya tetap mulus dan indah. Ia mudah alergi kosmetik dan make up, tetapi menjaga wajah dan berusaha untuk menghindari kerut wajah adalah hobinya.\n" +
                "\n" +
                "Ia memang pandai dalam hal itu, sehingga cenderung nampak muda dari umur yang sesungguhnya. Ia dapat menjadi sangat nakal, layaknya anak kecil, tetapi sebenarnya benar-benar 100% wanita. Ia tetap nampak manis baik dalam balutan jeans maupun baju malam. Ia beranggapan bahwa lelaki sama dengan perempuan.\n" +
                "\n" +
                "Terkadang ia dapat berpikir lebih cepat daripada anda, tetapi ia tidak akan meninggalkan anda jauh-jauh. Ia akan berusaha membuat anda merasa bahwa anda tidak tersaingi atau dikalahkan dalam tiap permainan yang anda mainkan dengan dirinya, walaupun ia menang. Ia sangat perayu, bahkan pada saat dia tidak mengerti apa yang dia maui.\n" +
                "\n" +
                "Ia tidak dapat memutuskan apa yang ingin dilakukannya, dan apa yang sebaiknya tidak dilakukannya, dia juga tidak mampu mengatur jadwal dengan baik, dalam kasus apapun. Ia berbakat dalam memilih pakaian, dan juga masalah memadankan pakaiannya. Ia suka sekali berpakaian warna hitam dan mengenakan parfum. Ia menyukai bau bunga yang ringan. Jika sedang bertengkar, ia benar-benar hebat.\n" +
                "\n" +
                "Ia dapat bertengkar dan berdebat selama berjam-jam, dan seringkali memenangkannya. Jika hal ini bukanlah pertengkaran yang serius, ia terkadang akan ikut bertengkar, atau terkadang hanya akan tersenyum saja. Ia akan menjadi politisi yang hebat, karena ia akan selalu dapat mengetahui, partai mana yang akan memenangkan pemilihan.\n" +
                "\n" +
                "Ia selalu memiliki alasan yang baik, bahkan ia suka untuk menentang dirinya sendiri. Ia tidak dapat menentukan mana yang benar ataupun salah bagi dirinya, karena segalanya memiliki sisi baik dan buruk. Wanita dalam zodiak lain mungkin tidak terlalu peduli dengan apa yang dipikirkan orang lain.\n" +
                "\n" +
                "Tetapi wanita Libra mendengar dan peduli apa yang dikatakan orang mengenai mereka, atau apa yang anda rasakan, sebanyak apa yang ia peduli mengenai perasaanya sendiri. Ia dapat menyesuakian diri dengan baik dalam lingkungannya, maka di pekerjaanya, ia seringkali dapat menanjak dengan cepat. Ia suka bekerja dalam tim dalam melakukan banyak hal.\n" +
                "\n" +
                "Jika anda meminta bantuan atau nasihat dari dia, dia akan dengan sukarela memberi bantuan, kecuali jika ia tidak menyukai anda. Ia dapat mengubah anda bahkan tanpa anda sadar bahwa anda berubah karena pengaruh dari dirinya. Sisi baik berpacaran dengan orang Libra adalah bahwa ia tidak akan bernah ikut campur dengan privasi anda.\n" +
                "\n" +
                "Ia tidak akan pernah membuat anda kehilangan muka didepan teman-teman anda. Walaupun ia orang yang peduli mengenai jumlah uang yang tertinggal di rekeningnya, ia tidak akan pernah lupa untuk selalu mengingatkan anda bahwa ia menyayangi anda.\n" +
                "\n" +
                "Ia beranggapan bahwa pekerjaan rumah adalah pekerjaan kaum wanita dan mereka dapat melakukannya dengan baik. Tapi jika anda berharap bahwa cewek Libra akan merasa takut kepada anda, maka anda salah total. Mereka adalah wanita kuat, walaupun dia memandang anda dengan mata yang manis dengan pandangan bagaikan bayi, dan bahkan terkadang kalah dalam permainan kartu.\n" +
                "\n" +
                "Jika anda mengejarnya, maka lakukanlah secara bertahap. Cara terbaik adalah dengan menggunakan temannya sebagai cara untuk memperkenalkan diri anda. Anda harus maju ke arah dia dengan keyakinan dan perasaan aman sepenuhnya. tunjukkan bahwa ia baik, ramah, dan seorang \"gentlemen\". Jangan terlalu cepat mengajak tangan anda \"berjalan-jalan\", kalau tidak, siaplah menerima tamparan darinya!! ");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LibraCewek.this, LibraCowok.class));
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
                startActivity(new Intent(LibraCewek.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

