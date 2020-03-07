package com.example.hackathon;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.hackathon.Modelos.Cultivo;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentEtapa1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentEtapa1 extends Fragment {

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
        Cultivo cultivo = (Cultivo) getActivity().getIntent().getSerializableExtra("cultivo");
        Toast.makeText(getContext(), cultivo.getCultivo(), Toast.LENGTH_LONG).show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_etapa1, container, false);
    }
}
