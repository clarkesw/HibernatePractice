-- DROP DATABASE demodb; 
-- create DATABASE demodb; 
-- use demodb;

-- Product(id, name, description, price, coupon_id, manufacturer_id)
-- Manufacturer(id, email, location, name, type)
-- Coupon(id, code, discount, expdate)

INSERT INTO coupon (id, code, discount, expdate) 
VALUES (1, '15', 0.1, '2025-07-01');
INSERT INTO coupon (id, code, discount, expdate) 
VALUES (1, '2', 0.2, '2222-01-01');

INSERT INTO manufacturer (id, email, location, name, type)
VALUES (1, 'ceo@sapple.com', 'New York, NY', 'SApple Corp.', 3); 

INSERT INTO product (id, name, description, price, coupon_id, manufacturer_id)
VALUES (1, 'iPhone 17', 'Lastest siPhone', 720, 1, 1); 
INSERT INTO product (id, name, description, price, coupon_id, manufacturer_id)
VALUES (2, 'iCar 2 Beta', 'Super Fast', 34720, null, 1);

-- ALTER TABLE product
-- ADD manufacturer varchar(255);