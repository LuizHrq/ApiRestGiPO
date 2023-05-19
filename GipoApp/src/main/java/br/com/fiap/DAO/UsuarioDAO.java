package br.com.fiap.DAO;

import java.util.ArrayList;
import java.util.List;

//import br.com.fiap.resource.EnderecoTO;
import br.com.fiap.resource.UsuarioTO;

public class UsuarioDAO {
	
	public static List<UsuarioTO> listaDeUsuario;
	
	//METODO PARA CRIAR NOVOS USUARIOS
	public UsuarioDAO() {
		if(listaDeUsuario == null) {
			listaDeUsuario = new ArrayList<UsuarioTO>();
			
			
			UsuarioTO uto = new UsuarioTO();
//			
			//usuario1
			uto.setIdUsuario(1);
			uto.setIdFase(1);
			uto.setNome("Luiz Nascimento");
			uto.setCpf("444.222.333-11");
			uto.setEmail("luiz@gmail.com");
			uto.setSenha("123456789");
			uto.setConfirmaSenha("123456789");
			
			listaDeUsuario.add(uto);
			
			//usuario2
			uto = new UsuarioTO();
			uto.setIdUsuario(2);
			uto.setIdFase(1);
			uto.setNome("Samuel Enderson");
			uto.setCpf("999.999.999-11");
			uto.setEmail("samuel@gmail.com");
			uto.setSenha("123456789");
			uto.setConfirmaSenha("123456789");
			listaDeUsuario.add(uto);
	
			//usuario3
			uto = new UsuarioTO();
			uto.setIdUsuario(3);
			uto.setIdFase(1);
			uto.setNome("Murilo");
			uto.setCpf("171.171.171-13");
			uto.setEmail("murilol@gmail.com");
			uto.setSenha("123456789");
			uto.setConfirmaSenha("123456789");
			listaDeUsuario.add(uto);
			
			//usuario2
			uto = new UsuarioTO();
			uto.setIdUsuario(4);
			uto.setIdFase(1);
			uto.setNome("Eduardo");
			uto.setCpf("444.444.444-44");
			uto.setEmail("eduardo@gmail.com");
			uto.setCpf("444.444.444-44");
			uto.setSenha("123456789");
			uto.setConfirmaSenha("123456789");
			listaDeUsuario.add(uto);
		}
	}
	
	//SELECT ALL
	public List<UsuarioTO> select(){
		return listaDeUsuario;
	}
	
	//SELECT USUARIO BY ID
	public UsuarioTO select (int id) {
		for(int i = 1; i < listaDeUsuario.size(); i++) {
			if(listaDeUsuario.get(i).getIdUsuario() == id) {
				return listaDeUsuario.get(i);
			}
		}
		return null;
	}
	
	//INSERT USUARIO
	public boolean insert(UsuarioTO uto) {
		uto.setIdUsuario(listaDeUsuario.size() + 1);
		return listaDeUsuario.add(uto);
	}
	
	//UPDATE USUARIO
	public void update(UsuarioTO uto) {
	    UsuarioTO usuarioEncontrado = select(uto.getIdUsuario());

	    usuarioEncontrado.setNome(uto.getNome());
	    usuarioEncontrado.setCpf(uto.getCpf());
	    usuarioEncontrado.setEmail(uto.getEmail());
	    usuarioEncontrado.setSenha(uto.getSenha());
	    usuarioEncontrado.setConfirmaSenha(uto.getConfirmaSenha());
	    
	}

	//DELETE
	public void delete(int id) {
		listaDeUsuario.remove(select (id));
	}
}

















