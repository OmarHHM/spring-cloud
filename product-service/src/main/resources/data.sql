INSERT INTO tbl_categories (id, name) VALUES (1, 'Bodas');
INSERT INTO tbl_categories (id, name) VALUES (2, 'Quince Años');
INSERT INTO tbl_categories (id, name) VALUES (3, 'Intantiles');
INSERT INTO tbl_categories (id, name) VALUES (4, 'Bautizo');
INSERT INTO tbl_categories (id, name) VALUES (5, 'Baby Shower');
INSERT INTO tbl_categories (id, name) VALUES (6, 'Comunion');
INSERT INTO tbl_categories (id, name) VALUES (7, 'Despedida de Soltero');
INSERT INTO tbl_categories (id, name) VALUES (8, 'Graduación');
INSERT INTO tbl_categories (id, name) VALUES (9, 'Temporada Navideña');

INSERT INTO tbl_sub_categories (id, name) VALUES (1, 'NOVIOS (DECORACION)');
INSERT INTO tbl_sub_categories (id, name) VALUES (2, 'FONDANT');
INSERT INTO tbl_sub_categories (id, name) VALUES (3, 'BUTTERCREAM');
INSERT INTO tbl_sub_categories (id, name) VALUES (4, 'CREMA');
INSERT INTO tbl_sub_categories (id, name) VALUES (5, 'NOVEDADES');
INSERT INTO tbl_sub_categories (id, name) VALUES (6, 'CLASICOS');
INSERT INTO tbl_sub_categories (id, name) VALUES (7, 'PELICULAS');
INSERT INTO tbl_sub_categories (id, name) VALUES (8, 'NIÑAS');
INSERT INTO tbl_sub_categories (id, name) VALUES (9, 'DEPORTES');
INSERT INTO tbl_sub_categories (id, name) VALUES (10, 'CARICATURAS');
INSERT INTO tbl_sub_categories (id, name) VALUES (11, 'FIGURAS DE DECORACION');
INSERT INTO tbl_sub_categories (id, name) VALUES (12, 'SANTA CLAUS');
INSERT INTO tbl_sub_categories (id, name) VALUES (13, 'FROSTY');
INSERT INTO tbl_sub_categories (id, name) VALUES (14, 'MINIE');
INSERT INTO tbl_sub_categories (id, name) VALUES (15, 'MUÑECO DE NIEVE');
INSERT INTO tbl_sub_categories (id, name) VALUES (16, 'SANTA Y RENO');
INSERT INTO tbl_sub_categories (id, name) VALUES (17, 'VIRGENCITA');




INSERT INTO tbl_products (id, name, description, stock,price, url_photo,status, create_at,category_id,sub_category_id)
VALUES (1, 'NOVIOS BORRACHOS','PASTEL DE BODAS CON MUÑECOS DE NOVIOS',10,450.00,'http://esperanza.tr3sco.net/Content/_files/image/productrequest/novioebrio-0789091173461215.jpg','CREATED',NOW(),1,1);

INSERT INTO tbl_products (id, name, description, stock,price,url_photo,status, create_at,category_id,sub_category_id)
VALUES (2, 'NOVIOS CON RAMO','PASTEL DE NOVIOS CON RAMO',6,150.00,'http://esperanza.tr3sco.net/Content/_files/image/productrequest/1noviosconramo-0888798970211669.jpg','CREATED',NOW(),1,1);


INSERT INTO tbl_products (id, name, description, stock,price,url_photo,status, create_at,category_id,sub_category_id)
VALUES (3, 'LENGUAJE DE AMOR','PASTEL DE BODAS MUÑECOS BAILANDO',4,800.00,'http://esperanza.tr3sco.net/Content/_files/image/productrequest/1lenguajedelamor-032379325540913.jpg','CREATED',NOW(),1,1);
