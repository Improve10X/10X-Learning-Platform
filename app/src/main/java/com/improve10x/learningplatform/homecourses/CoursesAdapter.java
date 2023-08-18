package com.improve10x.learningplatform.homecourses;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.improve10x.learningplatform.databinding.CourseItemBinding;
import com.improve10x.learningplatform.homecourses.model.Course;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CoursesAdapter extends RecyclerView.Adapter<CourseViewHolder> {

    private List<Course> courses;

    public CoursesAdapter(List<Course> courses){
        this.courses = courses;
    }
    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        CourseItemBinding binding = CourseItemBinding.inflate(inflater, parent, false);
        CourseViewHolder viewHolder = new CourseViewHolder(binding);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CourseViewHolder holder, int position) {
        Course course = courses.get(position);
        holder.binding.setCourse(course);
        Picasso.get().load(course.getImageUrl()).into(holder.binding.profleIv);
    }

    @Override
    public int getItemCount() {
        return courses.size();
    }
}
