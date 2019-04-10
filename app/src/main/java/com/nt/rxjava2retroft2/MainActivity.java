package com.nt.rxjava2retroft2;

import android.os.Bundle;
import android.util.Log;

import com.nt.rxjava2retroft2.baseImpl.BaseActivity;
import com.nt.rxjava2retroft2.contract.NewsContract;
import com.nt.rxjava2retroft2.presenter.NewsPresenter;

public class MainActivity extends BaseActivity<
        NewsPresenter> implements NewsContract.View {
    private String TAG="News";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter.getMsg();
    }

    @Override
    public NewsPresenter initPresenter() {
        return new NewsPresenter(this);
    }

    @Override
    public void showMsg(String msg) {
        Log.e(TAG, "showMsg: "+msg);
    }

}
