/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import UML.*;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
//import java.sql.Types;
import java.util.ArrayList;
import oracle.jdbc.OracleTypes;

/**
 * Clase de equipo de base de datos
 *
 * @author Joel Encinas
 * @author Eric Muñoz
 * @author Sergio Zulueta
 * @author Miguel Barros
 *
 * @see Jugador
 *
 * @version %I%, %G%
 * @since 1.0
 *
 */
public class EquipoBD {

    /**
     * Creacion de los atributos bdr, resultado y listaEquipos.
     */
    private static Bdr bdr;
    private ResultSet resultado;
    private String listaEquipos;

    public EquipoBD() {
        bdr = new Bdr();
    }

    /**
     *
     * @param e objeto de clase Equipo.
     * @throws Exception hereda excepciones
     */
    public void insertarEquipo(Equipo e) throws Exception {
        bdr.conectar();
        String plantilla = "INSERT INTO EQUIPO (NOMBRE,NACIONALIDAD,PRESUPUESTO,DUEÑO_COD_DUEÑO,PUNTUACION)VALUES(?,?,?,?,?)";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1, e.getNombre());
        sentenciaPre.setString(2, e.getNacionalidad());
        sentenciaPre.setInt(3, e.getPresupuesto());
        sentenciaPre.setInt(4, e.getDueño().getCod_dueño());
        sentenciaPre.setInt(5, e.getPuntuacion());
        sentenciaPre.executeUpdate();
        bdr.cerrarCon();

    }

    /**
     * Función que borra un equipo de la base de datos.
     *
     * @param cod_equipo (requerido) codigo del Equipo.
     * @throws Exception hereda excepciones.
     */
    public void borrarEquipo(int cod_equipo) throws Exception {
        bdr.conectar();

        String plantilla = "DELETE FROM EQUIPO WHERE COD_EQUIPO= ?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setInt(1, cod_equipo);

        sentenciaPre.executeUpdate();

        bdr.cerrarCon();
    }

    /**
     * Función para modificar un equipo.
     *
     * @param e (requerido) objeto de clase Equipo.
     * @throws Exception heredar excepciones
     */
    public void modificarEquipo(Equipo e) throws Exception {
        bdr.conectar();

        String plantilla = "UPDATE EQUIPO SET NOMBRE=?, NACIONALIDAD=?, PRESUPUESTO=?, DUEÑO_COD_DUEÑO=?, PUNTUACION=? WHERE COD_EQUIPO=?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1, e.getNombre());
        sentenciaPre.setString(2, e.getNacionalidad());
        sentenciaPre.setInt(3, e.getPresupuesto());
        sentenciaPre.setInt(4, e.getDueño().getCod_dueño());
        sentenciaPre.setInt(5, e.getPresupuesto());
        sentenciaPre.setInt(6, e.getCod_equipo());

        sentenciaPre.executeUpdate();

        bdr.cerrarCon();
    }

    /**
     * Funcion para buscar un equipo mediante el codigo.
     *
     * @param cod_equipo codigo del equipo
     * @return e objeto de clase Equipo
     * @throws Exception hereda excepciones
     */
    public Equipo consultarEquipoCodigo(int cod_equipo) throws Exception {
        bdr.conectar();
        String plantilla = "SELECT * FROM EQUIPO WHERE COD_EQUIPO= ?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setInt(1, cod_equipo);
        resultado = sentenciaPre.executeQuery();
        Equipo e;
        if (resultado.next()) {
            e = crearObjeto();
        } else {
            e = null;
        }

        // Cerrar la conexión
        bdr.cerrarCon();
        return e;
    }

    /**
     * Función que rellena un objeto equipo desde los datos de la base de datos.
     *
     * @return devuelve un objeto de clase Equipo.
     * @throws Exception hereda excepciones.
     */
    public Equipo crearObjeto() throws Exception {
        Equipo e = new Equipo();
        e.setCod_equipo(resultado.getInt("COD_EQUIPO"));
        e.setNombre(resultado.getString("NOMBRE"));
        e.setNacionalidad(resultado.getString("NACIONALIDAD"));
        e.setPresupuesto(Integer.parseInt(resultado.getString("PRESUPUESTO")));
        e.setPuntuacion(Integer.parseInt(resultado.getString("PUNTUACION")));
        DueñoBD dBD = new DueñoBD();
        Dueño d = dBD.consultarDueñoCodigo(resultado.getInt("DUEÑO_COD_DUEÑO"));
        e.setDueño(d);
        //e.setLista_jugadores(lista_jugadores);
        //e.setLista_partidos(lista_partidos);

        return e;
    }

    /**
     * Función que rellena un objeto equipo desde los datos de la base de datos.
     *
     * @return devuelve un objeto de clase Equipo.
     * @throws Exception hereda excepciones.
     */
    public Equipo crearObjetoConListas() throws Exception {
        ArrayList<Jugador> listaJugadoresEquipo = new ArrayList();
        ArrayList<Partido> listaPartidos = new ArrayList();
        Equipo e = new Equipo();

        e.setNombre(resultado.getString("NOMBRE"));
        e.setNacionalidad(resultado.getString("NACIONALIDAD"));
        e.setPresupuesto(Integer.parseInt(resultado.getString("PRESUPUESTO")));
        e.setPuntuacion(Integer.parseInt(resultado.getString("PUNTUACION")));
        DueñoBD dBD = new DueñoBD();
        Dueño d = dBD.consultarDueñoCodigo(resultado.getInt("DUEÑO_COD_DUEÑO"));
        e.setDueño(d);
        JugadorBD jBD = new JugadorBD();
        listaJugadoresEquipo = jBD.consultaTodosJugadores();
        e.setLista_jugadores(listaJugadoresEquipo);
        //e.setLista_partidos(lista_partidos);

        return e;
    }

    /**
     * Función que crea un ArrayList con todos los equipos de la base de datos.
     *
     * @return devuelve un ArrayList de Equipo.
     * @throws Exception hereda excepciones.
     */
    public ArrayList<Equipo> consultaEquipos() throws Exception {
        ArrayList<Equipo> listaEquipos = new ArrayList();

        bdr.conectar();

        Statement sentencia = bdr.getCon().createStatement();
        resultado = sentencia.executeQuery("SELECT * FROM EQUIPO");
        while (resultado.next()) {
            listaEquipos.add(crearObjeto());
        }
        bdr.cerrarCon();
        return listaEquipos;
    }

    /**
     * Función que crea un ArrayList con todos los equipos de la base de datos
     * de un dueño.
     *
     * @param cod_dueño codigo del dueño
     * @return devuelve un ArrayList de Equipo.
     * @throws Exception hereda excepciones.
     */
    public ArrayList<Equipo> consultaEquiposCodDueño(int cod_dueño) throws Exception {
        ArrayList<Equipo> listaEquipos = new ArrayList();

        bdr.conectar();
        String plantilla = "SELECT * FORM EQUIPO WHERE DUEÑO_COD_DUEÑO=?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setInt(1, cod_dueño);
        sentenciaPre.executeUpdate();
        while (resultado.next()) {
            listaEquipos.add(crearObjeto());
        }
        bdr.cerrarCon();
        return listaEquipos;
    }

    /**
     * Funcion que ejecuta el procedimiento PROC_REF_EQUIPO.
     *
     * @return devuelve un string con todos los equipos con el nombre de su
     * dueño y la cantidad de jugadores
     * @throws Exception hereda excepciones
     */
    public String consultarTodosEquipos() throws Exception {
        bdr.conectar();
        CallableStatement cStmt = bdr.getCon().prepareCall("{call PAQ_PROC_FUN.PROC_REF_EQUIPO(?)}");
        cStmt.registerOutParameter(1, OracleTypes.CURSOR);
        cStmt.executeUpdate();
        ResultSet rs = (ResultSet) cStmt.getObject(1);
        
        while (rs.next());
        {
            listaEquipos += "Codigo: " + rs.getInt("COD_EQUIPO");
            listaEquipos += "Nombre: " + rs.getString("NOMBRE");
            listaEquipos += "Nacionalidad: " + rs.getString("NACIONALIDAD");
            listaEquipos += "Presupuesto: " + rs.getInt("PRESUPUESTO");
            listaEquipos += "Puntuacion: " + rs.getInt("PUNTUACION");
            listaEquipos += "Codigo dueño: " + rs.getInt("CODIGO_DUEÑO");
            listaEquipos += "Nombre dueño: " + rs.getString("NOMBRE_DUEÑO");
            listaEquipos += "Numero jugadores " + rs.getInt("NUM_JUGADORES") + "\n";
        }
        
        rs.close();
        cStmt.close();
        bdr.cerrarCon();
        return listaEquipos;
    }

    /**
     * Funcion para buscar todos los equipos por orden de puntuacion.
     *
     * @return e objeto de clase Equipo
     * @throws Exception hereda excepciones
     */
    public ArrayList<Equipo> consultarEquipoOrderPuntuacion() throws Exception {
        bdr.conectar();
        ArrayList<Equipo> listaEquipos = new ArrayList<Equipo>();
        String plantilla = "SELECT * FROM EQUIPO ORDER BY PUNTUACION DESC";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        resultado = sentenciaPre.executeQuery();
        Equipo e;
        if (resultado.next()) {
            e = crearObjeto();
            listaEquipos.add(e);
        } else {
            e = null;
        }

        // Cerrar la conexión
        bdr.cerrarCon();
        return listaEquipos;
    }

    public String rellenarLigaEquipos() throws Exception {
        bdr.conectar();
        CallableStatement cStmt = bdr.getCon().prepareCall("{call PAQ_PROC_FUN.PROC_REF_EQUIPO(?)}");
        cStmt.registerOutParameter(1, OracleTypes.CURSOR);
        cStmt.executeUpdate();
        ResultSet rs = (ResultSet) cStmt.getObject(1);
        while (rs.next());
        {
            listaEquipos += "Nombre: " + rs.getString("NOMBRE");
            listaEquipos += "Puntuacion: " + rs.getString("PUNTUACION") + "\n";
        }
        rs.close();
        cStmt.close();
        bdr.cerrarCon();
        return listaEquipos;

    }
    public Equipo buscarCodigoPorNombre(String nomEquipo) throws Exception {
        bdr.conectar();
        String plantilla = "SELECT COD_EQUIPO FROM EQUIPO WHERE NOMBRE = ?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1, nomEquipo);
        resultado = sentenciaPre.executeQuery();
        Equipo e;
        if (resultado.next()) {
            e = crearObjeto();
        } else {
            e = null;
        }
        // Cerrar la conexión
        bdr.cerrarCon();
        return e;
    }
    public void modificarPuntuacion(Equipo e) throws Exception {
        bdr.conectar();

        String plantilla = "UPDATE EQUIPO SET PUNTUACION = PUNTUACION + 3 WHERE COD_EQUIPO = ?";
        PreparedStatement sentenciaPre = bdr.getCon().prepareStatement(plantilla);
        sentenciaPre.setInt(1, e.getCod_equipo());

        sentenciaPre.executeUpdate();

        bdr.cerrarCon();
    }
}
