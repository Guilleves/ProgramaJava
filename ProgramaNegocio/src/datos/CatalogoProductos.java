package datos;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import connection.ConnectionDB;

public class CatalogoProductos
{
	private ArrayList<Productos> listaProductos;
	
	public CatalogoProductos()
	{
		cargarLista();
	}
	
	public int getTamanoLista()
	{
		return this.listaProductos.size();
	}
	
	public Productos getListaProductos(int i)
	{
		return this.listaProductos.get(i);
	}
	
	private void cargarLista()
	{
		listaProductos = new ArrayList<Productos>();
		String sql="select idproductos, nombre, descripcion, precio from productos";
		Statement sentencia=null;
		ResultSet rs=null;
		
		try 
		{			
			sentencia= ConnectionDB.getInstancia().getConn().createStatement();
			rs= sentencia.executeQuery(sql);
			
			while(rs.next())
			{
				Productos p = new Productos();
				p.setIdProductos(rs.getInt("idproductos"));
				p.setNombre(rs.getString("nombre"));
				p.setDescripcion(rs.getString("descripcion"));
				p.setPrecio(rs.getFloat("precio"));
				listaProductos.add(p);
			}
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(rs!=null)
				{
					rs.close();
				}
				if(sentencia!=null && !sentencia.isClosed())
				{
					sentencia.close();
				}
				ConnectionDB.getInstancia().CloseConn();
			}
			catch (SQLException sqle)
			{
				sqle.printStackTrace();
			}
		}
	
	}
	public void cargarLista(String filtro)
	{
		listaProductos = new ArrayList<Productos>();
		String sql="select idproductos, nombre, descripcion, precio from productos where nombre like '" + filtro + "%'";
		Statement sentencia=null;
		ResultSet rs=null;
		
		try 
		{			
			sentencia= ConnectionDB.getInstancia().getConn().createStatement();
			rs= sentencia.executeQuery(sql);
			
			while(rs.next())
			{
				Productos p = new Productos();
				p.setIdProductos(rs.getInt("idproductos"));
				p.setNombre(rs.getString("nombre"));
				p.setDescripcion(rs.getString("descripcion"));
				p.setPrecio(rs.getFloat("precio"));
				listaProductos.add(p);
			}
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(rs!=null)
				{
					rs.close();
				}
				if(sentencia!=null && !sentencia.isClosed())
				{
					sentencia.close();
				}
				ConnectionDB.getInstancia().CloseConn();
			}
			catch (SQLException sqle)
			{
				sqle.printStackTrace();
			}
		}
	
	}
	
	public void modificarProductos(Productos P)
	{
		String sql="update productos set nombre = ?, descripcion = ?, precio = ?  where idproductos = ?";
		PreparedStatement sentencia=null;
		Connection conn=ConnectionDB.getInstancia().getConn();
		
		try {
			sentencia=conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			sentencia.setString(1, P.getNombre());
			sentencia.setString(2, P.getDescripcion());
			sentencia.setFloat(3, P.getPrecio());
			sentencia.setInt(4, P.getIdProductos());		

			sentencia.executeUpdate();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		finally{
			try{
				if(sentencia!=null && !sentencia.isClosed()){sentencia.close();}
				ConnectionDB.getInstancia().CloseConn();
			}
			catch (SQLException sqle){
				sqle.printStackTrace();
			}
			
		}
		cargarLista("");
		
	}
	

	public void nuevoProducto (Productos P)
	{
		String sql="insert into productos(nombre, descripcion, precio) values (?,?,?)";
		PreparedStatement sentencia=null;
		Connection conn=ConnectionDB.getInstancia().getConn();
		
		try {
			sentencia=conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			sentencia.setString(1, P.getNombre());
			sentencia.setString(2, P.getDescripcion());
			sentencia.setFloat(3, P.getPrecio());


			sentencia.executeUpdate();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		finally{
			try{
				if(sentencia!=null && !sentencia.isClosed()){sentencia.close();}
				ConnectionDB.getInstancia().CloseConn();
			}
			catch (SQLException sqle){
				sqle.printStackTrace();
			}
			
		}
		cargarLista("");
	}

}
