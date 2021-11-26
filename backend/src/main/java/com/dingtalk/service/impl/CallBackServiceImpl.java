package com.dingtalk.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dingtalk.config.AppConfig;
import com.dingtalk.config.DingCallbackCrypto;
import com.dingtalk.service.CallBackService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Service
public class CallBackServiceImpl implements CallBackService {

    @Override
    public Object callBack(HttpServletRequest request, String msg_signature, String timestamp, String nonce, JSONObject json) throws JsonProcessingException {
        JSONObject eventJson = null;
        try {
            // 1. 从http请求中获取加解密参数
            msg_signature = request.getParameter("msg_signature");
            if (msg_signature == null) {
                msg_signature = request.getParameter("signature");
            }
            timestamp = request.getParameter("timeStamp");
            if (timestamp == null) {
                timestamp = request.getParameter("timestamp");
            }
            nonce = request.getParameter("nonce");

            // 2. 使用加解密类型
            // Constant.OWNER_KEY 说明：
            // 1、开发者后台配置的订阅事件为应用级事件推送，
            //      此时OWNER_KEY为应用的APP_KEY（企业内部应用）或SUITE_KEY（三方应用）。
            // 2、调用订阅事件接口订阅的事件为企业级事件推送，
            //      此时OWNER_KEY为：企业的CORP_ID（企业内部应用）或SUITE_KEY（三方应用）
            DingCallbackCrypto callbackCrypto = new DingCallbackCrypto(AppConfig.getAesToken(), AppConfig.getAesKey(),
                    AppConfig.getAppKey());
            String encryptMsg = json.getString("encrypt");
            String decryptMsg = callbackCrypto.getDecryptMsg(msg_signature, timestamp, nonce, encryptMsg);
            // 3. 反序列化回调事件json数据
            eventJson = JSON.parseObject(decryptMsg);
            String eventType = eventJson.getString("EventType");

/*            // 4. 根据EventType分类处理
            if ("check_url".equals(eventType)) {
                // 测试回调url的正确性
            } else if ("user_add_org".equals(eventType)) {
                // 处理通讯录用户增加事件
            } else if (AttConstants.ATTENDANCE_CHECK_RECORD.equals(eventType)) {
                // 处理员工打卡事件
            }else {
                // 添加其他已注册的
            }*/

            // 5. 返回success的加密数据
            Map<String, String> success = callbackCrypto.getEncryptedMap("success");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }
}
