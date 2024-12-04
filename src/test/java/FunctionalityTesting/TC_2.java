package FunctionalityTesting;

import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClass;
import com.crm.Pom.CalendarRepo;

public class TC_2 extends BaseClass{
	@Test
	public void calender_day_tap() throws InterruptedException {
		CalendarRepo cr = new CalendarRepo(driver);
		cr.calendarTab().click();
		Thread.sleep(1000);
		cr.calendarDayTab().click();
		Thread.sleep(1000);
	}
	

}
