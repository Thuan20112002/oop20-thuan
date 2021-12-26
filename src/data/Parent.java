/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author DELL
 */
public class Parent {
    
    protected  String assetOne; //Ngôi nhà
    protected String asserTwo;

    public Parent(String assetOne, String asserTwo) {
        this.assetOne = assetOne;
        this.asserTwo = asserTwo;
    }

    public String getAssetOne() {
        return assetOne;
    }

    public String getAsserTwo() {
        return asserTwo;
    }

    public void setAssetOne(String assetOne) {
        this.assetOne = assetOne;
    }

    public void setAsserTwo(String asserTwo) {
        this.asserTwo = asserTwo;
    }

    @Override
    public String toString() {
        return "Parent{" + "assetOne=" + assetOne + ", asserTwo=" + asserTwo + '}';
    }
    
    public void showProfile(){
        System.out.println("PARENT > asset 1: " + assetOne + "; asset2: " + asserTwo);
    }
}
