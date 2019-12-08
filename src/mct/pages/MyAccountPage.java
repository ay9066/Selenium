package mct.pages;

import java.util.List;

public class MyAccountPage extends MasterPage{
	
	// All Locators Or XPath for this Page 
	
		String myAccountLabel = "Xpath:.//*[@id='item_details']/section/div/h3";
		String LocatorsOfAllOptions = "Xpath://div[@class='myaccount_list']//div[@class='col-sm-12 col-lg-3 col-md-3']/a";
		
		// Getter & Setters -

		public String getMyAccountLabel() {
			return getElementText(myAccountLabel);
		}


		public List<String> getAllOptions() {
			
			// Get the Locators Of all the Option And Return the Text in All Options Back 
			return getElementsText(LocatorsOfAllOptions);
			
		}

		
		
		
		// What the Page Can Do Functions 

		
		
	}
