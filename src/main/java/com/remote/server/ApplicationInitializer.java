package com.remote.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationInitializer /*implements WebApplicationInitializer */{

    public static void main(String[] args) {
        SpringApplication.run(ApplicationInitializer.class, args);
    }

   // private static final String DISPATCHER = "dispatcher";

    /*public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {

        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(WebConfig.class);
        servletContext.addListener(new ContextLoaderListener(ctx));

        ServletRegistration.Dynamic servletRegistration = servletContext.addServlet(DISPATCHER, new DispatcherServlet(ctx));
        servletRegistration.addMapping("/");
        servletRegistration.setLoadOnStartup(1);
    }*/
}
