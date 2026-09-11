package org.springframework.samples.petclinic.owner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.lang.String;
import java.util.List;
import org.springframework.aot.generate.Generated;
import org.springframework.data.jpa.repository.aot.AotRepositoryFragmentSupport;
import org.springframework.data.jpa.repository.query.QueryEnhancerSelector;
import org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport;

/**
 * AOT generated JPA repository implementation for {@link PetTypeRepository}.
 */
@Generated
public class PetTypeRepositoryImpl__TestContext001_AotRepository extends AotRepositoryFragmentSupport {
  private final RepositoryFactoryBeanSupport.FragmentCreationContext context;

  private final EntityManager entityManager;

  public PetTypeRepositoryImpl__TestContext001_AotRepository(EntityManager entityManager,
      RepositoryFactoryBeanSupport.FragmentCreationContext context) {
    super(QueryEnhancerSelector.DEFAULT_SELECTOR, context);
    this.entityManager = entityManager;
    this.context = context;
  }

  /**
   * AOT generated implementation of {@link PetTypeRepository#findPetTypes()}.
   */
  public List<PetType> findPetTypes() {
    String queryString = "SELECT ptype FROM PetType ptype ORDER BY ptype.name";
    Query query = this.entityManager.createQuery(queryString);

    return (List<PetType>) query.getResultList();
  }
}
