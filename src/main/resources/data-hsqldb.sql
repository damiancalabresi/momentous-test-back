INSERT INTO currency(id, name) values (1,'Dollar');
INSERT INTO currency(id, name) values (2,'Peso');

INSERT INTO menu(id, name, description, price, currency, from_valid_date, to_valid_date, from_hour, to_hour, ranking)
VALUES (1, 'Tostada Tijuana', 'Black Beans, Lettuce and others', 4.25, 1, DATE '2015-04-1', DATE '2015-12-31', TIME '08:00:00', TIME '12:00:00', 3.5);

INSERT INTO menu(id, name, description, price, currency, from_valid_date, to_valid_date, from_hour, to_hour, ranking)
VALUES (2, 'Classic Burguer', 'A fresh meat burguer with lettuce, tommato and onion', 7.50, 1, DATE '2015-08-15', DATE '2016-08-15', TIME '12:00:00', TIME '22:00:00', 4.5);

INSERT INTO menu(id, name, description, price, currency, from_valid_date, to_valid_date, from_hour, to_hour, ranking)
VALUES (3, 'Agnolottis', 'Original italian agnolottis with ham and cheese', 55.0, 2, DATE '2015-10-05', DATE '2016-04-10', TIME '11:00:00', TIME '16:00:00', 4.3);

INSERT INTO menu(id, name, description, price, currency, from_valid_date, to_valid_date, from_hour, to_hour, ranking)
VALUES (4, 'Risotto', 'An Italian rice with a creamy consistence', 42.0, 2, DATE '2014-07-01', DATE '2015-11-01', TIME '11:00:00', TIME '16:00:00', 3.8);