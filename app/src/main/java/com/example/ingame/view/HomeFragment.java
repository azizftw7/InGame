package com.example.ingame.view;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.ingame.R;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        View addEvent = view.findViewById(R.id.btnAddEvent);
        addEvent.setOnClickListener(v -> {
            // Inflate the custom dialog layout
            LayoutInflater inflater1 = LayoutInflater.from(requireContext());
            View dialogView = inflater1.inflate(R.layout.dialog_add_event, null);

            // Build the dialog
            new MaterialAlertDialogBuilder(requireContext())
                    .setTitle("Add Event")
                    .setView(dialogView)
                    .setPositiveButton("Save", (dialog, which) -> {

                    })
                    .setNegativeButton("Cancel", (dialog, which) -> {
                        dialog.dismiss();
                    })
                    .show();
        });


        return view;
    }
}
