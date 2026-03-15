package md.carousel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder>{

    private List<CardItem> cardItems;

    public CardAdapter(List<CardItem> cardItems) {
        this.cardItems = cardItems;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate your card layout and create a new CardViewHolder
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        return new CardViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        // Bind data to your card views here
        CardItem item = cardItems.get(position);
        // For example, if you have a TextView in your card layout:
        holder.imageView.setImageResource(item.getImageResId());
        holder.titleView.setText(item.getTitle());
        holder.descView.setText(item.getDescription());

    }
    @Override
    public int getItemCount() {
        return cardItems.size();
    }
    static class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView titleView, descView;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.cardImage);
            titleView = itemView.findViewById(R.id.cardTitle);
            descView = itemView.findViewById(R.id.cardDescription);
        }
    }


}
