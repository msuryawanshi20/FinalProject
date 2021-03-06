package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.FindByLabel;
import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.PageWaitAfter;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TextType;

@SalesforcePage( title="Rstk__ Sormh View"                                
               , summary=""
               , page="SormhView"
               , namespacePrefix="rstk"
               , object="rstk__sormh__c"
               , connection="QARSF_Admin"
     )             
public class rstk__SormhView {

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='RMA Number']/parent::span/parent::th/following-sibling::td[1]//span")
	public WebElement rMANumber;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@ButtonType()
	@FindByLabel(label = "RMA Detail Maintenance Grid")
	public WebElement rMADetailMaintenanceGrid;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@ButtonType()
	@FindByLabel(label = "Release RMA")
	public WebElement releaseRMA;
	@ButtonType()
	@FindByLabel(label = "RMA Detail Mass Ship")
	public WebElement rMADetailMassShip;
	@ButtonType()
	@FindByLabel(label = "Quick Create RMA Details")
	public WebElement quickCreateRMADetails;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 120)
	@LinkType()
	@FindBy(xpath = "//a[@name='createCreditMemoLink']")
	public WebElement creditMemo;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Credit Memo']/ancestor::th/following-sibling::td[1]")
	public WebElement creditMemoNumber;
	
}