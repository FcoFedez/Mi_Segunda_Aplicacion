package com.example.asus410.mi_segunda_aplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    private EditText nombre, direccion, telefono, edad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        nombre = (EditText) findViewById(R.id.ETnombre);
        direccion = (EditText) findViewById(R.id.ETdireccion);
        telefono = (EditText) findViewById(R.id.ETtelefono);
        edad = (EditText) findViewById(R.id.ETedad);

    }

    public void clickAceptar(View v){
        if(nombre.getText().toString().isEmpty() &&
                direccion.getText().toString().isEmpty() &&
                telefono.getText().toString().isEmpty() &&
                edad.getText().toString().isEmpty()){
            Toast t = Toast.makeText(getApplicationContext(),"Deben estar rellenos todos los campos",
                    Toast.LENGTH_LONG);
            t.show();
        }else if(nombre.getText().toString().isEmpty()){
            Toast t = Toast.makeText(getApplicationContext(),"Tiene que rellenar nombre",
                    Toast.LENGTH_LONG);
            t.show();
        }else if(direccion.getText().toString().isEmpty()){
            Toast t = Toast.makeText(getApplicationContext(),"Tiene que rellenar direccion",
                    Toast.LENGTH_LONG);
            t.show();
        }else if(edad.getText().toString().isEmpty()){
            Toast t = Toast.makeText(getApplicationContext(),"Tiene que rellenar edad",
                    Toast.LENGTH_LONG);
            t.show();
        }else if(telefono.getText().toString().isEmpty()){
            Toast t = Toast.makeText(getApplicationContext(),"Tiene que rellenar telefono",
                    Toast.LENGTH_LONG);
            t.show();
        }else {
            Toast t = Toast.makeText(getApplicationContext(),"Registro completo",
                    Toast.LENGTH_LONG);
            t.show();

            Intent i = new Intent();
            setResult(RESULT_OK,i);
            finish();
        }
    }

    public void clickVolver(View v){
        finish();
    }
}
