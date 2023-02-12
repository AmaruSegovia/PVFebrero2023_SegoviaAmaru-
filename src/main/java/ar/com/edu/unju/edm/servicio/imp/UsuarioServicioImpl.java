package ar.com.edu.unju.edm.servicio.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.edu.unju.edm.repositorio.UsuarioRepositorio;
import ar.com.edu.unju.edm.servicio.UsuarioServicio;
import ar.com.edu.unju.edm.usuario.Usuario;

@Service
public class UsuarioServicioImpl implements UsuarioServicio {

	@Autowired
	private UsuarioRepositorio repositorio;

	public List<Usuario> listarTodosLosUsuarios() {
		return repositorio.findAll();
	}

	@Override
	public Usuario guardarUsuario(Usuario usuario) {
		return repositorio.save(usuario);
	}

	@Override
	public Usuario obtenerUsuarioporId(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Usuario actualizarUsuario(Usuario usuario) {
		return repositorio.save(usuario);
	}

	@Override
	public void eliminarUsuario(Long id) {
		repositorio.deleteById(id);
	}

}
