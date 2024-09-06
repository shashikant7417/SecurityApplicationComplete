package com.shashi.springsecurity.securityapplication.repositories;

import com.shashi.springsecurity.securityapplication.entities.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostEntity,Long> {
}
