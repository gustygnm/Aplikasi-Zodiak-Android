package com.gnm.zodiakku.sekilas;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.gnm.zodiakku.MainActivity;
import com.gnm.zodiakku.R;
import com.gnm.zodiakku.cewek.AriesCewek;
import com.gnm.zodiakku.cewek.VirgoCewek;

public class VirgoSekilas extends AppCompatActivity {
    Button btnBack, btnNext;
    TextView tittleBar, txtKarakter, txtSifatUtama;
    ImageView imgCover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zodiak_sekilas);

        VirgoSekilas.this.setTitle("Karakter Virgo");
        //menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar toolbar = (Toolbar) findViewById(R.id.sekilas_toolbar);
        setSupportActionBar(toolbar);

        init();
        txtKarakter.setText("Virgo yang merupakan lambang dari kebijaksanaan, kebanyakan memiliki sifat pemalu dan selalu menungu untuk memberikan diri untuk para pencinta yang sempurna. Mereka adalah termasuk orang yang idealis. Planet Merkurius merupakan planet yang berkuasa untuk zodiak ini hal ini menyebabkan orang yang lahir di bawah tanda ini mempunyai pemikiran yang cepat dan jeli. Mereka memiliki intilek yang baik dan dalam semua urusan bisnis mereka memiliki penilaian yang baik serta tidak mudah untuk ditipu. ");
        txtSifatUtama.setText("Orang orang virgo memilii pemikiran analitis yang sangat canggih dan setiap saat mencoba untuk melakukan segala sesuatu yang mereka lihat mempunyai peluang untuk maju. Mereka memiliki perasaan yang tajam, pendengaran dan indra penciuman yang baik. Mereka mewarisi kemampuan yang menakjubkan untuk mengamati semua kekurangan yang ada.");
        imgCover.setImageResource(R.drawable.virgo2);
        imgCover.setBackgroundColor(Color.parseColor("#f272ad"));

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VirgoSekilas.this, VirgoCewek.class));
            }
        });

//        if (getSupportActionBar() != null) {
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//            getSupportActionBar().setDisplayShowHomeEnabled(true);
//        }
    }

    void init() {
        btnBack = (Button) findViewById(R.id.sekilas_btnBack);
        btnNext = (Button) findViewById(R.id.sekilas_btnNext);
        txtKarakter = (TextView) findViewById(R.id.sekilas_txtKarakter);
        txtSifatUtama = (TextView) findViewById(R.id.sekilas_txtSifatUtama);
        imgCover = (ImageView) findViewById(R.id.sekilas_imgCover);
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
                startActivity(new Intent(VirgoSekilas.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

