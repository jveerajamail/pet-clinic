package org.springframework.boot.cache.autoconfigure;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.cache.actuate.endpoint.CachesEndpoint;
import org.springframework.boot.cache.actuate.endpoint.CachesEndpointWebExtension;

/**
 * Bean definitions for {@link CachesEndpointAutoConfiguration}.
 */
@Generated
public class CachesEndpointAutoConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'cachesEndpointAutoConfiguration'.
   */
  public static BeanDefinition getCachesEndpointAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CachesEndpointAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(CachesEndpointAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'cachesEndpoint'.
   */
  private static BeanInstanceSupplier<CachesEndpoint> getCachesEndpointInstanceSupplier() {
    return BeanInstanceSupplier.<CachesEndpoint>forFactoryMethod(CachesEndpointAutoConfiguration.class, "cachesEndpoint", ConfigurableListableBeanFactory.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.cache.autoconfigure.CachesEndpointAutoConfiguration", CachesEndpointAutoConfiguration.class).cachesEndpoint(args.get(0)));
  }

  /**
   * Get the bean definition for 'cachesEndpoint'.
   */
  public static BeanDefinition getCachesEndpointBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CachesEndpoint.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.cache.autoconfigure.CachesEndpointAutoConfiguration");
    beanDefinition.setInstanceSupplier(getCachesEndpointInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'cachesEndpointWebExtension'.
   */
  private static BeanInstanceSupplier<CachesEndpointWebExtension> getCachesEndpointWebExtensionInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CachesEndpointWebExtension>forFactoryMethod(CachesEndpointAutoConfiguration.class, "cachesEndpointWebExtension", CachesEndpoint.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.cache.autoconfigure.CachesEndpointAutoConfiguration", CachesEndpointAutoConfiguration.class).cachesEndpointWebExtension(args.get(0)));
  }

  /**
   * Get the bean definition for 'cachesEndpointWebExtension'.
   */
  public static BeanDefinition getCachesEndpointWebExtensionBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CachesEndpointWebExtension.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.cache.autoconfigure.CachesEndpointAutoConfiguration");
    beanDefinition.setInstanceSupplier(getCachesEndpointWebExtensionInstanceSupplier());
    return beanDefinition;
  }
}
