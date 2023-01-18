package com.example.dockerspringdemo.model;

import com.example.dockerspringdemo.constant.enums.Roles;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "TEST_ENTITY")
public class TestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "entity_id")
    private Long id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_role")
    @Enumerated(EnumType.STRING)
    private Roles role;
}
