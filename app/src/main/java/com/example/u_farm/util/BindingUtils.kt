package com.example.u_farm.util


import android.annotation.SuppressLint
import android.app.Application
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.lifecycle.LiveData
import com.bumptech.glide.Glide
import com.chaquo.python.Python
import com.example.u_farm.R
import com.squareup.picasso.Picasso
import de.hdodenhof.circleimageview.CircleImageView
import com.example.u_farm.database.AuthRepository
import com.example.u_farm.model.U_Farm
import com.example.u_farm.util.lang
import com.squareup.picasso.Transformation


@SuppressLint("SetTextI18n")
@BindingAdapter("userDetails")
fun TextView.setUserDetails(item: String?) {
    item?.let {
        text = item
        val py = Python.getInstance()
        val pyobj = py.getModule("translate")
        text=pyobj.callAttr(lang,text).toString()
    }
}

@BindingAdapter("imageUrl")
fun bindImage(imgView: ImageView, imgUrl:String?) {
    imgUrl?.let{
        if(it!=""){
            Glide.with(imgView.context).load(imgUrl).into(imgView)
        }
    }
}

@BindingAdapter("imgUrl")
fun bindImage(circleImageView: CircleImageView, imgUrl:String?) {
    imgUrl?.let{
        if(it!=""){
            Glide.with(circleImageView.context).load(imgUrl).into(circleImageView)

//            Picasso.get().load(imgUrl).into(circleImageView)
        }
    }
}



