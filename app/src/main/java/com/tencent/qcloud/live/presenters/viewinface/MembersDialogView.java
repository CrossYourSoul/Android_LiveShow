package com.tencent.qcloud.live.presenters.viewinface;

import com.tencent.qcloud.live.model.MemberInfo;

import java.util.ArrayList;


/**
 * 成员列表回调
 */
public interface MembersDialogView extends MvpView {

    void showMembersList(ArrayList<MemberInfo> data);

}
