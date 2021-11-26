package com.dingtalk.controller;

import com.dingtalk.api.response.OapiAttendanceGroupMemberListResponse;
import com.dingtalk.api.response.OapiAttendanceGroupUsersAddResponse;
import com.dingtalk.api.response.OapiAttendanceGroupUsersQueryResponse;
import com.dingtalk.constant.ErrorCodeConstant;
import com.dingtalk.model.RpcServiceResult;
import com.dingtalk.model.userrequest.AddUserRequest;
import com.dingtalk.model.userrequest.GetUserRequest;
import com.dingtalk.service.AttendanceUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 考勤组人员控制层
 */
@RestController
@RequestMapping("/attendance/group/user")
public class AttendanceUserController {

    @Autowired
    private AttendanceUserService attendanceUserService;

    /**
     * @description: 批量新增参与考勤人员
     * @return: Result
     */
    @PostMapping(value = "/addGroupUser")
    RpcServiceResult<OapiAttendanceGroupUsersAddResponse.Result> addGroupUser(AddUserRequest request) throws Exception {
        RpcServiceResult<OapiAttendanceGroupUsersAddResponse.Result> objectRpcServiceResult = new RpcServiceResult<>();
        OapiAttendanceGroupUsersAddResponse.Result result = attendanceUserService.addGroupUser(request);
        objectRpcServiceResult.setData(result);
        objectRpcServiceResult.setSuccess(true);
        objectRpcServiceResult.setErrorCode(ErrorCodeConstant.SUCCESS_STRING);
        return objectRpcServiceResult;
    }

    /**
     * @description: 获取参与考勤人员
     * @return: PageResult
     */
    @PostMapping(value = "/getGroupUser")
    RpcServiceResult<OapiAttendanceGroupMemberListResponse.PageResult> getGroupUser(GetUserRequest request) throws Exception {
        RpcServiceResult<OapiAttendanceGroupMemberListResponse.PageResult> objectRpcServiceResult = new RpcServiceResult<>();
        OapiAttendanceGroupMemberListResponse.PageResult result = attendanceUserService.getGroupUser(request);
        objectRpcServiceResult.setData(result);
        objectRpcServiceResult.setSuccess(true);
        objectRpcServiceResult.setErrorCode(ErrorCodeConstant.SUCCESS_STRING);
        return objectRpcServiceResult;
    }

    /**
     * @description: 获取参与考勤人员的userid
     * @return: PageResult
     */
    @PostMapping(value = "/getGroupUserId")
    RpcServiceResult<OapiAttendanceGroupMemberListResponse.PageResult> getGroupUserId(GetUserRequest request) throws Exception {
        RpcServiceResult<OapiAttendanceGroupMemberListResponse.PageResult> objectRpcServiceResult = new RpcServiceResult<>();
        OapiAttendanceGroupMemberListResponse.PageResult result = attendanceUserService.getGroupUserId(request);
        objectRpcServiceResult.setData(result);
        objectRpcServiceResult.setSuccess(true);
        objectRpcServiceResult.setErrorCode(ErrorCodeConstant.SUCCESS_STRING);
        return objectRpcServiceResult;
    }

    /**
     * @description: 获取参与考勤人员的userid
     * @return: DingOpenResult
     */
    @PostMapping(value = "/getGroupUserList")
    RpcServiceResult<OapiAttendanceGroupUsersQueryResponse.DingOpenResult> getGroupUserList(GetUserRequest request) throws Exception {
        RpcServiceResult<OapiAttendanceGroupUsersQueryResponse.DingOpenResult> objectRpcServiceResult = new RpcServiceResult<>();
        OapiAttendanceGroupUsersQueryResponse.DingOpenResult result = attendanceUserService.getGroupUserList(request);
        objectRpcServiceResult.setData(result);
        objectRpcServiceResult.setSuccess(true);
        objectRpcServiceResult.setErrorCode(ErrorCodeConstant.SUCCESS_STRING);
        return objectRpcServiceResult;
    }

}
