package com.example.jerome.listviewexo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jerome on 22/08/2016.
 */
public class ListPersonne {

    private List<Personne> listPersonnes;


    public List<Personne> getListPersonnes() {
        return listPersonnes;
    }

    public void setListPersonnes(ArrayList<Personne> listPersonnes) {
        this.listPersonnes = listPersonnes;
    }

    public ListPersonne()
    {
        listPersonnes = new ArrayList<Personne>();

    }
}
