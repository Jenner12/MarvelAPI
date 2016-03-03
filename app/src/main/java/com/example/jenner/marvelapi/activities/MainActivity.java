package com.example.jenner.marvelapi.activities;

import android.graphics.BitmapFactory;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;

import com.example.jenner.marvelapi.R;
import com.example.jenner.marvelapi.fragments.DetallesPersonajeFragment;
import com.example.jenner.marvelapi.fragments.ListaDePersonajesFragment;
import com.example.jenner.marvelapi.model.Personaje;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.scrollFragmentIndividual)
    ScrollView scrlInd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        DetallesPersonajeFragment fragmentoDetalle = (DetallesPersonajeFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentIndividual);
        fragmentoDetalle.setRetainInstance(true);
        ListaDePersonajesFragment fragmentoLista = (ListaDePersonajesFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentList);
        fragmentoLista.setRetainInstance(true);

        DisplayMetrics metricas = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metricas);
        int alto = metricas.heightPixels;
        scrlInd.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                alto / 3
        ));

        /*
        for (int x =  1; x <= 5; x++) {
            Personaje p = new Personaje("El Spidey #" + x, "Esta es la biografia del Spidey! :)");
            p.setFotoSrc(R.drawable.spiderman_icon_list);
            p.setFotografia(BitmapFactory.decodeResource(this.getResources(), p.getFotoSrc()));
            fragmentoLista.addToList(p);
        }
        //*/
        Personaje p = new Personaje("Spiderman", "Esta es la biografia de Spiderman...");
        p.setFotoSrc(R.drawable.spiderman_profile);
        p.setFotografia(BitmapFactory.decodeResource(this.getResources(), p.getFotoSrc()));
        p.setFotoLista(BitmapFactory.decodeResource(this.getResources(), R.drawable.spiderman_icon_list));
        fragmentoLista.addToList(p);
        ///*
        p = new Personaje("Wolverine", "Esta es la biografia de Wolverine...");
        p.setFotoSrc(R.drawable.wolverine_profile);
        p.setFotografia(BitmapFactory.decodeResource(this.getResources(), p.getFotoSrc()));
        p.setFotoLista(BitmapFactory.decodeResource(this.getResources(), R.drawable.wolverine_icon_list));
        fragmentoLista.addToList(p);
        ///*
        p = new Personaje("Magneto", "Esta es la biografia de Magneto...");
        p.setFotoSrc(R.drawable.magneto_profile);
        p.setFotografia(BitmapFactory.decodeResource(this.getResources(), p.getFotoSrc()));
        p.setFotoLista(BitmapFactory.decodeResource(this.getResources(), R.drawable.magneto_icon_list));
        fragmentoLista.addToList(p);
        p = new Personaje("Capitan America", "Esta es la biografia de Capitan America...");
        p.setFotoSrc(R.drawable.captain_profile);
        p.setFotografia(BitmapFactory.decodeResource(this.getResources(), p.getFotoSrc()));
        p.setFotoLista(BitmapFactory.decodeResource(this.getResources(), R.drawable.captain_icon_list));
        fragmentoLista.addToList(p);
        p = new Personaje("Iron Man", "Esta es la biografia de Iron Man...");
        p.setFotoSrc(R.drawable.ironman_profile);
        p.setFotografia(BitmapFactory.decodeResource(this.getResources(), p.getFotoSrc()));
        p.setFotoLista(BitmapFactory.decodeResource(this.getResources(), R.drawable.ironman_icon_list));
        fragmentoLista.addToList(p);
        p = new Personaje("Ciclope", "Esta es la biografia de Ciclope...");
        p.setFotoSrc(R.drawable.cyclops_profile);
        p.setFotografia(BitmapFactory.decodeResource(this.getResources(), p.getFotoSrc()));
        p.setFotoLista(BitmapFactory.decodeResource(this.getResources(), R.drawable.cyclops_icon_list));
        fragmentoLista.addToList(p);
        //*/
    }
    public int dipToPixels(int dip){
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dip, getResources().getDisplayMetrics());
    }
    public int pixelsToDp(int pixels){
        return (pixels/dipToPixels(1));
    }
}
