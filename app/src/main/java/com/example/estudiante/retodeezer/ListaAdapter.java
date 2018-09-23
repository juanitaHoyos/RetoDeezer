package com.example.estudiante.retodeezer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListaAdapter extends BaseAdapter {

    ArrayList<Lista> listas;
    Activity activity;


    public ListaAdapter(Activity activity) {
        this.activity = activity;
        listas = new ArrayList<>();

    }

    @Override
    public Object getItem(int x) {
        return listas.get(x);
    }

    @Override
    public long getItemId(int x) {
        return x;
    }

    @Override
    public int getCount() {
        return listas.size();
    }


    @Override
    public View getView(final int position, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = activity.getLayoutInflater();



        View linea = inflater.inflate(R.layout.linea, null, false);
        TextView item_nombreCanciones = linea.findViewById(R.id.item_nombreCancion);
        TextView item_user = linea.findViewById(R.id.item_user);
        TextView item_canciones = linea.findViewById(R.id.item_canciones);


        item_nombreCanciones.setText(listas.get(position).getNombre());
        item_user.setText("creado por:  "+listas.get(position).getUser());
        item_canciones.setText("no. de canciones:  "+listas.get(position).getCanciones());

        return linea;
    }

    public void agregarLista(Lista lista){
        listas.add(lista);
        notifyDataSetChanged();
    }
}
