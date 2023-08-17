public class MidTerm{
    public static void main(String[] args) {
        Product chair = new Product("Chair", 500.0);
        Electronics tv = new Electronics("Television", 20000.0,"Samsung", "Neo QLED");
        Smartphone iphone = new Smartphone("Iphone", 40000.0, "Apple", "Iphone 99", "ios");
        Book OOPProgramming = new Book("OOP Programing", 250.0, "John Doe", 300);

        chair.getName();
        chair.getPrice();
        System.out.println("***************************");

        tv.getName();
        tv.getPrice();
        tv.getBrand();
        tv.getModel();
        System.out.println("***************************");

        iphone.getName();
        iphone.getPrice();
        iphone.getBrand();
        iphone.getModel();
        iphone.getOperatingSystem();
        System.out.println("***************************");

        OOPProgramming.getName();
        OOPProgramming.getPrice();
        OOPProgramming.getAuthor();
        OOPProgramming.getPages();
    }
}


class Product{
    private String Name;
    private double Price;

    Product(String name, double price){
        this.Name = name;
        this.Price = price;
    }
    public String getName() {
        System.out.println("Product Name: "+this.Name);
        return Name;

    }

    public void setName(String Newname) {
        this.Name = Newname;
    }

    public double getPrice() {
        System.out.println("Product Price: "+this.Price);
        return Price;
    }

    public void setPrice(double Newprice) {
        this.Price = Newprice;
    }
    public void display() {
        System.out.println("Product Name: " + Name);
        System.out.println("Product Price: " + Price);
    }
}


class Electronics extends Product{
    private String Brand;
    private String Model;
    Electronics(String name , double price, String brand,String model){
        super(name,price);
        this.Brand = brand;
        this.Model = model;
    }
    public String getBrand() {
        System.out.println("Brand: " + this.Brand);
        return Brand;
    }
    public void setBrand(String Newbrand) {
        this.Brand = Newbrand;
    }
    public String getModel() {
        System.out.println("Model: " + this.Model);
        return Model;
    }
    public void setModel(String Newmodel) {
        this.Model = Newmodel;
    }
}



class Smartphone extends Electronics {
    private String OperatingSystem;

    Smartphone(String name, double price, String brand, String model, String operatingSystem) {
        super(name, price, brand, model);
        this.OperatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        System.out.println("Operating System: " + this.OperatingSystem);
        return OperatingSystem;
    }

    public void setOperatingSystem(String NewoperatingSystem) {
        this.OperatingSystem = NewoperatingSystem;
    }
}


class Book extends Product{
    private String Author;
    private int Pages;

    Book(String name , double price, String author,int pages){
        super(name,price);
        this.Author = author;
        this.Pages = pages;
    }

    public String getAuthor(){
        System.out.println("Author: "+ this.Author);
        return Author;
    }

    public void setAuthor(String Newauthor){
        this.Author = Newauthor;
    }
    
    public int getPages(){
        System.out.println("Pages: " + this.Pages);
        return Pages;
    }

    public void setPages(int Newpages){
        this.Pages = Newpages;
    }
}