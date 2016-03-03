package com.example.jenner.marvelapi.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.jenner.marvelapi.R;
import com.example.jenner.marvelapi.model.Personaje;
import com.example.jenner.marvelapi.adapter.OnItemClickListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Jenner on 02/03/2016.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    List<Personaje> dataset;
    private OnItemClickListener clickListener;

    public RecyclerViewAdapter() {
        this.dataset = new ArrayList<Personaje>();
    }

    public void setOnItemClickListener(OnItemClickListener clickListener) {
        this.clickListener = clickListener;
    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.elemento_lista_personajes, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Personaje element = dataset.get(position);
        holder.nombre.setText(element.getNombre());
        holder.imgFoto.setImageBitmap(element.getFotoLista());
        if (this.clickListener != null) {
            holder.setOnItemClickListener(element, this.clickListener);
        }
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public void addElement(Personaje p){
        dataset.add(p);
        notifyDataSetChanged();
    }

    public void clear() {
        dataset.clear();
        notifyDataSetChanged();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        private View view;
        @Bind(R.id.elementoDeLista_txtNombre)
        TextView nombre;
        @Bind(R.id.elementoDeLista_imgFoto)
        ImageView imgFoto;

        public ViewHolder(View view) {
            super(view);
            this.view = view;
            ButterKnife.bind(this, view);
        }

        public void setOnItemClickListener(final Personaje p,
                                           final OnItemClickListener listener) {
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onItemClick(p);
                }
            });

        }
    }
}


