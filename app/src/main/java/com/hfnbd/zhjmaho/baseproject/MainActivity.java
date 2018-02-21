package com.hfnbd.zhjmaho.baseproject;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button1)
    Button button;
    private UserProfileViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//        findOrCreateViewFragment();
        viewModel = ViewModelProviders.of(this).get(UserProfileViewModel.class);
//        viewModel.init(userId);
        viewModel.user.observe(this,nameObserver);
    }

    Observer<User> nameObserver = new Observer<User>() {
        @Override
        public void onChanged(@Nullable User user) {
            button.setText(user.getName()+":"+System.currentTimeMillis());
        }
    };
//    private UserProfileFragment findOrCreateViewFragment() {
//    UserProfileFragment UserProfileFragment =
//            (UserProfileFragment) getSupportFragmentManager().findFragmentById(R.id.contentFrame);
//        if (UserProfileFragment == null) {
//        // Create the fragment
//            UserProfileFragment = UserProfileFragment.newInstance();
//            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), UserProfileFragment, R.id.contentFrame);
//        }
//        return UserProfileFragment;
//    }
}
