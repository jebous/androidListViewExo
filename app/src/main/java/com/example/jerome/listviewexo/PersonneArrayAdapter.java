package com.example.jerome.listviewexo;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Jerome on 22/08/2016.
 */
public class PersonneArrayAdapter extends ArrayAdapter<Personne> {
    private ListPersonne listPersonnes;

    Context context;
    int itemlayout;

    public PersonneArrayAdapter(Context context,int _r, List<Personne> personnes) {
        super(context, _r, personnes);
        this.itemlayout = _r;
        this.context = context;
        this.listPersonnes = new ListPersonne();
        this.listPersonnes.setListPersonnes((ArrayList<Personne>)personnes);
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        View v = view;
        if (v == null) {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            v = inflater.inflate(R.layout.item_of_list_look, viewGroup, false);
        }

        Personne personneOfItem = listPersonnes.getListPersonnes().get(i);

        if (personneOfItem != null)
        {
            TextView nomView = (TextView) v.findViewById(R.id.textViewNom);
            TextView prenomView = (TextView) v.findViewById(R.id.textViewPrenom);
            ImageView photoView = (ImageView) v.findViewById(R.id.imageViewPhoto);

            if (nomView != null) {
                nomView.setText("Name: " + personneOfItem.getNom());
            }
            if (prenomView != null) {
                prenomView.setText("Prenom: " + personneOfItem.getPrenom());
            }
            if (photoView != null) {
                if (personneOfItem.getImage() != null) {
                    photoView.setImageResource(personneOfItem.getImage());
                } else {
                    photoView.setImageDrawable(v.getResources().getDrawable(R.drawable.absent, null));
                }
            }

        }
        return v;
    }
}