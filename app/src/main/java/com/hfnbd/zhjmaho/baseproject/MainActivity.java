package com.hfnbd.zhjmaho.baseproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hfnbd.zhjmaho.baseproject.adapter.HomeAdapter;
import com.hfnbd.zhjmaho.baseproject.entity.HomeItem;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rv_test)
    RecyclerView rv_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initView();
    }

    private void initView() {
        String url = "https://i.pximg.net/c/768x1200_80/img-master/img/2017/02/14/20/01/51/61453558_p0_master1200.jpg";
        HomeItem homeItem = new HomeItem(url);
        List<HomeItem> list = new ArrayList();
        list.add(homeItem);
        rv_test.setLayoutManager(new LinearLayoutManager(this));
        rv_test.setAdapter(new HomeAdapter(R.layout.item_layout,list));

    }
}
