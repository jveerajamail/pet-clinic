package org.springframework.boot.resttestclient.autoconfigure;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.resttestclient.TestRestTemplate;
import org.springframework.context.ApplicationContext;

/**
 * Bean definitions for {@link TestRestTemplateTestAutoConfiguration}.
 */
@Generated
public class TestRestTemplateTestAutoConfiguration__TestContext005_BeanDefinitions {
  /**
   * Get the bean definition for 'testRestTemplateTestAutoConfiguration'.
   */
  public static BeanDefinition getTestRestTemplateTestAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TestRestTemplateTestAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(TestRestTemplateTestAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'org.springframework.boot.resttestclient.TestRestTemplate'.
   */
  private static BeanInstanceSupplier<TestRestTemplate> getTestRestTemplateInstanceSupplier() {
    return BeanInstanceSupplier.<TestRestTemplate>forFactoryMethod(TestRestTemplateTestAutoConfiguration.class, "testRestTemplate", ObjectProvider.class, ApplicationContext.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.resttestclient.autoconfigure.TestRestTemplateTestAutoConfiguration", TestRestTemplateTestAutoConfiguration.class).testRestTemplate(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'testRestTemplate'.
   */
  public static BeanDefinition getTestRestTemplateBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TestRestTemplate.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.resttestclient.autoconfigure.TestRestTemplateTestAutoConfiguration");
    beanDefinition.setInstanceSupplier(getTestRestTemplateInstanceSupplier());
    return beanDefinition;
  }
}
