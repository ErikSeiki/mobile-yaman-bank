package com.example.yaman_bank.ui.home;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.yaman_bank.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private TextView m_SaldoAtualizado;
    private TextView m_UltimaTransferencia;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
//        final TextView textView = root.findViewById(R.id.text_home);
//        homeViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        Resources res = getResources();
        String[] saldoAtualizado = res.getStringArray(R.array.saldoAtualizado);
        m_SaldoAtualizado = root.findViewById(R.id.textSaldoAtualizado);

        String[] ultimaTransferencia = res.getStringArray(R.array.ultimaTransferencia);
        m_UltimaTransferencia = root.findViewById(R.id.textUltimaTransferencia);


        m_SaldoAtualizado.setText(saldoAtualizado[0] + saldoAtualizado[1] + saldoAtualizado[2]);
        m_UltimaTransferencia.setText(ultimaTransferencia[0] + ultimaTransferencia[1] + ultimaTransferencia[2] + ultimaTransferencia[3]);
        return root;
    }
}