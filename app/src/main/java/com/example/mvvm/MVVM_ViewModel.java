package com.example.mvvm;

import androidx.databinding.ObservableField;
import androidx.lifecycle.ViewModel;

public class MVVM_ViewModel  extends ViewModel {

    public ObservableField<String> account = new ObservableField<>("");
    public ObservableField<String> pwd = new ObservableField<>("");
    public ObservableField<String> result = new ObservableField<>("");

    MVVM_Model mvvmModel;
    public MVVM_ViewModel() {
        mvvmModel = new MVVM_Model();
    }

    public void login(){
        boolean loginResult = mvvmModel.login(account.get(), pwd.get());
        result.set(loginResult ? "登录结果：成功" :"登录结果：失败");
    }

}
