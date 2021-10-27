package ${package}.web.rest;

import ${package}.config.ApplicationConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"", "/api"})
public class IndexResource {

    @Autowired
    ApplicationConfig app;

    @GetMapping({ "", "/" })
    public String index() {
        final String tpl = "Spring Boot App Module: %s running with %s profile.";
        return String.format(tpl, app.getApplicationName(), app.getProfile());
    }
}
