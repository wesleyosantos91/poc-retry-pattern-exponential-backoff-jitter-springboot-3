package io.github.wesleyosantos91.service;

import io.github.wesleyosantos91.client.MockBinClient;
import org.springframework.stereotype.Service;

@Service
public record MockBinService(MockBinClient mockBinClient) {

    public Object get() {
        return mockBinClient.get();
    }
}
