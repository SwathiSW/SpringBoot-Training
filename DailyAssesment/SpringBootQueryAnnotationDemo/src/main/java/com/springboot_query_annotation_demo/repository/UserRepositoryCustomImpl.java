//package com.springboot_query_annotation_demo.repository;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.criteria.CriteriaBuilder;
//import javax.persistence.criteria.CriteriaQuery;
//import javax.persistence.criteria.Path;
//import javax.persistence.criteria.Root;
//
//public class UserRepositoryCustomImpl implements UserRepositoryCustom {
//
//	@PersistenceContext
//	private EntityManager entityManager;
//
//	@Override
//	public List<User> findUserByEmails(Set<String> emails) {
//		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
//		CriteriaQuery<User> query = cb.createQuery(User.class);
//		Root<User> user = query.from(User.class);
//		Path<String> emailPath = user.get("email");
//		List<Predicate> predicates = new ArrayList<>();
//		for (String email : emails) {
//			predicates.add(cb.like(emailPath, email));
//		}
//		query.select(user).where(cb.or(predicates.toArray(new Predicate[predicates.size()])));
//		return entityManager.createQuery(query).getResultList();
//	}
//}
