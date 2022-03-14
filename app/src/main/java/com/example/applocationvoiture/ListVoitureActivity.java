package com.example.applocationvoiture;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.applocationvoiture.adapter.VoitureAdapter;
import com.example.applocationvoiture.beans.Voiture;
import com.example.applocationvoiture.service.VoitureService;

public class ListVoitureActivity extends AppCompatActivity {
    ListView list;
    VoitureService vs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_voiture);
        vs=new VoitureService();
        list= findViewById(R.id.liste);
        vs.Create(new Voiture(1, "Citroen C3", "AAHKS813", "300.0DH/jour", R.mipmap.img1, "30 jours", "La Citroën C3 est une incontournable du marché des citadines polyvalentes. Avec trois générations sorties en 25 ans, la C3 est aujourd'hui une sérieuse concurrente de ce marché particulièrement atomisé en France. Partant d'un joli design de type « bulle » en 2002, elle séduit aujourd'hui une clientèle plus jeune de par son « design musclé » et son allure de petit crossover urbain."));
        vs.Create(new Voiture(2, "Renault Clio 4", "JDAS6713", "250.0DH/jour", R.mipmap.img2, "40 jours", "Véritable star mondiale, la Renault Clio est le best-seller de la marque au losange (en tête des ventes de voitures neuves en France durant de nombreuses années). Produite depuis 1990, par le constructeur français, cette compacte en est à sa quatrième génération et se décline également en version break (Estate)."));
        vs.Create(new Voiture(3, "Fiat 500", "JBJSA761823", "300.0DH/jour", R.mipmap.img3, "15 jours", "Véritable star mondiale, la Fiat 500 est le best-seller de la marque au losange (en tête des ventes de voitures neuves en France durant de nombreuses années). Produite depuis 1990, par le constructeur français, cette compacte en est à sa quatrième génération et se décline également en version break (Estate)."));
        vs.Create(new Voiture(4, "Peugeot Santafe", "MBHASB87612832", "300.0DH/jour", R.mipmap.img4, "90 jours", ""));
        vs.Create(new Voiture(5, "Dacia Duster", "JKBKJSA876123", "400.0DH/jour", R.mipmap.img5, "44 jours", "Nouveau Dacia Duster affirme son caractère de baroudeur pour vous accompagner dans toutes vos aventures et s'impose comme le SUV familial emblématique Dacia. "));
        vs.Create(new Voiture(6, "Huandai i20", "JBJD8293", "450.0DH/jour", R.mipmap.img6, "130 jours", ""));
        vs.Create(new Voiture(7, "Mercedes gla200", "JGJQHKSA968213", "1200.0DH/jour", R.mipmap.img7, "70 jours", "Mercedes-Benz produces consumer luxury vehicles and commercial vehicles. ... Its first Mercedes-Benz-badged vehicles were produced in 1926. In 2018, Mercedes-Benz ..."));
        list.setAdapter(new VoitureAdapter(vs.findAll(), this));


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                final TextView idf = view.findViewById(R.id.code);
                Intent intent = new Intent(ListVoitureActivity.this, VoitureDetail.class);
                Voiture p = vs.findById(Integer.valueOf((String) idf.getText()));

                intent.putExtra("nom", p.getNom());
                intent.putExtra("photo", String.valueOf(p.getPhoto()));
                intent.putExtra("duree", p.getDuree());
                intent.putExtra("desc", p.getDescription());


                startActivity(intent);}
        });
    }
}
