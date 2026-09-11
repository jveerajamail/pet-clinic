package org.springframework.samples.petclinic;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link MysqlTestApplication}.
 */
@Generated
public class MysqlTestApplication__TestContext002_BeanDefinitions {
  /**
   * Get the bean definition for 'mysqlTestApplication'.
   */
  public static BeanDefinition getMysqlTestApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MysqlTestApplication.class);
    beanDefinition.setTargetType(MysqlTestApplication.class);
    ConfigurationClassUtils.initializeConfigurationClass(MysqlTestApplication.class);
    beanDefinition.setInstanceSupplier(MysqlTestApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
