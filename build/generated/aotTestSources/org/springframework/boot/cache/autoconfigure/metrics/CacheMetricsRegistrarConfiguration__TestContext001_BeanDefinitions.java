package org.springframework.boot.cache.autoconfigure.metrics;

import io.micrometer.core.instrument.MeterRegistry;
import java.util.Collection;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.cache.metrics.CacheMetricsRegistrar;

/**
 * Bean definitions for {@link CacheMetricsRegistrarConfiguration}.
 */
@Generated
public class CacheMetricsRegistrarConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.springframework.boot.cache.autoconfigure.metrics.CacheMetricsRegistrarConfiguration'.
   */
  private static BeanInstanceSupplier<CacheMetricsRegistrarConfiguration> getCacheMetricsRegistrarConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CacheMetricsRegistrarConfiguration>forConstructor(MeterRegistry.class, Collection.class, ConfigurableListableBeanFactory.class)
            .withGenerator((registeredBean, args) -> new CacheMetricsRegistrarConfiguration(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'cacheMetricsRegistrarConfiguration'.
   */
  public static BeanDefinition getCacheMetricsRegistrarConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CacheMetricsRegistrarConfiguration.class);
    beanDefinition.setInstanceSupplier(getCacheMetricsRegistrarConfigurationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'cacheMetricsRegistrar'.
   */
  private static BeanInstanceSupplier<CacheMetricsRegistrar> getCacheMetricsRegistrarInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CacheMetricsRegistrar>forFactoryMethod(CacheMetricsRegistrarConfiguration.class, "cacheMetricsRegistrar")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.cache.autoconfigure.metrics.CacheMetricsRegistrarConfiguration", CacheMetricsRegistrarConfiguration.class).cacheMetricsRegistrar());
  }

  /**
   * Get the bean definition for 'cacheMetricsRegistrar'.
   */
  public static BeanDefinition getCacheMetricsRegistrarBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CacheMetricsRegistrar.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.cache.autoconfigure.metrics.CacheMetricsRegistrarConfiguration");
    beanDefinition.setInstanceSupplier(getCacheMetricsRegistrarInstanceSupplier());
    return beanDefinition;
  }
}
