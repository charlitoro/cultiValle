package com.example.exportationapp.ui.about;


import android.content.Intent;
import android.net.Uri;
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

        String userGitLab = "charlietoro_";
        String repoGitLab = "cultivalle";
        Element gitLabElement = new Element();
        gitLabElement.setTitle("gitlab.com/charlietoro_/cultivalle");
        gitLabElement.setIconDrawable(R.drawable.ic_icons8_color);
        gitLabElement.setIconTint(R.color.colorGitLab);
        Intent gitLabIntent = new Intent();
        gitLabIntent.setAction(Intent.ACTION_VIEW);
        gitLabIntent.addCategory(Intent.CATEGORY_BROWSABLE);
        gitLabIntent.setData(Uri.parse(String.format("https://gitlab.com/%s/%s", userGitLab, repoGitLab)));

        gitLabElement.setIntent(gitLabIntent);

        View aboutPage = new AboutPage(getContext())
                .setDescription(getString(R.string.description))
                .isRTL(false)
                .setImage(R.drawable.ic_agro_export_app)
                .addItem(versionElement)
                .addEmail("carlostoro04@gmail.com")
                .addFacebook("charlietoroag")
                .addTwitter("charlietoro_")
                .addInstagram("charlietoro_")
                .addItem(gitLabElement)
                .create();
        return aboutPage;
    }
}
