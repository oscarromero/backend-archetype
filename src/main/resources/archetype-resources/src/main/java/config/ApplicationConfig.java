package ${package}.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    #[[
    @Value("${spring.application.name:SpringBoot}")
    private String applicationName;

    @Value("${spring.profiles.active:dev}")
    private String profile;
    ]]#

    public String getApplicationName() {
        return applicationName;
    }

    public String getProfile() {
        return profile;
    }
}
