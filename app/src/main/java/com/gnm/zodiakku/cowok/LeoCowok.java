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
import com.gnm.zodiakku.asmara.LeoAsmara;

public class LeoCowok extends AppCompatActivity {
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
        txtTitleBar.setText("Pria Leo");
        txtKarakterCowok.setText("Karakter Seorang Pria Zodiak Leo");
        txtKarakterCowok_isi.setText(" Ia suka menyisir rambutnya ke belakang, mempertontonkan dahinya, menunjukkan ekspresi wajah yang .. uhuiii. Matanya bersinar, tetapi sedikit menunjukkan kemalasan. Ia berjalan dengan pelan tetapi gagah, layaknya seekor singa, percaya diri dan sombong. Penampilan luarnya menunjukkan seseorang yang baik dan lemut, tetapi dia sebenarnya adalah orang yang kuat dan percaya diri.\n" +
                "\n" +
                "    Jika ia merasa ketakutan, ia akan bereaksi dan akan merespon sesegera mungkin. Kata-katanya selalu nampak normal, tetapi selalu berisi \"perintah dan permintaan\". Ia tidak akan berbicara cepat-cepat atau memang karena tidak bisa, demikian juga dengan berjalan, tidak pernah cepat. Ditengah kerumunan atau di tempat kerja, ia akan bersikap biasa saja.\n" +
                "\n" +
                "    Tapi tidak lama kemudian loe akan dapat melihatnya menonjol di tengah kelompok dan menjadi pusat perhatian karena kepandaiannya berbicara, atau menarik perhatian. Loe akan berpikir bahwa ia sebenarnya cowok pemalu, tetapi didalam hatinya, ia ingin memiliki kendali atas keluarga dan teman-temannya. Ia hanya menunggu waktu yang pas.\n" +
                "\n" +
                "    Jangan pernah berani mengambil apapun yang dipunyainya, dan juga jangan memerintah dirinya, atau kalau tidak, loe harus siap berhadapan dengan seekor singa ganas. Ia menghormati orang-orang tua dan para senior, tetapi tidak akan pernah membungkuk-bungkuk, atau menerima apapun seperti \"looser\", karena ia lebih baik mati daripada kehilangan harga dirinya.\n" +
                "\n" +
                "    Caranya berbicara datar, walaupun dalam acara yang mengharuskan dia untuk berbicara lebih \"hidup\". Ia adalah cowok yang penuh kasih dan selalu berusaha melihat sisi positif seseorang. Walaupun pembawaan dia cukup datar dan kaku, dia dapat dengan mudah mencapai tujuannya tanpa harus menambah musuh. Begitu loe tidak setuju mengenai sesuatu dengan dirinya, dia akan marah dan ngambek secara tiba-tiba seperti hujan badai di musim panas.\n" +
                "\n" +
                "    Memang hanya sebentar, dan kemudian ia akan kembali menjadi orang yang cerah ceria. Ia tipe orang yang cerdas dan cerdik, dan dia tidak pernah mau repot-repot melakukan sesuatu yang bagi dirinya tidak ada artinya dan hanya membuang-buang tenaganya saja. Ia adalah perencana yang baik dan dapat mengatur pekerjaan yang diberikan kepadanya.\n" +
                "\n" +
                "    Jika ia memberi perintah, ia berharap agar perintahnya dapat dilakukan secepat mungkin. Ia adalah tipe pemimpin yang dicintai pengikutnya. Ia dapat memberikan nasihat dan membantu memecahkan permasalahan orang lain dengan baik, kecuali, masalah dia sendiri. Ia dapat terluka dengan mudah oleh orang lain, terutama jika loe tidak mempercayai atau tidak menghargai kemampuannya.\n" +
                "\n" +
                "    Anda dapat memujinya suatu waktu dan merubah singa garang ini menjadi seekor anak kucing dengan mudahnya. Ia bukanlah seorang hakim yang baik karena ia cenderung mendengar pendapat terlalu banyak orang dan cenderung mempercayai semua sisi. Jarang sekali seorang pria Leo berjalan sendirian tanpa ada wanita disisinya. Jika loe melihatnya sendirian, mungkin saja sebenarnya dia memendam cinta dalam hatinya, atau baru saja putus.\n" +
                "\n" +
                "    Karena kesombongannya, ia sering berganti pacar. Ia akan melakukan apapun untuk wanita yang dicintainya, tetapi tidak akan mau sampai merasa kehilangan muka. Cowok Leo tidak akan bisa hidup tanpa cinta, karena menurutnya cinta adalah berkas cahaya kehidupan. Ia suka orang bergantung padanya, hal itu membuatnya merasa memiliki kekuasaan.\n" +
                "\n" +
                "    Ia mungkin mengeluh saat dimintai pertolongan, tetapi jauh di dalam hatinya ia merasa bahagia karena loe meminta pertolongan darinya. Jika loe menawarkan bantuan, ia akan segera menolaknya. Waktu dia kehabisan uang, entah bagaimana caranya, ia masih mampu memiliki sedikit uang. Ia tidak terlalu berhati-hati dengan pengeluarannya, karena ia memang senang menghamburkan uang dan suka membeli apa yang dia mau.\n" +
                "\n" +
                "    Ia akan meminjamkan uang kepada siapapun walaupun ia sendiri kekurangan, ia akan pergi menemui teman lainnya, untuk meminjamkan uang bagi loe. Ia suka hal-hal mewah, semua barang kelas utama. Ia dapat bekerja seperti kesetanan, dan terkadang malas, semalas kucing yang ngantuk. Ketika ia bekerja, ia sangat serius. Jika sedang dalam pesta, ia adalah tukang pesta.\n" +
                "\n" +
                "    Jika ia mengajak loe keluar berkencan, loe akan mengalami saat yang menyenangkan bersamanya. Ia akan berani bertaruh mengenai kehidupan cintanya, jadi, jika loe tahu bagaimana cara mengendalikannyua, loe pasti akan menang. Jika dia adalah kekasih loe, maka kehidupan cinta loe tidak akan seromantis novel percintaan. Loe harus selalu siap untuk meredakan amarahnya.\n" +
                "\n" +
                "    Karena reaksinya yang terlalu berlebihan hanya karena masalah kecil. Ia membutuhkannya, karena stabilitas dan ketenangan loe akan mengendalikan dan memperbaiki moodnya. Jika loe tidak dapat mengerti dan mengendalikannya, maka hubungan loe tidak ubahnya seperti kapal karang, hubungan yang terus putus-sambung sampai bahkan sampai ke titik teman loe sendiri akan bosan mendengar loe berdua putus dan berbaikan kembali.\n" +
                "\n" +
                "    Kecantikan selalu menjadi perhatian kaum Leo. Loe harus mampu tampil penuh pesona untuk dapat berjalan bersama si Raja Rimba. Penampilan loe adalah sebagaian dari citra dan egonya , dan ia juga sangat bangga dengan hal ini. Jika loe ingin merebut perhatiannya di saat pertemuan pertama, sebaiknya loe berusaha nampak luar biasa menarik. Pada saat perbincangan pertama dengannya, loe harus memperlihatkan betapa loe menyukai pemikirannya. Ia suka berbicara dan tidak menyadari bahwa pusat pembicaraannya tidak lain adalah dirinya sendiri.");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LeoCowok.this, LeoAsmara.class));
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
                startActivity(new Intent(LeoCowok.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

