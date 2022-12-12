package com.ff.jinsu.finance.application.port.out;

import com.ff.jinsu.finance.domain.Chart;

public interface YahooScrapChartPort {

    Chart.Stock scrap(String symbol, String interval, String range);
}
