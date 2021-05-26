package com.example.quester;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class QuestAdapter extends ArrayAdapter<TasksClass> {
    public QuestAdapter(@NonNull Context context, List<TasksClass> objects) {
        super(context, R.layout.task_adapter_item, objects);

    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        final TasksClass test = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.task_adapter_item, null);
        }
        ((TextView) convertView.findViewById(R.id.tv_short)).setText(test.testName);
        ((TextView) convertView.findViewById(R.id.tv_text)).setText(String.valueOf(test.shortInfo));

        return convertView;
    }

}
