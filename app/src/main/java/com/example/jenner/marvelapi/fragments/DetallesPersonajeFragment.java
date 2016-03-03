package com.example.jenner.marvelapi.fragments;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jenner.marvelapi.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Jenner on 02/03/2016.
 */
public class DetallesPersonajeFragment extends Fragment{
    @Bind(R.id.fragmentDetalle_imgFotoPerfil)
    ImageView imgFotoPerfil;
    @Bind(R.id.fragmentDetalle_txtNombre)
    TextView txtNombre;
    @Bind(R.id.fragmentDetalle_txtBiografia)
    TextView txtBiografia;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detalle_personaje, container, false);
        ButterKnife.bind(this, view);
        imgFotoPerfil.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.spiderman_profile));
        txtNombre.setText("SPIDEY O KE ASE?");
        txtBiografia.setText("La biografia");
        txtBiografia.setText("BIOGRAFIANDO O KE ASE?\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nhaahhaha\n\n\n\nlololo\n\n\n:P");
        return view;
    }
    public void setBiografia(String str){
        txtBiografia.setText(str);
    }
}
