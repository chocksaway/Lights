package com.chocksaway.lights;

import com.chocksaway.lights.service.FirstChatService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class FirstChatServiceTest {
    @Autowired
    FirstChatService firstChatService;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    void testWeatherTomorrow() {
        var response = firstChatService.query("What's the weather like tomorrow in London?");
        logger.info("response: {}", response);
        assertNotNull(response);
    }
}
