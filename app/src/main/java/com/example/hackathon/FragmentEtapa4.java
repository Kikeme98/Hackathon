package com.example.hackathon;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hackathon.Modelos.Cultivo;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentEtapa4 extends Fragment {

    TextView txtTempMax4, txtTempMin4, txtCanFertilizante4,txtTiempoFert4, txtPh4, txtDias4;

    public FragmentEtapa4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_etapa4, container, false);
        // Inflate the layout for this fragment
        txtDias4 = view.findViewById(R.id.txtDias4);
        txtTempMax4 = view.findViewById(R.id.txtTemMax4);
        txtTempMin4 = view.findViewById(R.id.txtTemMin4);
        txtCanFertilizante4 = view.findViewById(R.id.txtCanFer4);
        txtPh4 = view.findViewById(R.id.txtPH4);
        txtTiempoFert4 = view.findViewById(R.id.txtTieFer4);
        Cultivo cultivo = (Cultivo) getActivity().getIntent().getSerializableExtra("cultivo");
        txtDias4.setText(cultivo.getEtapa4().getDiasDuracion());
        txtTempMin4.setText(cultivo.getEtapa4().getTemperaturaMinima()+"");
        txtTempMax4.setText(cultivo.getEtapa4().getTemperaturaMaxima()+"");
        txtPh4.setText(cultivo.getEtapa4().getPh());
        txtCanFertilizante4.setText(cultivo.getEtapa4().getFertilizante().getCantidad());
        txtTiempoFert4.setText(cultivo.getEtapa4().getFertilizante().getTiempo());
        return view;
    }
}
