package com.nt.rxjava2retroft2.presenter;

import com.nt.rxjava2retroft2.baseImpl.BasePresenterImpl;
import com.nt.rxjava2retroft2.contract.NewsContract;
import com.nt.rxjava2retroft2.model.NewsModel;

/**
 * HuangPengHua
 * 2019-04-08
 */
public class NewsPresenter extends BasePresenterImpl<NewsContract.View> implements NewsContract.Presenter{

    private NewsModel newsModel;

    public NewsPresenter(NewsContract.View view)
    {
        super(view);
        newsModel=new NewsModel(this);
    }
    @Override
    public void getMsg() {
        newsModel.getMsg();
    }
    @Override
    public void showMsg(String msg) {
        view.showMsg(msg);
    }

}
