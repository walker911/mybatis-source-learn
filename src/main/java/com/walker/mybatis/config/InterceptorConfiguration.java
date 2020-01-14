package com.walker.mybatis.config;

import com.walker.mybatis.plugin.PageInterceptor;
import com.walker.mybatis.plugin.PerformanceInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 *
 * </p>
 *
 * @author mu qin
 * @date 2020/1/13
 */
@Configuration
public class InterceptorConfiguration {

    @Bean
    public PageInterceptor pageInterceptor() {
        return new PageInterceptor();
    }

    @Bean
    public PerformanceInterceptor performanceInterceptor() {
        return new PerformanceInterceptor();
    }

}
