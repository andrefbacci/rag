package com.inspira.rag.repositories;

import com.inspira.rag.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface FileRepository
    extends JpaRepository<File, UUID>, JpaSpecificationExecutor<File> {
}
