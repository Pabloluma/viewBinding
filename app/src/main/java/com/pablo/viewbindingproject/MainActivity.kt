package com.pablo.viewbindingproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pablo.viewbindingproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSave.setOnClickListener {
            save()
        }
    }

    fun save(){
        var textonombre = binding.editTextNombre.text.toString()
        var textoapellido = binding.editTextApellido.text.toString()
        var textoedad = binding.editTextEdad.text.toString()

        var i = Intent(this,MainActivity2::class.java)
        i.putExtra("nombre",textonombre)
        i.putExtra("apellido",textoapellido)
        i.putExtra("edad",textoedad)
        startActivity(i)
    }
}