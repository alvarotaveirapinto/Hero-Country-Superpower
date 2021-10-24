package com.example.HeroCountry.model;

import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "superpower")
public class SuperPower {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String description;
    private String name;
    private int level;

    @ManyToMany
    @JoinTable(
            name = "hero_superpower" ,
            joinColumns =  @JoinColumn(name = "id_superpower"),
            inverseJoinColumns = @JoinColumn(name = "id_hero"))
            List<Hero> heroes = new ArrayList<Hero>();

}
