package com.hfnbd.zhjmaho.baseproject;


import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;


/**
 * A simple {@link Fragment} subclass.
 */
public class UserProfileFragment extends Fragment {
    private static final String UID_KEY = "uid";
    private UserProfileViewModel viewModel;
    private Unbinder unbinder;
    @BindView(R.id.tv_name)
    TextView tv_name;
    public UserProfileFragment() {

    }

    public static UserProfileFragment newInstance() {
        return new UserProfileFragment();
    }

    Observer<User> nameObserver = new Observer<User>() {
        @Override
        public void onChanged(@Nullable User user) {
            tv_name.setText(user.getName()+":"+System.currentTimeMillis());
        }
    };
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
//        String userId = getArguments().getString(UID_KEY);
        viewModel = ViewModelProviders.of(getActivity()).get(UserProfileViewModel.class);
//        viewModel.init(userId);
        viewModel.user.observe(this,nameObserver);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View  rootView =  inflater.inflate(R.layout.fragment_user_profile, container, false);
        unbinder = ButterKnife.bind(this,rootView);
        return rootView;
    }

    @OnClick(R.id.tv_name)
    public void changeName(){
        Log.d("ZZZ","change Name");
        User user = new User();
        user.setName("Maho");
        viewModel.user.setValue(user);


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
