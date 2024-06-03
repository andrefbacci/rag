package com.inspira.rag.models;


import com.inspira.rag.models.enums.FileStatusEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class File {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Column(nullable = false)
  private String hash;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private Integer size;

  @Column(nullable = false)
  private String storage_path;

  @Column(nullable = false)
  @Enumerated(EnumType.STRING)
  private FileStatusEnum status;

  @ManyToOne
  @JoinColumn(name= "user_id", nullable = false)
  private User user;

}
