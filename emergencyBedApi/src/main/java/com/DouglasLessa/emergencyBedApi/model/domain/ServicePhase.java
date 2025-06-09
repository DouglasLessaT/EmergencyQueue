package com.DouglasLessa.emergencyBedApi.model.domain;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "service_phase")
public class ServicePhase {

    @Id
    private UUID id = UUID.randomUUID();

    private String name;
    private String code;
    private String color;
    private String description;
}
