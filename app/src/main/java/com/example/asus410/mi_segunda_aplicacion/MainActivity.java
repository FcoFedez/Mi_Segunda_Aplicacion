package com.example.asus410.mi_segunda_aplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btninteres = (Button)findViewById(R.id.btnIntereses);
    }

    public void clickIntereses(View view){

        Intent i = new Intent(this,Intereses.class);
        startActivity(i);
    }

    public void clickNoticias(View v){
        Intent i = new Intent(this,Noticias.class);
        startActivity(i);
    }
}
