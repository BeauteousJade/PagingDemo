package com.example.pby.pagingdemo;

import android.arch.paging.PagedListAdapter;
import android.support.annotation.NonNull;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RecyclerAdapter extends PagedListAdapter<Concert, RecyclerAdapter.RecyclerViewHolder> {


    protected RecyclerAdapter() {
        super(DIFF_CALLBACK);
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        Concert concert = getItem(position);
        if (concert != null) {
            holder.mTitleTextView.setText(concert.getTitle());
            holder.mAuthorTextView.setText(concert.getAuthor());
            holder.mContentTextView.setText(concert.getContent());
        }
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {

        TextView mTitleTextView;
        TextView mAuthorTextView;
        TextView mContentTextView;


        public RecyclerViewHolder(View itemView) {
            super(itemView);
            mTitleTextView = itemView.findViewById(R.id.title);
            mAuthorTextView = itemView.findViewById(R.id.author);
            mContentTextView = itemView.findViewById(R.id.content);
        }
    }

    private static DiffUtil.ItemCallback<Concert> DIFF_CALLBACK =
            new DiffUtil.ItemCallback<Concert>() {
                @Override
                public boolean areItemsTheSame(Concert oldConcert, Concert newConcert) {
                    return oldConcert.getTitle().equals(newConcert.getTitle());
                }

                @Override
                public boolean areContentsTheSame(Concert oldConcert,
                                                  Concert newConcert) {
                    return oldConcert.equals(newConcert);
                }
            };
}
