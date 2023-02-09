package com.ruijie.shamee.gitcc.utils;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

import java.nio.charset.StandardCharsets;

/**
 * 获取鸡汤工具类
 * @author Shamee Loop
 */
public class DutangUtils {

    private static final String url  = "https://api.nextrt.com/V1/Dutang";

    public static String getDutang(){
        try {
            String result = HttpUtil.get(url, StandardCharsets.UTF_8);
            JSONObject object = JSONUtil.parseObj(result);
            JSONArray jsonArray = object.getJSONArray("data");
            JSONObject entries = JSONUtil.parseObj(jsonArray.get(0));
            return entries.get("content").toString();
        } catch (Exception e) {
            // nop
            return "鸡汤内容获取失败";
        }
    }

}
