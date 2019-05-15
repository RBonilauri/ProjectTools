package com.project.ProjectTools.domain;

import com.project.ProjectTools.domain.enums.TypeMagie;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Magie {

    private TypeMagie typeMagie;
    private String attribut;
    private List<Attaque> attaques;
}
