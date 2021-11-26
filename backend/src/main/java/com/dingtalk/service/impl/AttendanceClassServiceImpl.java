package com.dingtalk.service.impl;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiAttendanceShiftAddRequest;
import com.dingtalk.api.request.OapiAttendanceShiftQueryRequest;
import com.dingtalk.api.response.OapiAttendanceShiftAddResponse;
import com.dingtalk.api.response.OapiAttendanceShiftQueryResponse;
import com.dingtalk.constant.UrlConstant;
import com.dingtalk.model.classrequest.AddClassRequest;
import com.dingtalk.model.classrequest.ShiftRequest;
import com.dingtalk.service.AttendanceClassService;
import com.dingtalk.util.AccessTokenUtil;
import com.taobao.api.ApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttendanceClassServiceImpl implements AttendanceClassService {

    @Autowired
    private AccessTokenUtil accessTokenUtil;

    @Override
    public OapiAttendanceShiftAddResponse.TopAtClassVo addClass(AddClassRequest request) throws ApiException {
        //首先获取accessToken,然后调用api
        String accessToken = accessTokenUtil.getAccessToken();
        DingTalkClient client = new DefaultDingTalkClient(UrlConstant.CREATE_ATTENDANCE_CLASS);
        OapiAttendanceShiftAddRequest req = new OapiAttendanceShiftAddRequest();
        //此处设置参数过多不展示,具体可参考官方文档https://developers.dingtalk.com/document/app/create-modify-shifts
        OapiAttendanceShiftAddResponse response = client.execute(req, accessToken);
        return response.getResult();
    }

    @Override
    public OapiAttendanceShiftQueryResponse.TopShiftVo getClass(ShiftRequest request) throws ApiException {
        //首先获取accessToken,然后调用api
        String accessToken = accessTokenUtil.getAccessToken();
        DingTalkClient client = new DefaultDingTalkClient(UrlConstant.GET_ATTENDANCE_CLASS);
        OapiAttendanceShiftQueryRequest req = new OapiAttendanceShiftQueryRequest();
        req.setOpUserId(request.getOpUserId());
        req.setShiftId(request.getShiftId());
        OapiAttendanceShiftQueryResponse rsp = client.execute(req, accessToken);
        return rsp.getResult();
    }

}
