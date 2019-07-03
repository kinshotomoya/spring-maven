package com.example.demo.repository;

import com.example.demo.entity.AuthUser;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface AuthUserRepository extends CrudRepository<AuthUser, Integer> {

    // CRUD以外のクエリを叩くときはここに定義する
    // e.g.
    //    @Query(value = "SELECT password FROM AuthUser u where u.email = :email")
    //    String findPasswordByEmail(@Param("email") String email);

}
