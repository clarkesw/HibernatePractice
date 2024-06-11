-- use demodb;
-- ALTER TABLE product
-- ADD manufacturer varchar(255);

-- Product(Long id, String name, String description, Manufacturer manufacturer, Coupon coupon, int price)
-- Manufacturer(Long id, String name, ManufacturerType type, List<Product> products, String location, String email)
-- Coupon(Long id, String code, Double discount, String expdate)

insert into product
values (7500, 1, 1, 1, 'Lastest siPhone', 'si15'); 
insert into manufacturer
values (3, 1, 'ceo@sapple.com', 'New York, NY', 'SApple Corp.'); 
insert into coupon
values (.2, 1, '502', '1/5/74');  
