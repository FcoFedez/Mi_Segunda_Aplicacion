package com.example.asus410.mi_segunda_aplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int cod;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button btninteres = (Button)findViewById(R.id.btnIntereses);
        cod = 0;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        Intent i;
        switch (item.getItemId()) {
            case R.id.Macerca:
                i = new Intent(this,Acercade.class);
                startActivity(i);
                return true;

            case R.id.Mayuda:
                i = new Intent(this,Ayuda.class);
                startActivity(i);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onActivityResult(int request, int result, Intent i) {
        if(request == 10 && result == RESULT_OK) cod =1;
    }

    public void clickIntereses(View view){

        if(cod == 0){
            Toast t = Toast.makeText(getApplicationContext(),"Debe registrarse primero",
                    Toast.LENGTH_LONG);
            t.show();
        }else {
            Intent i = new Intent(this,Intereses.class);
            startActivity(i);
        }

    }

    public void clickNoticias(View v){
        if(cod == 0){
            Toast t = Toast.makeText(getApplicationContext(),"Debe registrarse primero",
                    Toast.LENGTH_LONG);
            t.show();
        }else {
            Intent i = new Intent(this, Noticias.class);
            startActivity(i);
        }
    }

    public void clickHistoria(View v){
        if(cod == 0){
            Toast t = Toast.makeText(getApplicationContext(),"Debe registrarse primero",
                    Toast.LENGTH_LONG);
            t.show();
        }else {
            Intent i = new Intent(this, Historia.class);
            startActivity(i);
        }
    }
    public void  clickRegistro(View v){
        Intent i = new Intent(this,Registro.class);
        startActivityForResult(i,10);
    }


}
