package com.hfnbd.zhjmaho.baseproject.adapter;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.LazyHeaders;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.hfnbd.zhjmaho.baseproject.R;
import com.hfnbd.zhjmaho.baseproject.entity.HomeItem;

import java.util.List;

public class HomeAdapter extends BaseQuickAdapter<HomeItem, BaseViewHolder> {


    public HomeAdapter(int layoutResId, List data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, HomeItem item) {
        // 加载网络图片
        GlideUrl glideUrl = new GlideUrl(item.imgUrl,new LazyHeaders.Builder().addHeader("Referer",item.imgUrl).build());

        Glide.with(mContext).load(glideUrl).into((ImageView) helper.getView(R.id.iv));
    }
}