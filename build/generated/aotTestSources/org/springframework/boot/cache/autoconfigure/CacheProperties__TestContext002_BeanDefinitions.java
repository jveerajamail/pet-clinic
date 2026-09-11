package org.springframework.boot.cache.autoconfigure;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CacheProperties}.
 */
@Generated
public class CacheProperties__TestContext002_BeanDefinitions {
  /**
   * Get the bean definition for 'cacheProperties'.
   */
  public static BeanDefinition getCachePropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CacheProperties.class);
    beanDefinition.setInstanceSupplier(CacheProperties::new);
    return beanDefinition;
  }
}
