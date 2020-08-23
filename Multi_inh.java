/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multi._inh;

import java.util.Scanner;


/**
 *
 * @author priyadharshini
 */
public class Multi_inh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        result obj= new result();
        obj.read();
        obj.display();
        // TODO code application logic here
    }
    
}
class student
{
    String name:
    String rollno;
    Scanner obj=new Scanner(System.in);
public void read()
{
System.out.println("enter the name:");
name=obj.next();
System.out.println("enter the roll number:");
rollno=obj.next();
}
public void display()
{
    System.out.println("student details:");
            System.out.println("student name:"+name);
            System.out.println("roll number:"+rollno);
}
}
class mark extends student
{
    double m1;
    double m2;
    double m3;
    public void read()
    {
        super.read();
        System.out.println("enter mark 1:");
        m1=obj.nextDouble();
        System.out.println("enter mark 2:");
                m2=obj.nextDouble();
                System.out.println("enter mark 3:");
                m3=obj.nextDouble();
    }
    public void display()
    {
        super.display();
        System.out.println("mark 1:"+m1);
                System.out.println("mark 2:"+m2);
        System.out.println("mark 3:"+m3);

    }
}
    class result extends mark
    {
        double total;
        double average;

        @Override
        public void read()
        {
            super.read();
            total=m1+m2+m3;
            average=total/3;//To change body of generated methods, choose Tools | Templates.
        }
        public void display()
        {
            super.display();
            System.out.println("total:"+total);
            System.out.println("average mark:"+average);
        
            
        }
    }



        

    public student() {
    }
.
}