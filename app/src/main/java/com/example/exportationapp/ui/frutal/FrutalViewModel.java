package com.example.exportationapp.ui.frutal;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FrutalViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FrutalViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}