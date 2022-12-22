package com.bond.domain.model.trade.ability.rule;

import com.bond.domain.exception.BizException;
import com.bond.domain.exception.ErrorConstant;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author anzj
 * @date 2022/12/22 8:25
 */
@Component
public class OpeningTimeCheckRule {

    private static final String START_TIME = "080000";
    private static final String END_TIME = "080000";



    public void check(){
        String currentTime = new SimpleDateFormat("HHmmss").format(new Date());

        if(Long.parseLong(currentTime)< Long.parseLong(START_TIME) || Long.parseLong(currentTime)>Long.parseLong(END_TIME)){
            throw BizException.buildBizException(ErrorConstant.ERR_VALIDATION_NOT_IN_OPENING);
        }

    }


}
