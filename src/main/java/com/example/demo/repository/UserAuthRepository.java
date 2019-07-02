package com.example.demo.repository;

import com.example.demo.entity.UserAuth;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserAuthRepository extends CrudRepository<UserAuth, Integer> {

    // CRUD以外のクエリを叩くときはここに定義する
    // e.g.
    //    @Query(value = "SELECT password FROM UserAuth u where u.email = :email")
    //    String findPasswordByEmail(@Param("email") String email);

}
