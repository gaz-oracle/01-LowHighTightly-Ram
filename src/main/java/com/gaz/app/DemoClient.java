package com.gaz.app;

import com.gaz.app.configuration.AppConfiguration;
import com.gaz.app.controller.DemoController;
import com.gaz.app.repository.DemoRepository;
import com.gaz.app.service.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Annotation based Configuration

public class DemoClient {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfiguration.class);

        DemoController demoController = applicationContext.getBean(DemoController.class);
        System.out.println(demoController.hello());

        DemoService demoService = applicationContext.getBean(DemoService.class);
        System.out.println(demoService.hello());

        DemoRepository demoRepository = applicationContext.getBean(DemoRepository.class);
        System.out.println(demoRepository.hello());

    }

}
