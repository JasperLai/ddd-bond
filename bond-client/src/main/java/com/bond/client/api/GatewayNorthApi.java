package com.bond.client.api;

/**
 * 供前置模块调用的接入API
 */
public interface GatewayNorthApi {
    //日终接口
    public void handleReportFeedBackFile(String filePath, String frontId);

    //实时接口
    public void handleError(String frontId,String errorCode, Object data);

    //中债的报文都在报文头里约定了报文类型,针对frontid = 中债，调用使用CMDSERVICE处理
    public void handleFrontRequest(String frontId,String xmlData);
}
