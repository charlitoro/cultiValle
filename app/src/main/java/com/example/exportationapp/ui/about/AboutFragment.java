package com.example.exportationapp.ui.about;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.exportationapp.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class AboutFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState)
    {
        Element versionElement = new Element();
        versionElement.setTitle(getString(R.string.version)+" 1.1");
        View aboutPage = new AboutPage(getContext())
                .setDescription(getString(R.string.description))
                .isRTL(false)
                .setImage(R.drawable.ic_agro_export_app)
                .addItem(versionElement)
                .addGroup(getString(R.string.connect_us))
                .addEmail("carlostoro04@gmail.com")
                .addFacebook("charlietoro")
                .addTwitter("charlietoro_")
                .addInstagram("charlietoro_")
                .create();
        return aboutPage;
    }
}
