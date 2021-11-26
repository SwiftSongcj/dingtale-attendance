package com.dingtalk.model.classrequest;

import com.dingtalk.api.request.OapiAttendanceShiftAddRequest;

/**
 * @Description: 新增班次请求实体
 */
public class AddClassRequest {

    /** 操作人userId*/
    private String opUserId;

    /** 班次 */
    private OapiAttendanceShiftAddRequest.TopAtClassVo shift;

    public String getOpUserId() {
        return opUserId;
    }

    public void setOpUserId(String opUserId) {
        this.opUserId = opUserId;
    }

    public OapiAttendanceShiftAddRequest.TopAtClassVo getShift() {
        return shift;
    }

    public void setShift(OapiAttendanceShiftAddRequest.TopAtClassVo shift) {
        this.shift = shift;
    }
}
