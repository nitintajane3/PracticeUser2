package Pojo;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Pojo_Serial_instantwebtools 
{
	/*{    "id":199799,
		"name":"India Airways",
		"country":"India",
		"logo":"https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png",
		"slogan":"From India",
		"head_quaters":"Katunayake, Sri Lanka",
		"website":"www.srilankaairways.com",
		"established":"2022"
		
		
	}*/
	
	
	
	private String name;
	private String country;
	private String logo;
	private String slogan;
	private String head_quaters;
	private String website;
	private String established;
	
	public Pojo_Serial_instantwebtools(int id, String name, String country, String logo, String slogan,
			String head_quaters, String website, String established) 
	{
		
		this.id = id;
		this.name = name;
		this.country = country;
		this.logo = logo;
		this.slogan = slogan;
		this.head_quaters = head_quaters;
		this.website = website;
		this.established = established;
	}
	
	private	int id;
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getCountry() 
	{
		return country;
	}
	public void setCountry(String country) 
	{
		this.country = country;
	}
	public String getLogo() 
	{
		return logo;
	}
	public void setLogo(String logo) 
	{
		this.logo = logo;
	}
	public String getSlogan() 
	{
		return slogan;
	}
	public void setSlogan(String slogan) 
	{
		this.slogan = slogan;
	}
	public String getHead_quaters() 
	{
		return head_quaters;
	}
	public void setHead_quaters(String head_quaters) 
	{
		this.head_quaters = head_quaters;
	}
	public String getWebsite() 
	{
		return website;
	}
	public void setWebsite(String website) 
	{
		this.website = website;
	}
	public String getEstablished() 
	{
		return established;
	}
	public void setEstablished(String established) 
	{
		this.established = established;
	}
	/*@Override
	public String toString() 
	{
		return "Pojo_Serial_instantwebtools [name=" + this.name + ", country=" + this.country + ", logo=" + this.logo + ", slogan="
				+ this.slogan + ", head_quaters=" + this.head_quaters + ", website=" + this.website + ", established=" + this.established
				+ ", id=" + this.id + "]";
	}*/

	
}
