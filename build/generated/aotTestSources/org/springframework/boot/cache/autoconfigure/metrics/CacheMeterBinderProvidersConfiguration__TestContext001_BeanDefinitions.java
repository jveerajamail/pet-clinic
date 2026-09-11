package org.springframework.boot.cache.autoconfigure.metrics;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.cache.metrics.CaffeineCacheMeterBinderProvider;
import org.springframework.boot.cache.metrics.JCacheCacheMeterBinderProvider;

/**
 * Bean definitions for {@link CacheMeterBinderProvidersConfiguration}.
 */
@Generated
public class CacheMeterBinderProvidersConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'cacheMeterBinderProvidersConfiguration'.
   */
  public static BeanDefinition getCacheMeterBinderProvidersConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CacheMeterBinderProvidersConfiguration.class);
    beanDefinition.setInstanceSupplier(CacheMeterBinderProvidersConfiguration::new);
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link CacheMeterBinderProvidersConfiguration.CaffeineCacheMeterBinderProviderConfiguration}.
   */
  @Generated
  public static class CaffeineCacheMeterBinderProviderConfiguration {
    /**
     * Get the bean definition for 'caffeineCacheMeterBinderProviderConfiguration'.
     */
    public static BeanDefinition getCaffeineCacheMeterBinderProviderConfigurationBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(CacheMeterBinderProvidersConfiguration.CaffeineCacheMeterBinderProviderConfiguration.class);
      beanDefinition.setInstanceSupplier(CacheMeterBinderProvidersConfiguration.CaffeineCacheMeterBinderProviderConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'caffeineCacheMeterBinderProvider'.
     */
    private static BeanInstanceSupplier<CaffeineCacheMeterBinderProvider> getCaffeineCacheMeterBinderProviderInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<CaffeineCacheMeterBinderProvider>forFactoryMethod(CacheMeterBinderProvidersConfiguration.CaffeineCacheMeterBinderProviderConfiguration.class, "caffeineCacheMeterBinderProvider")
              .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.cache.autoconfigure.metrics.CacheMeterBinderProvidersConfiguration$CaffeineCacheMeterBinderProviderConfiguration", CacheMeterBinderProvidersConfiguration.CaffeineCacheMeterBinderProviderConfiguration.class).caffeineCacheMeterBinderProvider());
    }

    /**
     * Get the bean definition for 'caffeineCacheMeterBinderProvider'.
     */
    public static BeanDefinition getCaffeineCacheMeterBinderProviderBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(CaffeineCacheMeterBinderProvider.class);
      beanDefinition.setFactoryBeanName("org.springframework.boot.cache.autoconfigure.metrics.CacheMeterBinderProvidersConfiguration$CaffeineCacheMeterBinderProviderConfiguration");
      beanDefinition.setInstanceSupplier(getCaffeineCacheMeterBinderProviderInstanceSupplier());
      return beanDefinition;
    }
  }

  /**
   * Bean definitions for {@link CacheMeterBinderProvidersConfiguration.JCacheCacheMeterBinderProviderConfiguration}.
   */
  @Generated
  public static class JCacheCacheMeterBinderProviderConfiguration {
    /**
     * Get the bean definition for 'jCacheCacheMeterBinderProviderConfiguration'.
     */
    public static BeanDefinition getJCacheCacheMeterBinderProviderConfigurationBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(CacheMeterBinderProvidersConfiguration.JCacheCacheMeterBinderProviderConfiguration.class);
      beanDefinition.setInstanceSupplier(CacheMeterBinderProvidersConfiguration.JCacheCacheMeterBinderProviderConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'jCacheCacheMeterBinderProvider'.
     */
    private static BeanInstanceSupplier<JCacheCacheMeterBinderProvider> getJCacheCacheMeterBinderProviderInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<JCacheCacheMeterBinderProvider>forFactoryMethod(CacheMeterBinderProvidersConfiguration.JCacheCacheMeterBinderProviderConfiguration.class, "jCacheCacheMeterBinderProvider")
              .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.cache.autoconfigure.metrics.CacheMeterBinderProvidersConfiguration$JCacheCacheMeterBinderProviderConfiguration", CacheMeterBinderProvidersConfiguration.JCacheCacheMeterBinderProviderConfiguration.class).jCacheCacheMeterBinderProvider());
    }

    /**
     * Get the bean definition for 'jCacheCacheMeterBinderProvider'.
     */
    public static BeanDefinition getJCacheCacheMeterBinderProviderBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(JCacheCacheMeterBinderProvider.class);
      beanDefinition.setFactoryBeanName("org.springframework.boot.cache.autoconfigure.metrics.CacheMeterBinderProvidersConfiguration$JCacheCacheMeterBinderProviderConfiguration");
      beanDefinition.setInstanceSupplier(getJCacheCacheMeterBinderProviderInstanceSupplier());
      return beanDefinition;
    }
  }
}
