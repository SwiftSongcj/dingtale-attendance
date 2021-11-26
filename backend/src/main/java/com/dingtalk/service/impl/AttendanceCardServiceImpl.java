package com.dingtalk.service.impl;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiAttendanceListRecordRequest;
import com.dingtalk.api.request.OapiAttendanceListRequest;
import com.dingtalk.api.response.OapiAttendanceListRecordResponse;
import com.dingtalk.api.response.OapiAttendanceListResponse;
import com.dingtalk.constant.UrlConstant;
import com.dingtalk.model.cardrequest.CardDetailRequest;
import com.dingtalk.model.cardrequest.GetCardRequest;
import com.dingtalk.service.AttendanceCardService;
import com.dingtalk.util.AccessTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceCardServiceImpl implements AttendanceCardService {

    @Autowired
    private AccessTokenUtil accessTokenUtil;

    @Override
    public List<OapiAttendanceListResponse.Recordresult> getCardList(GetCardRequest request) throws Exception {
        //首先获取accessToken,然后调用api
        String accessToken = accessTokenUtil.getAccessToken();
        DingTalkClient client = new DefaultDingTalkClient(UrlConstant.GET_ATTENDANCE_CARD_LIST);
        OapiAttendanceListRequest req = new OapiAttendanceListRequest();
        req.setWorkDateFrom(request.getWorkDateFrom());
        req.setWorkDateTo(request.getWorkDateTo());
        req.setUserIdList(request.getUserIdList());
        req.setOffset(request.getOffset());
        req.setLimit(request.getLimit());
        req.setIsI18n(request.getI18n());
        OapiAttendanceListResponse rsp = client.execute(req, accessToken);
        return rsp.getRecordresult();
    }

    @Override
    public List<OapiAttendanceListRecordResponse.Recordresult> getCardDetail(CardDetailRequest request) throws Exception {
        //首先获取accessToken,然后调用api
        String accessToken = accessTokenUtil.getAccessToken();
        DingTalkClient client = new DefaultDingTalkClient(UrlConstant.GET_ATTENDANCE_CARD_DETAIL);
        OapiAttendanceListRecordRequest req = new OapiAttendanceListRecordRequest();
        req.setUserIds(request.getUserIds());
        req.setCheckDateFrom(request.getCheckDateFrom());
        req.setCheckDateTo(request.getCheckDateTo());
        req.setIsI18n(request.getI18n());
        OapiAttendanceListRecordResponse rsp = client.execute(req, accessToken);
        return rsp.getRecordresult();
    }
}
