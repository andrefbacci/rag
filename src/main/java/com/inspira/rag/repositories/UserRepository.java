package com.inspira.rag.repositories;

import com.inspira.rag.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface UserRepository
    extends JpaRepository<User, UUID>, JpaSpecificationExecutor<User> {
}
