package com.example.semana_15_kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Crear objetos que enlazan con los componentes

        // Crear objetos que enlazan con los componentes
        val tNombre = findViewById(R.id.etNombre) as EditText
        val tApellido = findViewById(R.id.etApellido) as EditText
        val bDatos = findViewById(R.id.btEnviarDatos) as Button

        // Crear el método Clic para el botón
        bDatos.setOnClickListener(View.OnClickListener { // Crear las variables que reciben los datos
            val nom: String = tNombre.getText().toString()
            val ape: String = tApellido.getText().toString()
            // Primera salida utilizando Toast
            Toast.makeText(applicationContext, "Tu nombre es: $nom $ape", Toast.LENGTH_LONG).show()
        })
    }
}