package com.manillas.personasmovil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Listar extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<Persona> personas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);
        tabla = findViewById(R.id.tabla);
        personas = Datos.obtener();

        for (int i = 0; i < personas.size(); i++){
            TableRow row = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);
            c1.setText(String.valueOf(i+1));
            c2.setText(personas.get(i).getCedula());
            c3.setText(personas.get(i).getNombre());
            c4.setText(personas.get(i).getApellido());

            row.addView(c1);
            row.addView(c2);
            row.addView(c3);
            row.addView(c4);

            tabla.addView(row);
        }
    }
}
