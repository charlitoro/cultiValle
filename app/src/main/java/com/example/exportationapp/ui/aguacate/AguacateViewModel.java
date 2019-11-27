package com.example.exportationapp.ui.aguacate;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AguacateViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AguacateViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}