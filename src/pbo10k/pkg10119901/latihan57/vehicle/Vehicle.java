/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan57.vehicle;

/**
 *
 * @author User
 */
public class Vehicle 
{
    protected String myBrand, myModel;
    
    public Vehicle()
    {
    }

    public String getBrand() 
    {
        return myBrand;
    }

    public void setBrand(String brand) 
    {
        this.myBrand = brand;
    }

    public String getModel() 
    {
        return myModel;
    }

    public void setModel(String model) 
    {
        this.myModel = model;
    }
}
