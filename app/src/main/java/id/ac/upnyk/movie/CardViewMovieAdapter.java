package id.ac.upnyk.movie;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.text.BreakIterator;
import java.util.ArrayList;

public class CardViewMovieAdapter extends RecyclerView.Adapter<CardViewMovieAdapter.CardViewViewHolder> {
    private Context context;
    private ArrayList<Movie> listMovie;

    public ArrayList<Movie> getListMovie(){
        return listMovie;
    }
    public void setListMovie(ArrayList<Movie>listMovie){
        this.listMovie = listMovie;


    }
    public CardViewMovieAdapter(Context context){
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewMovieAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_movie, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder cardViewViewHolder , int position) {
        Movie movie = getListMovie().get(position);
    Glide. with(context)
    .load(movie.getPhoto())
    .apply(new RequestOptions().override(350,550))
    .into(cardViewViewHolder.imgPhoto);
    cardViewViewHolder.tvttittle.setText(movie.getTitle());

}


    @Override
    public int getItemCount() {
        return getListMovie().size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public BreakIterator tvttittle;
        ImageView imgPhoto;
        TextView tvttitle;

        CardViewViewHolder(@NonNull final View itemView){
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.imagecover);
            tvttitle = itemView.findViewById(R.id.texttitle);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            Movie movie = getListMovie().get(position);

            movie.setTitle(movie.getTitle());
            movie.setDeskripsi(movie.getDeskripsi());
        }
    }
}
