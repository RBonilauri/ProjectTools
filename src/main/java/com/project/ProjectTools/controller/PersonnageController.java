package com.project.ProjectTools.controller;

import com.project.ProjectTools.domain.Personnage;
import com.project.ProjectTools.domain.enums.Attribut;
import com.project.ProjectTools.domain.enums.Genre;
import com.project.ProjectTools.domain.enums.Statut;
import com.project.ProjectTools.domain.enums.TypeMagie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/personnage")
public class PersonnageController {

    List<Genre> genres = new ArrayList<>();
    List<Statut> statuts = new ArrayList<>();
    List<TypeMagie> typeMagies = new ArrayList<>();
    List<Attribut> attributs = new ArrayList<>();

    @RequestMapping(value = {"/list"}, method = RequestMethod.GET)
    public String list(Model model) {
        String raf = "raf";
        model.addAttribute("raf", raf);
        return "personnage/list";
    }

    @RequestMapping(value = {"/form"}, method = RequestMethod.GET)
    public String form(Model model) {

        if (genres.size() == 0 && statuts.size() == 0 && typeMagies.size() == 0 && attributs.size() == 0) {
            for (Genre g : Genre.values()) {
                genres.add(g);
            }
            for (Statut s : Statut.values()) {
                statuts.add(s);
            }
            for (TypeMagie tm : TypeMagie.values()) {
                typeMagies.add(tm);
            }
            for (Attribut a : Attribut.values()) {
                attributs.add(a);
            }
        }

        System.out.println(statuts);

        model.addAttribute("listeGenres", genres);
        model.addAttribute("listeTypeMagies", typeMagies);
        model.addAttribute("listeAttributs", attributs);
        model.addAttribute("listeStatuts", statuts);
        return "personnage/form";
    }

    @RequestMapping(value = {"/detail"}, method = RequestMethod.GET)
    public String detail(Model model, Personnage perso) {

        model.addAttribute("personnage", new Personnage());

        // Identite
        model.addAttribute("nom", perso.getNom());
        model.addAttribute("prenom", perso.getPrenom());
        model.addAttribute("age", perso.getAge());
        model.addAttribute("espece", perso.getEspece());
        model.addAttribute("genre", perso.getGenre());
        model.addAttribute("statut", perso.getStatut());
        // Skill
        model.addAttribute("typeMage", perso.getMagie().getTypeMagie());
        model.addAttribute("attribut", perso.getMagie().getAttribut());
        model.addAttribute("listeAttaques", perso.getMagie().getAttaques());
        // Naration
        model.addAttribute("traitDeCaractere", perso.getTraitDeCaractere());
        model.addAttribute("origine", perso.getOrigine().getAppelation());
        model.addAttribute("clan", perso.getClan().getNomDeClan());
        model.addAttribute("statutNarratif", perso.getStatutNarratif());
        // Details
        model.addAttribute("taille", perso.getTaille());
        model.addAttribute("poids", perso.getPoids());
        model.addAttribute("dateNaissance", perso.getDateNaissance());
        model.addAttribute("pseudonymes", perso.getPseudonyme());
        model.addAttribute("affiliation", perso.getAffiliation());
        model.addAttribute("passeTemps", perso.getPasseTemps());
        model.addAttribute("nourriture", perso.getNourriturePrefere());
        return "personnage/detail";
    }

    @RequestMapping(value = {"/form"}, method = RequestMethod.POST)
    public String post(@RequestParam(value = "action", required = true) String action, @ModelAttribute("personnage") Personnage personnage) {

        String genre = String.valueOf(personnage.getGenre());
        System.out.println("==" + genre + "==");

        if (action.equals("Annuler")) {
            System.out.println("mal vu mec");
            return "personnage/form";
        } else if (action.equals("Creer")) {
            System.out.println("bien vu mec");
            return "redirect:list";
        } else {
            return "personnage/form";
        }
    }
}
