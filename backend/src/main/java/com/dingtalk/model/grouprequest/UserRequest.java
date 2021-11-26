package com.dingtalk.model.grouprequest;

/**
 * @Description: 用户请求实体
 */
public class UserRequest {

    /** 员工在企业内的userid */
    private String userid;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public UserRequest(String userid) {
        this.userid = userid;
    }
}
