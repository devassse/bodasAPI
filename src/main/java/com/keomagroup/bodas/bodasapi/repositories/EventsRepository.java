package com.keomagroup.bodas.bodasapi.repositories;

import com.keomagroup.bodas.bodasapi.entities.Events;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventsRepository extends JpaRepository<Events, UUID> {
}
