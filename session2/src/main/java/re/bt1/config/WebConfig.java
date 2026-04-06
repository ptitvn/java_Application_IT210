package re.bt1.config;
import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "re.bt1")
public class WebConfig {
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver res = new InternalResourceViewResolver();
        res.setPrefix("/views/");
        res.setSuffix(".jsp");
        return res;
    }
}