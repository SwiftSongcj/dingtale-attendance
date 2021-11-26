package com.dingtalk.service;

import com.dingtalk.api.request.OapiAttendanceGroupAddRequest;
import com.dingtalk.api.response.*;
import com.dingtalk.model.grouprequest.*;

import java.util.List;


/**
 * @Description: 考勤组业务层
 */
public interface AttendanceGroupService {

    /**
     * @description: 批量获取考勤组详情
     * @param request
     * @return: AtGroupListForTopVo
     */
    OapiAttendanceGetsimplegroupsResponse.AtGroupListForTopVo getSimpleGroups(PageRequest request) throws Exception;

    /**
     * @description: 获取用户考勤组
     * @param request
     * @return: AtGroupFullForTopVo
     */
    OapiAttendanceGetusergroupResponse.AtGroupFullForTopVo getUserGroup(UserRequest request) throws Exception;

    /**
     * @description: 批量获取考勤组摘要
     * @param request
     * @return: PageResult
     */
    OapiAttendanceGroupMinimalismListResponse.PageResult getGroupDetailBatch(GroupDetailRequest request) throws Exception;

    /**
     * @description: 获取考勤组详情
     * @param request
     * @return: TopSimpleGroupVO
     */
    OapiAttendanceGroupQueryResponse.TopSimpleGroupVO getGroupDetail(GetGroupRequest request) throws Exception;

    /**
     * @description: 搜索考勤组摘要
     * @param request
     * @return: TopMinimalismGroupVO
     */
    List<OapiAttendanceGroupSearchResponse.TopMinimalismGroupVO> searchGroup(SearchGroupRequest request) throws Exception;

    /**
     * @description: 创建考勤组
     * @param request
     * @return: TopGroupVo
     */
    OapiAttendanceGroupAddResponse.TopGroupVo createGroup(OapiAttendanceGroupAddRequest.TopGroupVo request) throws Exception;

    /**
     * @description: 删除考勤组
     * @param request
     * @return: String
     */
    String deleteGroup(DeleteGroupRequest request) throws Exception;
}
