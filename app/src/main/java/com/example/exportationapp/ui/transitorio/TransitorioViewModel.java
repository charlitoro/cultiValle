package com.example.exportationapp.ui.transitorio;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TransitorioViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TransitorioViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}