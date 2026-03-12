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
//	    @Test
//	    public void pageTitleTest()
//	    {
//	        String title = homePage.getPageTitle();
//	        Assert.assertEquals(title, HOME_PAGE_TITLE);
	//
//	    }
	    

		 @Test(priority=2)
	    public void pageUrlTest()
	    {
	        String url = homePage.getPageUrl();
	        Assert.assertEquals(url, loadProperty("baseUrl"));
	        
	    }
	    
	    @Test(priority=3)
	    public void PageBtnTest()
	    {
	    	homePage.aboutNCG();
	    	String title = homePage.getPageTitle();
	        Assert.assertEquals(title,NEWS_PAGE_TITLE);
	    	
	    	
	    }
	    


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
	    
	    
	    
	    

//	    @Test(dataProvider = "searchData")
//	    public void searchTest(String productName) throws InterruptedException
//	    {
//	        String itemName = homePage.searchItem(productName);
//	        Thread.sleep(5000);
//	        Assert.assertEquals("Search - "+productName, itemName);
//	        System.out.println("item: "+itemName);
//	    }


	}