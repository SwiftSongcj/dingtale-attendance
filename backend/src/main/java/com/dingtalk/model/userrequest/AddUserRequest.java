package com.dingtalk.model.userrequest;

/**
 * @Description: 新增考勤人员请求实体
 */
public class AddUserRequest {

    /** 操作人userid */
    private String opUserid;

    /** 考勤组ID */
    private String groupKey;

    /** 用户列表，最大值：100 */
    private String userIdList;

    public String getOpUserid() {
        return opUserid;
    }

    public void setOpUserid(String opUserid) {
        this.opUserid = opUserid;
    }

    public String getGroupKey() {
        return groupKey;
    }

    public void setGroupKey(String groupKey) {
        this.groupKey = groupKey;
    }

    public String getUserIdList() {
        return userIdList;
    }

    public void setUserIdList(String userIdList) {
        this.userIdList = userIdList;
    }
}
