package io.github.wesleyosantos91.client;

import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "MockbinClient")
public interface MockBinClient {

    @Retry(name = "MockbinClient")
    @GetMapping
    Object get();
}
