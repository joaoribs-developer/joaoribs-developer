package com.example.app_cadastro_tarefa_frontend.models

import com.google.gson.annotations.SerializedName

data class LoginResponse(
@SerializedName("status_code")
var status: Int,
@SerializedName("token")
var token: String,
@SerializedName("nome")
val nome: String,
@SerializedName("email")
val email: String,
)

