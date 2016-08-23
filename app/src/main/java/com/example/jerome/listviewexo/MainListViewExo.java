package com.example.jerome.listviewexo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainListViewExo extends AppCompatActivity {

    ListPersonne _lp;
    ListView listView1;
    Personne unePersonne;
    ArrayList<Personne> desPersonnes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list_view_exo);

        unePersonne = new Personne();
        unePersonne.setNom("Bousquet");
        unePersonne.setPrenom("Jerome");
        unePersonne.setImage(R.drawable.absent);
        desPersonnes = new ArrayList<Personne>();
        desPersonnes.add(unePersonne);
        _lp = new ListPersonne();
        _lp.setListPersonnes(desPersonnes);
        listView1 = (ListView)findViewById(R.id.onelistView);

        PersonneArrayAdapter adapter = new PersonneArrayAdapter(this, R.layout.item_of_list_look, desPersonnes);

        listView1.setAdapter(adapter);

    }
}
