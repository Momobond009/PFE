package com.SeQuorStudent.demo.model;

import com.SeQuorStudent.demo.model.Filiere;
import com.SeQuorStudent.demo.model.Module;
import com.SeQuorStudent.demo.model.Personne;
import com.SeQuorStudent.demo.model.*;

import javax.persistence.*;
import java.util.ArrayList;


@Entity
@DiscriminatorValue("etudiant")
@Table(name = "etudiant")
public class Etudiant extends  Personne
{
    private String section;
    private String semsetre;

    private Filiere filiere;

    private ArrayList<Module> modules;

    private Administrateur admin;


    public Etudiant() {
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getSemsetre() {
        return semsetre;
    }

    public void setSemsetre(String semsetre) {
        this.semsetre = semsetre;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public Administrateur getAdmin() {
        return admin;
    }

    public void setAdmin(Administrateur admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "Etudiant{" + super.toString()+
                "section='" + section + '\'' +
                ", semsetre='" + semsetre + '\'' +
                ", filiere=" + filiere +
                ", modules=" + modules.toString() +
                '}';
    }
}
