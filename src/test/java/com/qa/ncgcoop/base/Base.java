package com.qa.ncgcoop.base;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.microsoft.playwright.Page;
import com.qa.ncgcoop.factory.PlaywrightFactory;
import com.qa.ncgcoop.pages.HomePage;
import static utils.PropertyReader.loadProperty;

public class Base
{
    PlaywrightFactory factory;
    protected Page page;
    protected HomePage homePage;
    protected String pageKey;

    //Constants
    private final String browser = loadProperty("browserName");


    @BeforeTest(alwaysRun = true)
    public void setupPlaywright()
    {
        factory = new PlaywrightFactory();
        page = factory.initBrowser(browser);

        if(pageKey.equalsIgnoreCase("homepage"))
        {
            homePage = new HomePage(page);

        }

        else
        {
            System.out.println("page not available!!");
        }

    }


    @AfterTest(alwaysRun = true)
    public void tearDownPlaywright() throws InterruptedException
    {
    	Thread.sleep(10000);
        //page.context().browser().close();
    }

}