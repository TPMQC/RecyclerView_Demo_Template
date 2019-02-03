package com.example.recyclerviewdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.recyclerviewdemo.model.Reminder;

import java.util.List;

public class ReminderAdapter extends RecyclerView.Adapter<ReminderAdapter.ViewHolder> {
    //Todo:
    private Context context;
    private List<Reminder> reminderList;


    public ReminderAdapter(Context context, List<Reminder> reminderList) {
        //Todo:

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //todo:
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        //todo:
        viewHolder.bind(reminderList.get(position));
    }

    @Override
    public int getItemCount() {
        //todo:
        return 0;
    }

    //Todo:
    public void updateReminderList(List<Reminder> reminderList) {

    }

    class ViewHolder extends RecyclerView.ViewHolder {
        //todo:
        private TextView tvTittle, tvDate, tvPriority;
        private View container;

        public ViewHolder(@NonNull View itemView) {
            //todo:
            super(itemView);

        }

        private void bind(Reminder reminder) {
            //todo:

        }
    }

}
