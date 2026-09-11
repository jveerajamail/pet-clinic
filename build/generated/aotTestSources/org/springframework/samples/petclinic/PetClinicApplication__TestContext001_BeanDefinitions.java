package org.springframework.samples.petclinic;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link PetClinicApplication}.
 */
@Generated
public class PetClinicApplication__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'petClinicApplication'.
   */
  public static BeanDefinition getPetClinicApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PetClinicApplication.class);
    beanDefinition.setInstanceSupplier(PetClinicApplication::new);
    return beanDefinition;
  }
}
