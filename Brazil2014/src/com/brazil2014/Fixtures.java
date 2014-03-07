package com.brazil2014;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Fixtures extends Activity {
	


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fixture_activity);
        
        populateListView();
        registerClickCallBack();
        
    }

	

	private void populateListView()
	{
		//create list
		String[] groups = {"Group A", "Group B", "Group C", "Group D","Group E",
				"Group F","Group G", "Group H"};
		
		//build adapter
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.fixture_group, groups);
		
		//configure list view
		ListView list = (ListView) findViewById(R.id.listView1);
		list.setAdapter(adapter);
		
	}
	
	private void registerClickCallBack()
	{
		ListView list = (ListView) findViewById(R.id.listView1);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener()
		{

			@Override
			public void onItemClick(AdapterView<?> parent, View viewClicked, int position,long id)
			{
				TextView textview = (TextView) viewClicked;
				String message = "You chose " + textview.getText().toString();
				Toast.makeText(Fixtures.this, message, Toast.LENGTH_SHORT).show();
				
			}
			
			
		});
			
	}
    
}
