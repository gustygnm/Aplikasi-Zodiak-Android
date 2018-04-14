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
import com.gnm.zodiakku.asmara.AquariusAsmara;
import com.gnm.zodiakku.asmara.AriesAsmara;

public class AquariusCowok extends AppCompatActivity {
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
        txtTitleBar.setText("Pria Aquarius");
        txtKarakterCowok.setText("Karakter Seorang Pria Zodiak Aquarius");
        txtKarakterCowok_isi.setText(" Pria Aquarius berdarah panas , suka melakukan apapun sesuai keinginannya. Ia dapat tiba-tiba memutuskan melakukan sesuatu tanpa memikirkan hasil akhirnya. Ia adalah tipe cowok dengan \"peningkat energi\" dalam dirinya, jadi jika loe jatuh cinta pada cowok tipe ini, sebaiknya loe banyak \"bersabar\", dan harus mengikutinya kemana-mana.\n" +
                "\n" +
                "    Otak kreatifnya dapat menghasilkan ide fantastik kapanpun. Jika loe tidak mengerti atau tidak dapat mengikutinya, loe tidak akan dapat bersama mereka dalam waktu lama. Pria dalam zodiak ini cenderung pucat, dan jika memiliki bekas luka, maka bekas lukanya akan berada entah di wajah atau di kepala. Ia bergerak sangat cepat dan sangat enerjik, dan dia memiliki kepercayaan diri yang sangat kuat dalam dirinya.\n" +
                "\n" +
                "    Ia bukan tipe yang akan duduk dan menyesali sesuatu dalam jangka waktu lama, terutama dengan \"Cinta\". Ia suka keadilan. Ia akan dengan berani mengemukakan pendapatnya atau bahkan berdebat mengenai subyek tertentu bahkan ketika dia tahu bahwa hal itu akan membawa masalah. Mereka adalah tipe cowok yang blak-blakan dan akan sangat jarang berbohong, bahkan pada saat mereka perlu berbohong, mereka tidak dapat melakukannya dengan baik, karena mereka bukan tipe seorang pembohong.\n" +
                "\n" +
                "    Mereka tidak akan berbohong kepada loe mengenai masalah serius, tetapi jika berbohong, maka bohongnya juga hanya mengenai hal kecil. Dan jangan tanya ama mereka mengenai penampilan loe atau pilihan baju yang cocok buat loe, karena bagi mereka itu bukan suatu persoalan yang harus terlalu dipikirkan. So loe harus bisa berdandan sendiri dengan baik karena kalau loe dandan jelek maka mereka tidak dapat berbohong untuk mengatakan loe cantik.\n" +
                "\n" +
                "    Mereka ditakdirkan menjadi orang yang sosial karena pada dasarnya mereka memang orang yang baik, manis dan sopan. Mereka sama sekali bukan orang yang kejam. Mereka suka membantu orang yang berada dalam kesulitan bahkan tanpa diminta sama sekali. Persis seperti cowok Capricorn terutama yang lahir di bulan Januari yang masih di pengaruhi oleh Capricorn.\n" +
                "\n" +
                "    Mereka adalah orang yang akan mempertaruhkan semuanya dalam perjudian di kasino, jadi jangan pernah membawa mereka kesana. Mereka tidak suka orang pesimis, dengan niat rendah, dan orang yang mudah depresi, terutama, orang tanpa otak. Jeleknya mereka suka merendahkan orang seperti itu untuk menyatakan bahwa mereka lebih superior.\n" +
                "\n" +
                "    Mereka berpikiran positif terhadap semua hal dan melihat kehidupan duniawipun secara positif. Seringkali mereka akan tersakiti oleh realitas atau kenyataan yang ada, tetapi mereka tidak akan melarikan diri dan akan mengatasi kesulitan itu. Dan karena mereka selalu berpikiran positif maka kadang-kadang mereka sering melakukan hal-hal yang mungkin akan menjebak mereka dan walaupun loe udah kasih masukan sekalipun kalau mereka menganggap pemikiran mereka benar maka saran loe akan jadi angin lalu dan mereka tetap akan melakukan apa yang menurut mereka benar.\n" +
                "\n" +
                "    Perasaan mereka kadang bisa sensitif dan mereka akan menyesal jika ingat hal-hal buruk yang pernah diucapkannya terhadap loe , padahal loe sama sekali tidak ingat lagi atau telah melupakannya. Dan loe emang harus sabar menghadapi cowok ini karena suatu saat mereka akan mengulanginya lagi dan terus menyesal lagi dan memohon maaf ama loe. Yang jelas pada saat mereka sadar percayalah bahwa mereka benar-benar menyesal dari hati mereka yang dalam terhadap apa yang mereka lakukan , dan itu bukan sekedar sandiwara belaka. So kalau loe emang punya cowok berzodiak Aquarius maka loe harus lebih sabar dalam menghadapi mereka dan selalu ingatin mereka untuk tidak menyakiti loe lagi.\n" +
                "\n" +
                "    Cowok Aquarius gampang ditebak hatinya apabila mereka tertarik dengan lawan jenisnya, semua terpancar dari pancaran cahaya dimatanya , terutama pada saat ia menemui targetnya. Begitu jatuh cinta, mereka akan bertingkah bagaikan tidak pernah jatuh cinta sebelumnya. Anehnya mereka dapat jatuh cinta lagi dengan cewek lain dan bertingkah seakan-akan belum pernah merasakan cinta sebelumnya. Tetapi mereka dapat benar- benar mencintai seseorang apabila mereka sudah menjatuhkan pilihan. Maka mereka akan mengejar loe mati-matian dan berusaha membuat loe jatuh cinta ama mereka walaupun udah loe tolak beberapa kali. Mereka akan tetap maju pantang menyerah dan akan membuat loe jatuh cinta ama mereka. Karena patah hati bukan tipe cowok Aquarius, mereka menganut paham bahwa cinta adalah \"semangat\" dan \"Cinta harus terus dikejar.\" Dan apabila loe emang suka dengan cowok tipe ini, jangan pernah atau hindari menemui mereka dalam wajah bermasker, selalu usahakan tampil manis dan menyenangkan. Atau loe akan keluar dari target incaran mereka.\n" +
                "\n" +
                "    Bagaimana cara mengetahui apakah mereka benar-benar mencintai loe ?\n" +
                "    Pertaruhkan cinta dan perasaan loe ! Cintailah dia dan perlakukanlah dia sebaik mungkin, usahakan menghindari pertengkaran, dan dia akan selalu ada disisi loe selamanya. Jika loe adalah kekasihnya, dan perlu memberitahu sesuatu kepadanya, maka jalan terbaik adalah mengatakannya dengan terbuka dan langsung, karena ia benci cerita bertele-tele. Mereka menyukai wanita yang penuh percaya diri sekaligus pengikut setia. Jika mereka marah , biarkan dirinya sendiri sebentar, sampai kondisinya menjadi normal kembali. Dan tambahan lagi kalu loe emang menyukai cowok ini loe juga harus bisa menyukai dan mampu bersama dengan teman-temannya, tetapi bukan berarti bahwa mereka juga harus menyukai semua teman-teman loe. Jangan pernah berpikir bahwa loe dapat menyebabkannya cemburu karena loe bermain mata dengan orang lain, karena mereka lebih cenderung untuk segera pergi daripada marah-marah membuat keributan, karena mereka adalah orang yang percaya diri dan harus menjadi yang pertama dalam segala hal.\n" +
                "    Tetapi kalau loe dapat menjinakan semua sifat mereka maka mereka akan menjadi anak manis yang setia di samping loe.");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AquariusCowok.this, AquariusAsmara.class));
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
                startActivity(new Intent(AquariusCowok.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

