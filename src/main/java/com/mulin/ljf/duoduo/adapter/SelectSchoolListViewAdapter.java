package com.mulin.ljf.duoduo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.aimowei.community.R;
import com.aimowei.model.SchoolModel;

import java.util.ArrayList;
import java.util.List;

public class SelectSchoolListViewAdapter extends BaseAdapter {
	private List<SchoolModel> list = new ArrayList<SchoolModel>();
	private LayoutInflater listContainer;
	private int ListLayout;

	public final class Holder {
		public TextView shop_name;
	}

	public SelectSchoolListViewAdapter(Context context, List<SchoolModel> listItem, int ListLayout) {
		listContainer = LayoutInflater.from(context);
		this.list = listItem;
		this.ListLayout = ListLayout;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return list.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(final int position, View convertView, ViewGroup parent) {
		Holder holder = null;

		if (convertView == null) {
			holder = new Holder();
			convertView = listContainer.inflate(ListLayout, null);
			holder.shop_name = (TextView) convertView.findViewById(R.id.shop_name);
			convertView.setTag(holder);
		} else {
			holder = (Holder) convertView.getTag();
		}

		holder.shop_name.setText(list.get(position).getSchool_name());
		return convertView;
	}

	

}



