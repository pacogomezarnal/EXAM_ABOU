package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloCadete {

	public ModeloCadete(){
		
	}
	
	public ArrayList<Cadete> load(){
		ConexionDB conexion = ConexionDB.getInstance();
		ResultSet r = conexion.query("SELECT * FROM cadetes WHERE equipo=5;");
		
		ArrayList<Cadete> cadetes = new ArrayList<Cadete>();
		try{
			while(r.next()){
				Cadete cadete = new Cadete();
				cadete.setId((int) r.getObject("id"));
				cadete.setNombre((String) r.getObject("nombre"));
				cadete.setApellidos((String) r.getObject("apellidos"));
				cadete.setEdad((int) r.getObject("edad"));
				cadete.setNacionalidad((String) r.getObject("nacionalidad"));
				cadete.setEquipo((int) r.getObject("equipo"));
				cadetes.add(cadete);
			}
		}
		catch(SQLException errorLoadCadete){
			errorLoadCadete.printStackTrace();
			System.out.println("ERROR EN LOAD CADETE");
		}
		return cadetes;
	}
	
	public Cadete loadCadete(){
		ConexionDB conexion = ConexionDB.getInstance();
		ResultSet r = conexion.query("SELECT * FROM cadetes WHERE id=6;");
		
		Cadete Cadete = new Cadete();
		try{
			while(r.next()){
				Cadete.setId((int) r.getObject("id"));
				Cadete.setNombre((String) r.getObject("nombre"));
				Cadete.setApellidos((String) r.getObject("apellidos"));
				Cadete.setEdad((int) r.getObject("edad"));
				Cadete.setNacionalidad((String) r.getObject("nacionalidad"));
				Cadete.setEquipo((int) r.getObject("equipo"));
			}
		}
		catch(SQLException errorLoadCadete){
			errorLoadCadete.printStackTrace();
			System.out.println("ERROR EN LOAD  CADETE");
		}
		return Cadete;
	}
}
