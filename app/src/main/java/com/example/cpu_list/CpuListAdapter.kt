package com.example.cpu_list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CpuListAdapter(private val cpuList: List<CpuData>) : RecyclerView.Adapter<CpuListAdapter.CpuViewHolder>() {
    // Define the view holder class and its properties here.
    class CpuViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cpuImage: ImageView = itemView.findViewById(R.id.cpu_image)
        val cpuName: TextView = itemView.findViewById(R.id.cpu_name)
        val cpuDescription: TextView = itemView.findViewById(R.id.cpu_description)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CpuViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item_cpu, parent, false)
        return CpuViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: CpuViewHolder, position: Int) {
        val currentCpu = cpuList[position]
        holder.cpuImage.setImageResource(currentCpu.imageResourceId)
        holder.cpuName.text = currentCpu.name
        holder.cpuDescription.text = currentCpu.description
    }
    override fun getItemCount() = cpuList.size
}