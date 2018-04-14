package com.gnm.zodiakku.adapterBantuanMasukan;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.gnm.zodiakku.R;


public class SubBantuan extends Fragment {
    Button btnBantuan;
    EditText txtEmailTujuan, txtEmailSubject, txtEmailIsi;

    public SubBantuan() {
    }

    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.bantuan, container, false);

        btnBantuan = (Button) view.findViewById(R.id.btnKirimPertanyaan);
        txtEmailTujuan = (EditText) view.findViewById(R.id.txtEmailTujuanBantuan);
        txtEmailSubject = (EditText) view.findViewById(R.id.txtEmailSubjectBantuan);
        txtEmailIsi = (EditText) view.findViewById(R.id.txtEmailIsiBantuan);

        btnBantuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kirimEmail();
            }
        });
        return view;
    }

    void kirimEmail(){
        String emailTujuan=txtEmailTujuan.getText().toString();
        String emailSubject="ZodiakKu (Bantuan) from : "+txtEmailSubject.getText().toString();
        String emailIsi=txtEmailIsi.getText().toString();

        Intent i= new Intent(Intent.ACTION_SEND);
        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL, new String[]{emailTujuan});
        i.putExtra(Intent.EXTRA_SUBJECT, emailSubject);
        i.putExtra(Intent.EXTRA_TEXT, emailIsi);
        try {
            startActivity(Intent.createChooser(i,"Kirim Email Dengan"));
        } catch (android.content.ActivityNotFoundException ex){
            Toast.makeText(getActivity(),"Terdapat masalah",Toast.LENGTH_SHORT).show();
        }
    }

    public void klikKirimPertanyaan(View view) {
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setData(Uri.parse("email"));
        String[] s = {"gusti.ngurah.mertayasa@gmail.com"};
        i.putExtra(Intent.EXTRA_EMAIL, s);
        i.putExtra(Intent.EXTRA_SUBJECT, "(ZodiakKu Apps) Pertanyaan");
        i.setType("message/rfc822");
        Intent chooser = Intent.createChooser(i, "Launch Email");
        startActivity(chooser);
    }

    public void klikKirimMasukan(View view) {
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setData(Uri.parse("email"));
        String[] s = {"gusti.ngurah.mertayasa@gmail.com"};
        i.putExtra(Intent.EXTRA_EMAIL, s);
        i.putExtra(Intent.EXTRA_SUBJECT, "(ZodiakKu Apps) Saran dan Masukan");
        i.putExtra(Intent.EXTRA_TEXT, "Saran : \nMasukan : ");
        i.setType("message/rfc822");
        Intent chooser = Intent.createChooser(i, "Launch Email");
        startActivity(chooser);
    }
}
