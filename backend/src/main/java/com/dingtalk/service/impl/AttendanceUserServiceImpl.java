package com.dingtalk.service.impl;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiAttendanceGroupMemberListRequest;
import com.dingtalk.api.request.OapiAttendanceGroupUsersAddRequest;
import com.dingtalk.api.request.OapiAttendanceGroupUsersQueryRequest;
import com.dingtalk.api.response.OapiAttendanceGroupMemberListResponse;
import com.dingtalk.api.response.OapiAttendanceGroupUsersAddResponse;
import com.dingtalk.api.response.OapiAttendanceGroupUsersQueryResponse;
import com.dingtalk.constant.UrlConstant;
import com.dingtalk.model.userrequest.AddUserRequest;
import com.dingtalk.model.userrequest.GetUserRequest;
import com.dingtalk.service.AttendanceUserService;
import com.dingtalk.util.AccessTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttendanceUserServiceImpl implements AttendanceUserService {

    @Autowired
    private AccessTokenUtil accessTokenUtil;

    @Override
    public OapiAttendanceGroupUsersAddResponse.Result addGroupUser(AddUserRequest request) throws Exception {
        //首先获取accessToken,然后调用api
        String accessToken = accessTokenUtil.getAccessToken();
        DingTalkClient client = new DefaultDingTalkClient(UrlConstant.ADD_ATTENDANCE_USER);
        OapiAttendanceGroupUsersAddRequest req = new OapiAttendanceGroupUsersAddRequest();
        //传入操作人id、考勤组key、用户id(,拼接)
        req.setOpUserid(request.getOpUserid());
        req.setGroupKey(request.getGroupKey());
        req.setUserIdList(request.getUserIdList());
        OapiAttendanceGroupUsersAddResponse rsp = client.execute(req, accessToken);
        return rsp.getResult();
    }

    @Override
    public OapiAttendanceGroupMemberListResponse.PageResult getGroupUser(GetUserRequest request) throws Exception {
        //首先获取accessToken,然后调用api
        String accessToken = accessTokenUtil.getAccessToken();
        DingTalkClient client = new DefaultDingTalkClient(UrlConstant.GET_ATTENDANCE_USER);
        OapiAttendanceGroupMemberListRequest req = new OapiAttendanceGroupMemberListRequest();
        //传入操作人id、考勤组key、游标值
        req.setCursor(request.getCursor());
        req.setOpUserId(request.getOpUserId());
        req.setGroupId(req.getGroupId());
        OapiAttendanceGroupMemberListResponse rsp = client.execute(req, accessToken);
        return rsp.getResult();
    }

    @Override
    public OapiAttendanceGroupMemberListResponse.PageResult getGroupUserId(GetUserRequest request) throws Exception {
        //首先获取accessToken,然后调用api
        String accessToken = accessTokenUtil.getAccessToken();
        DingTalkClient client = new DefaultDingTalkClient(UrlConstant.GET_ATTENDANCE_USER_ID);
        OapiAttendanceGroupMemberListRequest req = new OapiAttendanceGroupMemberListRequest();
        //传入操作人id、考勤组key、游标值
        req.setCursor(request.getCursor());
        req.setOpUserId(request.getOpUserId());
        req.setGroupId(req.getGroupId());
        OapiAttendanceGroupMemberListResponse rsp = client.execute(req, accessToken);
        return rsp.getResult();
    }

    @Override
    public OapiAttendanceGroupUsersQueryResponse.DingOpenResult getGroupUserList(GetUserRequest request) throws Exception {
        //首先获取accessToken,然后调用api
        String accessToken = accessTokenUtil.getAccessToken();
        DingTalkClient client = new DefaultDingTalkClient(UrlConstant.GET_ATTENDANCE_USER_LIST);
        OapiAttendanceGroupUsersQueryRequest req = new OapiAttendanceGroupUsersQueryRequest();
        //传入操作人id、考勤组key、游标值
        req.setSize(request.getSize());
        req.setCursor(request.getCursor().toString());
        req.setOpUserid(request.getOpUserId());
        req.setGroupKey(request.getGroupId().toString());
        OapiAttendanceGroupUsersQueryResponse rsp = client.execute(req, accessToken);
        return rsp.getResult();
    }

}
