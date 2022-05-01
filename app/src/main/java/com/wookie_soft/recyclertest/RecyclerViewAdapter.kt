package com.wookie_soft.recyclertest

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.wookie_soft.recyclertest.databinding.RecyclerItemBinding

class RecyclerViewAdapter constructor(val context : Context, var items :MutableList<Item>,private val fragmentManager : FragmentManager) : RecyclerView.Adapter<RecyclerViewAdapter.VH>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val binding =
            RecyclerItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return VH(binding)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val item = getItemId(position)
        with(holder.binding) {
            holder.binding.tv01Tab1.setText("ggggggggggg")
        }

    }

    override fun getItemCount(): Int = items.size


    inner class VH(val binding: RecyclerItemBinding) : RecyclerView.ViewHolder(binding.root){

        val tv1:TextView = binding.tv01Tab1
        val tv2:TextView = binding.tv02
        val tv3:TextView = binding.tv03

    }

}