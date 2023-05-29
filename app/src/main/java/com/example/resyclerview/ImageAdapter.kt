package com.example.resyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import coil.load
import com.example.resyclerview.databinding.ImageItemBinding

class ImageAdapter : androidx.recyclerview.widget.ListAdapter<Images,ImageViewholder>(comparator) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewholder {
        return ImageViewholder(ImageItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ImageViewholder, position: Int) {

        getItem(position).let {
            holder.binding.imagesName.text=it.imageName
            holder.binding.imagesView.load(it.imageUrl)
        }

    }

    companion object {
        var comparator=object : DiffUtil.ItemCallback<Images>() {
            override fun areItemsTheSame(oldItem: Images, newItem: Images): Boolean {
                return oldItem.imageUrl==newItem.imageUrl
            }

            override fun areContentsTheSame(oldItem: Images, newItem: Images): Boolean {
                return oldItem==newItem
            }

        }
    }
}