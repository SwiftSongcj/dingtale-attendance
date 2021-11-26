package com.dingtalk.service;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description: 事件订阅回调业务层
 */
public interface CallBackService {

    /**
     * 钉钉事件回调
     * @param msg_signature
     * @param timestamp
     * @param nonce
     * @return
     */
    Object callBack(HttpServletRequest request, String msg_signature, String  timestamp, String nonce, JSONObject json) throws JsonProcessingException;

}
