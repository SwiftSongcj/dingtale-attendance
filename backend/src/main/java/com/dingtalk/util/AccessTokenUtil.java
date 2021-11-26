package com.dingtalk.util;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiGettokenRequest;
import com.dingtalk.api.response.OapiGettokenResponse;
import com.dingtalk.constant.ErrorCodeConstant;
import com.dingtalk.constant.UrlConstant;
import com.taobao.api.ApiException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class AccessTokenUtil {

    @Value("${app.app_key}")
    private String APP_KEY;

    @Value("${app.app_secret}")
    private String APP_SECRET;

    @Autowired
    private RedisUtil redisUtil;

    /**
     * 获取accessToken
     * @return accessToken
     */
    public String getAccessToken() throws ApiException {
        //如果缓存中accessToken未过期直接获取
        String accessToken = null;
        accessToken = (String) redisUtil.get("ding_accessToken");
        if (StringUtils.isNotBlank(accessToken)) {
            return accessToken;
        }
        DingTalkClient client = new DefaultDingTalkClient(UrlConstant.GET_ACCESS_TOKEN_URL);
        OapiGettokenRequest request = new OapiGettokenRequest();
        request.setAppkey(APP_KEY);
        request.setAppsecret(APP_SECRET);
        request.setHttpMethod("GET");
        OapiGettokenResponse response = client.execute(request);
        //accessToken为调用接口凭证,有调用上限不能重复调用,7200s过期,建议放到缓存中
        if (response.getErrcode().equals(ErrorCodeConstant.SUCCESS)) {
            redisUtil.set("ding_accessToken", response.getAccessToken(), 7200L, TimeUnit.SECONDS);
            return response.getAccessToken();
        }
        return null;
    }


}
