/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jems;

/**
 * Controladora de nuestro proyecto JEMS
 * https://www.oracle.com/technetwork/articles/java/index-137868.html
 *
 * @author Sergio Zulueta
 * @author Miguel Barros
 * @author Joel Encinas
 * @author Eric Muñoz
 *
 * @see JEMS
 *
 * @version %I%, %G%
 * @since 1.0
 *
 */
import Vistas.*;
import BD.*;
import UML.*;
import java.util.ArrayList;

public class JEMS {

    static V_Registrar v = new V_Registrar();
    private static ArrayList<Equipo> listaEquipos;
    private static ArrayList<Dueño> dueños;
    private static DueñoBD dBD;
    private static JugadorBD jBD;
    private static EquipoBD eBD;
    private static UsuarioBD uBD;
    private static Dueño d;
    private static Equipo e;
    private static Jugador j;
    private static Usuario u;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        dBD = new DueñoBD();
        jBD = new JugadorBD();
        eBD = new EquipoBD();
        dBD = new DueñoBD();
        uBD = new UsuarioBD();
        v.setVisible(true);

    }

    /**
     * Funcion para dar de alta a un jugador.
     *
     * @param nombre (requerido) nombre del jugador
     * @param apellido (requerido) apellido del jugador
     * @param nick (requerido) nickname del jugador
     * @param sueldo (requerido) sueldo del jugador
     * @param nacionalidad (requerido) nacionalidad del jugador
     * @param estado (requerido) estado del jugador
     * @param telefono (requerido) telefono del jugador
     * @param equipo (requerido) equipo del jugador
     * @throws Exception hereda excepciones
     */
    public static void altaJugador(String nombre, String apellido, String nick, int sueldo, String nacionalidad, String estado, String telefono, int equipo) throws Exception {
        j = new Jugador();
        j.setNombre(nombre);
        j.setApellido(apellido);
        j.setNickname(nick);
        j.setSueldo(sueldo);
        j.setNacionalidad(nacionalidad);
        j.setEstado(estado);
        j.setTelefono(telefono);
        e = eBD.consultarEquipoCodigo(equipo);
        j.setEquipo(e);
        jBD.insertarJugador(j);
    }

    /**
     * Un Get para el numero de equipos que hay.
     *
     * @return listaEquipos lista de tdos los equipos
     */
    public static int getNumeroEquipos() {
        return listaEquipos.size();
    }

    /**
     * un Get de el nombre del equipo de la posicion x
     *
     * @param x (requerido) numero del equipo en el ArrayList
     * @return devuelve el nombre del equipo
     */
    public static String getNombreEquipo(int x) {
        return listaEquipos.get(x).getNombre();
    }

    /**
     * Funcion que llama a la funcion de EquipoBD para rellenar la lista de
     * equipos de la base de datos.
     *
     * @return devuelve la lista de equipos
     * @throws Exception hereda excepciones
     */
    public static ArrayList<Equipo> rellenarListaEquipos() throws Exception {
        listaEquipos = eBD.consultaEquipos();
        return listaEquipos;
    }

    /**
     * Funcion que llama a la funcion de DueñoBD para rellenar la lista de
     * dueños de la base de datos.
     *
     * @return devuelve la lista de dueños
     * @throws Exception hereda excepciones
     */
    public static ArrayList<Dueño> getListaDueños() throws Exception {
        dueños = dBD.consultaTodosDueños();
        return dueños;
    }

    /**
     * Funcion que nos dirije a la clase modificacionJugador situado en
     * JugadorBD para pasarle los`parametros recogidos de la ventana V_Jugador y
     * asi modificar aun jugador ya existente.
     *
     *
     * @param nombre (requerido) nombre del jugador
     * @param apellido (requerido) apellido del jugador
     * @param nick (requerido) nickname del jugador
     * @param sueldo (requerido) sueldo del jugador
     * @param nacionalidad (requerido) nacionalidad del jugador
     * @param estado (requerido) estado del jugador
     * @param telefono (requerido) telefono del jugador
     * @param equipo (requerido) equipo del jugador
     * @throws Exception hereda excepciones
     */
    public static void modificarJugador(String nombre, String apellido, String nick, int sueldo, String nacionalidad, String estado, String telefono, int equipo) throws Exception {
        j = new Jugador();
        j.setNombre(nombre);
        j.setApellido(apellido);
        j.setNickname(nick);
        j.setSueldo(sueldo);
        j.setNacionalidad(nacionalidad);
        j.setEstado(estado);
        j.setTelefono(telefono);
        e = eBD.consultarEquipoCodigo(equipo);
        j.setEquipo(e);
        jBD.modificarJugador(j);
    }

    /**
     * Funcion que nos dirije a la clase bajaJugador situado en JugadorBD para
     * pasarle los`parametros recogidos de la ventana V_Jugador y asi dar de
     * baja a un jugador.
     *
     * @param codJugador (requerido) codigo del jugador a borrar
     * @throws Exception hereda excepciones
     */
    public static void borrarJugador(int codJugador) throws Exception {
        jBD.borrarJugador(codJugador);
    }

    /**
     * Funcion que nos dirije a la clase modificacicarEquipo situado en EquipoBD
     * para pasarle los parametros de la ventana V_Equipo y asi modificar un
     * equipo.
     *
     * @param nombre (requerido) nombre del equipo
     * @param nacionalidad (requerido) nacionalidad del equipo
     * @param presupuesto (requerido) presupuesto del equipo
     * @param puntuacion (requerido) puntuacion del equipo
     * @param dueño (requerido) dueño del equipo
     * @throws Exception hereda excepciones
     */
    public static void modificarEquipo(String nombre, String nacionalidad, int presupuesto, int puntuacion, int dueño) throws Exception {
        d = dBD.consultarDueñoCodigo(dueño);
        e = new Equipo(nombre, nacionalidad, presupuesto, puntuacion, d);
        eBD.modificarEquipo(e);
    }

    /**
     * Funcion que nos dirije a la clase insertarEquipo situada en EquipoBD para
     * pasarle los parametros de la ventana V_Equipo y asi añadir un equipo
     * nuevo.
     *
     * @param nombre (requerido) nombre del equipo
     * @param nacionalidad (requerido) nacionalidad del equipo
     * @param presupuesto (requerido) presupuesto del equipo
     * @param puntuacion (requerido) puntuacion del equipo
     * @param dueño (requerido) dueño del equipo
     * @throws Exception hereda excepciones
     */
    public static void altaEquipo(String nombre, String nacionalidad, int presupuesto, int puntuacion, int dueño) throws Exception {
        d = dBD.consultarDueñoCodigo(dueño);
        e = new Equipo(nombre, nacionalidad, presupuesto, puntuacion, d);
        eBD.insertarEquipo(e);
    }

    /**
     * Funcion que nos dirije a la clase borrarEquipo situada en EquipoBD para
     * pasarle los parametros de la ventana V_Equipo y asi borrar a un equipo ya
     * existente.
     *
     * @param codEquipo (requerido) codigo equipo
     * @throws Exception hereda excepciones
     */
    public static void bajaEquipo(int codEquipo) throws Exception {
        eBD.borrarEquipo(codEquipo);
    }

    /**
     * Funcion que nos dirije a la clase modificarDueño situada en DueñoBD para
     * pasarle los parametros de la ventana V_Dueño y asi modificar un dueño ya
     * existente.
     *
     * @param nombre (requerido) nombre del dueño
     * @param apellido (requerido) apellido del dueño
     * @param telefono (requerido) telefono del dueño
     * @throws Exception hereda excepciones
     */
    public static void modificarDueño(String nombre, String apellido, String telefono) throws Exception {
        d = new Dueño();
        d.setNombre(nombre);
        d.setApellido(apellido);
        d.setTelefono(telefono);
        dBD.modificarDueño(d);
    }

    /**
     * Funcion que nos dirije a la clase insertarDueño situada en DueñoBD para
     * pasarle los parametros de la ventana V_Dueño y asi dar de alta a un nuevo
     * dueño.
     *
     * @param nombre (requerido) nombre del dueño
     * @param apellido (requerido) apellido del dueño
     * @param telefono (requerido) telefono del dueño
     * @throws Exception hereda excepciones
     */
    public static void altaDueño(String nombre, String apellido, String telefono) throws Exception {
        d = new Dueño();
        d.setNombre(nombre);
        d.setApellido(apellido);
        d.setTelefono(telefono);
        dBD.insertarDueño(d);
    }

    /**
     * Funcion que nos dirije a la clase borrarDueño situada en DueñoBD para
     * pasarle los parametros de la ventana V_Dueño y asi borrar a un dueño ya
     * existente.
     *
     * @param codDueño (requerido) codigo del dueño
     * @throws Exception
     */
    public static void bajaDueño(int codDueño) throws Exception {
        dBD.borrarDueño(codDueño);
    }

    /**
     * Funcion que nos dirije a la clase modificarUsuario situada en UsuarioBD
     * para pasarle los parametros de la ventana V_Usuario y asi modificar un
     * usuario ya existente.
     *
     * @param usuario (requerido) usuario del usuario
     * @param contraseña (requerido) contraseñoa del usuario
     * @throws Exception hereda excepciones
     */
    public static void modificarUsuario(String usuario, String contraseña) throws Exception {
        u = new Usuario();
        u.setUsuario(usuario);
        u.setContraseña(contraseña);
        uBD.modificarUsuario(u);
    }

    /**
     * Funcion que nos dirije a la clase insertarUsuario situada en UsuarioBD
     * para pasarle los parametros de la ventana V_Dueño y asi dar de alta a un
     * nuevo usuario.
     *
     * @param usuario (requerido) usuario del usuario
     * @param contraseña (requerido) contraseñoa del usuario
     * @throws Exception hereda excepciones
     */
    public static void altaUsuario(String usuario, String contraseña) throws Exception {
        u = new Usuario();
        u.setUsuario(usuario);
        u.setContraseña(contraseña);
        uBD.insertarUsuario(u);
    }

    /**
     * Funcion que nos dirije a la clase borrarUsuario situada en UsuarioBD para
     * pasarle los parametros de la ventana V_Usuario y asi borrar a un usuario
     * ya existente.
     *
     * @param codUsuario (requerido) codigo del usuario
     * @throws Exception hereda excepciones
     */
    public static void bajaUsuario(int codUsuario) throws Exception {
        uBD.borrarUsuario(codUsuario);
    }

    /**
     * Funcion para buscar en la base de datos todos los usuarios.
     *
     * @return listaUsuariosTemp lista de los usuarios
     * @throws Exception hereda excepciones
     */
    public static ArrayList<Usuario> conseguirDatosUsuarios() throws Exception {
        UsuarioBD ubd = new UsuarioBD();
        ArrayList<Usuario> listaUsuariosTemp = ubd.consultaTodosUsuarios();
        return listaUsuariosTemp;
    }

}
