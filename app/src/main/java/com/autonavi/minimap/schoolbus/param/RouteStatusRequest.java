package com.autonavi.minimap.schoolbus.param;

import com.amap.bundle.aosservice.request.AosPostRequest;
import com.amap.bundle.blutils.app.ConfigerHelper;

public class RouteStatusRequest extends AosPostRequest {
    public static final String a;
    public String b = null;
    public String c = null;
    public String d = null;
    public String e = null;
    public String f = null;
    public String g = null;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(dkp.a(ConfigerHelper.AOS_SNS_URL_KEY));
        sb.append("ws/school-bus/route/status");
        a = sb.toString();
    }
}
