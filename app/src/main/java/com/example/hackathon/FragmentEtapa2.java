package com.example.hackathon;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hackathon.Modelos.Cultivo;
import com.example.hackathon.Modelos.Etapa;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentEtapa2 extends Fragment {

    TextView txtTempMax2, txtTempMin2, txtHum2, txtDias2;

    public FragmentEtapa2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_etapa2, container, false);
        // Inflate the layout for this fragment
        txtDias2 = view.findViewById(R.id.txtDias2);
        txtHum2 = view.findViewById(R.id.txtHum2);
        txtTempMax2 = view.findViewById(R.id.txtTemMax2);
        txtTempMin2 = view.findViewById(R.id.txtTemMin2);
        Cultivo cultivo = (Cultivo) getActivity().getIntent().getSerializableExtra("cultivo");
        txtDias2.setText(cultivo.getEtapa2().getDiasDuracion());
        txtTempMin2.setText(cultivo.getEtapa2().getTemperaturaMinima()+"°C");
        txtTempMax2.setText(cultivo.getEtapa2().getTemperaturaMaxima()+"°C");
        txtHum2.setText(cultivo.getEtapa2().getHumedad());
        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
