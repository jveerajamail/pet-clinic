package org.springframework.samples.petclinic.owner;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link PetController}.
 */
@Generated
public class PetController__TestContext002_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'petController'.
   */
  private static BeanInstanceSupplier<PetController> getPetControllerInstanceSupplier() {
    return BeanInstanceSupplier.<PetController>forConstructor(OwnerRepository.class, PetTypeRepository.class)
            .withGenerator((registeredBean, args) -> new PetController(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'petController'.
   */
  public static BeanDefinition getPetControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PetController.class);
    beanDefinition.setInstanceSupplier(getPetControllerInstanceSupplier());
    return beanDefinition;
  }
}
