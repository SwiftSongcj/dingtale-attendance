package com.dingtalk.controller;

import com.dingtalk.api.request.OapiAttendanceGroupAddRequest;
import com.dingtalk.api.response.*;
import com.dingtalk.constant.ErrorCodeConstant;
import com.dingtalk.model.RpcServiceResult;
import com.dingtalk.model.grouprequest.*;
import com.dingtalk.service.AttendanceGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: 考勤组控制层
 */
@RestController
@RequestMapping("/attendance/group")
public class AttendanceGroupController {

    @Autowired
    private AttendanceGroupService attendanceGroupService;

    /**
     * @description: 批量获取考勤组详情
     * @return: AtGroupListForTopVo
     */
    @PostMapping(value = "/getSimpleGroups")
    RpcServiceResult<OapiAttendanceGetsimplegroupsResponse.AtGroupListForTopVo> getSimpleGroups(PageRequest request) throws Exception {
        RpcServiceResult<OapiAttendanceGetsimplegroupsResponse.AtGroupListForTopVo> objectRpcServiceResult = new RpcServiceResult<>();
        OapiAttendanceGetsimplegroupsResponse.AtGroupListForTopVo simpleGroups = attendanceGroupService.getSimpleGroups(request);
        objectRpcServiceResult.setData(simpleGroups);
        objectRpcServiceResult.setSuccess(true);
        objectRpcServiceResult.setErrorCode(ErrorCodeConstant.SUCCESS_STRING);
        return objectRpcServiceResult;
    }

    /**
     * @description: 获取用户考勤组
     * @return: AtGroupFullForTopVo
     */
    @PostMapping(value = "/getUserGroup")
    RpcServiceResult<OapiAttendanceGetusergroupResponse.AtGroupFullForTopVo> getUserGroup(UserRequest request) throws Exception{
        RpcServiceResult<OapiAttendanceGetusergroupResponse.AtGroupFullForTopVo> objectRpcServiceResult = new RpcServiceResult<>();
        OapiAttendanceGetusergroupResponse.AtGroupFullForTopVo simpleGroups = attendanceGroupService.getUserGroup(request);
        objectRpcServiceResult.setData(simpleGroups);
        objectRpcServiceResult.setSuccess(true);
        objectRpcServiceResult.setErrorCode(ErrorCodeConstant.SUCCESS_STRING);
        return objectRpcServiceResult;
    }

    /**
     * @description: 批量获取考勤组摘要
     * @return: PageResult
     */
    @PostMapping(value = "/getGroupDetailBatch")
    RpcServiceResult<OapiAttendanceGroupMinimalismListResponse.PageResult> getGroupDetailBatch(GroupDetailRequest request) throws Exception{
        RpcServiceResult<OapiAttendanceGroupMinimalismListResponse.PageResult> objectRpcServiceResult = new RpcServiceResult<>();
        OapiAttendanceGroupMinimalismListResponse.PageResult  pageResult= attendanceGroupService.getGroupDetailBatch(request);
        objectRpcServiceResult.setData(pageResult);
        objectRpcServiceResult.setSuccess(true);
        objectRpcServiceResult.setErrorCode(ErrorCodeConstant.SUCCESS_STRING);
        return objectRpcServiceResult;
    }

    /**
     * @description: 获取考勤组详情
     * @return: TopSimpleGroupVO
     */
    @PostMapping(value = "/getGroupDetail")
    RpcServiceResult<OapiAttendanceGroupQueryResponse.TopSimpleGroupVO> getGroupDetail(GetGroupRequest request) throws Exception{
        RpcServiceResult<OapiAttendanceGroupQueryResponse.TopSimpleGroupVO> objectRpcServiceResult = new RpcServiceResult<>();
        OapiAttendanceGroupQueryResponse.TopSimpleGroupVO groupDetail = attendanceGroupService.getGroupDetail(request);
        objectRpcServiceResult.setData(groupDetail);
        objectRpcServiceResult.setSuccess(true);
        objectRpcServiceResult.setErrorCode(ErrorCodeConstant.SUCCESS_STRING);
        return objectRpcServiceResult;
    }

    /**
     * @description: 搜索考勤组摘要
     * @return: List<OapiAttendanceGroupSearchResponse.TopMinimalismGroupVO>
     */
    @PostMapping(value = "/searchGroup")
    RpcServiceResult<List<OapiAttendanceGroupSearchResponse.TopMinimalismGroupVO>> searchGroup(SearchGroupRequest request) throws Exception{
        RpcServiceResult<List<OapiAttendanceGroupSearchResponse.TopMinimalismGroupVO>> objectRpcServiceResult = new RpcServiceResult<>();
        List<OapiAttendanceGroupSearchResponse.TopMinimalismGroupVO> searchGroup = attendanceGroupService.searchGroup(request);
        objectRpcServiceResult.setData(searchGroup);
        objectRpcServiceResult.setSuccess(true);
        objectRpcServiceResult.setErrorCode(ErrorCodeConstant.SUCCESS_STRING);
        return objectRpcServiceResult;
    }

    /**
     * @description: 创建考勤组
     * @return: TopGroupVo
     */
    @PostMapping(value = "/createGroup")
    RpcServiceResult<OapiAttendanceGroupAddResponse.TopGroupVo> createGroup(OapiAttendanceGroupAddRequest.TopGroupVo request) throws Exception{
        RpcServiceResult<OapiAttendanceGroupAddResponse.TopGroupVo> objectRpcServiceResult = new RpcServiceResult<>();
        OapiAttendanceGroupAddResponse.TopGroupVo createGroup = attendanceGroupService.createGroup(request);
        objectRpcServiceResult.setData(createGroup);
        objectRpcServiceResult.setSuccess(true);
        objectRpcServiceResult.setErrorCode(ErrorCodeConstant.SUCCESS_STRING);
        return objectRpcServiceResult;
    }

    /**
     * @description: 删除考勤组
     * @return: TopGroupVo
     */
    @PostMapping(value = "/deleteGroup")
    RpcServiceResult<String> deleteGroup(DeleteGroupRequest request) throws Exception{
        RpcServiceResult<String> objectRpcServiceResult = new RpcServiceResult<>();
        String result = attendanceGroupService.deleteGroup(request);
        objectRpcServiceResult.setData(result);
        objectRpcServiceResult.setSuccess(true);
        objectRpcServiceResult.setErrorCode(ErrorCodeConstant.SUCCESS_STRING);
        return objectRpcServiceResult;
    }

}
