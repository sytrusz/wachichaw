package com.g3appdev.wachichaw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.g3appdev.wachichaw.entity.UserEntity;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Integer>{

}
