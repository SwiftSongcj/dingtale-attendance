package com.dingtalk.model.cardrequest;

import java.util.List;

/**
 * @Description:打卡列表请求实体
 */
public class GetCardRequest {

    /** 起始工作日 */
    private String workDateFrom;

    /** 结束工作日 */
    private String workDateTo;

    /** userid列表，最多不能超过50个 */
    private List<String> userIdList;

    /** 表示获取考勤数据的起始点 */
    private Long offset;

    /** 考勤数据的条数，最大不能超过50条 */
    private Long limit;

    /** 是否为海外企业使用 */
    private Boolean isI18n;

    public String getWorkDateFrom() {
        return workDateFrom;
    }

    public void setWorkDateFrom(String workDateFrom) {
        this.workDateFrom = workDateFrom;
    }

    public String getWorkDateTo() {
        return workDateTo;
    }

    public void setWorkDateTo(String workDateTo) {
        this.workDateTo = workDateTo;
    }

    public List<String> getUserIdList() {
        return userIdList;
    }

    public void setUserIdList(List<String> userIdList) {
        this.userIdList = userIdList;
    }

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public Boolean getI18n() {
        return isI18n;
    }

    public void setI18n(Boolean i18n) {
        isI18n = i18n;
    }
}
