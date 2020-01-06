package com.example.exportationapp.ui.permanente;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PermanenteViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PermanenteViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is send fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}