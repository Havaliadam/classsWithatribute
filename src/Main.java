public class Main {

    public static void main(String[] args) {
	product Product=new product(1,"laptop","asus laptop",3000,2,"siyah");

        productManager Productmanager=new productManager();

Productmanager.Add(Product);
    System.out.println(Product.getKod());
    }
}
