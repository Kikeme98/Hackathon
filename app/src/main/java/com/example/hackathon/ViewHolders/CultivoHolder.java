package com.example.hackathon.ViewHolders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hackathon.R;

public class CultivoHolder extends RecyclerView.ViewHolder {

    public ImageView imagen;
    public TextView txtNombreCultivo;
    public CultivoHolder(@NonNull View itemView) {
        super(itemView);
        imagen = itemView.findViewById(R.id.imgV1);

        txtNombreCultivo = itemView.findViewById(R.id.txtCultivoNombre);


    }
}
