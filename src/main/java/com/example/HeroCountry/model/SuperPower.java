package com.example.HeroCountry.model;

import lombok.*;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Validated
@ToString
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
            joinColumns =  @JoinColumn(name = "id_superpower", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_hero", referencedColumnName = "id"))
            List<Hero> heroes = new ArrayList<Hero>();

}
