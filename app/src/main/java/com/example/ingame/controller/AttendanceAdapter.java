package com.example.ingame.controller;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ingame.R;
import com.example.ingame.model.Member;
import com.google.android.material.chip.ChipGroup;

import java.util.List;

public class AttendanceAdapter extends RecyclerView.Adapter<AttendanceAdapter.MemberViewHolder> {

    private List<Member> memberList; // List of members to display

    // Constructor
    public AttendanceAdapter(List<Member> memberList) {
        this.memberList = memberList;
    }

    // ViewHolder inner class
    public static class MemberViewHolder extends RecyclerView.ViewHolder {

        ImageView imageViewAvatar;
        TextView textViewName, textViewDepartment;
        ChipGroup chipGroupAttendance;

        public MemberViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewAvatar = itemView.findViewById(R.id.memberAvatar);
            textViewName = itemView.findViewById(R.id.memberName);
            textViewDepartment = itemView.findViewById(R.id.memberDep);
            chipGroupAttendance = itemView.findViewById(R.id.AttendanceChipGroup);
        }
    }

    @NonNull
    @Override
    public MemberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the row layout
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_attendance_member, parent, false);
        return new MemberViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MemberViewHolder holder, int position) {
        Member member = memberList.get(position);
        holder.textViewName.setText(member.getName());
        if (member.getDep() != null) {
            holder.textViewDepartment.setText(member.getDep().name());
        } else {
            holder.textViewDepartment.setText("No Department");
        }
        holder.chipGroupAttendance.check(R.id.chipPresent);

    }

    @Override
    public int getItemCount() {
        return memberList.size();
    }
}