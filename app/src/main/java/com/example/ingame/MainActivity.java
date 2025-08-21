package com.example.ingame;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.ingame.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        TextView actionBar=binding.customActionBar.actionb;

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_members, R.id.navigation_attendance, R.id.navigation_settings)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        navController.addOnDestinationChangedListener((controller, destination, arguments) -> {
            int id = destination.getId();
            if (id == R.id.navigation_home) {
                binding.customActionBar.actionb.setText("Home");
            } else if (id == R.id.navigation_members) {
                binding.customActionBar.actionb.setText("Members");
            } else if (id == R.id.navigation_attendance) {
                binding.customActionBar.actionb.setText("Attendance");
            } else if (id == R.id.navigation_settings) {
                binding.customActionBar.actionb.setText("Settings");
            }
        });
        NavigationUI.setupWithNavController(binding.navView, navController);
    }

}