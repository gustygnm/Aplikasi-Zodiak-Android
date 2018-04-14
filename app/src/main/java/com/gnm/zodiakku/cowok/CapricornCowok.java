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
import com.gnm.zodiakku.asmara.CapricornAsmara;

public class CapricornCowok extends AppCompatActivity {
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
        txtTitleBar.setText("Pria Capricorn");
        txtKarakterCowok.setText("Karakter Seorang Pria Zodiak Capricorn");
        txtKarakterCowok_isi.setText("Para cowok dalam zodiak ini biasanya memiliki tatapan mata yang tajam dan dalam dengan garis rahang yang menarik artinya tidak terlalu keras dan tidak terlalu lembut pokoknya menarik deh. Tinggi mereka biasanya proporsional dengan beratnya. Ia berjalan tegas dan selalu berjalan dengan langkah panjang dan mantap.Ketika berjalan mereka akan melihat sekeliling tanpa terganggu dengan segala permasalahannya. Ia suka memperhatikan apa saja yang terjadi dan apa yang aneh serta bagaimana itu bisa terjadi.Maka terkadang loe akan menemukan dia sedang melihat suatu bangunan sedang dikerjakan, dan ia tidak akan merasa bosan.\n" +
                "\n" +
                "    Ia adalah seorang pendengar yang baik dan juga paling jago dari semua zodiak yang ada dalam hal memberi masukan atau saran apabila loe curhat kepada mereka. Saran yang mereka berikan biasanya sangat logis dan tidak memihak. Artinya tidak memihak apabila loe salah, bagi mereka tetap salah .Mereka ngga akan menyokong loe untuk kesalahan yang loe buat tapi akan memberikan solusi bagaimana loe seharusnya bertindak. Apabila loe benar mereka akan menyokong loe 100 %.\n" +
                "\n" +
                "    Ia dapat menebak apa yang ingin loe katakan bahkan sebelum loe ungkapkan. Dan mereka biasanya akan segera mengulurkan tangannya tanpa diminta untuk membantu loe apabila loe dalam kesulitan. Tapi ..... itu berlaku bagi orang yang menurut mereka memang wajib mendapatkan pertolongan. Bagi orang yang menurut mereka tidak harus dibantu maka mereka akan menjadi pendengar yang baik dan paling memberikan saran atau jalan keluar. Sekedar saran gitu lho. Hal ini disebabkan karena planet yang menaungi mereka adalah Planet Saturnus dimana planet ini lebih mempengaruhi sifat seseorang dalam hal keadilan, kekuatan fisik serta keduniawian.\n" +
                "\n" +
                "    Mereka sangat dermawan selalu berusaha membantu orang yang hidupnya kurang beruntung dari pada mereka. Ini sekali lagi pengaruh Planet Saturnus dalam hal keduniawian. Pokoknya sifat mereka layaknya seperti satria atau pahlawan. Mereka tidak pernah sirik dengan kehebatan orang lain, yang mereka pikirkan bagaimana mereka bisa lebih baik dari hari kemarin.Anda kenal Sir Alex Ferguson ? Pelatih Manchester United yang sukses melatih timnya menjadi kesebelasan tersohor yang pernah ada di jagad bumi. Dia adalah tipe seorang Capricorn yang selalu berpikir bagaimana besok harus lebih baik dari hari ini.\n" +
                "\n" +
                "    Dia pandai berdansa. Dia juga orang yang cukup berhati-hati dengan insting, jadi walaupun sedang hot di lantai dansa, ia selalu tahu apa yang ada di depan atau di belakangnya, sebelum ia mulai melangkah.\n" +
                "\n" +
                "    leo tidak dapat melihat ke wajahnya apabila mereka ada masalah atau tidak karena mereka biasanya memendamnya untuk dirinya sendiri tidak buat konsumsi orang lain dan mereka akan berusaha mengatasinya sendiri. Ironinya dia bisa dijadikan teman yang baik untuk curhat tetapi sangat sulit untuk memaksa mereka curhat ama loe terhadap masalah yang mereka alami. Kecuali loe sudah dia anggap sangat dekat dan dapat dipercaya sajalah baru mereka dapat mengungkapkan perasaan mereka. Tapi itu pun tidak menjamin mereka akan menceritakan seluruhnya ama loe.\n" +
                "\n" +
                "    Hijau adalah warna favoritnya. Loe akan cenderung melihatnya menggunakan warna hijau, biru, atau hitam . Dan mereka sangat menyukai hal-hal yang berbau seni atau unik. Pokonya mereka adalah orang yang eksentrik dan loe pasti tertarik ama mereka.\n" +
                "\n" +
                "    Mereka sangat beruntung karena tidak harus sering mengejar wanita.Karena sifatnya yang ksatria maka wanita akan cepat berpaling ke mereka tanpa mereka harus mengejarnya. Tapi hal itu tidak terjadi pada saat perkenalan pertama karena mereka tidak mempunyai tarik yang kuat seperti pria Gemini yang dapat membuat wanita bertekuk lutut pada perkenalan pertama.\n" +
                "\n" +
                "    Mereka lebih suka mengundang tamu ke rumahnya daripada mengunjungi rumah temannya. Ia tidak suka menjadi pusat perhatian, maka jika loe membutuhkan bantuannya,loe harus mencarinya. Hidupnya sederhana dan stabil. Tiap keputusan yang dibuat selalu telah di\"yakin\"i dan telah dipikirkan secara hati- hati. Ia tidak akan mau melakukan apa yang diminta jika ia tidak tertarik.\n" +
                "\n" +
                "    Mereka akan tampak melakukan segala sesuatu tanpa antusiasme, tetapi sebenarnya ia sangat serius dalam melakukan segala sesuatu. Ia menyukai lingkungan yang tenang dan damai, maka dalam waktu-waktu senggangnya, ia akan lebih memilih tinggal dirumah, daripada keluar rumah dan berpetualang.\n" +
                "\n" +
                "    Ia mencintai alam dan keluarganya, memimpikan rumah yang indah dan tenang dengan banyak pohon, atau ia malah memimpikan rumah di daerah pinggiran yang indah. Ia akan memberikan loe kebebasan dan hanya memandangi dari jauh. Jika loe melakukan sesuatu secara berlebihan, loe dapat segera menyadari dari sinar matanya yang sedingin es.\n" +
                "\n" +
                "    Ia adalah kekasih sempurna dari semua Zodiak yang ada. Mereka akan sangat memanjakan loe dengan hal-hal romantis dan hadiah -hadiah yang exclusive karena mereka tidak menyukai barang murahan. Mereka lebih suka membeli suatu barang yang langsung mahal tapi tahan lama dari pada barang murah yang beberapa bulan udah hancur dan dapat diganti dengan model baru . Walaupun barang itu sudah kuno dan ketinggalan jaman(tapi jangan sampai yang kuno banget atau purba mereka juga enggan )mereka tetap akan memakainya.\n" +
                "\n" +
                "    Ia akan melakukan apapun bagi orang yang dicintainya tanpa imbalan sama sekali. Ia tidak akan mengijinkan orang untuk menertawainya atau berpikir bahwa ia adalah seorang pelawak, maka ia akan menghabiskan uangnya untuk kemewahan yang semampunya. Ia suka wanita yang rapi dan berpakaian bagus, jadi jangan tampil dengan dandanan seadanya jika loe berpacaran ama mereka.\n" +
                "\n" +
                "    Yang paling negative dari sifat mereka adalah mereka kadang cepat putus asa atau tidak PD atau lebih tepatnya sering minder. Jadi sebagai pasangannya loe harus bisa meyakinkan mereka dengan kemampuan dan kehebatan para pria Capricorn ini.Karena mereka sebenarnya memang istimewa.\n" +
                "\n" +
                "    Selain itu jangan sekali pun menyakiti hatinya apalagi kalau mereka sudah menganggap loe adalah belahan jiwa mereka , maka sakit itu akan membekas dalam di hatinya dan akan sulit untuk dihapuskan. Karena cinta itu menurut mereka sangat sakral dan indah jangan dinodai, sekali loe menodai cinta mereka maka loe akan hidup di neraka. Apalagi kalau loe selingkuh, seumur hidup akan membekas dihati mereka walaupun mereka dapat menerima loe dalam hidupnya tapi cintanya tidak sedalam sebelumnya.\n" +
                "\n" +
                "    Dan seandainya loe putus ama mereka , hanya merekalah dari ke 12 zodiak yang masih berharap loe dapat hidup bahagia dengan pasangan baru loe. Romantis kan ?\n" +
                "\n" +
                "    Makanya loe harus berusaha mengerti mereka dan menaklukan hatinya sehingga loe akan menjadi orang yang paling berbahagia dan beruntung karena mempunyai kekasih seorang Capricorn. Karena semua cerita cinta sejati itu ada pada mereka.\n");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CapricornCowok.this, CapricornAsmara.class));
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
                startActivity(new Intent(CapricornCowok.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

