package com.dingtalk.controller;

import com.alibaba.fastjson.JSONObject;
import com.dingtalk.config.DingCallbackCrypto;
import com.dingtalk.service.CallBackService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description: 事件订阅控制层
 */
@RestController
@RequestMapping("/event/subscription")
public class CallBackController {

    @Autowired
    private CallBackService callBack;

    @RequestMapping(value = "/callBack")
    public Object callBack(HttpServletRequest request,
                           @RequestParam(value = "msg_signature", required = false) String msg_signature,
                           @RequestParam(value = "timestamp", required = false) String timeStamp,
                           @RequestParam(value = "nonce", required = false) String nonce,
                           @RequestBody(required = false) JSONObject json) throws JsonProcessingException, DingCallbackCrypto.DingTalkEncryptException {
        return callBack.callBack(request,msg_signature,timeStamp,nonce,json);
    }

}
