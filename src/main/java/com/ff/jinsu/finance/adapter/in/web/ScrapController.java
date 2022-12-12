package com.ff.jinsu.finance.adapter.in.web;

import com.ff.jinsu.finance.application.port.in.ScrapChart;
import com.ff.jinsu.finance.domain.Chart;
import io.swagger.annotations.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
class ScrapController {

    private final ScrapChart scrapChart;

    @Operation(summary = "주식 정보를 갖고 오는 api", description = "주식 정보 갖고와서 저장 후 응답")
    @Parameter(name = "symbol", in = ParameterIn.QUERY, description = "종복 심볼 (e.g 삼성전자 = 005930.KS)")
    @Parameter(name = "interval", in = ParameterIn.QUERY, description = "조회 주기 (e.g 1d)")
    @Parameter(name = "range", in = ParameterIn.QUERY, description = "조회 범위 (e.g \"1d\"," +
            "                        \"5d\"," +
            "                        \"1mo\"," +
            "                        \"3mo\"," +
            "                        \"6mo\"," +
            "                        \"1y\"," +
            "                        \"2y\"," +
            "                        \"5y\"," +
            "                        \"10y\"," +
            "                        \"ytd\"," +
            "                        \"max\")")
    @ApiResponse(code = 200, message = "ok")
    @GetMapping(value = "/scrap")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Chart.Response scrap(@RequestParam("symbol") String symbol
            , @RequestParam("interval") String interval
            , @RequestParam("range") String range) {

        return scrapChart.scraps(symbol, interval, range);
    }

}
