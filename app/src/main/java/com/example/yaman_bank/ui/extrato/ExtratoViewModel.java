package com.example.yaman_bank.ui.extrato;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ExtratoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ExtratoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is send fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}