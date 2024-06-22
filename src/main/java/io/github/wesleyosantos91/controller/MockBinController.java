package io.github.wesleyosantos91.controller;

import io.github.wesleyosantos91.service.MockBinService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mockbin")
public record MockBinController(MockBinService service) {

    @GetMapping
    public ResponseEntity<Object> get() {
        Object o = service.get();
        return ResponseEntity.ok(o);
    }
}
