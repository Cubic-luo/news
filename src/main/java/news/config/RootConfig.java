package news.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:spring/*.xml")
@Import(SecurityConfig.class)
@ComponentScan(basePackages = { "news.service"})
public class RootConfig {

}
