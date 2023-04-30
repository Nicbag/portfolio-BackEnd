SELECT P.* FROM persona P;

SELECT E.* From educacion E inner join persona P On E.idpersona = P.idpersona;

SELECT E.* From experiencia E inner join persona P On E.idpersona = P.idpersona;

SELECT D.* From destreza D inner join persona P On D.idpersona = P.idpersona;

SELECT Pro.* From Proyecto inner join persona P On Pro.idpersona = P.idpersona;

SELECT C.* From curso C inner join persona P On C.idpersona = P.idpersona;

SELECT I.* From idioma I inner join persona P On I.idpersona = P.idpersona;

