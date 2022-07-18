package com.example.fnafappgame.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fnafappgame.R
import com.example.fnafappgame.model.Produto

class AdapterItem(private val context: Context, private val produtos: MutableList<Produto>):RecyclerView.Adapter<AdapterItem.ItemViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.animatronics_itens, parent, false)
        val holder = ItemViewHolder(itemLista)
        return holder
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.foto.setImageResource(produtos[position].foto)
        holder.nome.text = produtos[position].nome
        holder.descricao.text = produtos[position].descricao
        holder.preco.text = produtos[position].preco
    }

    override fun getItemCount(): Int = produtos.size

    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto = itemView.findViewById<ImageView>(R.id.fotoItem)
        val nome = itemView.findViewById<TextView>(R.id.nomeItem)
        val descricao = itemView.findViewById<TextView>(R.id.decricaoItem)
        val preco = itemView.findViewById<TextView>(R.id.precoItem)
    }

}