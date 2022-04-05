
CREATE TABLE UF8_1_FORMULA_1 (
	ANIO NUMBER(4) CONSTRAINT FOR_1_ANIO_PK PRIMARY KEY,
	PILOTO_CAMPEON VARCHAR2(30) CONSTRAINT FOR_1_PIL_CAM_NN NOT NULL,
	EQUIPO_CAMPEON VARCHAR2(30) CONSTRAINT FOR_1_EQU_CAM_NN NOT NULL
);

BEGIN
INSERT INTO UF8_1_FORMULA_1 
VALUES (2016, 'Nico Rosberg', 'Mercedes');
INSERT INTO UF8_1_FORMULA_1 
VALUES (2015, 'Lewis Hamilton', 'Mercedes');
INSERT INTO UF8_1_FORMULA_1 
VALUES (2014, 'Lewis Hamilton', 'Mercedes');
INSERT INTO UF8_1_FORMULA_1 
VALUES (2013, 'Sebastian Vettel', 'Red Bull Renault');
INSERT INTO UF8_1_FORMULA_1 
VALUES (2012, 'Sebastian Vettel', 'Red Bull Renault');
INSERT INTO UF8_1_FORMULA_1 
VALUES (2011, 'Sebastian Vettel', 'Red Bull Renault');
INSERT INTO UF8_1_FORMULA_1 
VALUES (2010, 'Sebastian Vettel', 'Red Bull Renault');
INSERT INTO UF8_1_FORMULA_1 
VALUES (2009, 'Jenson Button', 'BrawnGP');
INSERT INTO UF8_1_FORMULA_1 
VALUES (2008, 'Lewis Hamilton', 'Ferrari');
INSERT INTO UF8_1_FORMULA_1 
VALUES (2007, 'Kimi Raikkonen', 'Ferrari');
INSERT INTO UF8_1_FORMULA_1 
VALUES (2006, 'Fernando Alonso', 'Renault');
INSERT INTO UF8_1_FORMULA_1 
VALUES (2005, 'Fernando Alonso', 'Renault');
END;

--EJERCICIO 1

/*Crea un bloque PLSQL al que se le pasa un año. Ese año ha tenido un 
campeón de F1. Se trata de que el programa diga cuál ha sido el piloto 
campeón de Fórmula 1 de ese año y el equipo campeón, según el año 
que introduzca el usuario: 
Crea la tabla y rellénala para realizar el ejercicio.
*/

CREATE OR REPLACE PROCEDURE CAMPEON_F1(p_anio UF8_1_FORMULA_1.ANIO%TYPE)
AS
	v_piloto UF8_1_FORMULA_1.PILOTO_CAMPEON%TYPE;
	v_equipo UF8_1_FORMULA_1.EQUIPO_CAMPEON%TYPE;
BEGIN
	SELECT PILOTO_CAMPEON, EQUIPO_CAMPEON INTO v_piloto, v_equipo
	FROM UF8_1_FORMULA_1
	WHERE ANIO = p_anio;
	
	DBMS_OUTPUT.PUT_LINE('En el año ' || p_anio || ' ganó el piloto ' || v_piloto);
	DBMS_OUTPUT.PUT_LINE(' y el equipo ' || v_equipo);
	
EXCEPTION
	WHEN NO_DATA_FOUND THEN
		RAISE_APPLICATION_ERROR(-20202, 'ERROR: No existen datos para el año indicado');
END;


--EJERCICIO 2

/*Crea un bloque PLSQL que muestre la fecha del sistema de la siguiente 
manera: 
La fecha de hoy es <<día>> de <<mes>> de <<año>> 
La hora es: <<hora>> 
Los minutos son: <<minutos>> 
Los segundos son: <<segundos>> 
*/

DECLARE

    v_dia VARCHAR2(2);
    v_mes VARCHAR2(3);
    v_anio VARCHAR2(4);
    v_hora VARCHAR2(2);
    v_minutos VARCHAR2(2);
    v_segundos VARCHAR2(2);

BEGIN
    SELECT TO_CHAR(SYSDATE, 'DD'), TO_CHAR(SYSDATE, 'MM'), TO_CHAR(SYSDATE, 'YYYY'),
    TO_CHAR(SYSDATE, 'HH24'), TO_CHAR(SYSDATE, 'MI'), TO_CHAR(SYSDATE, 'SS')
    INTO v_dia, v_mes, v_anio, v_hora, v_minutos, v_segundos
    FROM DUAL;

    DBMS_OUTPUT.PUT_LINE('La fecha de hoy es ' || v_dia || ' de ' || v_mes || ' de ' || v_anio);
    DBMS_OUTPUT.PUT_LINE('La hora es: ' || v_hora || ':' || v_minutos || ':' || v_segundos);

END;

--EJERCICIO 3

/*Crea un bloque PLSQL que muestre el área y el perímetro de rectángulo 
conociendo un lado de la figura. 
El mensaje de salida será: 
El área del rectángulo es <<área>> cm2 
El perímetro del rectángulo es <<perímetro>> cm 
*/
