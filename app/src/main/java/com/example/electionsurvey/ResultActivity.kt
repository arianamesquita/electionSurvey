package com.example.electionsurvey

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.electionsurvey.model.Formulario

class ResultActivity: AppCompatActivity() {
    @SuppressLint("NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val formulario: Formulario? = intent.getParcelableExtra("formulario", Formulario::class.java)
        val tText: TextView = findViewById(R.id.resultText)
        val text = "${formulario?.nome}, seja bem vindo! \n\n" +
                "Seu título de eleitor de número ${formulario?.titulo}, registrado na " +
                "zona ${formulario?.zona} na seção ${formulario?.secao}, da cidade de " +
                "${formulario?.cidade} e no estado de ${formulario?.estado}. \n\n" +
                "Você definiu como intenção de voto o prefeito ${formulario?.prefeito}, " +
                "o vereador ${formulario?.vereador} e o partido ${formulario?.partido}. " +
                "\n\nObrigada pelo apoio!"

        tText.setText(text)
    }

}