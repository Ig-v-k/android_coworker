package com.example.myappinterview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.ViewHolder> {
  Context context;
  List<Employee> employeeList;

  public EmployeeAdapter(Context context, List<Employee> employeeList) {
	this.context = context;
	this.employeeList = employeeList;
  }

  @NonNull
  @NotNull
  @Override
  public EmployeeAdapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
	return null;
  }

  @Override
  public void onBindViewHolder(@NonNull @NotNull EmployeeAdapter.ViewHolder holder, int position) {

  }

  @Override
  public int getItemCount() {
	return 0;
  }

  class ViewHolder extends RecyclerView.ViewHolder {
	public ViewHolder(@NonNull @NotNull View itemView) {
	  super(itemView);
	}
  }
}