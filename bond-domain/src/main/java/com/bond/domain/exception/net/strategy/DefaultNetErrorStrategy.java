package com.bond.domain.exception.net.strategy;


import com.bond.domain.exception.Error;
import com.bond.domain.exception.net.NetError;
import com.bond.domain.exception.net.NetErrorContext;

/**
 * @author anzj
 * @date 2022/12/20 16:02
 */
public class DefaultNetErrorStrategy implements NetErrorStrategy{
    @Override
    public boolean accept(Throwable t) {
        return true;
    }

    @Override
    public Error parseNetError(NetErrorContext context) {
        return NetError.ERR_REMOTE_ERROR;
    }
}
