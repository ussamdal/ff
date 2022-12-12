package com.ff.jinsu.finance.application.port.in;

import com.ff.jinsu.finance.domain.Chart;

public interface ScrapChart {

    Chart.Response scraps(String symbol, String interval, String range);
}
