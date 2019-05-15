package com.project.ProjectTools.domain;

import com.project.ProjectTools.domain.enums.TypeMagie;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Attaque {

    private String nom;
    private TypeMagie typeMagie;
    private Personnage personnage;
    private String description;

}
