SELECT * FROM JUGADOR;

-- CUENTA (CODIGO, NOMBRE, APELLIDO, USUARIO, CONTRASE�A) Y DUE�O (CODIGO, TELEFONO)
INSERT INTO CUENTAS VALUES (AUTO_COD_CUENTA_SEQ.NEXTVAL, 'USER', 'USER', 'USER', 'USER');
INSERT INTO DUE�O VALUES (AUTO_COD_CUENTA_SEQ.CURRVAL, 673910207);
INSERT INTO CUENTAS VALUES (AUTO_COD_CUENTA_SEQ.NEXTVAL, 'ADMIN', 'ADMIN', 'ADMIN', 'ADMIN', 'ADMIN');
INSERT INTO DUE�O VALUES (AUTO_COD_CUENTA_SEQ.CURRVAL, 781201201);
INSERT INTO CUENTAS VALUES (AUTO_COD_CUENTA_SEQ.NEXTVAL, 'MICHAEL' , 'WILHOIT', 'MICH', '123');
INSERT INTO DUE�O VALUES (AUTO_COD_CUENTA_SEQ.CURRVAL, 682912022);
INSERT INTO CUENTAS VALUES (AUTO_COD_CUENTA_SEQ.NEXTVAL, 'GEORGE', 'GRIFFIN', 'GEOR', '000');
INSERT INTO DUE�O VALUES (AUTO_COD_CUENTA_SEQ.CURRVAL, 832723923);
INSERT INTO CUENTAS VALUES (AUTO_COD_CUENTA_SEQ.NEXTVAL, 'DEBBIE', 'HAWKINS', 'DEBB', '12A');
INSERT INTO DUE�O VALUES (AUTO_COD_CUENTA_SEQ.CURRVAL, 743934034);
INSERT INTO CUENTAS VALUES (AUTO_COD_CUENTA_SEQ.NEXTVAL, 'LARRY', 'BONDS', 'LARR', 'ASD');
INSERT INTO DUE�O VALUES (AUTO_COD_CUENTA_SEQ.CURRVAL, 672392393);
INSERT INTO CUENTAS VALUES (AUTO_COD_CUENTA_SEQ.NEXTVAL, 'DARYL', 'CHARLES', 'DARY', 'QWE');
INSERT INTO DUE�O VALUES (AUTO_COD_CUENTA_SEQ.CURRVAL, 812912012);
INSERT INTO CUENTAS VALUES (AUTO_COD_CUENTA_SEQ.NEXTVAL, 'JOHN', 'FLAGG', 'JHON', '999');
INSERT INTO DUE�O VALUES (AUTO_COD_CUENTA_SEQ.CURRVAL, 721912021);
INSERT INTO CUENTAS VALUES (AUTO_COD_CUENTA_SEQ.NEXTVAL, 'WILLIAM', 'COOPER', 'WILL', 'ZXY');
INSERT INTO CUENTAS VALUES (AUTO_COD_CUENTA_SEQ.NEXTVAL, 'JORDAN', 'HARRIS', 'JORD', '12B');

-- EQUIPOS (CODIGO, NOMBRE, NACIONALIDAD, PRESUPUESTO, COD_DUE�O, PUNTUACION)
INSERT INTO EQUIPO VALUES(AUTO_COD_EQUIPO_SEQ.NEXTVAL, 'FNATIC', 'REINO UNIDO', 180000, 01, 0);
INSERT INTO EQUIPO VALUES(AUTO_COD_EQUIPO_SEQ.NEXTVAL, 'G2 ESPORTS', 'ESPA�A', 190000, 01, 0);
INSERT INTO EQUIPO VALUES(AUTO_COD_EQUIPO_SEQ.NEXTVAL, 'ORIGEN', 'ESPA�A', 140000, 01, 0);
INSERT INTO EQUIPO VALUES(AUTO_COD_EQUIPO_SEQ.NEXTVAL, 'SK GAMING', 'ALEMANIA', 155000, 01,  0);
INSERT INTO EQUIPO VALUES(AUTO_COD_EQUIPO_SEQ.NEXTVAL, 'SPLYCE', 'ESTADOS UNIDOS', 150000, 01, 0);
INSERT INTO EQUIPO VALUES(AUTO_COD_EQUIPO_SEQ.NEXTVAL, 'TEAM VITALITY', 'FRANCIA', 140000, 01, 0);
INSERT INTO EQUIPO VALUES(AUTO_COD_EQUIPO_SEQ.NEXTVAL, 'SK TELECOM T1', 'COREA', 200000, 01, 0);
INSERT INTO EQUIPO VALUES(AUTO_COD_EQUIPO_SEQ.NEXTVAL, 'ROYAL NEVER GIVE UP', 'CHINA', 200000, 01, 0);


