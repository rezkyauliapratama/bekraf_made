package id.rezkyauliapratama.submission01_meetuponline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = MovieMockDataFactory.create()

        val adapter = MovieAdapter(this)
        listView.adapter = adapter

        adapter.bind(items.moviesDto)

    }
}
