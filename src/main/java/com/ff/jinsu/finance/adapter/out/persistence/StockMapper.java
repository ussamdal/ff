package com.ff.jinsu.finance.adapter.out.persistence;

import com.ff.jinsu.finance.domain.Chart;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
class StockMapper {


    List<StockEntity> mapToJpaEntity(Chart.Stock stock, CompanyEntity company) {
        List<String> timestampList = stock.getTimestamp();
        int count = timestampList.size();
        Chart.Quote quote = stock.getIndicators().getQuote().get(0);
        List<StockEntity> stockEntities = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            StockEntity.builder()
                    .timestamp(timestampList.get(i))
                    .closePrice(quote.getClose().get(i))
                    .openPrice(quote.getOpen().get(i))
                    .highPrice(quote.getHigh().get(i))
                    .lowPrice(quote.getLow().get(i))
                    .volume(quote.getVolume().get(i))
                    .company(company)
                    .build();
        }

        return stockEntities;
    }

}
