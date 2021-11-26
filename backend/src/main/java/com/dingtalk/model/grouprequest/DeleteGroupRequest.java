package com.dingtalk.model.grouprequest;

/**
 * @Description:  删除班次请求实体
 */
public class DeleteGroupRequest {

    /** 操作人userId */
    private String opUserid;

    /** 考勤组ID */
    private String groupKey;

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
}
