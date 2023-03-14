package com.SIvanovskis.datortehnika.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name ="pieteikta_tehnika")
public class DatTehEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String datortehnika;
    private String pamatojums;
}
