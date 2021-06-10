package com.example.gamecatalogue.models

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.gamecatalogue.R
import com.example.gamecatalogue.activities.AboutActivity
import com.example.gamecatalogue.activities.DetailActivity

class ListGameAdapter(private val ListGame: ArrayList<ModelGame>) :
    RecyclerView.Adapter<ListGameAdapter.ListViewHolder>() {


    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvId: TextView
        var tvNama: TextView
        var tvDesc: TextView
        var ivIcon: ImageView

        init {
            tvId = itemView.findViewById(R.id.tv_itemId)
            tvNama = itemView.findViewById(R.id.tv_title_item)
            tvDesc = itemView.findViewById(R.id.tv_desc_item)
            ivIcon = itemView.findViewById(R.id.iv_icon)
        }
    }


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.item_game, viewGroup, false)
        return ListViewHolder(view)

    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val game = ListGame[position]

        holder.tvId.text = game.id
        holder.tvNama.text = game.name
        holder.tvDesc.text = game.desc

        Glide.with(holder.itemView.context)
            .load(game.photo)
            .into(holder.ivIcon)

        holder.itemView.setOnClickListener{ v->
            val intentAbout = Intent(v.context, DetailActivity::class.java)
            intentAbout.putExtra(DetailActivity.EXTRA_TITLE, game.name)
            intentAbout.putExtra(DetailActivity.EXTRA_DATE, game.date)
            intentAbout.putExtra(DetailActivity.EXTRA_DESC, game.desc)
            intentAbout.putExtra(DetailActivity.EXTRA_PHOTO, game.photo)
            intentAbout.putExtra(DetailActivity.EXTRA_PUBLISHER, game.publisher)
            intentAbout.putExtra(DetailActivity.EXTRA_LINK, game.link)
            intentAbout.putExtra(DetailActivity.EXTRA_RATING, game.rating)
            intentAbout.putExtra(DetailActivity.EXTRA_CATEG, game.categories)
            intentAbout.putExtra(DetailActivity.EXTRA_PLATF, game.platforms)
            intentAbout.putExtra(DetailActivity.EXTRA_GENRE, game.genre)
            v.context.startActivity(intentAbout)
        }
    }

    override fun getItemCount(): Int {
        return ListGame.size
    }

}