package com.gnm.zodiakku.adapterMenuUtama;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.gnm.zodiakku.R;
import com.gnm.zodiakku.home.AquariusHome;
import com.gnm.zodiakku.home.AriesHome;
import com.gnm.zodiakku.home.CancerHome;
import com.gnm.zodiakku.home.CapricornHome;
import com.gnm.zodiakku.home.GeminiHome;
import com.gnm.zodiakku.home.LeoHome;
import com.gnm.zodiakku.home.LibraHome;
import com.gnm.zodiakku.home.PiscesHome;
import com.gnm.zodiakku.home.SagitariusHome;
import com.gnm.zodiakku.home.ScorpioHome;
import com.gnm.zodiakku.home.TaurusHome;
import com.gnm.zodiakku.home.VirgoHome;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ujang Wahyu on 24/01/2017.
 */

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.ViewHolder> {

    List<EndangeredItem> mItems;

    public GridAdapter() {
        super();
        mItems = new ArrayList<EndangeredItem>();
        EndangeredItem nama = new EndangeredItem();
        nama.setKetHome("ARIES");
        nama.setmThumbnailHome(R.drawable.aries2);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setKetHome("TAURUS");
        nama.setmThumbnailHome(R.drawable.taurus2);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setKetHome("GEMINI");
        nama.setmThumbnailHome(R.drawable.gemini2);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setKetHome("CANCER");
        nama.setmThumbnailHome(R.drawable.cancer2);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setKetHome("LEO");
        nama.setmThumbnailHome(R.drawable.leo2);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setKetHome("VIRGO");
        nama.setmThumbnailHome(R.drawable.virgo2);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setKetHome("LIBRA");
        nama.setmThumbnailHome(R.drawable.libra2);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setKetHome("SCORPIO");
        nama.setmThumbnailHome(R.drawable.scorpio2);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setKetHome("SAGITARIUS");
        nama.setmThumbnailHome(R.drawable.sagittarius2);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setKetHome("CAPRICORN");
        nama.setmThumbnailHome(R.drawable.capricorn2);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setKetHome("AQUARIUS");
        nama.setmThumbnailHome(R.drawable.aquarius2);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setKetHome("PISCES");
        nama.setmThumbnailHome(R.drawable.pisces2);
        mItems.add(nama);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.grid_view_versi2, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, final int i) {
        EndangeredItem nature = mItems.get(i);
        viewHolder.txtKet.setText(nature.getKetHome());
        viewHolder.imgThumbnail.setImageResource(nature.getmThumbnailHome());
        viewHolder.klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah;
                if (i == 0) {
                    pindah = new Intent(view.getContext(), AriesHome.class);
                    view.getContext().startActivity(pindah);
                } else if (i == 1) {
                    pindah = new Intent(view.getContext(), TaurusHome.class);
                    view.getContext().startActivity(pindah);
                } else if (i == 2) {
                    pindah = new Intent(view.getContext(), GeminiHome.class);
                    view.getContext().startActivity(pindah);
                } else if (i == 3) {
                    pindah = new Intent(view.getContext(), CancerHome.class);
                    view.getContext().startActivity(pindah);
                } else if (i == 4) {
                    pindah = new Intent(view.getContext(), LeoHome.class);
                    view.getContext().startActivity(pindah);
                } else if (i == 5) {
                    pindah = new Intent(view.getContext(), VirgoHome.class);
                    view.getContext().startActivity(pindah);
                } else if (i == 6) {
                    pindah = new Intent(view.getContext(), LibraHome.class);
                    view.getContext().startActivity(pindah);
                } else if (i == 7) {
                    pindah = new Intent(view.getContext(), ScorpioHome.class);
                    view.getContext().startActivity(pindah);
                } else if (i == 8) {
                    pindah = new Intent(view.getContext(), SagitariusHome.class);
                    view.getContext().startActivity(pindah);
                } else if (i == 9) {
                    pindah = new Intent(view.getContext(), CapricornHome.class);
                    view.getContext().startActivity(pindah);
                } else if (i == 10) {
                    pindah = new Intent(view.getContext(), AquariusHome.class);
                    view.getContext().startActivity(pindah);
                } else if (i == 11) {
                    pindah = new Intent(view.getContext(), PiscesHome.class);
                    view.getContext().startActivity(pindah);
                }
            }
        });
    }

    @Override
    public int getItemCount() {

        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {


        protected ImageView imgThumbnail;
        protected TextView tvspecies;
        protected TextView jabatan;
        protected TextView txtKet;
        protected TextView btn_baca;

        protected RelativeLayout klik;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView) itemView.findViewById(R.id.img_thumbnail);
//            tvspecies = (TextView) itemView.findViewById(R.id.statusHome);
//            jabatan = (TextView) itemView.findViewById(R.id.textJudulHome);
            txtKet = (TextView) itemView.findViewById(R.id.keterangan);
            klik = (RelativeLayout) itemView.findViewById(R.id.klik_card);
//            btn_baca = (TextView) itemView.findViewById(R.id.btn_baca_ceritaSumbawa);
        }
    }
}
