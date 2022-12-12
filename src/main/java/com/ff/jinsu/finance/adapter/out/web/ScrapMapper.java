package com.ff.jinsu.finance.adapter.out.web;

import com.ff.jinsu.finance.domain.Chart;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
class ScrapMapper {

    Chart.Stock mapToDomainResponse(ScrapResponse scrapResponse) {
        ScrapResponse.Result result = scrapResponse.getChart().getResult().get(0);
        List<String> timestamp = result.getTimestamp();
        List<Chart.Quote> quote = result.getIndicators().getQuote().stream().map(
                item -> mapToChartQuote(item)).collect(Collectors.toList());
        return Chart.Stock.builder()
                .symbol(result.getMeta().getSymbol())
                .timestamp(timestamp)
                .indicators(Chart.Indicators.builder().quote(quote).build())
                .build();
    }

    private Chart.Quote mapToChartQuote(ScrapResponse.Quote quote) {
        return Chart.Quote.builder()
                .low(quote.getLow())
                .open(quote.getOpen())
                .high(quote.getHigh())
                .close(quote.getClose())
                .volume(quote.getVolume())
                .build();
    }

}
