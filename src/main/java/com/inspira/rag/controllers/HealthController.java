package com.inspira.rag.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequestMapping("/health")
public class HealthController {

  @GetMapping()
  public String getHealth() {
    final Instant now = Instant.now();
    return now.toString();
  }
}
