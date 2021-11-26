package com.dingtalk.model.userrequest;

/**
 * @Description:  获取考勤人员请求实体
 */
public class GetUserRequest {

    /** 游标值 */
    private Long cursor;

    /** 操作人userid */
    private String opUserId;

    /** 操作人userid */
    private Long groupId;

    /** 分页大小 */
    private Long size;

    public Long getCursor() {
        return cursor;
    }

    public void setCursor(Long cursor) {
        this.cursor = cursor;
    }

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

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }
}
