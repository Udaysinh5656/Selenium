package FunctionalityTesting;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClass;
import com.crm.FileUtility.AccessOrganizationNameFromXLSX;

import com.crm.Pom.OrganizationsRepo;

public class CreateOrganization extends BaseClass{

	public static AccessOrganizationNameFromXLSX org_info;
	
	@Test
	public void demo() throws EncryptedDocumentException, IOException, InterruptedException
	{
		org_info = new AccessOrganizationNameFromXLSX();
		String sheet_data = org_info.orgInfo("Sheet1", 1, 2);
		String actual_url = driver.getCurrentUrl();
		OrganizationsRepo or = new OrganizationsRepo(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		assertEquals(expected_url, actual_url);
		Thread.sleep(2000);	
		or.organizationsTab().click();
		Thread.sleep(2000);		
		or.createOrganization().click();
		Thread.sleep(2000);	
		String orgName = sheet_data + Math.random();
		or.organizationNameTextfield().sendKeys(orgName);
		or.saveButton().click();
		Thread.sleep(2000);
		String name_header = or.organizationHeader().getText();
		assertTrue(name_header.contains(orgName));
		System.out.println("New Organization is created");
				
	}
	
}