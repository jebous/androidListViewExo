package com.example.jerome.listviewexo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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

        registerForContextMenu(listView1);


    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_listview_personne, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        AdapterView.AdapterContextMenuInfo menuInfo = (AdapterView.AdapterContextMenuInfo)item.getMenuInfo();
        switch (item.getItemId()) {
            case R.id.copie:
                Toast.makeText(getApplicationContext(), "Copie: ID" + menuInfo.id + ", position " + menuInfo.position, Toast.LENGTH_SHORT).show();
                break;
            case R.id.delete:
                Toast.makeText(getApplicationContext(), "Delete: ID" + menuInfo.id + ", position " + menuInfo.position, Toast.LENGTH_SHORT).show();
                PersonneArrayAdapter paa=(PersonneArrayAdapter)listView1.getAdapter();
                Personne pASupprimer= paa.getItem(menuInfo.position);
                paa.notifyDataSetChanged();
                break;
        }
        return true;
    }

}
