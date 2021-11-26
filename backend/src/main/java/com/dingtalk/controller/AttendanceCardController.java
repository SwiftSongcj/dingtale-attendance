package com.dingtalk.controller;

import com.dingtalk.api.response.OapiAttendanceListRecordResponse;
import com.dingtalk.api.response.OapiAttendanceListResponse;
import com.dingtalk.constant.ErrorCodeConstant;
import com.dingtalk.model.RpcServiceResult;
import com.dingtalk.model.cardrequest.CardDetailRequest;
import com.dingtalk.model.cardrequest.GetCardRequest;
import com.dingtalk.service.AttendanceCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:  考勤打卡控制层
 */
@RestController
@RequestMapping("/attendance/card")
public class AttendanceCardController {

    @Autowired
    private AttendanceCardService attendanceCardService;

    /**
     * @description: 获取打卡结果
     * @return: Recordresult
     */
    @PostMapping(value = "/getCardList")
    RpcServiceResult<List<OapiAttendanceListResponse.Recordresult>> getCardList(GetCardRequest request) throws Exception {
        RpcServiceResult<List<OapiAttendanceListResponse.Recordresult>> objectRpcServiceResult = new RpcServiceResult<>();
        List<OapiAttendanceListResponse.Recordresult> recordresults = attendanceCardService.getCardList(request);
        objectRpcServiceResult.setData(recordresults);
        objectRpcServiceResult.setSuccess(true);
        objectRpcServiceResult.setErrorCode(ErrorCodeConstant.SUCCESS_STRING);
        return objectRpcServiceResult;
    }

    /**
     * @description: 获取打卡详情
     * @return: Recordresult
     */
    @PostMapping(value = "/getCardDetail")
    RpcServiceResult<List<OapiAttendanceListRecordResponse.Recordresult> > getCardDetail(CardDetailRequest request) throws Exception {
        RpcServiceResult<List<OapiAttendanceListRecordResponse.Recordresult> > objectRpcServiceResult = new RpcServiceResult<>();
        List<OapiAttendanceListRecordResponse.Recordresult>  recordresults = attendanceCardService.getCardDetail(request);
        objectRpcServiceResult.setData(recordresults);
        objectRpcServiceResult.setSuccess(true);
        objectRpcServiceResult.setErrorCode(ErrorCodeConstant.SUCCESS_STRING);
        return objectRpcServiceResult;
    }

}
