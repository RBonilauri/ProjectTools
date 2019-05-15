package com.project.ProjectTools.domain;

import com.project.ProjectTools.domain.enums.Niveau;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Lieu {

    private String appelation;
    private Niveau niveau;
    private String placeForte;
}
