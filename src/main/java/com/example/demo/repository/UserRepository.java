package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.User;

@Transactional
@Repository
public interface UserRepository extends JpaRepository<User, String> {
	User findByUserId(@Param("userid") String userid);
	
	@Modifying
	@Query("select userId,userName,className,classNumber,watchWord from User where role = 'STUDENT' and enable = '0' ")
	List<User> findRequestUsersColumn();		

	List<User> findByEnableAndRole(@Param("enable") String enable, @Param("role") String role );

	@Modifying
	@Query("update User u set u.enable = '1' where u.userId = :userId ")
	int enable(@Param("userId") String userId);

	User findByClassNameAndRole(@Param("userId") String userId,@Param("role") String role);

	User findByUserNameAndRoleAndEnable(@Param("userName") String userName,@Param("role") String role,@Param("enable") String enable);


}