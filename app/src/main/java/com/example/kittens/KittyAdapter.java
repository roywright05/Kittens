package com.example.kittens;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.kittens.model.ListItem;
import com.squareup.picasso.Picasso;


import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class KittyAdapter extends RecyclerView.Adapter<KittyAdapter.KittyViewHolder> {

    private ArrayList<ListItem> mListItems;
    private Context context;
    private OnItemClickListener mOnItemClickListener;

    public interface OnItemClickListener{

        void OnItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener){

        this.mOnItemClickListener = onItemClickListener;
    }

    public KittyAdapter(Context context, ArrayList<ListItem> listItems) {
        mListItems = listItems;
        this.context = context;
    }

    @NonNull
    @Override
    public KittyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater
                .from(parent.getContext()) //this may change to context
                .inflate(R.layout.list_item, parent, false);
        return new KittyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KittyViewHolder holder, int position) {

        ListItem listItem = mListItems.get(position);

        String imageUrl = listItem.getImageUrl();
        String creator = listItem.getCreator();
        int likes = listItem.getNumOfLikes();


        holder.tvCreator.setText(creator);
        holder.tvLikes.setText("Likes: " + likes);

        Picasso.get().load(imageUrl).fit().centerInside().into(holder.mCircleImageView);

        //Picasso.get().load(imageUrl).into(holder.mCircleImageView);

    }

    @Override
    public int getItemCount() {
        return mListItems.size();
    }

    public class KittyViewHolder extends RecyclerView.ViewHolder{

        public CircleImageView mCircleImageView;
        public TextView tvCreator, tvLikes;

        public KittyViewHolder(@NonNull View itemView) {
            super(itemView);

            mCircleImageView = itemView.findViewById(R.id.civ_large_image);
            tvCreator = itemView.findViewById(R.id.tv_creator);
            tvLikes = itemView.findViewById(R.id.tv_likes);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(mOnItemClickListener != null){

                        int position = getAdapterPosition();

                        if(position != RecyclerView.NO_POSITION){

                            mOnItemClickListener.OnItemClick(position);
                        }
                    }

                }
            });
        }
    }

}
