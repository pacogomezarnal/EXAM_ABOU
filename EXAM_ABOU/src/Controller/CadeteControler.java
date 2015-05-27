package Controller;

import java.util.ArrayList;

import Model.Cadete;
import Model.ModeloCadete;

public class CadeteControler {

	private ModeloCadete mc;
	
	public CadeteControler() {
		// TODO Auto-generated constructor stub
		mc = new ModeloCadete();
	}
	
	public ArrayList<Cadete> loadCadetes(){
		return mc.load();
	}
	
	public Cadete loadCadete(){
		return mc.loadCadete();
	}

}
