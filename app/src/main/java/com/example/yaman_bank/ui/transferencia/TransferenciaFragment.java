package com.example.yaman_bank.ui.transferencia;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.yaman_bank.R;

public class TransferenciaFragment extends Fragment {

    private TransferenciaViewModel transferenciaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        transferenciaViewModel =
                ViewModelProviders.of(this).get(TransferenciaViewModel.class);
        View root = inflater.inflate(R.layout.fragment_transferencia, container, false);
        final TextView textView = root.findViewById(R.id.text_transferencia);
        transferenciaViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}