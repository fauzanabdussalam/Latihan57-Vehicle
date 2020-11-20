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
public class Skateboard extends Vehicle
{
    private double myBoardLength;
    
    public Skateboard()
    {
        System.out.println("Skateboard");
    }

    public double getBoardLength() 
    {
        return myBoardLength;
    }

    public void setBoardLength(double boardLength) 
    {
        this.myBoardLength = boardLength;
    }
}
