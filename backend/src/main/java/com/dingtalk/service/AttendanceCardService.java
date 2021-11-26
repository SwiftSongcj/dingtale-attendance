package com.dingtalk.service;

import com.dingtalk.api.response.OapiAttendanceListRecordResponse;
import com.dingtalk.api.response.OapiAttendanceListResponse;
import com.dingtalk.model.cardrequest.CardDetailRequest;
import com.dingtalk.model.cardrequest.GetCardRequest;
import com.taobao.api.ApiException;

import java.util.List;

/**
 * @Description: 考勤打卡业务层
 */
public interface AttendanceCardService {

    /**
     * @description: 获取打卡结果
     * @param request
     * @return: Recordresult
     */
    List<OapiAttendanceListResponse.Recordresult> getCardList(GetCardRequest request) throws Exception;

    /**
     * @description: 获取打卡详情
     * @param request
     * @return: Recordresult
     */
    List<OapiAttendanceListRecordResponse.Recordresult> getCardDetail(CardDetailRequest request) throws ApiException, Exception;
}
