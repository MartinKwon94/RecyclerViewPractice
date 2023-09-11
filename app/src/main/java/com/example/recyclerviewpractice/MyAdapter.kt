package com.example.recyclerviewpractice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewpractice.databinding.MylistBinding

class MyAdapter(private val mitems: MutableList<Item>) :
    RecyclerView.Adapter<MyAdapter.Holder>() {

//    interface ItemClick {
//        fun onClick(view: View, position: Int)
//    }
//    var itemClick: ItemClick? = null
    //인터페이스를 통해 메인으로 클릭이벤트 넘기기
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.Holder {
        val binding = MylistBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    //뷰홀더  실제 클릭이 이루어지는곳?
    override fun onBindViewHolder(holder: MyAdapter.Holder, position: Int) {
        holder.itemView.setOnClickListener {
//            itemClick?.onClick(it, position)
        }
        //포지션에 맞는 정보 집어넣기
        holder.image.setImageResource(mitems[position].Image)
        holder.item1.text = mitems[position].Item1
        holder.item2.text = mitems[position].Item2
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemCount(): Int {
        return mitems.size
    }

//홀더 이너클래스로 선언하기
    inner class Holder(binding: MylistBinding) : RecyclerView.ViewHolder(binding.root) {
        val image = binding.ivImage
        val item1 = binding.tv01
        val item2 = binding.tv02
    }
}

