package com.example.hackathon;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hackathon.Modelos.Cultivo;
import com.example.hackathon.Modelos.Fertilizante;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentEtapa3 extends Fragment {

    TextView txtTempMax3, txtTempMin3, txtCanFertilizante3,txtTiempoFert3, txtPh3, txtDias3;

    public FragmentEtapa3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_etapa3, container, false);
        // Inflate the layout for this fragment
        txtDias3 = view.findViewById(R.id.txtDias3);
        txtTempMax3 = view.findViewById(R.id.txtTemMax3);
        txtTempMin3 = view.findViewById(R.id.txtTemMin3);
        txtCanFertilizante3 = view.findViewById(R.id.txtCanFer3);
        txtPh3 = view.findViewById(R.id.txtPH3);
        txtTiempoFert3 = view.findViewById(R.id.txtTieFer3);
        Cultivo cultivo = (Cultivo) getActivity().getIntent().getSerializableExtra("cultivo");
        txtDias3.setText(cultivo.getEtapa3().getDiasDuracion());
        txtTempMin3.setText(cultivo.getEtapa3().getTemperaturaMinima()+"");
        txtTempMax3.setText(cultivo.getEtapa3().getTemperaturaMaxima()+"");
        txtPh3.setText(cultivo.getEtapa3().getPh());
        txtCanFertilizante3.setText(cultivo.getEtapa3().getFertilizante().getCantidad());
        txtTiempoFert3.setText(cultivo.getEtapa3().getFertilizante().getTiempo());
        return view;
    }
}
