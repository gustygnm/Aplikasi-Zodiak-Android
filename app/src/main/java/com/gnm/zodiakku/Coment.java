package com.gnm.zodiakku;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Coment extends AppCompatActivity {
    Button btnKomen;
    EditText txtEmailTujuan, txtEmailSubject, txtEmailIsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_coment);

        //menerapkan tool bar sesuai id toolbar | ToolBarAtas adalah variabel buatan sndiri
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_Coment);
        setSupportActionBar(toolbar);

        txtEmailTujuan = (EditText) findViewById(R.id.txtEmailTujuanMasukan1);
        txtEmailSubject = (EditText) findViewById(R.id.txtEmailSubjectMasukan1);
        txtEmailIsi = (EditText) findViewById(R.id.txtEmailIsiMasukan1);
        btnKomen = (Button) findViewById(R.id.btnComent);

        btnKomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kirimEmail();
            }
        });


//        if (getSupportActionBar() != null) {
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//            getSupportActionBar().setDisplayShowHomeEnabled(true);
//        }
    }

    void kirimEmail() {
        String emailTujuan = txtEmailTujuan.getText().toString();
        String emailSubject = "ZodiakKu (Kritik / Saran) from : " + txtEmailSubject.getText().toString();
        String emailIsi = txtEmailIsi.getText().toString();

        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL, new String[]{emailTujuan});
        i.putExtra(Intent.EXTRA_SUBJECT, emailSubject);
        i.putExtra(Intent.EXTRA_TEXT, emailIsi);
        try {
            startActivity(Intent.createChooser(i, "Kirim Email Dengan"));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(this, "Terdapat masalah", Toast.LENGTH_SHORT).show();
        }
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
                startActivity(new Intent(Coment.this, MainActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

