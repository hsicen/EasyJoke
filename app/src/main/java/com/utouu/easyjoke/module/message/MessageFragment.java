package com.utouu.easyjoke.module.message;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.utouu.easyjoke.R;
import com.utouu.easyjoke.base.BaseFragment;

import butterknife.BindView;

/**
 * Create by 黄思程 on 2016/12/16   10:36
 * Function：
 * Desc：
 */
public class MessageFragment extends BaseFragment {

    @BindView(R.id.tv_indicate)
    TextView tvIndicate;

    @Override
    protected int getLayout() {
        return R.layout.layout_recommend;
    }

    @Override
    protected void _initView(View view, Bundle bundle) {
        tvIndicate.setText("这里是消息页面");
        tvIndicate.setTextColor(Color.BLUE);
    }
}
