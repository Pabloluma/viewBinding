package com.pablo.viewbindingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pablo.viewbindingproject.databinding.ActivityMain2Binding
import com.pablo.viewbindingproject.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding:ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        save()
    }

    fun save(){
        var bundle = intent.extras
        var tNombre = bundle?.getString("nombre")
        var tApellido = bundle?.getString("apellido")
        var tEdad = bundle?.getString("edad")

        binding.textViewNombre.text = tNombre
        binding.textViewApellido.text = tApellido
        binding.textViewEdad.text = tEdad
    }
}