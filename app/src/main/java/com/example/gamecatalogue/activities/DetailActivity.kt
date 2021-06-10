package com.example.gamecatalogue.activities

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.bumptech.glide.Glide
import com.example.gamecatalogue.R

class DetailActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        const val EXTRA_TITLE = "extra_title"
        const val EXTRA_DATE = "extra_date"
        const val EXTRA_PLATF = "extra_platf"
        const val EXTRA_PUBLISHER = "extra_publisher"
        const val EXTRA_GENRE = "extra_genre"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_DESC = "extra_desc"
        const val EXTRA_CATEG = "extra_categ"
        const val EXTRA_RATING = "extra_rating"
        const val EXTRA_LINK = "extra_LINK"
    }

    var link : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val title = intent.getStringExtra(EXTRA_TITLE)
        val date = intent.getStringExtra(EXTRA_DATE)
        val platf = intent.getStringExtra(EXTRA_PLATF)
        val publisher = intent.getStringExtra(EXTRA_PUBLISHER)
        val genre = intent.getStringExtra(EXTRA_GENRE)
        val desc = intent.getStringExtra(EXTRA_DESC)
        val categ = intent.getIntExtra(EXTRA_CATEG,0)
        val rating = intent.getIntExtra(EXTRA_RATING, 0)
        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)
        link = intent.getStringExtra(EXTRA_LINK).toString()

        val tvTitle: TextView = findViewById(R.id.tv_title)
        val tvDate: TextView = findViewById(R.id.tv_release)
        val tvPlatf: TextView = findViewById(R.id.tv_platform)
        val tvPubliher: TextView = findViewById(R.id.tv_publisher)
        val tvGenre: TextView = findViewById(R.id.tv_genre)
        val tvDesc: TextView = findViewById(R.id.tv_desc)
        val tvRating: TextView = findViewById(R.id.tv_rating)
        val ivCateg: ImageView = findViewById(R.id.iv_categories)
        val ivPhoto: ImageView = findViewById(R.id.iv_cover)
        val btnLink : Button = findViewById(R.id.btn_link)

        tvTitle.text = title
        tvDate.text = date
        tvPlatf.text = platf
        tvPubliher.text = publisher
        tvGenre.text = genre
        tvDesc.text = desc
        tvRating.text = rating.toString()

        ivPhoto.setImageResource(photo)
        ivCateg.setImageResource(categ)

        btnLink.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_link->{
                val intentWatch = Intent(Intent.ACTION_VIEW, Uri.parse(link))
                startActivity(intentWatch)
               }
        }
    }


}