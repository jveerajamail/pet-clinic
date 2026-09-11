package org.springframework.boot.cache.autoconfigure.metrics;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link CacheMetricsAutoConfiguration}.
 */
@Generated
public class CacheMetricsAutoConfiguration__TestContext002_BeanDefinitions {
  /**
   * Get the bean definition for 'cacheMetricsAutoConfiguration'.
   */
  public static BeanDefinition getCacheMetricsAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CacheMetricsAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(CacheMetricsAutoConfiguration::new);
    return beanDefinition;
  }
}
