package com.springboot.nacos.config;

import com.netflix.loadbalancer.IRule;
import com.springboot.nacos.rule.NacosRule;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;

@ConditionalOnBean(EnableConfig.Marker.class)
public class AutoConfig {
    @Bean
    public IRule ag(){
        return new NacosRule();
    }
}
