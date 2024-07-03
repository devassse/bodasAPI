package com.keomagroup.bodas.bodasapi.dto;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventsDto {
    private UUID uuid;
    private String name;
    private String slogan;

    private String logo;
    private String cover;
    private String address;

    /** The use of 'Integer', not 'int' is to facilitate validations */
    private Integer participantsLimit;

    private Set<String> participants;

    @NotBlank(message = "ERROR.LOGO_URL_EMPTY")
    private String logoUrl;
    @NotBlank(message = "ERROR.COVER_URL_EMPTY")
    private String coverUrl;
}
