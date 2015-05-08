package datos;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import connection.ConnectionDB;

public class CatalogoClientes 
{
	private ArrayList<Clientes> listaClientes;
	
	public CatalogoClientes()
	{
		cargarLista();
	}
	
	public int getTamanoLista()
	{
		return this.listaClientes.size();
	}
	
	public Clientes getListaClientes(int i)
	{
		return this.listaClientes.get(i);
	}
	
	private void cargarLista()
	{
		listaClientes = new ArrayList<Clientes>();
		String sql="select idclientes, nombre, apellido, telefono, domicilio from clientes";
		Statement sentencia=null;
		ResultSet rs=null;
		
		try 
		{			
			sentencia= ConnectionDB.getInstancia().getConn().createStatement();
			rs= sentencia.executeQuery(sql);
			
			while(rs.next())
			{
				Clientes c = new Clientes();
				c.setIdClientes(rs.getInt("idClientes"));
				c.setNombre(rs.getString("nombre"));
				c.setApellido(rs.getString("apellido"));
				c.setTelefono(rs.getString("telefono"));
				c.setDomicilio(rs.getString("domicilio"));
				listaClientes.add(c);
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
		listaClientes = new ArrayList<Clientes>();
		String sql="select idclientes, nombre, apellido, telefono, domicilio from clientes where nombre like '" + filtro + "%'";
		Statement sentencia=null;
		ResultSet rs=null;
		
		try 
		{			
			sentencia= ConnectionDB.getInstancia().getConn().createStatement();
			rs= sentencia.executeQuery(sql);
			
			while(rs.next())
			{
				Clientes c = new Clientes();
				c.setIdClientes(rs.getInt("idClientes"));
				c.setNombre(rs.getString("nombre"));
				c.setApellido(rs.getString("apellido"));
				c.setTelefono(rs.getString("telefono"));
				c.setDomicilio(rs.getString("domicilio"));
				listaClientes.add(c);
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
	
	public void modificarCliente(Clientes C)
	{
		String sql="update clientes set nombre = ?, apellido = ?, telefono = ?, domicilio = ?  where idClientes = ?";
		PreparedStatement sentencia=null;
		Connection conn=ConnectionDB.getInstancia().getConn();
		
		try {
			sentencia=conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			sentencia.setString(1, C.getNombre());
			sentencia.setString(2, C.getApellido());
			sentencia.setString(3, C.getTelefono());
			sentencia.setString(4, C.getDomicilio());
			sentencia.setInt(5, C.getIdClientes());
			

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
	

	public void nuevoCliente (Clientes c)
	{
		String sql="insert into clientes(nombre, apellido, telefono, domicilio) values (?,?,?,?)";
		PreparedStatement sentencia=null;
		Connection conn=ConnectionDB.getInstancia().getConn();
		
		try {
			sentencia=conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			sentencia.setString(1, c.getNombre());
			sentencia.setString(2, c.getApellido());
			sentencia.setString(3, c.getTelefono());
			sentencia.setString(4, c.getDomicilio());
			

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