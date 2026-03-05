package com.lyhm.airag.ai;

import dev.langchain4j.service.SystemMessage;
import reactor.core.publisher.Flux;

/**
 * AI 服务接口
 */
public interface AiNotebookService {
    /**
     * AI 应用对话入口
     * @param userMessage
     * @return
     */
    @SystemMessage(fromResource = "prompt/core-prompt.txt")
    String notebooklmApp(String userMessage);

    /**
     * AI 应用对话入口(流式)输出
     * @param userMessage
     * @return
     */
    @SystemMessage(fromResource = "prompt/core-prompt.txt")
    Flux<String> notebooklmAppStream(String userMessage);


}

