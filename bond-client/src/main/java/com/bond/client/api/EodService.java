package com.bond.client.api;

import com.bond.client.dto.result.EodResult;
import com.bond.client.dto.result.SubscribeResult;
import com.bond.client.dto.valueobject.BondVO;
import com.bond.client.dto.valueobject.EodVO;
import com.bond.client.dto.valueobject.InvestorVO;
import com.bond.client.dto.valueobject.TradeDataVO;

/**
 * 日终相关服务
 */
public interface EodService {

    /**
     * 日终调度app service定义
     */
    EodResult executeTaskByGroup(EodVO v);


}
