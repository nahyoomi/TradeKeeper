
--Default item data
INSERT INTO item (id_item,item_Code, description, price, state, creation_Date, user_Id)
VALUES
  (1,1001, 'Floral Print Pillow Cover', 19.99, 'Active', '2023-01-01', 'user1'),
  (2,1002, 'Vintage Brass Table Lamp', 79.99, 'Active', '2023-01-02', 'user2'),
  (3,1003, 'Rustic Wooden Shelf', 59.99, 'Active', '2023-01-03', 'user3');


--Default priceReduction data
INSERT INTO price_Reduction (price_reduction_id,reduced_Price, start_Date, end_Date, item_id)
VALUES
  (1,9.99, '2023-01-01', '2023-01-10', 1),
  (2,14.99, '2023-01-05', '2023-01-15', 2),
  (3,19.99, '2023-01-08', '2023-01-18', 3);

--Default supplier data
INSERT INTO supplier (supplier_id,name, country)
VALUES
  (1,'Creative Interiors', 'Canada'),
  (2,'Artistic Express', 'Japan'),
  (3,'Vintage Finds', 'Italy');

--Default Item_supplier data
INSERT INTO item_supplier (item_supplier_Id, id_item, supplier_id)
VALUES
  (1, 1, 1);

INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');

--Default user data
--admin12345--
INSERT INTO users (user_id, email, password, registered,username)
VALUES
(1,'admin@correo.com','$2a$10$33qAXWFFtrfMrbaC07OStuRayJLinzDS9F.ars/fka5VX79j/FikS',	null,	'admin')