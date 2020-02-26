package com.example.yaman_bank.ui.extrato;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.example.yaman_bank.ContaCorrenteFragment;
import com.example.yaman_bank.ContaPoupancaFragment;
import com.example.yaman_bank.R;
import com.example.yaman_bank.ui.extrato.ExtratoViewModel;
import com.example.yaman_bank.ui.main.PlaceholderFragment;
import com.example.yaman_bank.ui.main.SectionsPagerAdapter;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

public class ExtratoFragment extends Fragment {

    private ExtratoViewModel extratoViewModel;
    private TabLayout tabs;
    private ViewPager viewPager;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        extratoViewModel =
                ViewModelProviders.of(this).get(ExtratoViewModel.class);
        View root = inflater.inflate(R.layout.activity_tab, container, false);

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(getContext(), getActivity().getSupportFragmentManager());
        viewPager = root.findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        tabs = root.findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fab = root.findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Faça seu próprio método", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        return root;
    }
}