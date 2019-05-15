package com.project.ProjectTools.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArcNarratif {

    private String nom;
    private int chapDebut;
    private int chapFin;
    private List<Personnage> antagonistes;
    private List<Personnage> protagonistes;
    private Lieu lieuAction;

}
