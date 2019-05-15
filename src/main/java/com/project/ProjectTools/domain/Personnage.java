package com.project.ProjectTools.domain;

import com.project.ProjectTools.domain.enums.Espece;
import com.project.ProjectTools.domain.enums.Genre;
import com.project.ProjectTools.domain.enums.Statut;
import com.project.ProjectTools.domain.enums.StatutNarratif;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Personnage {

    // Identite
    private String prenom;
    private String nom;
    private int age;
    private Espece espece;
    private Genre genre;
    private Statut statut;

    // Skills
    private String arme;
    private Magie magie;
    private List<Attaque> listeAttaques;

    // Narration
    private String traitDeCaractere;
    private Lieu origine;
    private Clan clan;
    private StatutNarratif statutNarratif;

    // Details
    private String passeTemps;
    private String nourriturePrefere;
    private String pseudonyme;
    private double taille;
    private double poids;
    private Date dateNaissance;
    private String affiliation;

    // TODO : format date dd/MM
}
