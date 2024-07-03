package com.keomagroup.bodas.bodasapi.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Events {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;

    @Column(nullable = false, length = 200)
    @NotBlank(message = "ERROR.NAME_MUST_NOT_BE_NULL")
    private String name;

    @Column(nullable = false, length = 100)
    @NotBlank(message = "ERROR.SLOGAN_MUST_NOT_BE_NULL")
    private String slogan;

    private String logo;
    private String cover;
    private String address;

    /** The use of 'Integer', not 'int' is to facilitate validations */
    private Integer participantsLimit;

    @ElementCollection
    @CollectionTable(name = "participants")
    private Set<String> participants;

    @ElementCollection
    @CollectionTable(name = "sessions")
    private Set<String> session;
}
