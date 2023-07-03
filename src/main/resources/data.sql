
--Default item data
INSERT INTO item (id_item,item_Code, description, price, state, creation_Date, user_Id)
VALUES
  (1,1001, 'Descripción del item 1', 10.99, 'Active', '2023-01-01', 'user1'),
  (2,1002, 'Descripción del item 2', 15.99, 'Active', '2023-01-02', 'user2'),
  (3,1003, 'Descripción del item 3', 20.99, 'Active', '2023-01-03', 'user3');

--Default priceReduction data
INSERT INTO price_Reduction (price_reduction_id,reduced_Price, start_Date, end_Date, item_id)
VALUES
  (1,9.99, '2023-01-01', '2023-01-10', 1),
  (2,14.99, '2023-01-05', '2023-01-15', 2),
  (3,19.99, '2023-01-08', '2023-01-18', 3);

--Default supplier data
INSERT INTO supplier (supplier_id,name, country)
VALUES
  (1,'Proveedor 1', 'País del proveedor 1'),
  (2,'Proveedor 2', 'País del proveedor 2'),
  (3,'Proveedor 3', 'País del proveedor 3');

--Default Item_supplier data
INSERT INTO item_supplier (item_supplier_Id, id_Item)
VALUES
  (1, 1),
  ( 2, 2),
  ( 3, 3);

--Default user data
INSERT INTO user (username, password, registered)
VALUES
  ('admin', 'admin123', '2023-01-01'),
  ('user1', 'password1', '2023-01-02'),
  ('user2', 'password2', '2023-01-03');