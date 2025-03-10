package com.bond.adapter.web;

import com.bond.client.api.EodService;
import com.bond.client.dto.protocol.request.SubscribeRequest;
import com.bond.client.dto.protocol.response.SubscribeResponse;
import com.bond.client.dto.result.SubscribeResult;
import com.bond.client.dto.valueobject.BondVO;
import com.bond.client.dto.valueobject.InvestorVO;
import com.bond.client.dto.valueobject.TradeDataVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.table.TableRowSorter;

/**
 * @author anzj
 * @date 2022/12/19 16:51
 */
@RestController
public class BondController {

    private static final Logger logger = LoggerFactory.getLogger(BondController.class);

    @Autowired
    private EodService eodService;


    //EOD入口示例，此处和BTSS日终调度接口入参保持一致
    @PostMapping("/eod/execute")
    @ResponseBody
    public SubscribeResponse execute(SubscribeRequest request){
        logger.info("认购输入参数[{}]",request);
        SubscribeResponse response = new SubscribeResponse();

        BondVO bondVO = request.getBondVO();
        InvestorVO investorVO = request.getInvestorVO();
        TradeDataVO tradeDataVO = request.getTradeDataVO();


        logger.info("认购响应参数[{}]",response);
        return response;
    }


    @PostMapping("/bond/subscribe")
    @ResponseBody
    public SubscribeResponse subscription(SubscribeRequest request){
        logger.info("认购输入参数[{}]",request);
        SubscribeResponse response = new SubscribeResponse();

        BondVO bondVO = request.getBondVO();
        InvestorVO investorVO = request.getInvestorVO();
        TradeDataVO tradeDataVO = request.getTradeDataVO();


        logger.info("认购响应参数[{}]",response);
        return response;
    }
}
