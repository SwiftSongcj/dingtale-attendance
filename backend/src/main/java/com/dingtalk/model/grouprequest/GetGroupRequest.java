package com.dingtalk.model.grouprequest;

/**
 * @Description: 获取考勤组详情请求实体
 */
public class GetGroupRequest {

    /** 操作人userid */
    private String opUserId;

    /** 考勤组ID */
    private Long groupId;

    public String getOpUserId() {
        return opUserId;
    }

    public void setOpUserId(String opUserId) {
        this.opUserId = opUserId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public GetGroupRequest(String opUserId, Long groupId) {
        this.opUserId = opUserId;
        this.groupId = groupId;
    }
}
