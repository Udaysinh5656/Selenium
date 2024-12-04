package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarRepo {

	public CalendarRepo(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Calendar")
	private WebElement calendar_tab;
	
	public WebElement calendarTab()
	{
		return calendar_tab;
	}

	@FindBy(linkText = "Day")
	private WebElement calendar_day_tab;
	
	public WebElement calendarDayTab()
	{
		return calendar_day_tab;
	}
	
	@FindBy(linkText = "Week")
	private WebElement calendar_week_tab;
	
	public WebElement calendarWeekTab()
	{
		return calendar_week_tab;
	}
	
	@FindBy(linkText = "Month")
	private WebElement calendar_month_tab;
	
	public WebElement calendarMonthTab()
	{
		return calendar_month_tab;
	}
	
	@FindBy(linkText = "Year")
	private WebElement calendar_year_tab;
	
	public WebElement calendarYearTab()
	{
		return calendar_year_tab;
	}
}
