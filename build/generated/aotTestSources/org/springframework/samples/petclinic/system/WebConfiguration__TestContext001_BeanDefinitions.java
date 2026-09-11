package org.springframework.samples.petclinic.system;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

/**
 * Bean definitions for {@link WebConfiguration}.
 */
@Generated
public class WebConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'webConfiguration'.
   */
  public static BeanDefinition getWebConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(WebConfiguration.class);
    beanDefinition.setTargetType(WebConfiguration.class);
    ConfigurationClassUtils.initializeConfigurationClass(WebConfiguration.class);
    beanDefinition.setInstanceSupplier(WebConfiguration$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'localeResolver'.
   */
  private static BeanInstanceSupplier<LocaleResolver> getLocaleResolverInstanceSupplier() {
    return BeanInstanceSupplier.<LocaleResolver>forFactoryMethod(WebConfiguration$$SpringCGLIB$$0.class, "localeResolver")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("webConfiguration", WebConfiguration.class).localeResolver());
  }

  /**
   * Get the bean definition for 'localeResolver'.
   */
  public static BeanDefinition getLocaleResolverBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LocaleResolver.class);
    beanDefinition.setFactoryBeanName("webConfiguration");
    beanDefinition.setInstanceSupplier(getLocaleResolverInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'localeChangeInterceptor'.
   */
  private static BeanInstanceSupplier<LocaleChangeInterceptor> getLocaleChangeInterceptorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<LocaleChangeInterceptor>forFactoryMethod(WebConfiguration$$SpringCGLIB$$0.class, "localeChangeInterceptor")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("webConfiguration", WebConfiguration.class).localeChangeInterceptor());
  }

  /**
   * Get the bean definition for 'localeChangeInterceptor'.
   */
  public static BeanDefinition getLocaleChangeInterceptorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LocaleChangeInterceptor.class);
    beanDefinition.setFactoryBeanName("webConfiguration");
    beanDefinition.setInstanceSupplier(getLocaleChangeInterceptorInstanceSupplier());
    return beanDefinition;
  }
}
