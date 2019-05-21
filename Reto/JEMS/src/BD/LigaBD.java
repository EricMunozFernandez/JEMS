/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import UML.Liga;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

/**
 * Clase de Liga de base de datos.
 *
 * @author Eric Muñoz
 *
 *@see Liga
 *
 * @version %I%, %G%
 * @since 1.0
 *
 */
public class LigaBD {

    /**
     * Creacion de los atributos bdr, resultado y l.
     *
     */
    private static Bdr bdr;
    private static ResultSet resultado;
    private static Liga l;

    /**
     * Constructor de JugadorBD con el objeto de la conexión a la base de datos.
     *
     */
    public LigaBD() {
        bdr = new Bdr();
    }

    /**
     * Funcion que ejecuta el procedimiento GENERAR_CALENDARIO.
     *
     * @param fechaInicioLiga (requerido) fecha de inicio de la Liga
     * @return devuelve un string con el mensaje de la creacion de la Liga
     * @throws Exception hereda excepciones
     */
    public String crearLigaVacia(Date fechaInicioLiga) throws Exception {
        java.sql.Date sDate = convertUtilToSql(fechaInicioLiga);
        bdr.conectar();
        CallableStatement cStmt = bdr.getCon().prepareCall("{call PAQ_PROC_FUN.GENERAR_CALENDARIO(?)}");
        cStmt.setDate(1, sDate);
        cStmt.executeUpdate();
        String mensaje = "";
        ResultSet rs = (ResultSet) cStmt.getResultSet();
        while (rs.next()) {
            mensaje = "Liga vacia creada";
        }
        rs.close();
        cStmt.close();
        bdr.cerrarCon();
        return mensaje;
    }

    /**
     * Transformar java date a sql date.
     *
     * @param fechaInicioLiga fecha del inicio de la liga
     * @return devuelve la fecha en sql date
     */
    private java.sql.Date convertUtilToSql(java.util.Date fechaInicioLiga) {
        java.sql.Date sDate = new java.sql.Date(fechaInicioLiga.getTime());
        return sDate;
    }

    /**
     * busca en la base de datos la Liga.
     *
     * @return devuelve una
     * @throws Exception
     */
    public Liga consultarLiga() throws Exception {
        bdr.conectar();
        Statement sentencia = bdr.getCon().createStatement();
        resultado = sentencia.executeQuery("SELECT COD_LIGA,NOMBRE,FECHA_INICIO,FECHA_FIN,ESTADO FROM LIGA");
        while (resultado.next()) {
            l = crearObjeto();
        }
        bdr.cerrarCon();
        return l;
    }

    /**
     * crear un objeto tipo Liga.
     *
     * @return devuelve un objeto Liga
     * @throws Exception hereda excepciones
     */
    public Liga crearObjeto() throws Exception {
        l = new Liga();
        l.setNombre(resultado.getString("NOMBRE"));
        l.setFecha_inicio(resultado.getDate("FECHA_INICIO"));
        l.setFecha_fin(resultado.getDate("FECHA_FIN"));
        l.setEstado(resultado.getBoolean("ESTADO"));
        return l;
    }
}
