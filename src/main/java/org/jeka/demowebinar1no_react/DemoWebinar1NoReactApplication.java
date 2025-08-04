package org.jeka.demowebinar1no_react;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.ChatOptions;
import org.springframework.ai.ollama.api.OllamaOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoWebinar1NoReactApplication {

    @Bean
    public ChatClient chatClient(ChatClient.Builder builder) {
        return builder.build();
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoWebinar1NoReactApplication.class, args);
        ChatClient chatClient = context.getBean(ChatClient.class);
        System.out.println(chatClient.prompt().user("Дай первую строчку Bohemian Rhapsody").call().content());
    }



}
