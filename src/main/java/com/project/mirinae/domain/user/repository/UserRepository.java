package com.project.mirinae.domain.user.repository;

import com.project.mirinae.domain.user.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findByUserId(String userId);

    Optional<User> findByName(String name);

    User getReferenceByUserId(String userId);

}
