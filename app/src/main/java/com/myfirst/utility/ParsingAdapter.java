package com.myfirst.utility;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.myfirst.R;

import java.util.ArrayList;

public class ParsingAdapter extends RecyclerView.Adapter<ParsingAdapter.ViewHolder> {
    private ArrayList<ItemObject> mList;

    public  class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView_img;
        private TextView textView_title, textView_release, texView_director;

        public ViewHolder(View itemView) {
            super(itemView);

            imageView_img = itemView.findViewById(R.id.imageView_img);
            textView_title = itemView.findViewById(R.id.textView_title);
            textView_release = itemView.findViewById(R.id.textView_release);
            texView_director = itemView.findViewById(R.id.textView_director);
        }
    }

    //생성자
    public ParsingAdapter(ArrayList<ItemObject> list) {
        this.mList = list;
    }

    @NonNull
    @Override
    public ParsingAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list, parent, false);
        return new ViewHolder(view);
    }

    //각 데이터 가져오기, ItemObject와 연동
    @Override
    public void onBindViewHolder(@NonNull ParsingAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() { return mList.size(); }
}
