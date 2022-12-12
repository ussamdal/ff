package com.ff.jinsu.finance.application.port.out;

import com.ff.jinsu.finance.domain.Chart;

public interface StoreStockPort {
    void storeStock(Chart.Stock stock);
}
