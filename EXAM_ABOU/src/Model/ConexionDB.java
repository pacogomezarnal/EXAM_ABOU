package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionDB {
	
	private Connection conexion;
	private String CONTROLADOR_MYSQL="com.mysql.jdbc.Driver";
	private String server="localhost";
	private String bbdd="thelaby";
	private String user="root";
	private String pass="";
	private static ConexionDB instance=null;
	

	private ConexionDB(){
		try {
			Class.forName(CONTROLADOR_MYSQL).newInstance();
			System.out.println("CARGA CORRECTA DEL CONTROLADOR JDBC");
		} 
		catch (Exception errorCargaControlador) {
			// TODO Auto-generated catch block
			errorCargaControlador.printStackTrace();
			System.out.println("ERROR EN LA CARGA DEL CONTROLADOR");
		}
		
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://"+server+"/"+bbdd+"?"+"user="+user+"&password="+pass);
			System.out.println("CONEXION REALIZADA CON EXITO");
		} 
		catch (SQLException errorConexionBBDD) {
			// TODO Auto-generated catch block
			errorConexionBBDD.printStackTrace();
			System.out.println("ERROR DE CONEXION CON LA BBDD");
		}
	}
	
	public static ConexionDB getInstance() {
		if(instance==null) {
			instance=new ConexionDB();
		}
		return instance;
	}
		

		//Con este metodo hago los selects
	public ResultSet query(String query){
		
		Statement st;
		ResultSet rs = null;

		try {
			st = conexion.createStatement();
			try{
				rs = st.executeQuery(query);
			}
			catch (SQLException e){
				e.printStackTrace();
			}
		
		}
		catch (SQLException e1) {
				// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		return rs;	
										
	}
	
	//Con este metodo vamos a hacer los inserts, update y deletes.
	public int modifyQuery(String update){
		Statement stmt;
		int rs = 0;
		try{
		stmt = conexion.createStatement();		
			try{
				rs = stmt.executeUpdate(update);
			}
			catch (SQLException e){
				
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return rs;
	}
}



/*package Model;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;



public class ConexionDB {
	// DATOS DE LA CONEXION
	static final String CONTROLADOR_MYSQL= "com.mysql.jdbc.Driver";
	
	//DATOS POR DEFECTO
	private static final String HOST="localhost";
	private static final String BBDD="thelaby";
	private static final String USER="root";
	private static final String PASS="";
	
	//DATOS DE LA BBDD
	private String host;
	private String bbdd;
	private String user;
	private String pass;
	private String url;
	
	//Conexion
	private static Connection conexion = null;// maneja la conexió
	
	//Instancia unica
	private static ConexionDB instance = null;
	
	private ConexionDB(String HOST,String BBDD,String USER,String PASS) {
		this.host=HOST;
		this.bbdd=BBDD;
		this.user=USER;
		this.pass=PASS;
		this.url="jdbc:mysql://"+this.host+"/"+this.bbdd;
	}
	
	//Implementar SingleTon
	public static ConexionDB getInstance(String HOST,String BBDD,String USER,String PASS) {
	      if(instance == null) {
	         instance = null;
	      }
	      return instance;
	   }
	//Este método es el mismo que el anterior pero no es necesario
	//pasar parámetros de base de datos ya que toma los
	//valores por defecto
	public static ConexionDB getInstance() {
	      if(instance == null) {
	         instance = null;
	      }
	      return instance;
	  }
	
	//Metodo que permite la conexion a la base de datos
	public boolean connectDB(){
		try{
			//Lo primero es cargar el controlador MySQL el cual automáticamente se registra
			Class.forName(CONTROLADOR_MYSQL);
			//Conectarnos a la BBDD
			conexion = DriverManager.getConnection(this.url,this.user,this.pass);
		}
		catch( SQLException excepcionSql ) 
		{
			excepcionSql.printStackTrace();
			return false;
		}
		catch( ClassNotFoundException noEncontroClase)
		{
			noEncontroClase.printStackTrace();
			return false;
		}
		return true;
	}
	
	//Metodo que devuelve la conexion a la base de datos
	public static Connection getConexion(){
		return conexion;
	}

}
*/
