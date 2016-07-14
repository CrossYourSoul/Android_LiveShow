package com.tencent.qcloud.live.presenters.viewinface;

import com.tencent.qcloud.live.model.LiveInfoJson;

import java.util.ArrayList;


/**
 *  列表页面回调
 */
public interface LiveListView extends MvpView{

    void showFirstPage(ArrayList<LiveInfoJson> livelist);
}
