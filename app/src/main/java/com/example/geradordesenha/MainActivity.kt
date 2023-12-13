package com.example.geradordesenha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.geradordesenha.databinding.ActivityMainBinding
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val alfabeto = arrayListOf(
        "A","B","C","D","E","F","G", "H",
        "I","J","K","L","M","N","O", "P",
        "Q","R","S","T","U","V","X", "W",
        "Y","Z")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGerarSenha.setOnClickListener {

            val letra1 = alfabeto.random()
            val letra2 = alfabeto.random()
            val numero = Random.nextInt(1000..9999)

            binding.textSenha.text = "$letra1$letra2-$numero"

        }
    }
}