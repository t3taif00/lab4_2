public class main { 
public static void main(String[] args) { 
Product product = new Product("Edam", 3.3, 120); 
System.out.println("Product value is " + product.countValue()); 
product.printProduct(); 
} 
} 
class Product { 
private String name; 
private double price; 
private int amount; //Amount in storage 
private int changeBalance;
public Product(String name, double price, int amount, int changeBalance) { 
this.name = name; 
this.price = price; 
this.amount = amount; 
this.changeBalance = changeBalance;
} 
public double countValue() { 
return(amount * price); 
} 
public void printProduct() { 
System.out.printf("Product %s, price %4.1f and balance %d pcs", name,price,amount); 
} 
} 