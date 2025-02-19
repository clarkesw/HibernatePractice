INSERT INTO demodb.manufacturer (id, email, location, name, type)
VALUES (1, 'ceo@sapple.com', 'New York, NY', 'SApple Corp.', 3); 
INSERT INTO demodb.coupon (id, code, discount, expdate)
VALUES (1, '502', .2, '5/5/25'); 
INSERT INTO demodb.product (id, name, description, price, coupon_id, manufacturer_id)
VALUES (1, 'iPhone 17', 'Lastest siPhone', 720, 1, 1); 
INSERT INTO demodb.product (id, name, description, price, coupon_id, manufacturer_id)
VALUES (2, 'iCar 2 Beta', 'Super Fast', 34720, null, 1);

-- ALTER TABLE product
-- ADD manufacturer varchar(255);

-- Product(id, name, description, price, coupon_id, manufacturer_id)
-- Manufacturer(id, email, location, name, type)
-- Coupon(id, code, discount, expdate)
 
-- DROP DATABASE demodb; 
-- create DATABASE demodb; 
-- use demodb;