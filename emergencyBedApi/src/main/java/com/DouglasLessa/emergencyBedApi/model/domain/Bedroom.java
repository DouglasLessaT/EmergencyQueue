package com.DouglasLessa.emergencyBedApi.model.domain;

import java.util.ArrayList;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bedroom")
public class Bedroom {

    @Id
    private UUID id = UUID.randomUUID();

    private String code;
    private String floor;
    private String type;

    @ManyToOne
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;

    @OneToMany(mappedBy = "bedroom")
    private ArrayList<Bed> beds;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;
}
