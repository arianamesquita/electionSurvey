package com.example.electionsurvey

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.electionsurvey.model.Formulario

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val buttonSend: Button = findViewById(R.id.btnEnviar)

        val nomeInput: EditText = findViewById(R.id.enterName)
        val tituloInput:EditText = findViewById(R.id.enterTitulo)
        val zonaInput:EditText = findViewById(R.id.enterZona)
        val secaoInput:EditText = findViewById(R.id.enterSecao)
        val cidadeInput:EditText = findViewById(R.id.enterCidade)
        val estadoInput:Spinner = findViewById(R.id.enterEstado)
        val prefeitoInput:Spinner = findViewById(R.id.enterPrefeito)
        val vereadorInput:Spinner = findViewById(R.id.enterVereador)
        val partidoInput:Spinner = findViewById(R.id.enterPartido)

        buttonSend.setOnClickListener(){
            val formulario = Formulario(
                nome = nomeInput.text.toString(),
                titulo = tituloInput.text.toString().toInt(), // Certifique-se de converter corretamente os números
                zona = zonaInput.text.toString().toInt(),
                secao = secaoInput.text.toString().toInt(),
                cidade = cidadeInput.text.toString(),
                estado = estadoInput.selectedItem.toString(),
                prefeito = prefeitoInput.selectedItem.toString(),
                vereador = vereadorInput.selectedItem.toString(),
                partido = partidoInput.selectedItem.toString()
            )
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("formulario", formulario)
            startActivity(intent)
        }
    }
}