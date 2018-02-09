package com.morpheus.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);

        //Todos los items de la lista tienen el mismo tamaño
        recyclerView.setHasFixedSize(true);

        //Se agrega una propiedad del recycler
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
