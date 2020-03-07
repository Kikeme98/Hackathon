package com.example.hackathon.Utils;

import android.content.Context;

import com.example.hackathon.Modelos.Cultivo;
import com.example.hackathon.ViewHolders.CultivoHolder;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.Query;
import com.squareup.picasso.Picasso;

public class AdaptadorFirebase extends FirebaseRecyclerAdapter<Cultivo, CultivoHolder> {
    Context context;
    public AdaptadorFirebase(Class<Cultivo> modelClass, int modelLayout, Class<CultivoHolder> viewHolderClass, Query ref, Context c) {
        super(modelClass, modelLayout, viewHolderClass, ref);
        context = c;
    }

    @Override
    protected void populateViewHolder(CultivoHolder cultivoHolder, Cultivo cultivo, int i) {
        cultivoHolder.txtNombreCultivo.setText(cultivo.getCultivo());
        Picasso.with(context).load(cultivo.getImagen()).into(cultivoHolder.imagen);

    }
}
