package com.ff.jinsu.finance.adapter.out.web;

import com.ff.jinsu.common.config.feign.FeignClientConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ff", url = "${ff.scrap.yahoo.url}", configuration = FeignClientConfig.class)
public interface YahooClient {

    @GetMapping(value = "/chart/{symbol}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ScrapResponse scrap(@PathVariable("symbol") String symbol, @RequestParam("interval") String interval, @RequestParam("range") String range);

}
