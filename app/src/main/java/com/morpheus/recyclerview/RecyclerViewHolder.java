package com.morpheus.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Morpheus on 08/02/2018.
 */

//Clase que ayuda a acomodar el item en el RecyclerView

public class RecyclerViewHolder extends RecyclerView.ViewHolder
{
    TextView titulo, texto;
    ImageView imagen;

    public RecyclerViewHolder(View itemView)
    {
        super(itemView);
        titulo = (TextView)itemView.findViewById(R.id.titulo);
        texto = (TextView)itemView.findViewById(R.id.texto);
        imagen = (ImageView)itemView.findViewById(R.id.imagen);
    }
}
