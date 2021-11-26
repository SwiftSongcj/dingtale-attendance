package com.dingtalk.controller;

import com.dingtalk.api.response.OapiAttendanceShiftAddResponse;
import com.dingtalk.api.response.OapiAttendanceShiftQueryResponse;
import com.dingtalk.constant.ErrorCodeConstant;
import com.dingtalk.model.RpcServiceResult;
import com.dingtalk.model.classrequest.AddClassRequest;
import com.dingtalk.model.classrequest.ShiftRequest;
import com.dingtalk.service.AttendanceClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Description: 考勤班次控制层
 */
@RestController
@RequestMapping("/attendance/class")
public class AttendanceClassController {

    @Autowired
    private AttendanceClassService attendanceClassService;

    /**
     * @description: 创建班次
     * @return: TopAtClassVo
     */
    @PostMapping(value = "/addClass")
    RpcServiceResult<OapiAttendanceShiftAddResponse.TopAtClassVo> addClass(AddClassRequest request) throws Exception {
        RpcServiceResult<OapiAttendanceShiftAddResponse.TopAtClassVo> objectRpcServiceResult = new RpcServiceResult<>();
        OapiAttendanceShiftAddResponse.TopAtClassVo result= attendanceClassService.addClass(request);
        objectRpcServiceResult.setData(result);
        objectRpcServiceResult.setSuccess(true);
        objectRpcServiceResult.setErrorCode(ErrorCodeConstant.SUCCESS_STRING);
        return objectRpcServiceResult;
    }

    /**
     * @description: 获取班次详情
     * @return: TopShiftVo
     */
    @PostMapping(value = "/getClass")
    RpcServiceResult<OapiAttendanceShiftQueryResponse.TopShiftVo> getClass(ShiftRequest request) throws Exception {
        RpcServiceResult<OapiAttendanceShiftQueryResponse.TopShiftVo> objectRpcServiceResult = new RpcServiceResult<>();
        OapiAttendanceShiftQueryResponse.TopShiftVo result= attendanceClassService.getClass(request);
        objectRpcServiceResult.setData(result);
        objectRpcServiceResult.setSuccess(true);
        objectRpcServiceResult.setErrorCode(ErrorCodeConstant.SUCCESS_STRING);
        return objectRpcServiceResult;
    }

}
