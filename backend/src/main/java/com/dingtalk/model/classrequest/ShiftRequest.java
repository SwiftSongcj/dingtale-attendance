package com.dingtalk.model.classrequest;

/**
 * @Description:  获取班次详情请求实体
 */
public class ShiftRequest {

    /** 操作者的userid */
    private String opUserId;

    /** 班次ID */
    private Long shiftId;

    public String getOpUserId() {
        return opUserId;
    }

    public void setOpUserId(String opUserId) {
        this.opUserId = opUserId;
    }

    public Long getShiftId() {
        return shiftId;
    }

    public void setShiftId(Long shiftId) {
        this.shiftId = shiftId;
    }
}
