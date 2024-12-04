package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsRepo {

public OrganizationsRepo(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Organizations']")
	private WebElement organizations_tab;
	public WebElement organizationsTab()
	{
		return organizations_tab;
	}

	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement create_organization_icon;
	public WebElement createOrganization()
	{
		return create_organization_icon;
	}

	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement organization_name_textfield;
	public WebElement organizationNameTextfield()
	{
		return organization_name_textfield;
	}
	
	@FindBy(xpath = "//input[@title=\"Save [Alt+S]\"]")
	private WebElement save_button;
	public WebElement saveButton()
	{
		return save_button;
	}
	
	@FindBy(xpath = "//div[@class='small']/table/tbody/tr/td/span")
	private WebElement organization_header;
	public WebElement organizationHeader()
	{
		return organization_header;
	}
	
}