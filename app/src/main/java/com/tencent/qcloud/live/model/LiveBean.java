package com.tencent.qcloud.live.model;

import java.util.List;

/**
 * Created by wankaz on 16/7/9.
 */
public class LiveBean {

    /**
     * errorInfo :
     * data : {"recordList":[{"chatRoomId":"22472","avRoomId":22472,"watchCount":2,"timeSpan":0,"title":"hhhhh","admireCount":2,"host":{"uid":"15195800551","avatar":"http://wx.qlogo.cn/mmopen/N4HWkmwbSVSCTibc5ZHQs52BXmgeZNrhO8Fz0StGjicGuCejUFprou7FZJa44Micwz3093HdniarzZdiaytFWgVeoQA/0","username":"tearsfly"},"cover":"","createTime":1468031784,"lbs":{"address":"","longitude":0,"latitude":0}},{"chatRoomId":"88","avRoomId":88,"watchCount":1,"timeSpan":150,"title":"(null) Live","admireCount":0,"host":{"uid":"100008","avatar":"","username":"100008"},"cover":"","createTime":1468031753,"lbs":{"address":"","longitude":0,"latitude":0}},{"chatRoomId":"23235","avRoomId":23235,"watchCount":0,"timeSpan":0,"title":"dffg","admireCount":0,"host":{"uid":"chengxh","avatar":"","username":""},"cover":"","createTime":1468031753,"lbs":{"address":"","longitude":0,"latitude":0}},{"chatRoomId":"27763","avRoomId":27763,"watchCount":0,"timeSpan":0,"title":"我的直播我做主","admireCount":0,"host":{"uid":"07f8ed2c92074499841ff529ede0be92","avatar":"http://kipo-att-test.img-cn-beijing.aliyuncs.com/201605/f7a27064861b47388a552408620592bd.jpg@!160x160","username":"我叫MT"},"cover":"","createTime":1468031624,"lbs":{"address":"","longitude":0,"latitude":0}}],"totalItem":4}
     * errorCode : 0
     */

    private String errorInfo;
    /**
     * recordList : [{"chatRoomId":"22472","avRoomId":22472,"watchCount":2,"timeSpan":0,"title":"hhhhh","admireCount":2,"host":{"uid":"15195800551","avatar":"http://wx.qlogo.cn/mmopen/N4HWkmwbSVSCTibc5ZHQs52BXmgeZNrhO8Fz0StGjicGuCejUFprou7FZJa44Micwz3093HdniarzZdiaytFWgVeoQA/0","username":"tearsfly"},"cover":"","createTime":1468031784,"lbs":{"address":"","longitude":0,"latitude":0}},{"chatRoomId":"88","avRoomId":88,"watchCount":1,"timeSpan":150,"title":"(null) Live","admireCount":0,"host":{"uid":"100008","avatar":"","username":"100008"},"cover":"","createTime":1468031753,"lbs":{"address":"","longitude":0,"latitude":0}},{"chatRoomId":"23235","avRoomId":23235,"watchCount":0,"timeSpan":0,"title":"dffg","admireCount":0,"host":{"uid":"chengxh","avatar":"","username":""},"cover":"","createTime":1468031753,"lbs":{"address":"","longitude":0,"latitude":0}},{"chatRoomId":"27763","avRoomId":27763,"watchCount":0,"timeSpan":0,"title":"我的直播我做主","admireCount":0,"host":{"uid":"07f8ed2c92074499841ff529ede0be92","avatar":"http://kipo-att-test.img-cn-beijing.aliyuncs.com/201605/f7a27064861b47388a552408620592bd.jpg@!160x160","username":"我叫MT"},"cover":"","createTime":1468031624,"lbs":{"address":"","longitude":0,"latitude":0}}]
     * totalItem : 4
     */

    private DataBean data;
    private int errorCode;

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public static class DataBean {
        private int totalItem;
        /**
         * chatRoomId : 22472
         * avRoomId : 22472
         * watchCount : 2
         * timeSpan : 0
         * title : hhhhh
         * admireCount : 2
         * host : {"uid":"15195800551","avatar":"http://wx.qlogo.cn/mmopen/N4HWkmwbSVSCTibc5ZHQs52BXmgeZNrhO8Fz0StGjicGuCejUFprou7FZJa44Micwz3093HdniarzZdiaytFWgVeoQA/0","username":"tearsfly"}
         * cover :
         * createTime : 1468031784
         * lbs : {"address":"","longitude":0,"latitude":0}
         */

        private List<RecordListBean> recordList;

        public int getTotalItem() {
            return totalItem;
        }

        public void setTotalItem(int totalItem) {
            this.totalItem = totalItem;
        }

        public List<RecordListBean> getRecordList() {
            return recordList;
        }

        public void setRecordList(List<RecordListBean> recordList) {
            this.recordList = recordList;
        }

        public static class RecordListBean {
            private String chatRoomId;
            private int avRoomId;
            private int watchCount;
            private int timeSpan;
            private String title;
            private int admireCount;
            /**
             * uid : 15195800551
             * avatar : http://wx.qlogo.cn/mmopen/N4HWkmwbSVSCTibc5ZHQs52BXmgeZNrhO8Fz0StGjicGuCejUFprou7FZJa44Micwz3093HdniarzZdiaytFWgVeoQA/0
             * username : tearsfly
             */

            private HostBean host;
            private String cover;
            private int createTime;
            /**
             * address :
             * longitude : 0
             * latitude : 0
             */

            private LbsBean lbs;

            public String getChatRoomId() {
                return chatRoomId;
            }

            public void setChatRoomId(String chatRoomId) {
                this.chatRoomId = chatRoomId;
            }

            public int getAvRoomId() {
                return avRoomId;
            }

            public void setAvRoomId(int avRoomId) {
                this.avRoomId = avRoomId;
            }

            public int getWatchCount() {
                return watchCount;
            }

            public void setWatchCount(int watchCount) {
                this.watchCount = watchCount;
            }

            public int getTimeSpan() {
                return timeSpan;
            }

            public void setTimeSpan(int timeSpan) {
                this.timeSpan = timeSpan;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getAdmireCount() {
                return admireCount;
            }

            public void setAdmireCount(int admireCount) {
                this.admireCount = admireCount;
            }

            public HostBean getHost() {
                return host;
            }

            public void setHost(HostBean host) {
                this.host = host;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public int getCreateTime() {
                return createTime;
            }

            public void setCreateTime(int createTime) {
                this.createTime = createTime;
            }

            public LbsBean getLbs() {
                return lbs;
            }

            public void setLbs(LbsBean lbs) {
                this.lbs = lbs;
            }

            public static class HostBean {
                private String uid;
                private String avatar;
                private String username;

                public String getUid() {
                    return uid;
                }

                public void setUid(String uid) {
                    this.uid = uid;
                }

                public String getAvatar() {
                    return avatar;
                }

                public void setAvatar(String avatar) {
                    this.avatar = avatar;
                }

                public String getUsername() {
                    return username;
                }

                public void setUsername(String username) {
                    this.username = username;
                }
            }

            public static class LbsBean {
                private String address;
                private int longitude;
                private int latitude;

                public String getAddress() {
                    return address;
                }

                public void setAddress(String address) {
                    this.address = address;
                }

                public int getLongitude() {
                    return longitude;
                }

                public void setLongitude(int longitude) {
                    this.longitude = longitude;
                }

                public int getLatitude() {
                    return latitude;
                }

                public void setLatitude(int latitude) {
                    this.latitude = latitude;
                }
            }
        }
    }
}
