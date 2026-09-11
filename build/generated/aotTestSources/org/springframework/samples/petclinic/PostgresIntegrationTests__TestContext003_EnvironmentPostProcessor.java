package org.springframework.samples.petclinic;

import java.lang.Override;
import org.springframework.aot.generate.Generated;
import org.springframework.boot.EnvironmentPostProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Configure the environment with AOT optimizations.
 */
@Generated
public class PostgresIntegrationTests__TestContext003_EnvironmentPostProcessor implements EnvironmentPostProcessor {
  @Override
  public void postProcessEnvironment(ConfigurableEnvironment environment,
      SpringApplication application) {
    environment.addActiveProfile("postgres");
  }
}
