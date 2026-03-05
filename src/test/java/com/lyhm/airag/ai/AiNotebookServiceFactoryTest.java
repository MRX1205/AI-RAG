package com.lyhm.airag.ai;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class AiNotebookServiceFactoryTest {
    @Resource
    private AiNotebookService aiNotebookService;

    @Test
    void aiNotebookService() {
        String result = aiNotebookService.notebooklmApp("你好！你可以为我做什么？");
        Assertions.assertNotNull(result);
    }
}