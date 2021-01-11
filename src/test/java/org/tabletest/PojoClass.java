package org.tabletest;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass {

	public PojoClass() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="fromPort")
	private WebElement departurecityclick;
	@FindBy(name="fromPort")
	private WebElement departurecity;
	@FindBy(name="toPort")
	private WebElement destinationcityclick;
	@FindBy(name="toPort")
	private WebElement destinationcity;
	@FindBy(xpath="//input[@value='Find Flights']")
	private WebElement findflight;
	@FindBy(xpath="//table")
	private WebElement table;
	@FindBy(tagName="tr")
	private List<WebElement> tablerows;
	@FindBy(tagName="th")
	private WebElement tableheading;
	@FindBy(tagName="td")
	private List<WebElement> tabledatas;
	@FindBy(xpath="(//input[@value='Choose This Flight'])[3]")
	private WebElement chooseflight;
	@FindBy(id="inputName")
	private WebElement customername;
	@FindBy(id="address")
	private WebElement customeraddress;
	@FindBy(id="city")
	private WebElement customercity;
	@FindBy(id="state")
	private WebElement customerstate;
	@FindBy(id="zipCode")
	private WebElement customerzipcode;
	@FindBy(id="cardType")
	private WebElement cardTypeclick;
	@FindBy(id="cardType")
	private WebElement cardType;
	@FindBy(id="creditCardNumber")
	private WebElement cardNo;
	@FindBy(id="creditCardMonth")
	private WebElement cardMonth;
	@FindBy(id="creditCardYear")
	private WebElement cardYear;
	@FindBy(id="nameOnCard")
	private WebElement cardName;
	@FindBy(xpath="//input[@value='Purchase Flight']")
	private WebElement purchaseflight;
	@FindBy(xpath="//table")
	private WebElement table1;
	
	public void automateTable(String deptcity,String destcity,String name,String address,String city,String state,String zipcode,String cardtype,String cardno,String cardmonth,String cardyear,String nameoncard) throws InterruptedException {
		
        maximise();
        click(departurecityclick);
        dropDownVisibleText(departurecity,deptcity);
        click(destinationcityclick);
        dropDownValue(destinationcity, destcity);
        click(findflight);
        for(int i=0;i<tablerows.size();i++) {
        	String tablerowstext = tablerows.get(i).getText();
        for(int j=0;j<tabledatas.size();j++) {
        	String tabledatastext = tabledatas.get(j).getText();
        	if(tabledatastext.equals("$200.98")) {
        		click(chooseflight);
        	}
        }}
       hardcoded(customername,name); 
       hardcoded(customeraddress,address);
       hardcoded(customercity,city);
       hardcoded(customerstate,state);
       hardcoded(customerzipcode,zipcode);
       click(cardTypeclick);
       dropDownVisibleText(cardType,cardtype);
       Thread.sleep(2000);
       hardcoded(cardNo,cardno);
       clear(cardMonth);
       hardcoded(cardMonth,cardmonth);
       clear(cardYear);
       hardcoded(cardYear,cardyear);
       hardcoded(cardName,nameoncard);
       click(purchaseflight);
       System.out.println(table1.getText());
	}
	public WebElement getDeparturecityclick() {
		return departurecityclick;
	}
	public WebElement getDeparturecity() {
		return departurecity;
	}
	public WebElement getDestinationcityclick() {
		return destinationcityclick;
	}
	public WebElement getDestinationcity() {
		return destinationcity;
	}
	public WebElement getFindflight() {
		return findflight;
	}
	public WebElement getTable() {
		return table;
	}
	public List<WebElement> getTablerows() {
		return tablerows;
	}
	public WebElement getTableheading() {
		return tableheading;
	}
	public List<WebElement> getTabledatas() {
		return tabledatas;
	}
	public WebElement getChooseflight() {
		return chooseflight;
	}
	public WebElement getCustomername() {
		return customername;
	}
	public WebElement getCustomeraddress() {
		return customeraddress;
	}
	public WebElement getCustomercity() {
		return customercity;
	}
	public WebElement getCustomerstate() {
		return customerstate;
	}
	public WebElement getCustomerzipcode() {
		return customerzipcode;
	}
	public WebElement getCardTypeclick() {
		return cardTypeclick;
	}
	public WebElement getCardType() {
		return cardType;
	}
	public WebElement getCardNo() {
		return cardNo;
	}
	public WebElement getCardMonth() {
		return cardMonth;
	}
	public WebElement getCardYear() {
		return cardYear;
	}
	public WebElement getCardName() {
		return cardName;
	}
	public WebElement getPurchaseflight() {
		return purchaseflight;
	}
}
