package com.example.hackathon.Utils;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import android.widget.Toast;

import com.example.hackathon.ActivityCultivo;
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
    protected void populateViewHolder(CultivoHolder cultivoHolder, final Cultivo cultivo, final int i) {
        cultivoHolder.txtNombreCultivo.setText(cultivo.getCultivo());
        Picasso.with(context).load(cultivo.getImagen()).into(cultivoHolder.imagen);
        cultivoHolder.txtNombreCultivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context c = v.getContext();
                Intent intent = new Intent(context, ActivityCultivo.class);
                intent.putExtra("cultivo", cultivo);
                c.startActivity(intent);
            }
        });

    }
}
