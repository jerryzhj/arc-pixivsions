package com.hfnbd.zhjmaho.baseproject;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class UserProfileViewModel extends ViewModel {
    private String userId;
    public MutableLiveData<User> user = new MutableLiveData<>();

    public void init(String userId) {
        this.userId = userId;
    }
}