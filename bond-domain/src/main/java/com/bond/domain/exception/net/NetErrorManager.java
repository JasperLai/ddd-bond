package com.bond.domain.exception.net;


import com.bond.domain.exception.Error;
import com.bond.domain.exception.net.strategy.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author anzj
 * @date 2022/12/20 15:28
 */
public class NetErrorManager {

    private static List<NetErrorStrategy> strategyList = new ArrayList<>();

    static {
        strategyList.add(new BindErrorStrategy());
        strategyList.add(new ConnectErrorStrategy());
        strategyList.add(new SocketErrorStrategy());
        strategyList.add(new SocketTimeoutErrorStrategy());
    }

    public static Error parse(NetErrorContext context){
        Error error =null;
        Throwable t = context.getThrowable();

        while(true){
            if(t == null){
                break;
            }
            for(NetErrorStrategy strategy : strategyList){
                if(strategy.accept(t)){
                    error = strategy.parseNetError(context);
                    break;
                }
            }
            t = t.getCause();
        }
        return error;
    }

}
