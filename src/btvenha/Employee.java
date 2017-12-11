/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvenha;

import java.util.Scanner;

/**
 *
 * @author tc
 */

public class Employee
{
   private String Hoten;
   private String Gioitinh;
   private String Quequan;
   private String Chucvu;
   private double Luong;
    public Employee(){}
    
    public String getHoten()
    {
        return Hoten;
    }
  
    public String getGioitinh()
    {
        return Gioitinh;
    }
    public String getQuequan()
    {
        return Quequan;
    }
    public String getChucvu()
    {
        return Chucvu;
    }
    public double getLuong()
    {
        return Luong;
    }
    
    public void setHoten(String ht)
    {
        this.Hoten = Hoten;
    }
    public void setGioitinh(String gt)
    {
        this.Gioitinh = Gioitinh;
    }
    public void setQuequan(String qq)
    {
        this.Quequan = Quequan;
    }
    public void setChucvu(String cv)
    {
        this.Chucvu = Chucvu;
    }
    public void setLuong(double luong)
    {
        this.Luong = Luong;
    }
    
    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Họ tên: ");
        Hoten  = sc.nextLine();
        System.out.print("Giới tính: ");
        Gioitinh = sc.nextLine();
        System.out.print("Quê quán: ");
        Quequan = sc.nextLine();
        System.out.print("Chức vụ: ");
        Chucvu = sc.nextLine();
        System.out.print("Lương: ");
        Luong = sc.nextDouble();
    }
    public void Hienthi()
    {
        System.out.println("Họ tên: " + Hoten + ", Giới tính : " +  Gioitinh + ", Quê quán : " + Quequan + ", Chức vụ: " + Chucvu + ", Lương: " + Luong + "Btc");
    } 
    }

    
    
