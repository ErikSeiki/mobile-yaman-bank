package com.example.yaman_bank.ui.extrato;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.example.yaman_bank.R;
import com.example.yaman_bank.ui.main.PageViewModel;
import com.example.yaman_bank.ui.main.SectionsPagerAdapter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class ExtratoFragment extends Fragment {

    private ExtratoViewModel extratoViewModel;
    private PageViewModel pageViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        extratoViewModel =
                ViewModelProviders.of (this).get(ExtratoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_extrato, container, false);
//        final TextView textView = root.findViewById(R.id.text_extrato);
//        extratoViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getFragmentManager());
        ViewPager viewPager = root.findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = root.findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

        ListView lista = root.findViewById(R.id.lista);
        ArrayList<String> pagamentos = preencherDados();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                getContext(), android.R.layout.simple_list_item_1, pagamentos);

        lista.setAdapter(arrayAdapter);

        return root;
    }

    public ArrayList<String> preencherDados() {
        ArrayList<String> dados = new ArrayList<String>();
        dados.add("Outback");
        dados.add("Americanas");

        return dados;
    }
}