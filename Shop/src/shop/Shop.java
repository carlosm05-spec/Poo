/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shop;
import Conexion.conexion;
import java.util.Scanner;
import PDF.pdf;

public class Shop {

    public static void main(String[] args) {
        
        String documento="mipdf.pdf";
        
        pdf pdf = new pdf();
        pdf.generarPDF(documento);
        
        conexion con = new conexion();
        Scanner sc = new Scanner(System.in);
        
        
        
    }
}
       