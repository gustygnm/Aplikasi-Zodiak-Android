package com.gnm.zodiakku;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.gnm.zodiakku.adapterBantuanMasukan.PagerAdapter;

public class BantuanMasukan extends AppCompatActivity {

    private TabLayout tabLayout;
    AlertDialog.Builder alertDialogBuilder;

//    Button btnBantuan;
//    EditText txtEmailTujuan, txtEmailSubject, txtEmailIsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bantuan_masukan);

        BantuanMasukan.this.setTitle("Bantuan & Masukan");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_satu_bantuanDanMasukan);
        setSupportActionBar(toolbar);

//        btnBantuan = (Button) findViewById(R.id.btnKirimPertanyaan);
//        txtEmailTujuan = (EditText) findViewById(R.id.txtEmailTujuanBantuan);
//        txtEmailSubject = (EditText) findViewById(R.id.txtEmailSubjectBantuan);
//        txtEmailIsi = (EditText) findViewById(R.id.txtEmailIsiBantuan);
//
//        btnBantuan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                kirimEmail();
//            }
//        });

        tabLayout = (TabLayout) findViewById(R.id.tablayout_tentang);
        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager_programstudi);
        final PagerAdapter adapter = new PagerAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        alertDialogBuilder = new AlertDialog.Builder(this);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }

//    void kirimEmail() {
//        String emailTujuan = txtEmailTujuan.getText().toString();
//        String emailSubject = "ZodiakKu (Bantuan) from : " + txtEmailSubject.getText().toString();
//        String emailIsi = txtEmailIsi.getText().toString();
//
//        Intent i = new Intent(Intent.ACTION_SEND);
//        i.setType("message/rfc822");
//        i.putExtra(Intent.EXTRA_EMAIL, new String[]{emailTujuan});
//        i.putExtra(Intent.EXTRA_SUBJECT, emailSubject);
//        i.putExtra(Intent.EXTRA_TEXT, emailIsi);
//        try {
//            startActivity(Intent.createChooser(i, "Kirim Email Dengan"));
//        } catch (android.content.ActivityNotFoundException ex) {
//            Toast.makeText(this, "Terdapat masalah", Toast.LENGTH_SHORT).show();
//        }
//    }

    @Override
    public void onBackPressed() {
//        startActivity(new Intent(AboutMe.this, MainActivity.class));
        finish();
    }

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
