package com.dingtalk.service;

import com.dingtalk.api.response.OapiAttendanceShiftAddResponse;
import com.dingtalk.api.response.OapiAttendanceShiftQueryResponse;
import com.dingtalk.model.classrequest.AddClassRequest;
import com.dingtalk.model.classrequest.ShiftRequest;
import com.taobao.api.ApiException;

/**
 * @Description: 考勤班次业务层
 */
public interface AttendanceClassService {

    /**
     * @description: 创建班次
     * @param request
     * @return: TopShiftVo
     */
    OapiAttendanceShiftAddResponse.TopAtClassVo addClass(AddClassRequest request) throws ApiException;

    /**
     * @description: 获取班次详情
     * @param request
     * @return: TopShiftVo
     */
    OapiAttendanceShiftQueryResponse.TopShiftVo getClass(ShiftRequest request) throws ApiException;
}
