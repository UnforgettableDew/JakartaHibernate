package com.example.demo1;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity(name = "mark_table")
@Table(name = "mark_table", schema = "public")
public class Mark implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "presence")
    private boolean presence;

    @Column(name = "knowledge_level")
    private int knowledgeLevel;
}