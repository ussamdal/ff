package com.ff.jinsu.finance.adapter.out.web;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class ScrapResponse {
    private Chart chart;

    @Data
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    @Builder
    public static class Meta {
        private String currency;
        private String symbol;
        private String exchangeName;
        private String instrumentType;
        private Integer firstTradeDate;
        private Integer regularMarketTime;
        private Integer gmtoffset;
        private String timezone;
        private String exchangeTimezoneName;
        private Double regularMarketPrice;
        private Double chartPreviousClose;
        private Integer priceHInteger;
        private CurrentTradingPeriod currentTradingPeriod;
        private String dataGranularity;
        private String range;
        private List<String> validRanges;
    }

    @Data
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    @Builder
    public static class Post {
        private String timezone;
        private Integer start;
        private Integer end;
        private Integer gmtoffset;
    }

    @Data
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    @Builder
    public static class Pre {
        private String timezone;
        private Integer start;
        private Integer end;
        private Integer gmtoffset;
    }

    @Data
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    @Builder
    public static class Quote {
        private List<Double> low;
        private List<Double> open;
        private List<Double> high;
        private List<Double> close;
        private List<Integer> volume;
    }

    @Data
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    @Builder
    public static class Regular {
        private String timezone;
        private Integer start;
        private Integer end;
        private Integer gmtoffset;
    }

    @Data
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    @Builder
    public static class Result {
        private Meta meta;
        private List<String> timestamp;
        private Indicators indicators;
    }

    @Data
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    @Builder
    public static class Adjclose {
        private List<Double> adjclose;
    }

    @Data
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    @Builder
    public static class Chart {
        private List<Result> result;
        private Object error;
    }

    @Data
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    @Builder
    public static class CurrentTradingPeriod {
        private Pre pre;
        private Regular regular;
        private Post post;
    }

    @Data
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    @Builder
    public static class Indicators {
        private List<Quote> quote;
        private List<Adjclose> adjclose;
    }


}