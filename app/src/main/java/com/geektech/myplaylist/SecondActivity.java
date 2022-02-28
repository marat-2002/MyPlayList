package com.geektech.myplaylist;

import android.os.Bundle;
import android.view.LayoutInflater;

import androidx.appcompat.app.AppCompatActivity;

import com.geektech.myplaylist.databinding.SecondActivityBinding;

public class SecondActivity extends AppCompatActivity {
    private SecondActivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = SecondActivityBinding.inflate(LayoutInflater.from(getApplicationContext()));
        setContentView(binding.getRoot());
        binding.text.setText(getIntent().getStringExtra("text"));
        binding.text1.setText(getIntent().getStringExtra("text_1"));
    }
}
