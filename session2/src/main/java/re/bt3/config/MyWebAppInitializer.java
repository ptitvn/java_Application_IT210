package re.bt3.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { Bt3WebConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" }; // bắt toàn bộ request
    }
}
