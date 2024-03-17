package com.application.pokedex;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long number;

    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @Column(name = "type1", nullable = false, length = 50)
    private String type1;

    @Column(name = "type2", length = 50)
    private String type2;

    @Column(name = "species", nullable = false, length = 255)
    private String species;

    @Column(name = "height")
    private double height;

    @Column(name = "weight")
    private double weight;

    @Column(name = "evolution_1", length = 255)
    private String evolution1;

    @Column(name = "evolution_2", length = 255)
    private String evolution2;

}
