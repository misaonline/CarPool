package com.misa.pool;

import android.widget.Button;
import android.widget.ListView;

public class MainAction extends BaseAction 
{

	private Button mButton_Car = null;
	private Button mButton_Person = null;
	private ListView mListView_Car = null;
	private ListView mListView_Person = null;
	
	@Override
	public void installBusiness() {
		mButton_Car = (Button)findViewById(R.id.main_button_car);
		mButton_Person = (Button)findViewById(R.id.main_button_person);
		
		mListView_Car = (ListView)findViewById(R.id.main_car_listview);
		mListView_Person = (ListView)findViewById(R.id.main_person_listview);
		
//		mListView_Person.setAdapter(adapter)
//Test
	}

	@Override
	public void installAction() {
		
	}

	@Override
	public void dispatchListener() {
		
	}

}
