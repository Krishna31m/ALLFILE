package com.example.events

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class HomeActivity : AppCompatActivity() {
    private lateinit var eventRecyclerView: RecyclerView
    private lateinit var eventAdapter: EventAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Setup the toolbar
        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.homeToolbar)
        setSupportActionBar(toolbar)

        val events = EventRepository.eventList
        eventRecyclerView = findViewById(R.id.eventRecyclerView)
        eventAdapter = EventAdapter(this, events)
        eventRecyclerView.layoutManager = LinearLayoutManager(this)
        eventRecyclerView.adapter = eventAdapter
    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.home_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_comedy -> {
                Toast.makeText(this, "Comedy Section Selected", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.menu_music -> {
                Toast.makeText(this, "Music Section Selected", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.menu_plays -> {
                Toast.makeText(this, "Plays Section Selected", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.menu_sports -> {
                Toast.makeText(this, "Sports Section Selected", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.menu_adventure -> {
                Toast.makeText(this, "Adventure Section Selected", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.menu_workshop -> {
                Toast.makeText(this, "Workshop Section Selected", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.menu_kids_zone -> {
                Toast.makeText(this, "Kids Zone Selected", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.menu_movies -> {
                Toast.makeText(this, "Movies Section Selected", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.menu_live -> {
                Toast.makeText(this, "Live Events Selected", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
