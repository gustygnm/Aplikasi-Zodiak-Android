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
import com.gnm.zodiakku.cowok.VirgoCowok;

public class VirgoCewek extends AppCompatActivity {
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
        txtTitleBar.setText("Wanita Virgo");
        txtKarakterCewek.setText("Karakter Seorang Wanita Zodiak Virgo");
        txtKarakterCewek_isi.setText("Penampilannya mirip dengan wanita Leo, wanita langsing yang mampu bergerak dengan penuh percaya diri dan kebanggaan. Wajahnya memiliki struktur layaknya telur, dengan dahi yang tinggi dan bundar. Ia suka memandang langsung ke arah kita, seperti sedang menyelidiki sesuatu. Ia bukan tipe yang suka berpura-pura dan selalu mengatakan apa yang ia pikirkan secara terbuka.\n" +
                "\n" +
                "Anda akan melihat wanita dalam zodiak ini berjalan cepat. Ia akan selalu berusaha mencoba kemampuan terbaiknya untuk menjadi sempurnya, tampak dan merasa sempurna, walaupun sebenarnya kesempurnaan macam itu tidak pernah ada. Ia sangat berhati-hati dalam memilih pakaian.\n" +
                "\n" +
                "Ia cerdas dan mudah putus asa menghadapi rintangan. Ia suka cowok cerdas yang mampu mengimbanginya, jadi jika anda adalah tipe cowok kaya yang agak bego, lebih baik segera lupakan dia. Ia bukan orang yang posesif atau cemburuan, karena ia mengharapkan penghormatan dari orang yang dikasihinya. Ia tidak menyukai hubungan yang sifatnya sementara.\n" +
                "\n" +
                "Jika ia menemukan cowok impiannya, ia tidak akan pernah meninggalkannya. Jika ia tidak menyukai anda, maka ia akan berusaha menjaga jarak. Dia berusaha berdisiplin untuk berusaha bertindak wajar dan layak. Ia tidak suka dan tidak akan tahan bahasa kotor, dan sumpah serapah.\n" +
                "\n" +
                "Ia menyukai pria yang gentlemen, yang akan membukakan pintu untuknya, Ia ingin merasa dilindungi dan ketika seorang pria mengambil tugas ini, ia merasa sudah menjadi wanita yang sepenuhnya. Ia mengingat segala sesuatu mengenai orang lain dan mengenai dirinya dengan amat baik. Dia benar-benar mampu menjaga rahasia, anda dapat mempercayai dia mengenai hal ini.\n" +
                "\n" +
                "Ia suka bau yang menyebarkan dan ringan. Ia juga sangat halus dalam menjaga kecantikan dirinya, maka anda akan dapat melihat ia sedang sangat serius memilih sabun yang akan cocok dengan kondisi kulitnya. Jangan pernah mengomentari kebiasaannya yang pemilih, karena hal ini adalah kebahagiannya, menjadi ahli kencantikan bagi dirinya sendiri.\n" +
                "\n" +
                "Ia bukanlah malaikat tanpa cela, karena terkadang ia akan sangat keras, bagaikan baja. Walaupun ia cukup mudah putus asa, ia tidak akan pernah menangis karenanya. Dia adalah tipe pemalu, maka jika ia harus berbicara didepan umum, maka dia akan sangat gugup, walaupun ia dapat berjalan dan berbicara dengan penuh percaya diri.\n" +
                "\n" +
                "Ia hanya mencari cinta sejati, bukan hanya sekedar cinta. Model cinta yang diinginkannya adalah model ideal. Ia suka beranggapan bahwa tidak ada orang yang lebih rapi dan efektif daripada dirinya, yang sebenarnya malah terkadang membuat anda jengkel, karena sebenarnya tidak ada hal seperti itu.\n" +
                "\n" +
                "Ia menyukai kata-kata manis, tetapi terkadang ia dapat kelepasan bicara dan mengatakan sesuatu yang tidak anda perkirakan, bahkan tidak dapat anda terima. Ketika ia sudah berhenti marah, ia akan benar-benar lupa apa yang baru saja dikatakannya, dan kembali menjadi sesosok malaikat. Jika anda berkencan dengannya, lebih baik anda datang tepat waktu.\n" +
                "\n" +
                "Bunga dan rayuan manis akan dapat membuat dia merasa tenang. Jika anda ingin meminta maaf, lakukanlah secara langsung dan tidak berbelit-belit. Jangan membuat permintaan anda bertele-tele dan membosankan, sampai akhirnya kencan anda menjadi acara berbaikan, hal ini dapat menyeret anda ke perang dunia berikutnya.\n" +
                "\n" +
                "Ia suka melihat cowoknya tampil rapi dan bersih. Ia sangat mendetil, terutama mengenai uang. Jangan membuatnya berpikir bahwa dia lucu atau melawak seperti badut. Pada saat perkenalan pertama dengannya, jangan banyak melirik wanita lainnya. Pada awal berpacaran, jangan terlalu sering memeluk dia dipedan umum, karena hal itu dirasanya kurang baik.\n" +
                "\n" +
                "Ia menyukai buku, drama panggung, dan musik, dan juga suka mengkritik penampilan mereka. Kritikus wanita adalah ikon bagi dia, termasuk juga hal-hal kecil dan besar dalam kehidupan, misalnya rambut, baju, dan cara jalan anda. Jika anda jatuh cinta padanya, usahakanlah menjadi sesempurna mungkin. ");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VirgoCewek.this, VirgoCowok.class));
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
                startActivity(new Intent(VirgoCewek.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

