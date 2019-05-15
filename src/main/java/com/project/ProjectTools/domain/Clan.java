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
public class Clan {

    private Lieu localisation;
    private String nomDeClan;
    private List<Personnage> personnes;
}
