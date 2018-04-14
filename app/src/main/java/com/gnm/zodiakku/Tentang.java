package com.gnm.zodiakku;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


public class Tentang extends AppCompatActivity {

    AlertDialog.Builder alertDialogBuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tentang);

        Tentang.this.setTitle("Tentang");

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_satu_Tentang);
        setSupportActionBar(toolbar);
        alertDialogBuilder = new AlertDialog.Builder(this);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public void onBackPressed() {
        finish();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            case R.id.action_aboutme:
                Intent i = new Intent(Tentang.this, TentangDeveloper.class);
                startActivity(i);
                return true;
            case R.id.action_restartapps:
                alertDialogBuilder.setTitle("Restart Apps");
                alertDialogBuilder
                        .setMessage("Anda akan melakukan Restart Apps!\nTekan 'YA' untuk melanjutkan.")

                        .setCancelable(false)
                        .setPositiveButton("Ya",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogInterface, int id) {
                                        Intent i = new Intent(Tentang.this, SplashActivity.class);
                                        startActivity(i);
                                    }
                                })
                        .setNegativeButton("Tidak",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogInterface, int id) {
                                        dialogInterface.cancel();
                                    }
                                }).create().show();
        }

        return super.onOptionsItemSelected(item);
    }
}