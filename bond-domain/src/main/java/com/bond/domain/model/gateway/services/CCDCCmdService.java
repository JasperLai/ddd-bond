package com.bond.domain.model.gateway.services;


//中债直接下发请求处理，包括资格管理控制，机动额度分配，系统状态切换通知，文件下载通知
public class CCDCCmdService {

    public void handleSaleAuthority(){
        //TODO 资格管理控制，通过调用交易模块提供的资格控制接口修改销售资格和机动额度资格
    }

    public void handleQuota(){
        //TODO 手动机动额度分配，调用交易模块机动额度设置接口

    }

    public void systemSwitch(){
        //TODO 前置机状态切换，代理层校验前置机状态进行请求管理
    }

    public void fileDownload(){
        //TODO 文件下载通知，代理层接收到通知后不需要告知应用层，直接组件报文通知前置模块进行FTP文件下载
    }

    public void handleTechNotify(){
        //TODO 技术公告入管理台数据库
    }

}
