package com.example.utspraktukumku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recycle: RecyclerView
    lateinit var recycleAdapter: ClasAdapter
    lateinit var listData: ArrayList<Datapeserta>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recycle = findViewById(R.id.idrecycle)
        recycle.setHasFixedSize(true)
        listData = ArrayList()

        listData.add(Datapeserta("Kona", "210441100119", "17 Tahun", R.drawable.kona))
        listData.add(Datapeserta("Dhot", "210441100119", "17 tahun", R.drawable.dhot))
        listData.add(Datapeserta("Robi", "210441100119", "17 tahun", R.drawable.robi))
        listData.add(Datapeserta("Peot", "210441100119", "17 tahun", R.drawable.peot))
        listData.add(Datapeserta("Dinda", "210441100119", "16 tahun", R.drawable.dinda))
        listData.add(Datapeserta("Sintia", "210441100119", "17 tahun", R.drawable.sintia))
        listData.add(Datapeserta("Jansen", "210441100119", "17 tahun", R.drawable.jansen))
        listData.add(Datapeserta("Pak Dhot", "210441100119", "40 tahun", R.drawable.pakdhot))
        listData.add(Datapeserta("Murid Baru", "210441100119", "16 tahun", R.drawable.muridbaru))
        listData.add(Datapeserta("bangjack", "210441100119", "28 tahun", R.drawable.preman))

        showList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.opsi, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.list) {
            showList()
        } else if (item.itemId == R.id.grid) {
            showGrid()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showGrid() {
        val layoutManager = GridLayoutManager(this, 2)
        recycle.layoutManager = layoutManager
        recycleAdapter = ClasAdapter(listData, this)
        recycle.adapter = recycleAdapter
    }

    private fun showList() {
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycle.layoutManager = layoutManager
        recycleAdapter = ClasAdapter(listData, this)
        recycle.adapter = recycleAdapter
    }
}