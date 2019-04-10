package com.nt.rxjava2retroft2.contract;

import com.nt.rxjava2retroft2.baseImpl.BaseView;

/**
 * HuangPengHua
 * 2019-04-08
 */
public interface NewsContract {
    interface Model {
        void getMsg();
    }

    interface View extends BaseView {
        void showMsg(String msg);
    }

    interface Presenter {
        void getMsg();
        void showMsg(String msg);
    }
}
