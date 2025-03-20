package com.proyecto.main;

import com.proyecto.dao.UsuarioDAO;
import com.proyecto.modelo.Usuario;

public class Main {
    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        // Insertar un nuevo usuario
        Usuario nuevoUsuario = new Usuario("Juan Perez", "juan@example.com");
        usuarioDAO.insertarUsuario(nuevoUsuario);

        // Listar usuarios
        System.out.println("Lista de usuarios:");
        usuarioDAO.listarUsuarios().forEach(usuario -> {
            System.out.println("ID: " + usuario.getId() + ", Nombre: " + usuario.getNombre() + ", Email: " + usuario.getEmail());
        });

        // Actualizar un usuario
        Usuario usuarioActualizar = new Usuario("Juan Perez Actualizado", "juan_actualizado@example.com");
        usuarioActualizar.setId(3); // Suponiendo que el ID del usuario a actualizar es 1
        usuarioDAO.actualizarUsuario(usuarioActualizar);

        // Eliminar un usuario
        usuarioDAO.eliminarUsuario(2); // Suponiendo que el ID del usuario a eliminar es 1
    }
}