/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shop;

import shop.Producto;
import Conexion.conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoCon {
    
    public Producto buscarPorId(int id) throws SQLException {
        Connection con = new conexion().getConnection();
        String sql = "SELECT nombre, precio, cantidad FROM Producto WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();

        Producto producto = null;
        if (rs.next()) {
            producto = new Producto(id, rs.getString("nombre"), rs.getInt("precio"), rs.getInt("cantidad"));
        }

        rs.close();
        ps.close();
        con.close();
        return producto;
    }

    public void actualizarProducto(Producto p) throws SQLException {
        Connection con = new conexion().getConnection();
        String sql = "UPDATE Producto SET nombre = ?, precio = ?, cantidad = ? WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, p.getNombre());
        ps.setInt(2, p.getPrecio());
        ps.setInt(3, p.getCantidad());
        ps.setInt(4, p.getId());
        ps.executeUpdate();
        ps.close();
        con.close();
    }
    
    public boolean eliminarProductoPorId(int idProducto) {
        Connection conn = null;
        PreparedStatement psVenta = null;
        PreparedStatement psProducto = null;

        try {
            conn = new conexion().getConnection();

            // Primero elimina en la tabla venta
            String sqlVenta = "DELETE FROM venta WHERE id_producto = ?";
            psVenta = conn.prepareStatement(sqlVenta);
            psVenta.setInt(1, idProducto);
            psVenta.executeUpdate();

            // Luego elimina en la tabla producto
            String sqlProducto = "DELETE FROM Producto WHERE id = ?";
            psProducto = conn.prepareStatement(sqlProducto);
            psProducto.setInt(1, idProducto);
            psProducto.executeUpdate();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;

        } finally {
            try {
                if (psVenta != null) psVenta.close();
                if (psProducto != null) psProducto.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public boolean agregarProductoConVenta(Producto producto) {
        Connection conn = null;
        PreparedStatement psProducto = null;
        PreparedStatement psVenta = null;
        ResultSet rs = null;

        try {
            conn = new conexion().getConnection();

            String sqlProducto = "INSERT INTO Producto (nombre, cantidad, precio) VALUES (?, ?, ?)";
            psProducto = conn.prepareStatement(sqlProducto, Statement.RETURN_GENERATED_KEYS);
            psProducto.setString(1, producto.getNombre());
            psProducto.setInt(2, producto.getCantidad());
            psProducto.setInt(3, producto.getPrecio());
            psProducto.executeUpdate();

            rs = psProducto.getGeneratedKeys();
            if (rs.next()) {
                int idProducto = rs.getInt(1);

                String sqlVenta = "INSERT INTO venta (id_producto) VALUES (?)";
                psVenta = conn.prepareStatement(sqlVenta);
                psVenta.setInt(1, idProducto);
                psVenta.executeUpdate();
            }

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;

        } finally {
            try {
                if (rs != null) rs.close();
                if (psProducto != null) psProducto.close();
                if (psVenta != null) psVenta.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public List<Producto> listarProductos() {
        List<Producto> productos = new ArrayList<>();

        try (Connection conn = new conexion().getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Producto");
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Producto producto = new Producto(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getInt("cantidad"),
                    rs.getInt("precio")
                );
                productos.add(producto);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return productos;
    }
}


