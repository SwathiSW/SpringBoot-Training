package com.springboot_query_annotation_demo.repository;

import java.awt.print.Pageable;
import java.util.Collection;
import java.util.List;

import org.apache.catalina.User;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springboot_query_annotation_demo.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	@Query(value = "SELECT * FROM EMPLOYEE e WHERE e.name = 'Sudeb'", nativeQuery = true) // Used for SQL Database.
	Collection<Employee> findAllNames();

	List<Employee> findAllByAddress(Iterable<String> address);

	Page<Employee> findAllEmployeesUsingPagination(Pageable pageable);

	@Query(value = "SELECT * FROM Employee ORDER BY id", countQuery = "SELECT count(*) FROm Employee", nativeQuery = true)

	Page<Employee> findAllEmployeesWithPagination(Pageable pageable);

	@Query("SELECT u FROM Employee u WHERE u.status = ?1")

	User findUserByStatus(Integer status);

	@Query("SELECT u FROM User u WHERE u.status = ?1 and u.name = ?2")

	User findUserByStatusAndName(Integer status, String name);

	@Query("SELECT u FROM User u WHERE u.status = :status and u.name = :name")
	User findUserByStatusAndNameNamedParams(@Param("status") Integer status, @Param("name") String name);

	@Query("SELECT u FROM User u WHERE u.status = :status and u.name = :name")
	User findUserByUserStatusAndUserName(@Param("status") Integer userStatus, @Param("name") String userName);

	@Modifying
	@Query("update User u set u.status = :status where u.name = :name")
	int updateUserSetStatusForName(@Param("status") Integer status, @Param("name") String name);

	@Modifying
	@Query(value = "update Users u set u.status = ? where u.name = ?", nativeQuery = true)
	int updateUserSetStatusForNameNative(Integer status, String name);

	@Modifying
	@Query(value = "insert into Users (name, age, email, status) values (:name, :age, :email, :status)", nativeQuery = true)
	void insertUser(@Param("name") String name, @Param("age") Integer age, @Param("status") Integer status,
			@Param("email") String email);

//	<==========================================USING JPQL=====================================================================>

	@Query("SELECT u FROM Employee u WHERE u.phone = 1343434") // Used for JPQL (Java Persistence Query Language.)
	Collection<Employee> findAllPhones();

}
