package com.dingtalk.constant;

/**
 * 钉钉开放接口网关常量
 */
public class UrlConstant {

    /**
     * 获取access_token url
     */
    public static final String GET_ACCESS_TOKEN_URL = "https://oapi.dingtalk.com/gettoken";

    /**
     * 通过免登授权码获取用户信息 url
     */
    public static final String GET_USER_INFO_URL = "https://oapi.dingtalk.com/topapi/v2/user/getuserinfo";
    /**
     * 根据用户id获取用户详情 url
     */
    public static final String USER_GET_URL = "https://oapi.dingtalk.com/topapi/v2/user/get";

    /**
     * 批量获取考勤组详情
     */
    public static final String GET_ATTENDANCE_GROUP_BATCH = "https://oapi.dingtalk.com/topapi/attendance/getsimplegroups";

    /**
     * 获取用户考勤组
     */
    public static final String GET_USER_ATTENDANCE_GROUP = "https://oapi.dingtalk.com/topapi/attendance/getusergroup";

    /**
     * 批量获取考勤组摘要
     */
    public static final String GET_ATTENDANCE_GROUP_DETAIL_BATCH = "https://oapi.dingtalk.com/topapi/attendance/getusergroup";

    /**
     * 获取考勤组详情
     */
    public static final String GET_ATTENDANCE_GROUP_DETAIL = "https://oapi.dingtalk.com/topapi/attendance/group/query";

    /**
     * 搜索考勤组摘要
     */
    public static final String SEARCH_ATTENDANCE_GROUP = "https://oapi.dingtalk.com/topapi/attendance/group/search";

    /**
     * 创建考勤组
     */
    public static final String CREATE_ATTENDANCE_GROUP = "https://oapi.dingtalk.com/topapi/attendance/group/add";

    /**
     * 删除考勤组
     */
    public static final String DELETE_ATTENDANCE_GROUP = "https://oapi.dingtalk.com/topapi/attendance/group/delete";

    /**
     * 批量新增参与考勤人员
     */
    public static final String ADD_ATTENDANCE_USER = "https://oapi.dingtalk.com/topapi/attendance/group/users/add";

    /**
     * 获取参与考勤人员
     */
    public static final String GET_ATTENDANCE_USER = "https://oapi.dingtalk.com/topapi/attendance/group/member/list";

    /**
     * 获取参与考勤人员的userid
     */
    public static final String GET_ATTENDANCE_USER_ID = "https://oapi.dingtalk.com/topapi/attendance/group/memberusers/list";

    /**
     * 查询参与考勤人员列表
     */
    public static final String GET_ATTENDANCE_USER_LIST = "https://oapi.dingtalk.com/topapi/attendance/group/users/query";

    /**
     * 获取打卡结果
     */
    public static final String GET_ATTENDANCE_CARD_LIST = "https://oapi.dingtalk.com/attendance/list";

    /**
     * 获取打卡详情
     */
    public static final String GET_ATTENDANCE_CARD_DETAIL = "https://oapi.dingtalk.com/attendance/listRecord";

    /**
     * 创建班次
     */
    public static final String CREATE_ATTENDANCE_CLASS = "https://oapi.dingtalk.com/topapi/attendance/shift/add";

    /**
     * 获取班次详情
     */
    public static final String GET_ATTENDANCE_CLASS = "https://oapi.dingtalk.com/topapi/attendance/shift/query";
}
