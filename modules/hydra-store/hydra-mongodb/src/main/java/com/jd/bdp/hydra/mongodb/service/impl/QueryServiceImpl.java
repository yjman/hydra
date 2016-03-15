package com.jd.bdp.hydra.mongodb.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jd.bdp.hydra.store.inter.QueryService;

/**
 * User: biandi
 * Date: 13-5-9
 * Time: 下午4:13
 */
public class QueryServiceImpl implements QueryService {
    @Override
    public JSONObject getTraceInfo(Long traceId) {
        return null;
    }

    @Override
    public JSONArray getTracesByDuration(String serviceId, Long startTime, int sum, int durationMin, int durationMax) {
        return null;
    }

    @Override
    public JSONArray getTracesByEx(String serviceId, Long startTime, int sum) {
        return null;
    }
}
