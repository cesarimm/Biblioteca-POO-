
CREATE DATABASE if not exists biblioteca;

CREATE TABLE if not exists biblioteca.alumnos(
 
           `id_alumno` varchar(15) NOT NULL,
 
           `matricula` varchar(60) NOT NULL,
  
            `programa` varchar(60) NOT NULL,
 
          `grupo` varchar(60) NOT NULL,
 
         `semestre` varchar(60) ,
          primary key (`id_alumno`)
)  ;



CREATE TABLE if not exists biblioteca.items (
  
                  `id_items` varchar(15) NOT NULL,
 
                  `autor` varchar(60) NOT NULL,
  
                  `nombre` varchar(60) NOT NULL,
 
                  `lugarP` varchar(60) NOT NULL,
 
                  `anioPublicacion` varchar(60) NOT NULL,
                   primary key (`id_items`)
);


CREATE TABLE IF NOT EXISTS biblioteca.consulta( 
                           `id_consulta` VARCHAR (15) NOT NULL,
                            `fecha` DATE, 
                            `fk_items` VARCHAR (15) NOT NULL, 
                             CONSTRAINT `fk_consulta_items` FOREIGN KEY (`fk_items`) REFERENCES items(`id_items`) );



CREATE TABLE if not exists biblioteca.libro(
  `id_libro` varchar(15) NOT NULL,
 
                    `no_edicion` varchar(60) DEFAULT NULL,
 
                     `editorial` varchar(60) NOT NULL,
  
                     `pag` varchar(5) DEFAULT NULL,
  
                    `categoria` varchar(60) DEFAULT NULL,
                      primary key (`id_libro`)

)




CREATE TABLE if not exists biblioteca.prestamo (
  
  `id_prestamo` varchar(15) NOT NULL,
  
  `fechaP` date NOT NULL,
 
  `fk_id_usuario` varchar(15) NOT NULL,
   primary key (`id_prestamo`),
    CONSTRAINT ` fk_prestamo_usuario` FOREIGN KEY (`fk_id_usuario`) REFERENCES usuarios(`id_usuario`)
) ;



CREATE TABLE if not exists biblioteca.tesis (
  
                `id_tesis` varchar(15) NOT NULL,
 
                `asesor1` varchar(60) DEFAULT NULL,
  
                `asesor2` varchar(60) DEFAULT NULL,
 
                `categoria` varchar(60) DEFAULT NULL,
 
                `tema` varchar(60) DEFAULT NULL, 
                PRIMARY KEY (`id_tesis`)

) ;


CREATE TABLE if not exists biblioteca.profesor (
 
                     `id_profesor` varchar(15) NOT NULL,
 
                      `clave` varchar(60) NOT NULL,
 
                      `academia` varchar(60) NOT NULL,
                      PRIMARY KEY (`id_profesor`)
) ;


CREATE TABLE if not exists biblioteca.usuarios(
 
              `id_usuario` varchar(15) NOT NULL,
  
               `nombre` varchar(60) NOT NULL,
 
               `apellidoP` varchar(60) NOT NULL,

               `apellidoM` varchar(60) NOT NULL,
  
               `direccion` varchar(60) NOT NULL,
  
               `telefono` varchar(60) NOT NULL,
                primary key (`id_usuario`)

);



CREATE TABLE if not exists biblioteca.prestamo_items(
  
                         `id_prestamo_items` varchar(15) NOT NULL,
 
                         `fk_prestamo` varchar(15) NOT NULL,
 
                         `fk_item` varchar(15) NOT NULL,
                          `fechaE` DATE NOT NULL,  
                          PRIMARY KEY (`id_prestamo_items`),

                          CONSTRAIN `fk_prestamo_prestamo_items` (`fk_prestamo`) REFERENCES prestamo(`id_prestamo`),
 
                          CONSTRAIN `fk_prestamo_items_prestamo` (`fk_item`) REFERENCES items(`id_items`)

) ;
