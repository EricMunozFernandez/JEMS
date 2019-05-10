DROP TRIGGER TRIG_SUELDOTOTALEQUIPO;

CREATE OR REPLACE TRIGGER TRIG_SUELDOTOTALEQUIPO
  AFTER INSERT OR UPDATE ON JUGADOR
    DECLARE
      EQUIPO_SALARIO NUMBER;
    BEGIN    
      SELECT SUM(SUELDO) INTO EQUIPO_SALARIO FROM JUGADOR WHERE EQUIPO_COD_EQUIPO=PAQUETE_MUTANTE.CODIGOEQUIPO;  --AQUI CALCULAMOS LA SUMA DEL SALARIO DE LOS YA EXISTENTES MIEMBROS DEL EQUIPO
      EQUIPO_SALARIO:=EQUIPO_SALARIO+PAQUETE_MUTANTE.SUELDOJUGADOR;--Y AQUI LE SUMAMOS A ESO EL SALARIO DEL NUEVO MIEMBRO
      IF EQUIPO_SALARIO > 200000 --SI LA SUMA DE LOS TOTALES ES MAYOR A 200000 ENTONCES
        THEN RAISE_APPLICATION_ERROR(-20007,'UN EQUIPO NO PUEDE TENER MAS DE 200.000� DE PRESUPUESTO');  --SALTA LA EXCEPCION        
      END IF;     
END;

/

DROP TRIGGER TRIG_MAXEQUIPOS;
CREATE OR REPLACE TRIGGER TRIG_MAXEQUIPOS--ESTE TRIGGER LIMITARA LA CANTIDAD DE EQUIPOS PARA PREVENIR FUTUROS PROBLEMAS
BEFORE INSERT OR UPDATE OR DELETE ON EQUIPO
FOR EACH ROW
DECLARE
  CONT NUMBER; --VARIABLE EN LA QUE VAMOS A CONTAR LOS EQUIPOS CREADOS
  BEGIN
    SELECT COUNT(COD_EQUIPO) --SELET PARA CONTAR LOS EQUIPOS CREADOS
      INTO CONT FROM EQUIPO; -- LO GUARDAMOS EN LA VARIABLE
      IF CONT > 6 --SI ES MAYOR QUE 6
        THEN RAISE_APPLICATION_ERROR(-20001,'NO PUEDE HABER MAS DE 6 EQUIPOS');
        ELSE
          IF CONT < 6
            THEN INSERT INTO EQUIPO VALUES (:NEW.COD_EQUIPO,:NEW.NOMBRE,:NEW.NACIONALIDAD,:NEW.PRESUPUESTO,:NEW.DUE�O_COD_CUENTA,:NEW.PUNTUACION);
          END IF;     
      END IF;
END;