package com.example.applocationvoiture.service;

import com.example.applocationvoiture.beans.Voiture;
import com.example.applocationvoiture.dao.IDao;

import java.util.ArrayList;
import java.util.List;

public class VoitureService implements IDao<Voiture> {
    private List<Voiture> voitures;
    public VoitureService(){
        this.voitures = new ArrayList<>();
    }
    @Override
    public boolean Create(Voiture o) {
        return voitures.add(o);
    }

    @Override
    public boolean Delete(Voiture o) {
        return voitures.remove(o);
    }

    @Override
    public boolean Update(Voiture o) {
        return false;
    }

    @Override
    public List<Voiture> findAll() {
        return voitures;
    }

    @Override
    public Voiture findById(int id) {
        for(Voiture v : voitures){
            if(v.getId() == id) {
                return v;
            }
        }
        return null;
    }
}
