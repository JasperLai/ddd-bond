package com.bond.domain.exception.net.strategy;

import com.bond.domain.exception.Error;
import com.bond.domain.exception.net.NetErrorContext;

/**
 * @author anzj
 * @date 2022/12/20 15:39
 */
public interface NetErrorStrategy {

    Error parseNetError(NetErrorContext context);

    boolean accept(Throwable t);
}
