CREATE OR REPLACE PROCEDURE GENERAR_CALENDARIO( dia NUMBER, mes NUMBER, a�o NUMBER)
IS 
v_fecha DATE;
v_dia NUMBER;
v_mes NUMBER;
v_a�o NUMBER := 2019;

BEGIN 
    LOOP
        v_fecha := TO_DATE(dia || '/' || mes || '/' || a�o, 'dd/mm/yyyy');
        dia := dia + 1;
        IF dia = 30 THEN
            mes := mes + 1;
            IF mes = 12 THEN
                a�o := a�o + 1;
                END IF;
        end if;
    END LOOP;
END GENERAR_CALENDARIO;