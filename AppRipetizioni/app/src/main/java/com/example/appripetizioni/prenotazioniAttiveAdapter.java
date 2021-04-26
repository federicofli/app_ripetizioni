package com.example.appripetizioni;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;


import java.util.ArrayList;


public class prenotazioniAttiveAdapter extends ArrayAdapter<Prenotazioni> {


    public prenotazioniAttiveAdapter(Activity context, ArrayList<Prenotazioni> carsDetails){
        super(context, 0, carsDetails);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_prenotazioni_attive, parent, false
            );
        }

        Prenotazioni prenotazione = getItem(position);

        TextView nomeTv = (TextView) listItemView.findViewById(R.id.nome);
        nomeTv.setText(prenotazione.getNomeP());

        TextView cognomeTv = (TextView) listItemView.findViewById(R.id.cognome);
        cognomeTv.setText(prenotazione.getCognome());

        TextView orarioTv = (TextView) listItemView.findViewById(R.id.orario);
        orarioTv.setText(prenotazione.getGiorno());

        TextView dataTv = (TextView) listItemView.findViewById(R.id.data);
        dataTv.setText(prenotazione.getOrario());

      /*  Button materiaTv = (Button) listItemView.findViewById(R.id.materia);
        materiaTv.setTag(prenotazione.getIdPrenotazione()); */




        return listItemView;
    }
}
