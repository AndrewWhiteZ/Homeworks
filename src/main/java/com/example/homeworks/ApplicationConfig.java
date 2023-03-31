package com.example.homeworks;

import com.example.homeworks.beans.DependedBean;
import com.example.homeworks.beans.NotDefaultBean;
import com.example.homeworks.beans.TestBean;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import javax.annotation.PostConstruct;
import java.util.List;

@Log4j2
@Configuration
@ConfigurationProperties(prefix = "spring")
public class ApplicationConfig {
    @Value("${spring.application.name}")
    private String applicationName;
    @Value("${example.test}")
    private String exampleTest;
    @Setter
    @Getter
    private List<String> goods;

    /**
     * Утилитарный метод для вывода служебной информации
     */
    @PostConstruct
    public void printServiceInfo() {
        log.info("[!]  Название приложения: " + applicationName + "  [!]");
        log.info("[!]  Список значений: " + goods + "  [!]");
        log.info("[!]  Значение переменной окружения EXAMPLE_TEST: " + exampleTest + "  [!]");
    }

    /**
     * Бин создается только, если активен профиль 'test'
     * */
    @Bean
    @Profile("test")
    public TestBean getTestBean() {
        log.info("[+]  Тестовый бин создан!  [+]");
        return new TestBean();
    }

    /**
     * Бин создается, только если создается первый бин ('TestBean')
     * */
    @Bean
    @ConditionalOnBean(TestBean.class)
    public DependedBean getDependedBean() {
        log.info("[+]  Зависимый бин создан!  [+]");
        return new DependedBean();
    }

    /**
     * Бин создается только, если значение переменной окружения EXAMPLE_TEST не равно значению по умолчанию ('default')
     */
    @Bean
    @ConditionalOnExpression("!'${example.test}'.equals('default')")
    public NotDefaultBean getNotDefaultBean() {
        log.info("[+]  Не дефолтный бин создан!  [+]");
        return new NotDefaultBean();
    }
}
