package com.example.android.marsphotos.binding.ui

import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.android.marsphotos.MarsPhoto
import com.example.android.marsphotos.R
import com.example.android.marsphotos.adapter.PhotoGridAdapter


//@BindingAdapter("imageUrl")
//fun ImageView.bindImage(imageUrl: String?) {
//
//    this.load(imageUrl?.toUri()?.buildUpon()?.scheme("https")?.build()) {
//        placeholder(R.drawable.loading_animation)
//        error(R.drawable.ic_connection_error)
//    }
//
//
//
//}


@BindingAdapter("imageUrl")
fun bindImage(imgView: ImageView, imgUrl: String?) {
    imgUrl?.let {
        val imgUri = imgUrl.toUri().buildUpon().scheme("https").build()
        imgView.load(imgUri) {
            placeholder(R.drawable.loading_animation)
            error(R.drawable.ic_broken_image)
        }
    }
}


@BindingAdapter("listData")
fun bindRecyclerView(recyclerView: RecyclerView, data: List<MarsPhoto>?){

    val adapter = recyclerView.adapter as PhotoGridAdapter
    adapter.submitList(data)
}