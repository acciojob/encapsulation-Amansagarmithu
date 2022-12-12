package com.driver;
import java.util.*;
public class Main {
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      RWOnly obj = new RWOnly();
      try{
          obj.name = input.next();
          System.out.println(obj.name);

      }
      catch(Exception e){
          System.out.println(e);
      }
      obj.setName(input.next());
      obj.getName();
  }
}