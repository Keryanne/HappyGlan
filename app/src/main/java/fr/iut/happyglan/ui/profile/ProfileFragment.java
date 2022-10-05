package fr.iut.happyglan.ui.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import fr.iut.happyglan.databinding.FragmentProfileBinding;

public class ProfileFragment extends Fragment {

    private FragmentProfileBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ProfileViewModel profileViewModel =
                new ViewModelProvider(this).get(ProfileViewModel.class);

        binding = FragmentProfileBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView fullName = binding.profileFullName;
        profileViewModel.getFullname().observe(getViewLifecycleOwner(), fullName::setText);

        final TextView description = binding.profileDescription;
        profileViewModel.getDescription().observe(getViewLifecycleOwner(), description::setText);

        final TextView numberGleaning = binding.profileFirstNumber;
        profileViewModel.getNumberGleaning().observe(getViewLifecycleOwner(), numberGleaning::setText);

        final TextView avgGleaning = binding.profileSecondNumber;
        profileViewModel.getAverageGleaning().observe(getViewLifecycleOwner(), avgGleaning::setText);

        final TextView contributions = binding.profileThirdNumber;
        profileViewModel.getContributions().observe(getViewLifecycleOwner(), contributions::setText);

        final ImageView profilePicture = binding.profilePicture;
        profilePicture.setImageDrawable(profileViewModel.getProfilePictureDrawable());


//        final TextView textView = binding.textGallery;
//        profileViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}