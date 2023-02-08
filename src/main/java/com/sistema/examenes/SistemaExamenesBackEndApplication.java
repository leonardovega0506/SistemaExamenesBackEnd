package com.sistema.examenes;

import com.sistema.examenes.modelo.Rol;
import com.sistema.examenes.modelo.Usuario;
import com.sistema.examenes.modelo.UsuarioRol;
import com.sistema.examenes.servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SistemaExamenesBackEndApplication implements CommandLineRunner {

	@Autowired
	private UsuarioService usuarioService;

	public static void main(String[] args) {
		SpringApplication.run(SistemaExamenesBackEndApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
/*
			Usuario usuario = new Usuario();
			usuario.setNombre("Leo");
			usuario.setApellido("Vega");
			usuario.setUsername("admin1");
			usuario.setPassword("12345");
			usuario.setEmail("leo.vega0506@gmail.com");
			usuario.setTelefono("5627696094");
			usuario.setPerfil("foto.png");
			Rol rol = new Rol();
			rol.setRolId(1L);
			rol.setRolNombre("ADMIN");
			Set<UsuarioRol> usuariosRoles = new HashSet<>();
			UsuarioRol usuarioRol = new UsuarioRol();
			usuarioRol.setRol(rol);
			usuarioRol.setUsuario(usuario);
			usuariosRoles.add(usuarioRol);
			Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario,usuariosRoles);
			System.out.println(usuarioGuardado.getUsername());
*/
		}
	}

