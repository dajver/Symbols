package desa.app;


import android.app.TabActivity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class Numbers_mobi extends TabActivity 
{
	TabHost tabHost;
	
	public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        tabHost = getTabHost();
        
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        
		TabSpec urk = tabHost.newTabSpec("tab1");             
		urk.setIndicator("Украина", getResources().getDrawable(R.drawable.icon_ukr));                            
		Intent ukrIntent = new Intent(this, Num_ukr.class);
		urk.setContent(ukrIntent);
		
		tabHost.addTab(urk); 
		
		TabSpec rus = tabHost.newTabSpec("tab2");             
		rus.setIndicator("Россия", getResources().getDrawable(R.drawable.icon_rus));
		Intent rusIntent = new Intent(this, Num_rus.class);
		rus.setContent(rusIntent);
		
		tabHost.addTab(rus);
		
		TabSpec blr = tabHost.newTabSpec("tab3");
		blr.setIndicator("Белоруссия", getResources().getDrawable(R.drawable.icon_blr));
		Intent blrIntent = new Intent(this, Num_blr.class);
		blr.setContent(blrIntent);

		 tabHost.addTab(blr);
		 
		 for(int i=0;i<tabHost.getTabWidget().getChildCount();i++)
		 {
			 tabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.green);
		 }
		tabHost.getTabWidget().setCurrentTab(0);
		tabHost.getTabWidget().getChildAt(0).setBackgroundResource(R.drawable.green);

    }
    
    public void onTabChanged(String tabId) 
    {
    	 for(int i=0;i<tabHost.getTabWidget().getChildCount();i++)
    	 {
    		 tabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.green);
    	 }
    	 
    	 	tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).setBackgroundResource(R.drawable.green);
    }
}
