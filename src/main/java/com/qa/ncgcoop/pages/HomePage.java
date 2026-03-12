package com.qa.ncgcoop.pages;

import com.microsoft.playwright.Page;

public class HomePage {
	// constants
	private Page page;

	// String locators - OR
	/*
	 * private String searchBar = "//input[@name='search']"; private String
	 * searchBtn = "(//input[@name='search']//following::button)[1]";
	 */
	private String aboutNCG = "//a[@class='menu-link' and text()= 'About NCG']";
	private String aboutNCG_news="//a[@class='menu-link' and text()='News and Information']";

	// Constructor to capture Page
	public HomePage(Page page) {
		this.page = page;
	}
	public String getPageTitle() {
		return page.title();
	}

	public String getPageUrl() {
		return page.url();
	}

	public void aboutNCG() {
		page.locator(aboutNCG).first().click();
		//page.waitForTimeout(5000);

		page.waitForSelector(aboutNCG_news).click();
	}
	

//    public AccountPage loginUser(String email, String password)
//    {
//        page.fill(emailIdfield, email);
//        page.fill(passwordfield, password);
//        page.click(loginBtn);
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        return new AccountPage(page);
//    }

	/*
	 * public String searchItem(String itemToBeSearched) { page.fill(searchBar,
	 * itemToBeSearched); page.click(searchBtn); String itemName =
	 * page.textContent(searchedItemName); return itemName; }
	 */

}
