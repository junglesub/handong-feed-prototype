package com.thc.realspr.controller;

import com.thc.realspr.service.TbKaFeedService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping("/api/kafeed")
@RestController
public class TbKaFeedController {

    private final TbKaFeedService tbKaFeedService;

    public TbKaFeedController(
            TbKaFeedService tbKaFeedService
    ) {
        this.tbKaFeedService = tbKaFeedService;
    }

    @PostMapping("")
    public Map<String, Object> create(@RequestBody Map<String, Object> param) {
        System.out.println(param);
        return tbKaFeedService.create(param);
    }

    @GetMapping("/last")
    public Map<String, Object> getLastKaFeed() {
        return tbKaFeedService.getLastKaFeed();
    }

    @GetMapping("/all")
    public List<Map<String, Object>> getAllKaFeed() {
        return tbKaFeedService.getAll();
    }

}
