package com.xworkz.Dmart.items;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.security.PrivateKey;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private int productId;
    private String productName;

  private  String mfgDate;

  private  String ExdDate;

  private int price;
}
