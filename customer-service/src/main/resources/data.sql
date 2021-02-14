INSERT INTO tbl_regions (id, name) VALUES (1, 'Sudamérica');
INSERT INTO tbl_regions (id, name) VALUES (2, 'Centroamérica');
INSERT INTO tbl_regions (id, name) VALUES (3, 'Norteamérica');
INSERT INTO tbl_regions (id, name) VALUES (4, 'Europa');
INSERT INTO tbl_regions (id, name) VALUES (5, 'Asia');
INSERT INTO tbl_regions (id, name) VALUES (6, 'Africa');
INSERT INTO tbl_regions (id, name) VALUES (7, 'Oceanía');
INSERT INTO tbl_regions (id, name) VALUES (8, 'Antártida');



INSERT INTO tbl_states (id, name) VALUES (1, 'OAXACA');
INSERT INTO tbl_states (id, name) VALUES (2, 'CDMX');
INSERT INTO tbl_states (id, name) VALUES (3, 'JALISCO');

INSERT INTO tbl_city (id, name) VALUES (1, 'TUXTEPEC');
INSERT INTO tbl_city (id, name) VALUES (2, 'CONDESA');
INSERT INTO tbl_city (id, name) VALUES (3, 'GUADALAJARA');


INSERT INTO tbl_customers (id,phone_number,first_name,last_name , email, photo_url,status) 
VALUES(1,'5578559345', 'Omar', 'Hernandez', 'ing_omar@hotmail.com','https://avatars.githubusercontent.com/u/24512671?s=400&amp;u=9be1f29bb16805904ec983a25e657b80d838cfc9&amp;v=4','CREATED');


INSERT INTO tbl_address (id,customer_id,state_id,city_id,address) 
VALUES(1,1,1, 1,'Calle norte No.80 colonia anzures');