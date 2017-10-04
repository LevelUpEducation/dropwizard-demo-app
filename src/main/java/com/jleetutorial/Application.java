package com.jleetutorial;

import com.jleetutorial.configuration.ApplicationDropwizardConfiguration;
import com.jleetutorial.resource.ApplicationResource;
import io.dropwizard.setup.Environment;

public class Application extends io.dropwizard.Application<ApplicationDropwizardConfiguration> {

    @Override
    public void run(ApplicationDropwizardConfiguration configuration, Environment environment) throws Exception {
        // Resources
        environment.jersey().register(new ApplicationResource());
    }

    public static void main(String[] args) throws Exception {
        new Application().run(args);
    }
}
