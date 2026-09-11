package org.springframework.test.context.aot;

import java.lang.Class;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import org.springframework.aot.generate.Generated;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.samples.petclinic.PetClinicConcurrencyTests__TestContext001_ApplicationContextInitializer;
import org.springframework.samples.petclinic.PetClinicIntegrationTests__TestContext002_ApplicationContextInitializer;
import org.springframework.samples.petclinic.PostgresIntegrationTests__TestContext003_ApplicationContextInitializer;
import org.springframework.samples.petclinic.service.ClinicServiceTests__TestContext004_ApplicationContextInitializer;
import org.springframework.samples.petclinic.system.CrashControllerIntegrationTests__TestContext005_ApplicationContextInitializer;

/**
 * Generated mappings for {@link AotTestContextInitializers}.
 */
@Generated
public class AotTestContextInitializers__Generated {
  public static Map<String, Supplier<ApplicationContextInitializer<? extends ConfigurableApplicationContext>>> getContextInitializers(
      ) {
    Map<String, Supplier<ApplicationContextInitializer<? extends ConfigurableApplicationContext>>> map = new HashMap<>();
    map.put("org.springframework.samples.petclinic.PetClinicConcurrencyTests", () -> new PetClinicConcurrencyTests__TestContext001_ApplicationContextInitializer());
    map.put("org.springframework.samples.petclinic.PetClinicIntegrationTests", () -> new PetClinicIntegrationTests__TestContext002_ApplicationContextInitializer());
    map.put("org.springframework.samples.petclinic.PostgresIntegrationTests", () -> new PostgresIntegrationTests__TestContext003_ApplicationContextInitializer());
    map.put("org.springframework.samples.petclinic.service.ClinicServiceTests", () -> new ClinicServiceTests__TestContext004_ApplicationContextInitializer());
    map.put("org.springframework.samples.petclinic.system.CrashControllerIntegrationTests", () -> new CrashControllerIntegrationTests__TestContext005_ApplicationContextInitializer());
    return map;
  }

  public static Map<String, Class<? extends ApplicationContextInitializer<?>>> getContextInitializerClasses(
      ) {
    Map<String, Class<? extends ApplicationContextInitializer<?>>> map = new HashMap<>();
    map.put("org.springframework.samples.petclinic.PetClinicConcurrencyTests", PetClinicConcurrencyTests__TestContext001_ApplicationContextInitializer.class);
    map.put("org.springframework.samples.petclinic.PetClinicIntegrationTests", PetClinicIntegrationTests__TestContext002_ApplicationContextInitializer.class);
    map.put("org.springframework.samples.petclinic.PostgresIntegrationTests", PostgresIntegrationTests__TestContext003_ApplicationContextInitializer.class);
    map.put("org.springframework.samples.petclinic.service.ClinicServiceTests", ClinicServiceTests__TestContext004_ApplicationContextInitializer.class);
    map.put("org.springframework.samples.petclinic.system.CrashControllerIntegrationTests", CrashControllerIntegrationTests__TestContext005_ApplicationContextInitializer.class);
    return map;
  }
}
