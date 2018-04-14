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
import com.gnm.zodiakku.cowok.CapricornCowok;

public class CapricornCewek extends AppCompatActivity {
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
        txtTitleBar.setText("Wanita Capricorn");
        txtKarakterCewek.setText("Karakter Seorang Wanita Zodiak Capricorn");
        txtKarakterCewek_isi.setText("Wanita yang jangkung, langsing, dan tenang. Begitu marah, ia akan sangat galak. Ia akan dapat bekerja dengan lebih baik daripada beberapa pria, dan dia adalah wanita yang sangat percaya diri. Menurut pendapatnya, wanita bukanlah sekedar bunga untuk penghias rumah atau kantor dan jelas bukan gender yang lemah yang membutuhkan pertolongan saja.\n" +
                "\n" +
                "Ia suka mengendalikan dan menyembunyikan emosi di yang lemah. Ia tidak akan pernah mencoba untuk mengubah siapapun, dan ia akan berusaha menerima mereka apa adanya. Jika ia tidak menyukai seseorang, maka ia tidak akan akan mengkritik atau memberi komentar, ia akan sama sekali tidak memperdulikan orang itu.\n" +
                "\n" +
                "Ia benci bunga plastik dan bunga buatan karena hal itu terkan tidak tulus. Ia menyukai bunga hidup dan baunya. Ia juga menyukai cowok yang memakai pewangi after shave. Jika anda adalah tipe orang yang akan memakai Jeans anda sampai sebulan, baru kemudian mencucinya, atau orang yang memakai sepatu lama, lebih baik anda melupakannya.\n" +
                "\n" +
                "Ia mencintai musik dan alam, walaupun terkadang muncul juga kasus langka, (tidak menyukainya). Ia suka berpiknik di alam bebas, maka, jika anda tidak punya banyak waktu untuknya, anda lebih baik mengajaknya dalam perjalanan memancing. Dia tidak sepencemburu wanita Leo atau Aquarius, tetapi jangan pernah melintasi batas.\n" +
                "\n" +
                "Lebih baik anda tidak melihat dia marah, terutama didepan publik dimana dia dapat merasa dipermalukan secara umum. Ia suka berdandan dan memakai baju dengan sempurna dan sangat rapi, maka jangan pernah memaksa dia cepat-cepat melakukan hal ini. Ia memiliki tujuan sendiri dalam hidupnya, dan tidak perduli apakah anda memiliki gelar doktor atau tidak, jika ia menanggap anda tidak cerdas, maka dia tidak akan peduli tentang anda sama sekali.\n" +
                "\n" +
                "Ia suka bertemu dengan karakter orang cerdas, bukan karena sertifikat yang menyatakan bahwa ia cerdas. Jika memang anda tidak mampu menunjukkan bahwa anda cerdas, lebih baik anda segera menyingkir pergi. Ia tidak pernah menyukai pemimpi yang membicarakan mengenai mimpinya, tetapi tidak pernah berusaha mewujudkan mimpinya.\n" +
                "\n" +
                "Jangan pernah mengatakan kepadanya \"semua orang melakukannya, maka kamu sebaiknya juga\", atau \"rasanya lebih baik kamu lakukan, karena itu baik buat kamu\", karena ia hanya akan mau melakukan apa yang ia mau lakukan. Ia adalah orang yang rapi, jadi jika kamar anda mirip kandang babi, jangan pernah ajak dia masuk kedalam kamar anda.\n" +
                "\n" +
                "Jika anda pergi kencan, cobalah tampil serapi dan sebersih mungkin, kuku juga bersih, atau kalau tidak, kencan itu akan menjadi kencan terakhir anda. Ia adalah tipe cewek yang 'cool' dan tidak akan merengek-rengek, begitu menyenangkan di telinga anda. Ia adalah tipe yang pelan tapi pasti. Ia akan selalu menghormati dan menghargai anda dan tidak akan pernah membuat anda malu.\n" +
                "\n" +
                "Jika ia mencintai anda, ia akan selalu membantu anda melakukan apapun yang anda lakukan. Ia suka membantu orang tanpa pamrih. Jika ia meminta anda melakukan sesuatu, dan anda tidak membantu, maka ia akan merasa sangat kecewa. Ia memiliki harapan yang tinggi dan percaya diri yang tinggi, ia lebih mempercayai kemampuan diri dan kepercayaan dirinya daripada \"keberuntungan.\"\n" +
                "\n" +
                "Jika istri anda adalah capricornus, maka anda akan memiliki rumah yang indah dan nyaman, dan makanan yang enak. Jika orang tua anda mengunjungi rumah anda, mereka akan merasa puas. Ia adalah seorang 3 in 1, ibu, istri, dan wanita rumah tangga sempurna, dan anda pun dapat mengatakan \"bahagia selamanya.\" ");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CapricornCewek.this, CapricornCowok.class));
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
                startActivity(new Intent(CapricornCewek.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

