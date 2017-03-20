package com.utouu.easyjoke.base;

import android.os.Bundle;

import com.marno.easyutilcode.ToastUtil;

/**
 * Create by 黄思程 on 2017/3/20  9:54
 * Function：
 * Desc：带刷新和加载的MVP Activity
 */
public abstract class BaseMVPRefreshAndLoadActivity<V, T extends BasePresenter<V>> extends
        BaseRefreshAndLoadActivity implements IBaseStatusView {

    protected T mPresenter;

    @Override
    protected void _initView(Bundle bundle) {
        //创建代理
        mPresenter = createPresenter();
        //创建关联
        mPresenter.attachView((V) this);

    }

    protected abstract T createPresenter();

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detacheView();
        }
    }

    @Override
    public void noNet() {
        if (easyStatusView != null) {
            easyStatusView.noNet();
        }
        ToastUtil.show("请检查当前网络状态");
    }

    @Override
    public void empty() {
        if (easyStatusView != null) {
            easyStatusView.empty();
        }
    }

    @Override
    public void loading() {
        if (easyStatusView != null) {
            easyStatusView.loading();
        }
    }

    @Override
    public void error(String msg) {
        if (easyStatusView != null) {
            easyStatusView.error();
        }
        ToastUtil.show(msg);
    }

    @Override
    public void content() {
        if (easyStatusView != null) {
            easyStatusView.content();
        }
    }
}
