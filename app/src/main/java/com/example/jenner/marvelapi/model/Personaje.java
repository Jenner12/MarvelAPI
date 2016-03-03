package com.example.jenner.marvelapi.model;

import java.util.Date;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by Jenner on 02/03/2016.
 */
public class Personaje {
    private String nombre;
    private String alterEgo;
    private Date fechaNacimiento;
    private String creadores;
    private String biografia;
    private Bitmap fotografia;
    private int fotoSrc;
    private Bitmap fotoLista;
    private int fotoListaSrc;
    private String[] poderes;

    public Personaje(String n, String bio){
        this.nombre = n;
        this.biografia = bio;
    }

    public String getNombre() {return this.nombre;}
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlterEgo() {
        return this.alterEgo;
    }
    public void setAlterEgo(String alterEgo) {
        this.alterEgo = alterEgo;
    }

    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCreadores() {
        return this.creadores;
    }
    public void setCreadores(String creadores) {this.creadores = creadores;
    }

    public String getBiografia(){return this.biografia;}
    public void setBiografia(String biografia) {this.biografia = biografia;}

    public Bitmap getFotografia() {return this.fotografia;}
    public void setFotografia(Bitmap fotografia) {this.fotografia = fotografia;}

    public int getFotoSrc() {return this.fotoSrc;}
    public void setFotoSrc(int fotoSrc) {this.fotoSrc = fotoSrc;}

    public Bitmap getFotoLista() {return this.fotoLista;}
    public void setFotoLista(Bitmap fotoLista) {this.fotoLista = fotoLista;}

    public int getFotoListaSrc() {return this.fotoListaSrc;}
    public void setFotoListaSrc(int fotoListaSrc) {this.fotoListaSrc = fotoListaSrc;}

    public String[] getPoderes() {return this.poderes;}
    public void setPoderes(String[] poderes) {
        this.poderes = poderes;
    }

    public String toString(){
        String res = " -Nombre real: " + alterEgo
                + "  -Nombre de Heroe: " + nombre
                + "  -Super poderes:";
        for (String poder : this.poderes)
            res += " *"+ poder;
        return res;
    }
}
