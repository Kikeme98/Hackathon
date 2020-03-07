package com.example.hackathon;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.hackathon.Modelos.Cultivo;
import com.example.hackathon.Modelos.Etapa;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentEtapa2 extends Fragment {

    public FragmentEtapa2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_etapa2, container, false);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Cultivo cultivo = (Cultivo) getActivity().getIntent().getSerializableExtra("cultivo");
        Etapa etapa = cultivo.getEtapa2();
        Toast.makeText(getContext(), etapa.getDiasDuracion(), Toast.LENGTH_LONG).show();
    }
}
