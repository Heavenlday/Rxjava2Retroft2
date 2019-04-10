package com.nt.rxjava2retroft2.baseImpl;

/**
 * HuangPengHua
 * 2019-04-08
 */
public interface BaseView {
    //显示dialog
    void showLoadingDialog(String msg);

    //取消dialog
    void dismissLoadingDialog();
}
