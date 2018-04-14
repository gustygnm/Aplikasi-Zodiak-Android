package com.gnm.zodiakku.adapterMenuUtama;

import android.widget.Button;

public class EndangeredItem {
    private String JudulHome;
    private String NameHome;
    private String KetHome;
    private int mThumbnailHome;
    private Button btn_Baca;

    public Button getBtn_Baca() {
        return btn_Baca;
    }

    public void setBtn_Baca(Button btn_Baca) {
        this.btn_Baca = btn_Baca;
    }

    public String getJudulHome() {
        return JudulHome;
    }

    public void setJudulHome(String judulHome) {
        JudulHome = judulHome;
    }

    public String getNameHome() {
        return NameHome;
    }

    public void setNameHome(String nameHome) {
        NameHome = nameHome;
    }

    public String getKetHome() {
        return KetHome;
    }

    public void setKetHome(String ketHome) {
        KetHome = ketHome;
    }

    public int getmThumbnailHome() {
        return mThumbnailHome;
    }

    public void setmThumbnailHome(int mThumbnailHome) {
        this.mThumbnailHome = mThumbnailHome;
    }
}

