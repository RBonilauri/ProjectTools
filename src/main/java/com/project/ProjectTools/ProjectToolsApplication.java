package com.project.ProjectTools;

import com.project.ProjectTools.domain.*;
import com.project.ProjectTools.domain.enums.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectToolsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectToolsApplication.class, args);

		Personnage perso1 = Personnage.builder()
				.prenom("Ayato")
				.age(17)
				.espece(Espece.HUMAIN)
				.genre(Genre.HOMME)
				.statut(Statut.VIVANT)
				.arme("katana")
				.magie(Magie.builder().typeMagie(TypeMagie.PIERRE_ELEMENTAIRE).build())
				.traitDeCaractere("kleptoman")
				.origine(Lieu.builder().niveau(Niveau.SURFACE).appelation("pays de l'eau").build())
				.clan(Clan.builder().nomDeClan("clan du vent").build())
				.statutNarratif(StatutNarratif.PERSONNAGE_PRINCIPAL)
				.passeTemps("voler objet en tout genre")
				.nourriturePrefere("cordon bleu")
				.taille(1.75)
				.poids(65)
				.affiliation("clan du vent")
				.build();

		System.out.println(perso1);
	}

	// TODO : s'occuper du header
	// TODO : voir si un footer est nécéssaire
	// TODO : regarder pour BDD hébergée

}
