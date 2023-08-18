package com.improve10x.learningplatform.homecourses;

import androidx.recyclerview.widget.RecyclerView;

import com.improve10x.learningplatform.databinding.CourseItemBinding;

public class CourseViewHolder extends RecyclerView.ViewHolder {

    CourseItemBinding binding;

    public CourseViewHolder(CourseItemBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
}
