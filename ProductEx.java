package com.xworkz.Dmart;

import com.xworkz.Dmart.dmart.Dmart;
import com.xworkz.Dmart.items.Product;

import java.util.Scanner;

public class ProductEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No products to be added");
        int size = sc.nextInt();
        Dmart dmart = new Dmart(size);

        for (int index = 0; index < size; index++) {

            Product product = new Product();

          //  System.out.println("");
         //   product.setProductId(sc.nextInt());
            System.out.println("Enter the Product Name");
            product.setProductName(sc.next());
            System.out.println("Enter the MfgDate");
            product.setMfgDate(sc.next());
            System.out.println("Enter the ExdDate");
            product.setExdDate(sc.next());
            System.out.println("Enter the price of the product");
            product.setPrice(sc.nextInt());

        dmart.addAllProducts(product);
    }dmart.getAllProducts();



        String input=null;

        do{
            System.out.println("Press 1 to getAllProducts ");
            System.out.println("Press 2 to getProductInfoByProductName");
            System.out.println("Press 3 to getProductpriceByMfgDate");
            System.out.println("Press 4 to getupdateProductByName");
            System.out.println("Press 5 to getPostNameByName");

            int options= sc.nextInt();
            switch (options)
            {
                case 1:
                    System.out.println("list of products");
                    dmart.getAllProducts();
                    break;
                case 2:
                    System.out.println("Enter the Product name to get Information");
                Product ProductName=    dmart.getProductInfoByProductName(sc.next());
                    System.out.println(ProductName);
                break;
                case 3:
                    System.out.println("Enter the Product mfgDate to get Price" );
                String mfgDate =dmart.getProductpriceByMfgDate(sc.next());
                    System.out.println(mfgDate);
                    break;
                case 4:
                    System.out.println("Enter Name to be Update");
                    System.out.println("Enter the existingName");
                  boolean  updateProductByName=dmart.updateProductByName(sc.next(), sc.next());
                    System.out.println(updateProductByName);
                  break;

                case 5:
                    System.out.println("Enter product Id to delete the name");
                    int deleteproducts=dmart.deleteProductNameById(sc.nextInt());
                    System.out.println(deleteproducts);
                default:
                    System.out.println("select available option only");
            }
            System.out.println("Do you what to continue Yes/No");
            input=sc.next();

        }while (input.equals("Yes"));

        System.out.println("Thank you for ur time");


}
}
