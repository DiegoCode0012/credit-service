
/* */
INSERT INTO client (name,last_name, dni, phone) VALUES('Diego','Burneo',8371212,5452312);
INSERT INTO client (name,last_name, dni, phone) VALUES('Maria', 'Gonzales', '94105432', '42131293');
INSERT INTO client (name,last_name, dni, phone) VALUES('Pedro', 'López', '98765432', '1122334455');
INSERT INTO client (name,last_name, dni, phone) VALUES ('Ana', 'Martínez', '56789012', '1123456789');
INSERT INTO client (name,last_name, dni, phone) VALUES ('Luis', 'Sánchez', '34567890', '1987654321');


INSERT INTO account (account_type,balance,state) VALUES('Corriente', -7000, 'Pendiente de pago');
INSERT INTO account (account_type,balance,state) VALUES('Ahorros', -4000, 'Pendiente de pago');
INSERT INTO account (account_type,balance,state) VALUES('Corriente', -6000, 'Pendiente de pago');



INSERT INTO credit (amount,request_interest_rate,returned_interest_rate,state,currency,type_credit,initial_date,response_date,months,client_id,account_id) VALUES (7000,0.01,null,'En revision','Soles','Prestamo personal','2024-02-15',null,'10',1,1);

INSERT INTO credit (amount,request_interest_rate,returned_interest_rate,state,currency,type_credit,initial_date,response_date,months,client_id,account_id) VALUES (4000,0.03,0.01,'Aprobado','Soles','Prestamo hipotecario','2024-02-10','2024-02-13','10',1,2);

INSERT INTO credit (amount,request_interest_rate,returned_interest_rate,state,currency,type_credit,initial_date,response_date,months,client_id,account_id) VALUES (6000,0.02,0.01,'Aprobado','Soles','Prestamo personal','2024-02-12','2024-02-14','10',2,3);

INSERT INTO payment (id_credit,payment_amount,payment_date)VALUES(2,1000,'2024-02-15');