package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToActivityProducto(View view){
        Intent newIntent = new Intent(this, ProductoActivity.class);
        //Paso de parametros
        newIntent.putExtra( "saludo",  "Hola");
        newIntent.putExtra(  "area",  "Producto");
        //Inicializacion de la nueva activity
        startActivity(newIntent);

    }

    public void goToActivityCategoria(View view){
        Intent newIntent = new Intent(this, CategoriaActivity.class);
        //Paso de parametros
        newIntent.putExtra( "saludo",  "Hola");
        newIntent.putExtra(  "area",  "Categoría");
        newIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // Elimina las activities anteriores
        //Inicializacion de la nueva activity
        startActivity(newIntent);
    }
}