package com.lyhm.airag.ai;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class AiNotebookServiceTest {
    @Resource
    private AiNotebookService aiNotebookService;
    @Test
    void notebooklmAppStream() {
        Flux<String> result = aiNotebookService.notebooklmAppStream("你好！你可以为我做什么？");
        Assertions.assertNotNull(result);
    }
}