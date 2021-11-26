package com.dingtalk.model.grouprequest;

/**
 * @Description: 分页实体
 */
public class PageRequest {

    /** 支持分页查询，与size参数同时设置时才生效，此参数代表偏移量，偏移量从0开始，下次调用传上次调用时的size与offset之和 */
    private Long offset;

    /** 分页大小，最大10 */
    private Long size;

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }
}
