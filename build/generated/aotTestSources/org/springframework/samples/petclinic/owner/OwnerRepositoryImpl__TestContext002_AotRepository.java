package org.springframework.samples.petclinic.owner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.lang.String;
import java.util.List;
import java.util.function.LongSupplier;
import org.springframework.aot.generate.Generated;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.aot.AotRepositoryFragmentSupport;
import org.springframework.data.jpa.repository.query.DeclaredQuery;
import org.springframework.data.jpa.repository.query.QueryEnhancerSelector;
import org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport;
import org.springframework.data.support.PageableExecutionUtils;

/**
 * AOT generated JPA repository implementation for {@link OwnerRepository}.
 */
@Generated
public class OwnerRepositoryImpl__TestContext002_AotRepository extends AotRepositoryFragmentSupport {
  private final RepositoryFactoryBeanSupport.FragmentCreationContext context;

  private final EntityManager entityManager;

  public OwnerRepositoryImpl__TestContext002_AotRepository(EntityManager entityManager,
      RepositoryFactoryBeanSupport.FragmentCreationContext context) {
    super(QueryEnhancerSelector.DEFAULT_SELECTOR, context);
    this.entityManager = entityManager;
    this.context = context;
  }

  /**
   * AOT generated implementation of {@link OwnerRepository#findByLastNameStartingWith(java.lang.String,org.springframework.data.domain.Pageable)}.
   */
  public Page<Owner> findByLastNameStartingWith(String lastName, Pageable pageable) {
    String queryString = "SELECT o FROM Owner o WHERE o.lastName LIKE :lastName ESCAPE '\\'";
    String countQueryString = "SELECT COUNT(o) FROM Owner o WHERE o.lastName LIKE :lastName ESCAPE '\\'";
    Pageable pageable_1 = pageable != null ? pageable : Pageable.unpaged();
    if (pageable_1.getSort().isSorted()) {
      DeclaredQuery declaredQuery = DeclaredQuery.jpqlQuery(queryString);
      queryString = rewriteQuery(declaredQuery, pageable_1.getSort(), Owner.class);
    }
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("lastName", "%s%%".formatted(lastName));
    if (pageable_1.isPaged()) {
      query.setFirstResult(Long.valueOf(pageable_1.getOffset()).intValue());
      query.setMaxResults(pageable_1.getPageSize());
    }
    LongSupplier countAll = () -> {
      Query countQuery = this.entityManager.createQuery(countQueryString);
      countQuery.setParameter("lastName", "%s%%".formatted(lastName));
      return getCount(countQuery);
    };

    return PageableExecutionUtils.getPage((List<Owner>) query.getResultList(), pageable_1, countAll);
  }
}