-- JUGADORES (CODIGO, NOMBRE, APELLIDO, NICK, SUELDO, NACIONALIDAD, ESTADO, TELEFONO, EQUIPO)

--FNATIC
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'GABRI�L', 'RAU', 'BWIPO', 40000, 'BELGICA', 'CONTRATADO', 684939291, 01);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'MADS', 'BROCK-PEDERSEN', 'BROXAH', 28900, 'DINAMARCA', 'CONTRATADO', 683010193, 01);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'TIM', 'LIPOVSEK', 'NEMESIS', 32000, 'ESLOVENIA', 'CONTRATADO', 683910291, 01);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'MARTIN', 'LARSON', 'REKKLES', 80000, 'SUECIA', 'CONTRATADO', 743818282, 01);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'ZDRAVETS', 'LLIEV', 'HYLISSANG', 25000, 'BULGARIA', 'CONTRATADO', 748182930, 01);

--SKT T1
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'KIM', 'DONG-HA', 'KHAN', 45000, 'COREA', 'CONTRATADO', 638420422, 07);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'KIM', 'TAE-MIN', 'CLID', 35400, 'COREA', 'CONTRATADO', 683839201, 07);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'LEE', 'SANG-HYEOK', 'FAKER', 120000, 'COREA', 'CONTRATADO', 748192930, 07);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'PARK', 'JIN-SEONG', 'TEDDY', 49000, 'COREA', 'CONTRATADO', 683228394, 07);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'CHO', 'SE-HYEONG', 'MATA', 78000, 'COREA', 'CONTRATADO', 674920192, 07);

--G2
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'MARTIN', 'HANSEN', 'WUNDER', 30400, 'DINAMARCA', 'CONTRATADO', 682039192, 02);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'MARCIN', 'JANKOWSKI', 'JANKOS', 39000, 'POLONIA', 'CONTRATADO', 683919203, 02);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'RASMUS', 'WINTHER', 'CAPS', 69000, 'DINAMARCA', 'CONTRATADO', 683920192, 02);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'LUKA', 'PERKOVI?', 'PERKZ', 56000, 'CROACIA', 'CONTRATADO', 683920174, 02);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'MIHAEL', 'MEHLE', 'MIKYX', 17000, 'ESLOVENIA', 'CONTRATADO', 628301022, 02);

--ORIGEN
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'BARNEY', 'MORRIS', 'ALPHARI', 40200, 'REINO UNIDO', 'CONTRATADO', 683919203, 03);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'JONAS', 'ANDERSEN', 'KOLD', 30102, 'DINAMARCA', 'CONTRATADO', 683920394, 03);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'ERLEND', 'V�TEVIK', 'NUKEDUCK', 29000, 'NORUEGA', 'CONTRATADO', 928392930, 03);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'PATRIK', 'J�R?', 'PATRIK', 19000, 'REPUBLICA CHECA', 'CONTRATADO', 937481828, 03);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'ALFONSO', 'AGUIRRE', 'MITHY', 50200, 'ESPA�A', 'CONTRATADO', 928371828, 03);

--SK GAMING
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'JORGE', 'CASANOVAS', 'WERLYB', 17000, 'ESPA�A', 'CONTRATADO', 928374618, 04);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'OSKAR', 'BODEREK', 'SELFMADE', 23000, 'POLONIA', 'CONTRATADO', 849381729, 04);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'CHOI', 'JUN-SIK', 'PIREAN', 28000, 'COREA', 'CONTRATADO', 673912123, 04);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'JU�', 'MARU�I?', 'CROWNSHOT', 24000, 'ESLOVENIA', 'CONTRATADO', 839283912, 04);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'HAN', 'MIN-KOOK', 'DREAMS', 21020, 'COREA', 'CONTRATADO', 728394819, 04);

