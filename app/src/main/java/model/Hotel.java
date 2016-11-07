package model;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

/**
 * Created by user_ on 11/3/2016.
 */

public class Hotel implements Serializable {
    public String judul;
    public String deskripsi;
    public String lokasi;
    public String detail;
    public String foto;

    public Hotel(String judul, String deskripsi,
                 String detail, String lokasi,
                 String foto)
    {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.detail = detail;
        this.lokasi = lokasi;
        this.foto = foto;
    }

}
