package com.walker.mybatis.plugin;

import org.apache.ibatis.executor.parameter.ParameterHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;

/**
 * <p>
 *
 * </p>
 *
 * @author mu qin
 * @date 2020/1/17
 */
@Intercepts({@Signature(type = ParameterHandler.class, method = "getParameterObject", args = Void.class)})
public class ParameterPlugin implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        return null;
    }
}