--SPLYCE
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'ANDREI', 'POPA', 'OROME', 18000, 'RUMANIA', 'CONTRATADO', 918281231, 05);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'TAM�S', 'KISS', 'VIZICSACSI', 43000, 'HUNGRIA', 'CONTRATADO', 812831231, 05);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'ANDREI', 'DRAGOMIR', 'XERXE', 24000, 'RUMANIA', 'CONTRATADO', 912831012, 05);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'MAREK', 'BR�ZDA', 'HUMANOID', 15020, 'REPUBLICA CHECA', 'CONTRATADO', 712801281, 05);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'KASPER', 'KOBBERUP', 'KOBBE', 19030, 'DINAMARCA', 'CONTRATADO', 912812012, 05);

--TEAM VITALITY
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'LUCAS', 'SIMON-MESLET', 'CABOCHARD', 39020, 'FRANCIA', 'CONTRATADO', 681291201, 06);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'LEE', 'JAE-HA', 'MOWGLI', 37000, 'COREA', 'CONTRATADO', 712912012, 06);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'DANIELE', 'DI MAURO', 'JIZUKE', 32010, 'ITALIA', 'CONTRATADO', 723932011, 06);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'AMADEU', 'CARVALHO', 'ATTILA', 27300, 'PORTUGAL', 'CONTRATADO', 612812012, 06);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'JAKUB', 'SKURZY?SKI', 'JACTROLL', 17000, 'POLONIA', 'CONTRATADO', 782910291, 06);

--ROYAL NEVER GIVE UP
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'SHEK', 'WAI HO', 'AMAZINGJ', 49000, 'CHINA', 'CONTRATADO', 82930291, 08);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'HUNG', 'HAO-HSUAN', 'KARSA', 55000, 'TAIWAN', 'CONTRATADO', 829102910, 08);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'LI', 'YUAN-HAO', 'XIAOHU', 75000, 'CHINA', 'CONTRATADO', 672819102, 08);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'JIAN', 'ZI-HAO', 'UZI', 96000, 'CHINA', 'CONTRATADO', 682930291, 08);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'SHI', 'SEN-MING', 'MING', 63000, 'CHINA', 'CONTRATADO', 612812012, 08);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'WANG', 'KANG-CAN', 'S1XU', 18000, 'CHINA', 'CONTRATADO', 812712812, 08);

-- SIN CONTRATO
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'LEE', 'SANG-HO', 'EFFORT', 14000, 'COREA', 'VACANTE', 783910293, NULL);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'KIM', 'DO-YEONG', 'DORAON', 18000, 'COREA', 'VACANTE', 671212882, NULL);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'DAVID', 'ROBERSON', 'COP', 21000, 'ESTADOS UNIDOS', 'VACANTE', 672829102, NULL);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'MATY��', 'ORS�G', 'CARZZY', 13000, 'REPUBLICA CHECA', 'VACANTE', 928291281, NULL);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'DEIVYDAS', 'PLIKAITIS', 'AGENTAS', 12011, 'LITUANIA', 'VACANTE', 712812912, NULL);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'FELIX', 'BOSTR�M', 'MAGIFELIX', 30400, 'SUECIA', 'VACANTE', 912012912, NULL);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'TONI', 'SABALI?', 'SACRE', 12000, 'CROACIA', 'VACANTE', 612947538, NULL);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'PH?M', 'MINH', 'ZEROS', 24000, 'VIETNAM', 'VACANTE', 712912012, NULL);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'HO�NG', 'TI?N', 'MELIODAS', 23020, 'VIETNAM', 'VACANTE', 829310122, NULL);
INSERT INTO JUGADOR VALUES (AUTO_COD_JUG_SEQ.NEXTVAL , 'ILYA', 'MAKAVCHUK', 'GADGET', 21020, 'BIELORRUSIA', 'VACANTE', 693012912, NULL);


-- LIGA (CODIGO, NOMBRE, FECHA_INICIO, FECHA_FIN, ESTADO)
-- INSERT INTO LIGA VALUES (01, 'LIGA E-GIBIDE', NULL, NULL, NULL);