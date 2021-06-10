package com.example.gamecatalogue.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gamecatalogue.models.GamesData
import com.example.gamecatalogue.models.ListGameAdapter
import com.example.gamecatalogue.models.ModelGame
import com.example.gamecatalogue.R

class MainActivity : AppCompatActivity() {
    private lateinit var rvGame: RecyclerView
    private var list: ArrayList<ModelGame> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        rvGame = findViewById(R.id.rv_game)
        rvGame.setHasFixedSize(true)

        list.addAll(GamesData.listGame)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvGame.layoutManager = LinearLayoutManager(this)
        val ListGameAdapter = ListGameAdapter(list)
        rvGame.adapter = ListGameAdapter
    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_about, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.about -> {
                val intentAbout = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(intentAbout)
            }
        }
        return super.onOptionsItemSelected(item)
    }

}