package com.inspira.rag.models;

import com.inspira.rag.models.enums.UserStatusEnum;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.UUID;

public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Column(nullable = false)
  private String document;

  @Column(nullable = true)
  private String social_platform_id;

  @Column(nullable = false)
  private Integer total_queries;

  @Column(nullable = true)
  private Timestamp last_query;

  @Column(nullable = false)
  @Enumerated(EnumType.STRING)
  private UserStatusEnum status;

}
