package com.qa.ncgcoop.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.ncgcoop.base.Base;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.OrderWith;
import org.testng.Assert;
import static utils.PropertyReader.loadProperty;
import static com.qa.ncgcoop.constants.HomePageConstants.HOME_PAGE_TITLE;
import static com.qa.ncgcoop.constants.HomePageConstants.NEWS_PAGE_TITLE;
import static org.junit.Assert.assertThat;
import static com.qa.ncgcoop.constants.HomePageConstants.BOTTOM_TEXT;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class HomePageTest extends Base {





	   // private static final String HOME_PAGE_TITLE = null;

		public HomePageTest()
	    {
	        pageKey = "homepage";
	    }

		 @Test(priority=1)
	    public void pageTitleTest()
	    {
	        String title = homePage.getPageTitle();
	        Assert.assertEquals(title,HOME_PAGE_TITLE);

	    }

	    

		 @Test(priority=2)
	    public void pageUrlTest()
	    {
	        String url = homePage.getPageUrl();
	        Assert.assertEquals(url, loadProperty("baseUrl"));
	        
	    }
		 
		 @Test(priority=3)
		 public void scrolldownHome()
		 {
			
			 homePage.scrollDOWNPage();
			 String bottom_text=homePage.textContent();
			 Assert.assertEquals(bottom_text,BOTTOM_TEXT);
		 }
		 
		 @Test(priority=4)
		 public void scrollUPHome()
		 {
			 homePage.scrollUPPage();
		
//			if(assertThat(page.getByText(BOTTOM_TEXT)).equals(homePage.textContent())) {
//				homePage.scrollUPPage();
//			}else {
//				System.out.println("Fail");
//			}
			 
			
		 }
		 
//	    @Test(priority=3)
//	    public void PageBtnTest()
//	    {
//	    	homePage.aboutNCG();
//	    	String title = homePage.getPageTitle();
//	        Assert.assertEquals(title,NEWS_PAGE_TITLE);
//	    	
//	    	
//	    }
	    


	    @DataProvider
	    public Object[][] searchData()
	    {
	        return new Object[][]
	                {
	                        {"Macbook"},
	                        {"iMac"},
	                        {"iPhone"}
	                };
	    }
	    
	    
	}