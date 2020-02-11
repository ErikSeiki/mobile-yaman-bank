package com.example.yaman_bank.ui.transferencia;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TransferenciaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TransferenciaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}