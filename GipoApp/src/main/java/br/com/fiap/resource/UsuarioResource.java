package br.com.fiap.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import br.fiap.com.BO.UsuarioBO;



@Path("/usuario")
public class UsuarioResource {
	
	UsuarioBO ub = new UsuarioBO();
	
	//SELECT ALL
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<UsuarioTO> buscar() {
		return ub.listar();
	}
	
	
	//SELECT BY ID
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public UsuarioTO buscar(@PathParam("id") int idUsuario) {
		return ub.listar(idUsuario);
	}

	
	
	//INSERT USUARIO
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(UsuarioTO usuario, @Context UriInfo UriInfo) {
		
		//INSERIR NO BASE
		ub.cadastrar(usuario);
		
		//CONSTRUIR O PATH DE RETORNO
		UriBuilder builder = UriInfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(usuario.getIdUsuario()));
		
		//RETORNA O PATH E STATUS 201
		return Response.created(builder.build()).build();
	}
	
	//UPDATE USUARIO
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualiza(UsuarioTO usuario, @PathParam("id") int id) {
		usuario.setIdUsuario(id);
		ub.atualiza(usuario);
		
		return Response.ok().build();
	}
	
	@DELETE
	@Path("/{id}")
	public void excluir(@PathParam("id") int id) {
		ub.remover(id);
	}
	
}




