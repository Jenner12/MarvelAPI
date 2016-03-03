package com.example.jenner.marvelapi.activities;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jenner.marvelapi.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Jenner on 02/03/2016.
 */
public class DetallesPersonajeActivity extends AppCompatActivity {
    public static final String HERO_KEY = "Heroe";
    public static final String BIO_KEY = "Biografia";
    public static final String PIC_KEY = "Fotografia";
    @Bind(R.id.fragmentDetalle_txtNombre)
    TextView txtNombre;
    @Bind(R.id.fragmentDetalle_txtBiografia)
    TextView txtBiografia;
    @Bind(R.id.fragmentDetalle_imgFotoPerfil)
    ImageView imgFotoPerfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_detalle_personaje);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        txtNombre.setText(b.getString(DetallesPersonajeActivity.HERO_KEY));
        txtBiografia.setText(b.getString(DetallesPersonajeActivity.BIO_KEY));
        imgFotoPerfil.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), b.getInt(DetallesPersonajeActivity.PIC_KEY)));
    }
}
