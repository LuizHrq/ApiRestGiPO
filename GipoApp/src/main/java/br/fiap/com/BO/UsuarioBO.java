package br.fiap.com.BO;

import java.util.*;

import br.com.fiap.DAO.UsuarioDAO;
import br.com.fiap.resource.UsuarioTO;

public class UsuarioBO {
	
	private UsuarioDAO ud;
	
	//LISTA DE USUARIO
	public List<UsuarioTO>listar(){
		ud = new UsuarioDAO();
		return ud.select();
	}
	
	
	//TRATAR O METODO SELECT
	public UsuarioTO listar(int id) {
		ud = new UsuarioDAO();
		return ud.select(id);
	}
	
	//TRATAR O METODO INSERT
	public boolean cadastrar(UsuarioTO uto) {
		ud = new UsuarioDAO();
		return ud.insert(uto);
	}
	
	//TRATAR O METODO UPDATE
	public void atualiza(UsuarioTO uto) {
		ud = new UsuarioDAO();
		ud.update(uto);
	}
	
	//TRATAR O METODO DELETE
	public void remover(int id) {
		ud = new UsuarioDAO();
		ud.delete(id);
	}

}
