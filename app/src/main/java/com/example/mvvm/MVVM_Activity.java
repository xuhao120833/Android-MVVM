package com.example.mvvm;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.example.mvvm.databinding.ActivityMainMvvmBinding;

public class MVVM_Activity extends AppCompatActivity {

    MVVM_ViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainMvvmBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main_mvvm);
        viewModel = new ViewModelProvider(this).get(MVVM_ViewModel.class);
        binding.setVariable(BR.viewModel, viewModel);
        binding.setLifecycleOwner(this);
        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.login();
            }
        });

    }

}
