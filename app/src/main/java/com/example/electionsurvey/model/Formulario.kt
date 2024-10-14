package com.example.electionsurvey.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Formulario(val nome: String, val titulo: Number, val zona: Number, val secao: Number,
                      val cidade: String, val estado: String, val prefeito: String,
                      val vereador: String, val partido: String) : Parcelable