package com.g3appdev.wachichaw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.g3appdev.wachichaw.entity.EventEntity;

@Repository
public interface EventRepo extends JpaRepository<EventEntity, Integer> {

}
