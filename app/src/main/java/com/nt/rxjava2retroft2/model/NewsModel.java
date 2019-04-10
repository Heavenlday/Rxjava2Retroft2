package com.nt.rxjava2retroft2.model;

import com.google.gson.JsonObject;
import com.nt.rxjava2retroft2.RetrofitFactory;
import com.nt.rxjava2retroft2.contract.NewsContract;
import com.nt.rxjava2retroft2.presenter.NewsPresenter;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * HuangPengHua
 * 2019-04-08
 */
public class NewsModel implements NewsContract.Model {

    private NewsPresenter np;
    public NewsModel(NewsPresenter newsPresenter)
    {
        np=newsPresenter;
    }
    @Override
    public void getMsg() {

        RetrofitFactory.getInstance().getNews()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<JsonObject>() {
                    @Override
                    public void accept(JsonObject jsonObject) throws Exception {
                        np.showMsg(jsonObject.toString());
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {

                    }
                });

    }
}
