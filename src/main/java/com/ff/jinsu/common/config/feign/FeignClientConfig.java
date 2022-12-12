package com.ff.jinsu.common.config.feign;

import feign.Logger.Level;
import feign.Request.Options;
import feign.codec.ErrorDecoder;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@EnableFeignClients(basePackages = "com.ff.jinsu.finance.adapter.out.web")
@Configuration
public class FeignClientConfig {

    private static final int THOUSAND_MILLIS = 1000;

    @Bean
    public ErrorDecoder errorDecoder() {
        return new FeignErrorDecoder();
    }

    @Bean
    public Options feignOptions() {
        return new Options(20, TimeUnit.SECONDS, 20, TimeUnit.SECONDS, false);
    }

    @Bean
    public Level loggerLevel() {
        return Level.FULL;
    }
}
