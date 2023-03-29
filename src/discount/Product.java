package discount;

public class Product {
	

double productprice =1000;

double defaultdiscount =500;
double discount;
double actualprice;

String promocode;

void promo()  {
	
  if(promocode == "Promo5")
  
  { discount = defaultdiscount + (defaultdiscount*5/100);
  actualprice = productprice-discount;
  System.out.println("price of product after discount is" + actualprice );
  } 
 
  else if(promocode == "Promo10")
	  
  { discount = defaultdiscount + (defaultdiscount*10/100);
  actualprice = productprice-discount;
  System.out.println("price of product after discount is" + actualprice );
  } 
  
  else if(promocode == "Promo20")
	  
  { discount = defaultdiscount + (defaultdiscount*20/100);
  actualprice = productprice-discount;
  System.out.println("price of product after discount is" + actualprice );
  } 
  
  else 
  {actualprice = productprice-defaultdiscount;
	  
  System.out.println("price of product after discount is" + actualprice );  
  }  
}
	

}
