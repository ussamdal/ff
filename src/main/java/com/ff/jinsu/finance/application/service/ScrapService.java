package com.ff.jinsu.finance.application.service;

import com.ff.jinsu.finance.application.port.in.ScrapChart;
import com.ff.jinsu.finance.application.port.out.StoreStockPort;
import com.ff.jinsu.finance.application.port.out.YahooScrapChartPort;
import com.ff.jinsu.finance.domain.Chart;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional
public class ScrapService implements ScrapChart {

    private final YahooScrapChartPort yahooScrapChartPort;
    private final StoreStockPort storeStockPort;

    @Override
    public Chart.Response scraps(String symbol, String interval, String range) {
        Chart.Stock stock = yahooScrapChartPort.scrap(symbol, interval, range);
        storeStockPort.storeStock(stock);
        log.info(stock.toString());
        return stock.mapToResponse();
    }

}
