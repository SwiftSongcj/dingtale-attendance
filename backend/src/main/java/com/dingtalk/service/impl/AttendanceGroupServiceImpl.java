package com.dingtalk.service.impl;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.*;
import com.dingtalk.api.response.*;
import com.dingtalk.constant.UrlConstant;
import com.dingtalk.model.grouprequest.*;
import com.dingtalk.service.AttendanceGroupService;
import com.dingtalk.util.AccessTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceGroupServiceImpl implements AttendanceGroupService {

    @Autowired
    private AccessTokenUtil accessTokenUtil;

    @Override
    public OapiAttendanceGetsimplegroupsResponse.AtGroupListForTopVo getSimpleGroups(PageRequest request) throws Exception {
        //首先获取accessToken,然后调用api
        String accessToken = accessTokenUtil.getAccessToken();
        DingTalkClient client = new DefaultDingTalkClient(UrlConstant.GET_ATTENDANCE_GROUP_BATCH);
        OapiAttendanceGetsimplegroupsRequest req = new OapiAttendanceGetsimplegroupsRequest();
        //传入分页参数
        req.setOffset(req.getOffset());
        req.setSize(req.getSize());
        OapiAttendanceGetsimplegroupsResponse rsp = client.execute(req, accessToken);
        return rsp.getResult();
    }

    @Override
    public OapiAttendanceGetusergroupResponse.AtGroupFullForTopVo getUserGroup(UserRequest request) throws Exception {
        //首先获取accessToken,然后调用api
        String accessToken = accessTokenUtil.getAccessToken();
        DingTalkClient client = new DefaultDingTalkClient(UrlConstant.GET_USER_ATTENDANCE_GROUP);
        OapiAttendanceGetusergroupRequest req = new OapiAttendanceGetusergroupRequest();
        //传入用户id
        req.setUserid(request.getUserid());
        OapiAttendanceGetusergroupResponse rsp = client.execute(req, accessToken);
        return rsp.getResult();
    }

    @Override
    public OapiAttendanceGroupMinimalismListResponse.PageResult getGroupDetailBatch(GroupDetailRequest request) throws Exception {
        //首先获取accessToken,然后调用api
        String accessToken = accessTokenUtil.getAccessToken();
        DingTalkClient client = new DefaultDingTalkClient(UrlConstant.GET_ATTENDANCE_GROUP_DETAIL_BATCH);
        OapiAttendanceGroupMinimalismListRequest req = new OapiAttendanceGroupMinimalismListRequest();
        //传入用户id和游标
        req.setOpUserId(request.getOpUserId());
        req.setCursor(req.getCursor());
        OapiAttendanceGroupMinimalismListResponse rsp = client.execute(req, accessToken);
        return  rsp.getResult();
    }

    @Override
    public OapiAttendanceGroupQueryResponse.TopSimpleGroupVO getGroupDetail(GetGroupRequest request) throws Exception {
        //首先获取accessToken,然后调用api
        String accessToken = accessTokenUtil.getAccessToken();
        DingTalkClient client = new DefaultDingTalkClient(UrlConstant.GET_ATTENDANCE_GROUP_DETAIL);
        OapiAttendanceGroupQueryRequest req = new OapiAttendanceGroupQueryRequest();
        //传入用户id和考勤组id
        req.setOpUserId(request.getOpUserId());
        req.setGroupId(request.getGroupId());
        OapiAttendanceGroupQueryResponse rsp = client.execute(req, accessToken);
        return rsp.getResult();
    }

    @Override
    public List<OapiAttendanceGroupSearchResponse.TopMinimalismGroupVO> searchGroup(SearchGroupRequest request) throws Exception {
        //首先获取accessToken,然后调用api
        String accessToken = accessTokenUtil.getAccessToken();
        DingTalkClient client = new DefaultDingTalkClient(UrlConstant.SEARCH_ATTENDANCE_GROUP);
        OapiAttendanceGroupSearchRequest req = new OapiAttendanceGroupSearchRequest();
        //传入操作人id和考勤组名称
        req.setOpUserId(request.getOpUserId());
        req.setGroupName(request.getGroupName());
        OapiAttendanceGroupSearchResponse rsp = client.execute(req, accessToken);
        return rsp.getResult();
    }

    @Override
    public OapiAttendanceGroupAddResponse.TopGroupVo createGroup(OapiAttendanceGroupAddRequest.TopGroupVo topGroupVo) throws Exception {
        //首先获取accessToken,然后调用api
        String accessToken = accessTokenUtil.getAccessToken();
        DingTalkClient client = new DefaultDingTalkClient(UrlConstant.CREATE_ATTENDANCE_GROUP);
        //此处参数过多,不一一展示,详情参考官方接口文档,地址: https://developers.dingtalk.com/document/app/attendance-group-write
        OapiAttendanceGroupAddRequest req = new OapiAttendanceGroupAddRequest();
        OapiAttendanceGroupAddResponse rsp = client.execute(req, accessToken);
        return rsp.getResult();
    }

    @Override
    public String deleteGroup(DeleteGroupRequest request) throws Exception {
        //首先获取accessToken,然后调用api
        String accessToken = accessTokenUtil.getAccessToken();
        DingTalkClient client = new DefaultDingTalkClient(UrlConstant.DELETE_ATTENDANCE_GROUP);
        OapiAttendanceGroupDeleteRequest req = new OapiAttendanceGroupDeleteRequest();
        //传入操作人id和考勤组id
        req.setOpUserid(request.getOpUserid());
        req.setGroupKey(request.getGroupKey());
        OapiAttendanceGroupDeleteResponse rsp = client.execute(req, accessToken);
        return rsp.getResult();
    }

}
