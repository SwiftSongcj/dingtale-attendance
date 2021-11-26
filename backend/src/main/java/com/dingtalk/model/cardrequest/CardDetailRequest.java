package com.dingtalk.model.cardrequest;

import java.util.List;

/**
 * @Description: 打卡详情请求实体
 */
public class CardDetailRequest {

    /** 企业内的员工ID列表 */
    private List<String> userIds;

    /** 查询考勤打卡记录的起始工作日 */
    private String checkDateFrom;

    /** 查询考勤打卡记录的结束工作日*/
    private String checkDateTo;

    /** 是否为海外企业使用 */
    private Boolean isI18n;

    public List<String> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<String> userIds) {
        this.userIds = userIds;
    }

    public String getCheckDateFrom() {
        return checkDateFrom;
    }

    public void setCheckDateFrom(String checkDateFrom) {
        this.checkDateFrom = checkDateFrom;
    }

    public String getCheckDateTo() {
        return checkDateTo;
    }

    public void setCheckDateTo(String checkDateTo) {
        this.checkDateTo = checkDateTo;
    }

    public Boolean getI18n() {
        return isI18n;
    }

    public void setI18n(Boolean i18n) {
        isI18n = i18n;
    }
}
