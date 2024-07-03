package com.example.mediaplayer.models

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.mediaplayer.R

class MusikAdapter (val context: Context, val list: ArrayList<MusikAdapter>, val rvClick: RvClick):
        RecyclerView.Adapter<MusikAdapter.VH> (){
        inner class VH(var itemRv: View): RecyclerView.ViewHolder(itemRv){
            fun onBind(musik: Musik) {
                itemRv.setOnClickListener {

                    rvClick.onClick(musik)
                }

                itemRv.findViewById<ImageView>(R.id.image11).setImageDrawable(ContextCompat.getDrawable(context,musik.Qoshiq!!))
                itemRv.findViewById<TextView>(R.id.qoshiqnomi).text =  musik.nomi

            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
            return VH(LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false))
        }

        override fun onBindViewHolder(holder: VH, position: Int) {

        }

        override fun getItemCount(): Int {
            return list.size
        }

        interface RvClick{
            fun onClick(musik: Musik)
        }

    }
