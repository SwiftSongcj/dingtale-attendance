package com.dingtalk.model.grouprequest;

/**
 * @Description: 批量获取考勤组摘要请求实体
 */
public class GroupDetailRequest {

    /** 操作人userid */
    private String opUserId;

    /** 游标值，表示从第几个开始，不传默认从第一个开始 */
    private Long cursor;

    public String getOpUserId() {
        return opUserId;
    }

    public void setOpUserId(String opUserId) {
        this.opUserId = opUserId;
    }

    public Long getCursor() {
        return cursor;
    }

    public void setCursor(Long cursor) {
        this.cursor = cursor;
    }

    public GroupDetailRequest(String opUserId, Long cursor) {
        this.opUserId = opUserId;
        this.cursor = cursor;
    }
}
