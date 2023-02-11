package ar.com.edu.unju.edm.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ar.com.edu.unju.edm.servicio.UsuarioServicio;
import ar.com.edu.unju.edm.usuario.Usuario;

@Controller
public class UsuarioControlador {

	@Autowired
	private UsuarioServicio servicio;

	@GetMapping({ "usuarios", "/" })
	public String listarUsuarios(Model modelo) {
		modelo.addAttribute("usuarios", servicio.listarTodosLosUsuarios());
		return "usuarios";
	}

	@GetMapping({ "usuarios/nuevo" })
	public String crearUsuarioFormulario(Model modelo) {
		Usuario usuario = new Usuario();
		modelo.addAttribute("usuario", usuario);
		return "crear_usuarios";
	}

	@PostMapping("/usuarios")
	public String guardarUsuarios(@ModelAttribute("usuario") Usuario usuario) {
		servicio.guardarUsuario(usuario);
		return "redirect:/usuarios";
	}

	@GetMapping("/usuarios/editar/{id}")
	public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("usuario", servicio.obtenerUsuarioporId(id));
		return "editar_estudiante";
	}

	@PostMapping("/usuarios/{id}")
	public String actualizarUsuarios(@PathVariable Long id, @ModelAttribute("usuario") Usuario usuario, Model modelo) {
		Usuario usuarioExistente = servicio.obtenerUsuarioporId(id);
		usuarioExistente.setId(id);
		usuarioExistente.setNombre(usuario.getNombre());
		usuarioExistente.setApellido(usuario.getApellido());
		usuarioExistente.setEmail(usuario.getEmail());

		servicio.actualizarUsuario(usuarioExistente);
		return "redirect:/usuarios";
	}

	@GetMapping("/usuarios/{id}")
	public String eliminarUsuario(@PathVariable Long id) {
		servicio.eliminarUsuario(id);
		return "redirect:/usuarios";
	}

}
