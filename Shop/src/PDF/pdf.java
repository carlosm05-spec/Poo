/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PDF;

import Conexion.conexion;
import java.sql.*;
import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.common.PDRectangle; // Define tamaños de página como carta o A4
import org.apache.pdfbox.pdmodel.PDPageContentStream; // Permite escribir o dibujar contenido en las páginas del PDF

public class pdf {
    
    public void generarPDF(String ruta){
        
        try (Connection conn = new conexion().getConnection()) {
            String query = "SELECT p.nombre, p.cantidad, p.precio, (p.cantidad * p.precio) AS subtotal " +
                           "FROM venta v JOIN Producto p ON v.id_producto = p.id;";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            PDDocument document = new PDDocument();
            PDPage page = new PDPage(PDRectangle.LETTER);
            document.addPage(page);

            PDPageContentStream content = new PDPageContentStream(document, page);

            content.beginText();
            content.setFont(PDType1Font.HELVETICA_BOLD, 16);
            content.newLineAtOffset(50, 700);
            content.newLine();
            content.newLine();
            
            content.setFont(PDType1Font.HELVETICA, 12);
            content.setLeading(16f);

            double totalGeneral = 0;

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                int cantidad = rs.getInt("cantidad");
                double precio = rs.getDouble("precio");
                double subtotal = rs.getDouble("subtotal");

                String linea = String.format("%-20s - Cantidad: %d - Precio Original: $%.2f - Subtotal: $%.2f", nombre, cantidad, precio, subtotal);
                content.showText(linea);
                content.newLine();

                totalGeneral += subtotal;
            }

            content.newLine();
            content.setFont(PDType1Font.HELVETICA_BOLD, 14);
            content.showText(String.format("Resumen de compra - Total a pagar: $%.2f", totalGeneral));

            content.endText();
            content.close();

            document.save(ruta);
            document.close();

            System.out.println("PDF generado en: " + ruta);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}