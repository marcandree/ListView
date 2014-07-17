package com.example.listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity
{
    ListView listView ;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = (ListView) findViewById(R.id.list);

        // création d'un tableau contenant des valeurs
        String[] values = new String[] { "Nike",
                "Adidad",
                "Puma",
                "New Balance",
                "Fila"
        };

        // création de l'adapter
        // android.R.id.text1 est définit dans le layout du listview

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // assigne un adapter à une listview
        listView.setAdapter(adapter);

        //rajout d'un click listener à une listview
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id)
            {

                // la position de l'élément
                int itemPosition     = position;

                // la valeur de l'élément choisit
                String  itemValue    = (String) listView.getItemAtPosition(position);

                // Affichage du message
                Toast.makeText(getApplicationContext(),
                        "Position :"+itemPosition+"  Element : " +itemValue , Toast.LENGTH_LONG)
                        .show();

            }

        });
    }

}