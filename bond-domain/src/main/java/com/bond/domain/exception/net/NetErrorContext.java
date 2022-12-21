package com.bond.domain.exception.net;


import com.bond.domain.exception.Error;
import com.bond.domain.exception.net.strategy.NetErrorStrategy;

/**
 * @author anzj
 * @date 2022/12/20 15:43
 */
public class NetErrorContext {

    private Throwable throwable;
    private String url;
    private Integer readTimeout;
    private Integer connectTimeout;


    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
    }

    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
    }
}
