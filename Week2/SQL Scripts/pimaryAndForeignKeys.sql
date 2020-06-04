-- parts and items table example

CREATE TABLE part(
Part_no    NUMBER PRIMARY KEY,
Part_desc VARCHAR2(200) NOT NULL );
 
CREATE TABLE item (
Item_no   NUMBER,
Part_no   NUMBER,
Item_desc varchar2(200) NOT NULL,
CONSTRAINT fk_item_part FOREIGN KEY (part_no) REFERENCES PART (part_no),
CONSTRAINT pk_item PRIMARY  KEY (item_no, part_no) );




-- supplier and products example

CREATE TABLE supplier
( supplier_id numeric(10) not null,
  supplier_name varchar2(50) not null,
  contact_name varchar2(50),
  CONSTRAINT supplier_pk PRIMARY KEY (supplier_id)
);

CREATE TABLE products
( product_id numeric(10) not null,
  supplier_id numeric(10) not null,
  CONSTRAINT fk_supplier FOREIGN KEY (supplier_id) REFERENCES supplier(supplier_id)
);