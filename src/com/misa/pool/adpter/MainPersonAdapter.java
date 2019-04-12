package com.misa.pool.adpter;

import java.util.List;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

import com.misa.pool.dom.CarItem;


public class MainPersonAdapter implements ListAdapter
{
	private Context mContext;
	private List<CarItem> mArrays;
	
	public MainPersonAdapter(Context context,List<CarItem> array)
	{
		mContext = context;
		mArrays = array;
	}
	
	@Override
	public int getCount() 
	{
		return mArrays.size();
	}

	@Override
	public Object getItem(int position) 
	{
		return mArrays.get(position);
	}

	@Override
	public long getItemId(int position) 
	{
		return position;
	}

	@Override
	public int getItemViewType(int position) 
	{
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) 
	{
		if(convertView == null)
		{
			//
		}
		else
		{
			
		}
		
		return convertView;
	}

	@Override
	public int getViewTypeCount() {
		return 0;
	}

	@Override
	public boolean hasStableIds() {
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void registerDataSetObserver(DataSetObserver observer) {
		
	}

	@Override
	public void unregisterDataSetObserver(DataSetObserver observer) {
		
	}

	@Override
	public boolean areAllItemsEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled(int position) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
