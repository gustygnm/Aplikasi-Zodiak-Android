package com.gnm.zodiakku.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.gnm.zodiakku.R;
import com.gnm.zodiakku.sekilas.AriesSekilas;
import com.gnm.zodiakku.sekilas.PiscesSekilas;

public class PiscesHome extends AppCompatActivity {
    Button btnLanjut;
    TextView titleBar, txtTglLahirZodiak, txtTglLahirZodiak_isi1, txtTglLahirZodiak_isi2, txtSifat, txtSekilas, txtJdlSekitarZodiak;
    ImageView img_Cover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zodiak_home);

        PiscesHome.this.setTitle("");
        //menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_Home);
        setSupportActionBar(toolbar);
        init();

        titleBar.setText("Pisces");
        txtTglLahirZodiak.setText("Lahir pada 20 Februari - 20 Maret");
        txtTglLahirZodiak_isi1.setText("Simbol : Ikan\nElemen : Air\nPlanet : Neptunus\nBatu : Giok/ koral\nWarna : Biru laut");
        txtTglLahirZodiak_isi2.setText("Pisces disimbolkan oleh dua ikan yang berenang berlainan arah. Simbol tersebut melambangkan karakter Pisces yang selalu bimbang dan tak mudah mengambil suatu keputusan. Namun mereka adalah orang yang sangat terbuka dan mudah menerima masukan atau kritik dari luar.");
        txtSifat.setText("Para pisces penuh pesona, humor dan sipati bila berhadapan dengan orang lain sehingga menerima banyak pertolongan dari orang lain. Pisces butuh suatu wadah untuk mengembangkan bakatnya sehingga ia merasa sangat bahagia.");
        txtJdlSekitarZodiak.setText("Sekilas tentang Pisces");
        txtSekilas.setText("Para Pisces kaum yang ekstrim, sensitif dan lain dari yang lain. Mereka ingin melakukan segala sesuatunya dengan baik tetapi hal ini sulit sekali, karena mereka juga harus selalu mendengarkan kata hati mereka tentang hal-hal yang benar & salah.\n" +
                "Para pisces penuh pesona, humor dan sipati bila berhadapan dengan orang lain sehingga menerima banyak pertolongan dari orang lain. Pisces butuh suatu wadah untuk mengembangkan bakatnya sehingga ia merasa sangat bahagia.\n" +
                "Mereka akan frustasi bila terjebak dalam rutinitas. Mereka mudah percaya janji-janji yang diberi oleh orang lain, tanpa berpikir panjang. Kaum Pisces pKamui dalam hal memainkan perasaan.\n" +
                "Mereka menjadi sangat sensitif terhadap apa yang dipikirkan dan dirasakan orang lain, dam menjadi sangat mudah marah tanpa alasan yang jelas. Ini membuat orang lain sulit menebak perasaan mereka. Kaum Pisces pKamui membujuk. Mereka senang bila pekerjaannya dihargai orang lain, bila tidak maka ia tidak akan mengerjakan tugasnya dengan benar.\n" +
                "Pisces senang pada hal-hal yang bersifat hiburan dan bersedia menjadi tuan rumah dari setiap peristiwa atau pertemuan. Mereka terlihat malu dan tertutup namun padahal tidak. Bila mereka merasa nyaman dengan sekitarnya, mereka tidak akan ragu untuk mengambil alih.\n");
        img_Cover.setImageResource(R.drawable.cover_pisces);

        btnLanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PiscesHome.this, PiscesSekilas.class));
            }
        });
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }

    @Override
    public void onBackPressed() {
        finish();
    }

    void init() {
        btnLanjut = (Button) findViewById(R.id.btnLanjut);
        titleBar = (TextView) findViewById(R.id.home_titleBar);
        txtTglLahirZodiak = (TextView) findViewById(R.id.home_txtLahirZodiak);
        txtTglLahirZodiak_isi1 = (TextView) findViewById(R.id.home_txtLahirZodiak_Isi1);
        txtTglLahirZodiak_isi2 = (TextView) findViewById(R.id.home_txtLahirZodiak_isi2);
        txtSifat = (TextView) findViewById(R.id.home_ZodiaktxtSifat);
        txtSekilas = (TextView) findViewById(R.id.home_ZodiaktxtSekilas);
        txtJdlSekitarZodiak = (TextView) findViewById(R.id.home_txtjdlSekitarZodiak);
        img_Cover = (ImageView) findViewById(R.id.home_img);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.close, menu);
//        return true;
//    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

