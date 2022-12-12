package com.ff.jinsu.finance.adapter.out.web;

import com.ff.jinsu.finance.application.port.out.YahooScrapChartPort;
import com.ff.jinsu.finance.domain.Chart;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
class ScrapYahooAdapter implements YahooScrapChartPort {

    private final YahooClient yahooClient;

    private final ScrapMapper scrapMapper;

    private final String SYMBOL = "005930.KS";
    private final String INTERVAL = "1d";
    private final String RANGE = "5d";

    @Override
    public Chart.Stock scrap(String symbol, String interval, String range) {

        ScrapResponse scrapResponse = yahooClient.scrap(symbol, interval, range);
        Chart.Stock response = scrapMapper.mapToDomainResponse(scrapResponse);
        return response;
    }
}
