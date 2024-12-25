package com.viet.tech.controller;
import com.viet.tech.service.WagyuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fire/wagyu")
public class WagyuController
{

    @Autowired
    private WagyuService producerService;

    @PostMapping("/publish")
    public String publishMessage(@RequestParam("message") String message)
    {
        producerService.sendMessage(message);
        return "Message sent to Kafka topic successfully!";
    }
}
