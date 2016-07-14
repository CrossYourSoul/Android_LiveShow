package com.tencent.qcloud.live.model;

import java.util.List;

/**
 * Created by wankaz on 16/7/8.
 */
public class LoginInfo {

    private DataBean data;
    /**
     * data : {"sign":["eJxljl1PgzAYhe-5FaS3M1oKrKl3DJxB2dwySIY3BGkZlY3yUVbU*N9VXCKJ5-Z53vecD03XdRAGu*s0y0RfyUS*1QzotzqA4OoP1jWnSSoTs6X-IBtq3rIkzSVrR2jYto0gnDqcskrynF8MyTpJCJkIHS2TseX3g-V9bhiYmFOFH0a4uotdf*stjzEONiK8nzcoos5j2VunYO0tVFggZ-nSq*GwaEo1zITyC2ezi2auyqJnhw8ra*97N3gdv2dNL5mQ*Nw8Fa9qf9w*mG4*qZT8xC6D5phghG08oWfWdlxUo4CgYRvIhD8B2qf2BRvdXrU_"]}
     * errorCode : 0
     * errorInfo :
     */

    private int errorCode;
    private String errorInfo;

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

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public static class DataBean {
        private List<String> sign;

        public List<String> getSign() {
            return sign;
        }

        public void setSign(List<String> sign) {
            this.sign = sign;
        }
    }
}
