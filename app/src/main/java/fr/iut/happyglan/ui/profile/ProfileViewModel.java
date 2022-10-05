package fr.iut.happyglan.ui.profile;


import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.net.URI;

import fr.iut.happyglan.MainActivity;
import fr.iut.happyglan.R;

public class ProfileViewModel extends ViewModel {

    private final MutableLiveData<String> fullname;
    private final MutableLiveData<String> description;
    private final MutableLiveData<String> numberGleaning;
    private final MutableLiveData<String> averageGleaning;
    private final MutableLiveData<String> contributions;
//    private final MutableLiveData<String> mText;

    public MutableLiveData<String> getAverageGleaning() {
        return averageGleaning;
    }

    public MutableLiveData<String> getContributions() {
        return contributions;
    }

    public ProfileViewModel() {
        //TODO : Récupérer JSON
        fullname = new MutableLiveData<>();
        fullname.setValue("Karine Le Marchand");
        description = new MutableLiveData<>();
        description.setValue("Bonjour à tous, je suis une fan du glanage !");
        numberGleaning = new MutableLiveData<>();
        numberGleaning.setValue(String.valueOf(42));
        averageGleaning = new MutableLiveData<>();
        averageGleaning.setValue(12 + "kg");
        contributions = new MutableLiveData<>();
        contributions.setValue(150 + "€");
    }

    public LiveData<String> getDescription() {
        return description;
    }

    public LiveData<String> getFullname(){
        return fullname;
    }

    public LiveData<String> getNumberGleaning() {
        return numberGleaning;
    }

    public Drawable getProfilePictureDrawable(){
        return ResourcesCompat.getDrawable(MainActivity.getContext().getResources(), R.drawable.pdp, null);
    }
}