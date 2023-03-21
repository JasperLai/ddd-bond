package com.bond.client.api;

import java.io.File;

/**
 * 供日终模块调用的接入API
 */
public interface GatewaySouthApi {

    public boolean register(String senderId, String frontId,int... protocol);
    //日终交易类
    public boolean fileUploadNotify(String senderId,String frontId, String businessType);

    //日间实时交易
    public boolean getQuota(int amount);

    public boolean reportSale(int amount);

    //前置管理
    public boolean getFrontStatus(String frontId);


}
