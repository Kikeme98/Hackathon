package com.example.hackathon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.hackathon.Modelos.Cultivo;
import com.example.hackathon.Utils.AdaptadorFirebase;
import com.example.hackathon.ViewHolders.CultivoHolder;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ActivitySembrar extends AppCompatActivity {

    RecyclerView recyclerViewCultivos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sembrar);
        recyclerViewCultivos = findViewById(R.id.recyclerViewCultivos);
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference reference = firebaseDatabase.getReference("cultivos");
        AdaptadorFirebase adaptadorFirebase = new AdaptadorFirebase(Cultivo.class, R.layout.cultivo_holder, CultivoHolder.class, reference, getApplicationContext());
        recyclerViewCultivos.setAdapter(adaptadorFirebase);
        recyclerViewCultivos.setLayoutManager(new GridLayoutManager(ActivitySembrar.this, 1, LinearLayoutManager.VERTICAL, false));



    }
}
