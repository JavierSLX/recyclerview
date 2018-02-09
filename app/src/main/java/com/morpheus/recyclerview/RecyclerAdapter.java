package com.morpheus.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by Morpheus on 08/02/2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder>
{
    String arreglo[] = {"Layouts", "Fragments", "Items", "Java", "Android"};
    Context context;
    LayoutInflater inflater;

    public RecyclerAdapter(Context context)
    {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    //Crea el viewHolder inflado
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View v = inflater.inflate(R.layout.item, parent, false);
        RecyclerViewHolder holder = new RecyclerViewHolder(v);
        return holder;
    }

    //Llena cada uno de los items
    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position)
    {
        holder.titulo.setText(arreglo[position]);

        //Pasa el valor del holder en un tag
        holder.imagen.setTag(holder);

        holder.imagen.setOnClickListener(onClickListener);
    }

    View.OnClickListener onClickListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {
            //Recupera el holder
            RecyclerViewHolder vh = (RecyclerViewHolder)view.getTag();
            int position = vh.getAdapterPosition();
            Toast.makeText(context, "La posicion es " + position, Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    public int getItemCount()
    {
        return arreglo.length;
    }
}
