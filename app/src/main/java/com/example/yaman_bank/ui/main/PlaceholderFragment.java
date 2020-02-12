package com.example.yaman_bank.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.yaman_bank.R;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    private PageViewModel pageViewModel;

    public static PlaceholderFragment newInstance(int index) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel = ViewModelProviders.of(this).get(PageViewModel.class);
        int index = 1;
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_SECTION_NUMBER);
        }
        pageViewModel.setIndex(index);
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_contas, container, false);
//        final ListView lista = root.findViewById(R.id.lista);
//        pageViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                ArrayList<String> equipes = preencherDados();
//                ArrayAdapter<String> arrayAdapter = getStringArrayAdapter(equipes);
//                lista.setAdapter(arrayAdapter);
//            }
//        });

        return root;
    }
//
//    private ArrayAdapter<String> getStringArrayAdapter(ArrayList<String> equipes) {
//        return new ArrayAdapter<String>(
//                            getActivity(), android.R.layout.simple_list_item_1, equipes);
//    }

//    public ArrayList<String> preencherDados() {
//        ArrayList<String> dados = new ArrayList<String>();
//        dados.add("Outback");
//        dados.add("Americanas");
//
//        return dados;
//    }
}