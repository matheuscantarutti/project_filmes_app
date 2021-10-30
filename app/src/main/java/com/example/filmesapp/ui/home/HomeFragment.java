package com.example.filmesapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.filmesapp.R;
import com.example.filmesapp.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {


    TextView mensagem;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        mensagem = getActivity().findViewById(R.id.text_home);
        mensagem.setText(getArguments().getString("nome"));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}