package com.ff.jinsu.finance.adapter.out.web;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
class ScrapRequest {

    @JsonProperty("interval")
    private String interval;
    @JsonProperty("range")
    private String range;

    public static ScrapRequest defaultOf() {
        return new ScrapRequest("1d", "5d");
    }
}
