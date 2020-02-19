package com.example.yaman_bank.ui.extrato;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.example.yaman_bank.R;
import com.example.yaman_bank.ui.main.PageViewModel;
import com.example.yaman_bank.ui.main.SectionsPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class ExtratoFragment extends Fragment {

    private ExtratoViewModel extratoViewModel;
    private PageViewModel pageViewModel;

    private Button corrente, poupanca;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        extratoViewModel =
                ViewModelProviders.of (this).get(ExtratoViewModel.class);
        final View root = inflater.inflate(R.layout.fragment_extrato, container, false);

        final SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(getContext(), getFragmentManager());

            ViewPager viewPager = root.findViewById(R.id.viewPagerExtrato);
            viewPager.setAdapter(sectionsPagerAdapter);
//            TabLayout tabs = root.findViewById(R.id.tabs);
//            tabs.setupWithViewPager(viewPager);

//        corrente = root.findViewById(R.id.botaoCorrente);
//        corrente.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ViewPager viewPager = root.findViewById(R.id.viewPagerExtrato);
//                viewPager.setAdapter(sectionsPagerAdapter);
//            }
//        });
//
//        poupanca = root.findViewById(R.id.botaoPoupanca);
//        poupanca.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ViewPager viewPager = root.findViewById(R.id.viewPagerExtrato2);
//                viewPager.setAdapter(sectionsPagerAdapter);
//            }
//        });

        return root;
    }

}