package com.example.fnafappgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fnafappgame.Adapter.AdapterItem
import com.example.fnafappgame.model.Produto

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()

        val recyclerView_produtos = findViewById<RecyclerView>(R.id.recyclerView_produtos)
        recyclerView_produtos.layoutManager = LinearLayoutManager(this)
        recyclerView_produtos.setHasFixedSize(true)
        //Configurar o Adapter
        val listaItens: MutableList<Produto> = mutableListOf()
        val adapterItem = AdapterItem(this, listaItens)
        recyclerView_produtos.adapter = adapterItem

        val produto1 = Produto(
            R.drawable.bonnie,
            "Bonnie",
            "Confiável, rápido e muita capacidade. A SanDisk, pioneira em tecnologias de armazenamento de estado sólido é a marca de confiança dos profissionais da área, oferece maior velocidade e desempenho com o SanDisk SSD Plus.",
            "R$ 800,00"

        )
        listaItens.add(produto1)

        val produto2 = Produto(
            R.drawable.chica,
            "Chica",
            "Confiável, rápido e muita capacidade. A SanDisk, pioneira em tecnologias de armazenamento de estado sólido é a marca de confiança dos profissionais da área, oferece maior velocidade e desempenho com o SanDisk SSD Plus.",
            "R$ 800,00"

        )
        listaItens.add(produto2)

        val produto3 = Produto(
            R.drawable.foxy,
            "Foxy",
            "Confiável, rápido e muita capacidade. A SanDisk, pioneira em tecnologias de armazenamento de estado sólido é a marca de confiança dos profissionais da área, oferece maior velocidade e desempenho com o SanDisk SSD Plus.",
            "R$ 800,00"

        )
        listaItens.add(produto3)

        val produto4 = Produto(
            R.drawable.freddy,
            "Freddy",
            "Confiável, rápido e muita capacidade. A SanDisk, pioneira em tecnologias de armazenamento de estado sólido é a marca de confiança dos profissionais da área, oferece maior velocidade e desempenho com o SanDisk SSD Plus.",
            "R$ 800,00"

        )
        listaItens.add(produto4)

        val produto5 = Produto(
            R.drawable.gfreddy,
            "Golden Freddy",
            "Confiável, rápido e muita capacidade. A SanDisk, pioneira em tecnologias de armazenamento de estado sólido é a marca de confiança dos profissionais da área, oferece maior velocidade e desempenho com o SanDisk SSD Plus.",
            "R$ 800,00"

        )
        listaItens.add(produto5)
    }
}