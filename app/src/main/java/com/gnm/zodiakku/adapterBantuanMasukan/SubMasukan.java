package com.gnm.zodiakku.adapterBantuanMasukan;

import android.content.Intent;
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


public class SubMasukan extends Fragment {
    Button btnMasukan;
    EditText txtEmailTujuan, txtEmailSubject, txtEmailIsi;
    public SubMasukan(){}
    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.masukan, container, false);

        btnMasukan = (Button) view.findViewById(R.id.btnKirimMasukan);
        txtEmailTujuan = (EditText) view.findViewById(R.id.txtEmailTujuanMasukan);
        txtEmailSubject = (EditText) view.findViewById(R.id.txtEmailSubjectMasukan);
        txtEmailIsi = (EditText) view.findViewById(R.id.txtEmailIsiMasukan);

        btnMasukan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kirimEmail();
            }
        });

        return view;
    }
    void kirimEmail(){
        String emailTujuan=txtEmailTujuan.getText().toString();
        String emailSubject="ZodiakKu (Masukan) from : "+txtEmailSubject.getText().toString();
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
}
