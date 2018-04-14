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
import com.gnm.zodiakku.sekilas.LibraSekilas;

public class LibraHome extends AppCompatActivity {
    Button btnLanjut;
    TextView titleBar, txtTglLahirZodiak, txtTglLahirZodiak_isi1, txtTglLahirZodiak_isi2, txtSifat, txtSekilas, txtJdlSekitarZodiak;
    ImageView img_Cover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zodiak_home);

        LibraHome.this.setTitle("");
        //menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_Home);
        setSupportActionBar(toolbar);
        init();

        titleBar.setText("Libra");
        txtTglLahirZodiak.setText("Lahir pada 24 September - 22 Oktober");
        txtTglLahirZodiak_isi1.setText("Simbol : Timbangan\n" +
                "Elemen : udara\n" +
                "Planet : Venus\n" +
                "Batu : berlian\n" +
                "Mineral : tembaga\n" +
                "Warna : Hijau");
        txtTglLahirZodiak_isi2.setText("Timbangan adalah simbol dari Libra, alat yang digunakan untuk mengukur berat suatu benda. Dipercaya bahwa simbol ini merupakan lambang dari keseimbangan, keharmonisan dan keadilan. Mereka adalah sosok yang cinta damai dan hidup dalam lingkungan yang stabil.");
        txtSifat.setText("penuh gairah, posesif, fokus, sangat menggebu-gebu, memiliki rasa ingin tahu yang besar");
        txtJdlSekitarZodiak.setText("Sekilas tentang Libra");
        txtSekilas.setText("Libra dikenal sebagai pribadi yang tidak malas, mereka bekerja keras dan selalu menuntut bahwa mitra / rekan kerja nya juga pekerja keras. Kamu memiliki rasa keadilan yang kuat serta fair play. Libra merupakan orang yang sangat positif dan menentukan dalam semua pikiran dan tindakan mereka. Merka memiliki pandangan yang jauh kedepan dengan intuisi dan biasanya menghasilkan hal terbaik untuk mereka.\nSifat positif yang dimilki zodiak libra adalah kamu pintar untuk menentukan dalam semua pikiran dan tindakan. Dengan pandangan yang jauh kedepan membuat kamu selalu memikirkan hal hal yang akan terjadi. Baik hati dan penuh kasih sayang serta menikmati berbicara dengan orang, namun juga menjadi pendengar yang sangat penuh perhatian. Sedangkan sifat buruk / sifat negatif dari zodiak libra adalah mudah dipengaruhi dan tidak suka rutinitas. Sangat senstif terhadap kebutuhan orang lain.");
        img_Cover.setImageResource(R.drawable.cover_libra);

        btnLanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LibraHome.this, LibraSekilas.class));
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

