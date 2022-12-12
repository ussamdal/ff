package com.ff.jinsu.finance.domain;

import lombok.*;

import java.util.List;

public class Chart {


    @Getter
    @ToString
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Stock {
        private String symbol;
        private List<String> timestamp;
        private Indicators indicators;

        public Response mapToResponse() {
            return Response.builder()
                    .timestamp(this.timestamp)
                    .indicators(this.indicators)
                    .build();
        }
    }

    @Getter
    @ToString
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Response {
        private List<String> timestamp;
        private Indicators indicators;
    }

    @Getter
    @ToString
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Indicators {
        private List<Quote> quote;
    }

    @Getter
    @ToString
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Quote {
        private List<Double> low;
        private List<Double> open;
        private List<Double> high;
        private List<Double> close;
        private List<Integer> volume;
    }
}
