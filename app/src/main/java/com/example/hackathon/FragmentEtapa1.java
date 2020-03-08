package com.example.hackathon;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hackathon.Modelos.Cultivo;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentEtapa1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentEtapa1 extends Fragment {

    TextView txtTempMax1, txtTempMin1, txtHum1, txtDias1;

    public FragmentEtapa1() {
        // Required empty public constructor
    }
    // TODO: Rename and change types and number of parameters
    public static FragmentEtapa1 newInstance(String param1, String param2) {
        FragmentEtapa1 fragment = new FragmentEtapa1();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_etapa1, container, false);
        // Inflate the layout for this fragment
        Cultivo cultivo = (Cultivo) getActivity().getIntent().getSerializableExtra("cultivo");
        Toast.makeText(getContext(), cultivo.getCultivo(), Toast.LENGTH_LONG).show();
        txtDias1 = view.findViewById(R.id.txtDias1);
        txtHum1 = view.findViewById(R.id.txtHum1);
        txtTempMax1 = view.findViewById(R.id.txtTemMax1);
        txtTempMin1 = view.findViewById(R.id.txtTemMin1);

        txtDias1.setText(cultivo.getEtapa1().getDiasDuracion());
        txtTempMin1.setText(cultivo.getEtapa1().getTemperaturaMinima()+"");
        txtTempMax1.setText(cultivo.getEtapa1().getTemperaturaMaxima()+"");
        txtHum1.setText(cultivo.getEtapa1().getHumedad());

        return view;
    }
}
