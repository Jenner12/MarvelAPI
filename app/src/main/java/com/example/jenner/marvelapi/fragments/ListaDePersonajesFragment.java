package com.example.jenner.marvelapi.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jenner.marvelapi.R;
import com.example.jenner.marvelapi.activities.DetallesPersonajeActivity;
import com.example.jenner.marvelapi.adapter.OnItemClickListener;
import com.example.jenner.marvelapi.adapter.RecyclerViewAdapter;
import com.example.jenner.marvelapi.model.Personaje;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Jenner on 02/03/2016.
 */
public class ListaDePersonajesFragment extends Fragment implements OnItemClickListener {

    @Bind(R.id.recyclerViewPersonajes)
    RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_lista_de_personajes, container, false);
        ButterKnife.bind(this, view);
        if (this.adapter == null) {
            this.adapter = new RecyclerViewAdapter();
            this.adapter.setOnItemClickListener(this);
        }
        this.recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.recyclerView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onItemClick(Personaje element) {
        Intent i = new Intent(getActivity(), DetallesPersonajeActivity.class);
        i.putExtra(DetallesPersonajeActivity.HERO_KEY, element.getNombre());
        i.putExtra(DetallesPersonajeActivity.BIO_KEY, element.getBiografia());
        i.putExtra(DetallesPersonajeActivity.PIC_KEY, element.getFotoSrc());
        startActivity(i);
    }

    //@Override
    public void addToList(Personaje p) {
        adapter.addElement(p);
    }

    //@Override
    public void clearList() {
        adapter.clear();
    }
}
