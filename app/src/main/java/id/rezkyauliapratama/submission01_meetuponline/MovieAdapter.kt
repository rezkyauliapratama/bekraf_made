package id.rezkyauliapratama.submission01_meetuponline

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.list_item_movie.view.*
import java.text.FieldPosition

class MovieAdapter(val context: Context) : BaseAdapter() {

    //array list
    internal var items = arrayListOf<MovieDtoBean>()

    fun bind(tempItems: List<MovieDtoBean>){
        this.items.clear()
        if (tempItems.isNotEmpty()){
            this.items.addAll(tempItems)
        }
        //notifikasi adapter untuk mengubah list nya
        notifyDataSetChanged()
    }

    override fun getView(position: Int, view: View?, viewGroup: ViewGroup?): View {
        var temporaryView :  View

        if (view == null){
            temporaryView = LayoutInflater.from(context).inflate(R.layout.list_item_movie, viewGroup, false)
        } else {
            temporaryView = view
        }
        val movie = items[position]

        temporaryView.tvTitle.text = movie.title
        temporaryView.tvScore.text = movie.popularity.toString()
        temporaryView.ivPoster.setImageResource(movie.posterPath)

        return temporaryView
    }

    override fun getItem(position: Int): Any {
        return items[position]
    }

    override fun getItemId(position: Int): Long {
        return items[position].id.toLong()
    }

    override fun getCount(): Int {
        return items.size
    }

}