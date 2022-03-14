package com.example.applocationvoiture.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.applocationvoiture.ListVoitureActivity;
import com.example.applocationvoiture.R;
import com.example.applocationvoiture.beans.Voiture;

import java.util.List;

public class VoitureAdapter extends BaseAdapter {
    private LayoutInflater layoutInflater;
    private List<Voiture> voitures;
    private Context context;
    private ImageView iv;
    private TextView title,prix,matricule;

    public VoitureAdapter(List<Voiture> voitures, ListVoitureActivity context) {
        this.voitures = voitures;
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return voitures.size();
    }

    @Override
    public Object getItem(int i) {
        return voitures.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = layoutInflater.inflate(R.layout.activity_main,null);
        iv = v.findViewById(R.id.img);
        title = v.findViewById(R.id.tit);
        prix = v.findViewById(R.id.sub);
        matricule = v.findViewById(R.id.code);
        Voiture p = voitures.get(i);
        iv.setImageResource(p.getPhoto());
        title.setText(p.getNom());
        try {
            matricule.setText(p.getDuree()+"");
        }catch (Exception e){}
       try {
           prix.setText(p.getPrix()+"");
       }catch (Exception e){}

        return v;
    }
}
