package com.project.milestone1;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class OperatingSystemsAdapter extends RecyclerView.Adapter<OperatingSystemsAdapter.ViewHolder> {

    private String[] operatingSystems;

    public OperatingSystemsAdapter(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_operating_system, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(operatingSystems[position]);
    }

    @Override
    public int getItemCount() {
        return operatingSystems.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView;

        private ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.operating_system);
        }

        private void bind(String operatingSystem) {
            textView.setText(operatingSystem);

            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(textView.getContext(), DeviceDetailActivity.class);
                    textView.getContext().startActivity(intent);
                }
            });
        }
    }
}
