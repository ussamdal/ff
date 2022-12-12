package com.ff.jinsu.common.config.feign;

import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Response;
import feign.codec.ErrorDecoder;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;

@Slf4j
public class FeignErrorDecoder implements ErrorDecoder {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public Exception decode(String methodKey, Response response) {
        try (InputStream inputStream = response.body().asInputStream()) {
            String responseBody = objectMapper.readValue(inputStream, String.class);
        } catch (IOException e) {
            log.error("failed to read input stream", e);
            throw new IllegalStateException("응답을 읽는데 실패하였습니다.");
        }
        return null;
    }
}
