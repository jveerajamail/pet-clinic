package org.springframework.boot.jdbc.test.autoconfigure;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TestDatabaseAutoConfiguration}.
 */
@Generated
public class TestDatabaseAutoConfiguration__TestContext004_BeanDefinitions {
  /**
   * Get the bean definition for 'testDatabaseAutoConfiguration'.
   */
  public static BeanDefinition getTestDatabaseAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TestDatabaseAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(TestDatabaseAutoConfiguration::new);
    return beanDefinition;
  }
}
