package com.dingtalk.service;

import com.dingtalk.api.response.OapiAttendanceGroupMemberListResponse;
import com.dingtalk.api.response.OapiAttendanceGroupUsersAddResponse;
import com.dingtalk.api.response.OapiAttendanceGroupUsersQueryResponse;
import com.dingtalk.model.userrequest.AddUserRequest;
import com.dingtalk.model.userrequest.GetUserRequest;

/**
 * @Description: 考勤人员业务层
 */
public interface AttendanceUserService {

    /**
     * @description: 批量新增参与考勤人员
     * @param request
     * @return: Result
     */
    OapiAttendanceGroupUsersAddResponse.Result addGroupUser(AddUserRequest request) throws Exception;

    /**
     * @description: 获取参与考勤人员
     * @param request
     * @return: PageResult
     */
    OapiAttendanceGroupMemberListResponse.PageResult getGroupUser(GetUserRequest request) throws Exception;

    /**
     * @description: 获取参与考勤人员的userid
     * @param request
     * @return: PageResult
     */
    OapiAttendanceGroupMemberListResponse.PageResult getGroupUserId(GetUserRequest request) throws Exception;

    /**
     * @description: 查询参与考勤人员列表
     * @param request
     * @return: DingOpenResult
     */
    OapiAttendanceGroupUsersQueryResponse.DingOpenResult getGroupUserList(GetUserRequest request) throws Exception;
}
