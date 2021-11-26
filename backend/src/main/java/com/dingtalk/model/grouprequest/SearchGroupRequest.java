package com.dingtalk.model.grouprequest;

/**
 * @Description: 搜索考勤组请求实体
 */
public class SearchGroupRequest {

    /** 操作人userid */
    private String opUserId;

    /** 考勤组名称 */
    private String groupName;

    public SearchGroupRequest(String opUserId, String groupName) {
        this.opUserId = opUserId;
        this.groupName = groupName;
    }

    public String getOpUserId() {
        return opUserId;
    }

    public void setOpUserId(String opUserId) {
        this.opUserId = opUserId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
