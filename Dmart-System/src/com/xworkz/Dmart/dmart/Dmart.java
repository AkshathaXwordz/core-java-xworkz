package com.xworkz.Dmart.dmart;

import com.xworkz.Dmart.items.Product;

import java.util.Arrays;

public class Dmart {
    Product product[];

    public Dmart(int size) {
        product = new Product[size];
    }

    int index;
    int id;

    public boolean addAllProducts(Product product) {
        System.out.println("invoke allAllProducts");
        boolean isAdded = false;
        if (product != null) {
            product.setProductId(id++);
            this.product[index++] = product;
            isAdded = true;
        }
        return isAdded;
    }

    public void getAllProducts() {
        System.out.println("Products lists are");
        for (int index = 0; index < product.length; index++) {
            System.out.println(product[index].getProductId() + " "
                    + product[index].getProductName() + " "
                    + product[index].getMfgDate() + " "
                    + product[index].getExdDate() + " "
                    + product[index].getPrice());

        }
    }

    public Product getProductInfoByProductName(String ProductName) {
        Product product1 = null;
        for (int productIndex = 0; productIndex < this.product.length; productIndex++) {
            if (product[productIndex].getProductName() == ProductName) {
                product1 = product[productIndex];

            }
        }
        return product1;
    }


    public String getProductpriceByMfgDate(String MfgDate) {
        String mfgDate = null;

        for (int officerIndex = 0; officerIndex < this.product.length; officerIndex++) {
            if (product[officerIndex].getMfgDate() == MfgDate) {
                mfgDate = product[officerIndex].getMfgDate();

            }
        }
        return mfgDate;
    }

    public boolean updateProductByName(String updatedProductName, String exisistingName) {
        boolean isPostNameUpdated = false;
        for (int officerIndex = 0; officerIndex < this.product.length; officerIndex++) {
            if (product[officerIndex].getProductName() == exisistingName) {
                product[officerIndex].setProductName(updatedProductName);
                isPostNameUpdated = true;


            }
        }
        return isPostNameUpdated;
    }

    public int deleteProductNameById(int id) {
        System.out.println("invoked deleteproductName ");
        int index, newIndex;
        for (index = 0, newIndex = 0; index < this.product.length; index++) {
            if (product[index].getProductId() != id) {
                product[newIndex++] = product[index];
            } else {
                System.out.println("Given prodcct name is deleted");
            }
        }
        product = Arrays.copyOf(product, newIndex);
        getAllProducts();
        return index;
    }


        public void getAllOfficersName(Product application[]){

            System.out.println("--------------------------------");
            System.out.println("Get all new products details");
            for (int index = 0; index < application.length; index++) {
                System.out.println(product[index].getProductId()+" "+product[index].getProductName()+" "+product[index].getMfgDate()+" "+product[index].getExdDate()+" "+product[index].getPrice());
            }
        }

    }

