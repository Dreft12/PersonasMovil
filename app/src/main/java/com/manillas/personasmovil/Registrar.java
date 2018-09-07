package com.manillas.personasmovil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registrar extends AppCompatActivity {
    private EditText cedula, nombre, apellido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
        cedula = findViewById(R.id.txtcedula);
        nombre = findViewById(R.id.txtNombre);
        apellido = findViewById(R.id.txtApellido);
    }

    public void guardar(View v){
        String cedula, nombre, apellido;
        cedula = this.cedula.getText().toString();
        nombre = this.nombre.getText().toString();
        apellido = this.apellido.getText().toString();
        Persona p = new Persona(cedula, nombre, apellido);
        p.guardar();
        Toast.makeText(this, getResources().getText(R.string.exitoso), Toast.LENGTH_SHORT).show();
        limpiar();
    }

    public void borrar(View v){
        limpiar();
    }
    private void limpiar(){
        cedula.setText("");
        nombre.setText("");
        apellido.setText("");
        cedula.requestFocus();
    }
}
