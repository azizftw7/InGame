package com.example.ingame.controller;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ingame.R;
import com.example.ingame.model.Member;
import com.google.android.material.chip.Chip;

import java.util.List;

public class memberAdapter extends RecyclerView.Adapter<memberAdapter.MemberViewHolder> {
    private List<Member> memberList;

    public memberAdapter(List<Member> memberList) {
        this.memberList = memberList;
    }
    @NonNull
    @Override
    public MemberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_member, parent, false);
        return new MemberViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MemberViewHolder holder, int position) {
        // Get the member for this position
        Member member = memberList.get(position);


        holder.memberName.setText(member.getName());


        if (member.getDep() != null) {
            holder.memberDep.setText(member.getDep().name());
        } else {
            holder.memberDep.setText("No Department");
        }

        // Hardcoded chips for now
        holder.chipPresent.setText("Present: 3");
        holder.chipAbsent.setText("Absent: 1");
        holder.chipLate.setText("Late: 0");



    }


    @Override
    public int getItemCount() {

        return memberList.size();
    }


    public static class MemberViewHolder extends RecyclerView.ViewHolder {


        TextView memberName, memberDep;
        Chip chipPresent, chipAbsent, chipLate;
        ImageView avatar ;

        ImageButton deletebtn;


        public MemberViewHolder(@NonNull View itemView) {
            super(itemView);
            memberName = itemView.findViewById(R.id.memeberName);
            memberDep = itemView.findViewById(R.id.memeberDep);
            chipPresent = itemView.findViewById(R.id.chipPresent);
            chipAbsent = itemView.findViewById(R.id.chipAbsent);
            chipLate = itemView.findViewById(R.id.chipLate);
            avatar = itemView.findViewById(R.id.avatarPers);
            deletebtn = itemView.findViewById(R.id.deleteBtn);
        }

    }
}