package cn.windwood.apps.googleplayserviceschecker;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import cn.windwood.apps.googleplayserviceschecker.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }

    public void servicesInfo(View view) {
    }

    public void storeInfo(View view) {
    }

    public void aboutInfo(View view) {
    }
}