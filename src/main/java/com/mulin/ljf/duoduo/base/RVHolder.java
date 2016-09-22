package com.mulin.ljf.duoduo.base;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by mulin on 16/9/19.
 */
public class RVHolder  extends RecyclerView.ViewHolder {


    private ViewHolder viewHolder;

    public RVHolder(View itemView) {
        super(itemView);
        viewHolder= ViewHolder.getViewHolder(itemView);
    }


    public ViewHolder getViewHolder() {
        return viewHolder;
    }

}
