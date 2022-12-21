package com.bond.domain.exception.net.strategy;

import com.bond.domain.exception.Error;
import com.bond.domain.exception.net.NetError;
import com.bond.domain.exception.net.NetErrorContext;

import java.net.BindException;

/**
 * @author anzj
 * @date 2022/12/20 15:41
 */
public class BindErrorStrategy implements NetErrorStrategy {
    @Override
    public Error parseNetError(NetErrorContext context) {
        return NetError.ERR_REMOTE_ALREADY_BIND.buildErrorMessageForOperator(context.getUrl());
    }

    @Override
    public boolean accept(Throwable t) {
        if(t instanceof BindException){
            return true;
        }
        return false;
    }
}
