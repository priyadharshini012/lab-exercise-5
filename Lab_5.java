/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab_.pkg5;

/**
 *
 * @author priyadharshini
 */
public class Lab_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        UG obj1=new UG();
        obj1.getdegree();
        PG obj=new PG();
        obj.getdegree();

        
    }
    
}
class degree
{
    void getdegree()
    {
        System.out.println("i got a degree");
    }
}
class UG extends degree 
{
     
    void getdegree()
    {   
        super.getdegree();
        System.out.println("I am undergraduate");
    }
}
class PG extends UG
{
   
    void getdegree()
    {
        System.out.println("I am postgraduate");
    }
}