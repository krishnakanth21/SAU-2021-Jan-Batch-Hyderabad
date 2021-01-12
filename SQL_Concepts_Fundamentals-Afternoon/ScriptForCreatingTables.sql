/*
-- Query: SHOW CREATE TABLE category
-- Date: 2021-01-12 16:04
*/
/* CATEGORY TABLE*/
INSERT INTO `` (`Table`,`Create Table`) VALUES ('category','CREATE TABLE `category` (\n  `category_code` varchar(255) NOT NULL,\n  `catergory_name` varchar(255) DEFAULT NULL,\n  PRIMARY KEY (`category_code`)\n) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci');

/* PRODUCT TABLE */
CREATE TABLE `accolite`.`product` (
  `product_code` INT NOT NULL,
  `product_name` VARCHAR(45) NULL,
  `unit_price` INT NULL,
  `category_code` VARCHAR(255) NULL,
  PRIMARY KEY (`product_code`),
  INDEX `category_code_idx` (`category_code` ASC) VISIBLE,
  CONSTRAINT `category_code`
    FOREIGN KEY (`category_code`)
    REFERENCES `accolite`.`category` (`category_code`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

/* LOCATION TABLE*/
CREATE TABLE `accolite`.`location` (
  `location_code` INT NOT NULL,
  `location_name` VARCHAR(255) NULL,
  PRIMARY KEY (`location_code`));

/* CUSTOMER TABLE */
CREATE TABLE `accolite`.`customer` (
  `customer_id` INT NOT NULL,
  `customer_name` VARCHAR(255) NULL,
  `customer_DOB` DATE NULL,
  `customer_gender` VARCHAR(255) NULL,
  `customer_mobile` VARCHAR(255) NULL,
  `location_code` INT NULL,
  PRIMARY KEY (`customer_id`),
  INDEX `location_code_idx` (`location_code` ASC) VISIBLE,
  CONSTRAINT `location_code`
    FOREIGN KEY (`location_code`)
    REFERENCES `accolite`.`location` (`location_code`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

/* SALES EXECUTIVE TABLE */
CREATE TABLE `accolite`.`sales_executive` (
  `sales_executive_id` INT NOT NULL,
  `sales_executive_name` VARCHAR(255) NULL,
  `sales_executive_DOB` DATE NULL,
  `sales_executive_gender` VARCHAR(255) NULL,
  `sales_executive_mobile` VARCHAR(255) NULL,
  PRIMARY KEY (`sales_executive_id`));

/* SALE DETAILS TABLE */
CREATE TABLE `accolite`.`sale_details` (
  `customer_id` INT NOT NULL,
  `sales_executive_id` INT NOT NULL,
  `product_code` INT NOT NULL,
  `purchase_date` DATE NOT NULL,
  `quantity` INT NULL,
  INDEX `customer_id_idx` (`customer_id` ASC) VISIBLE,
  INDEX `sales_executive_id_idx` (`sales_executive_id` ASC) VISIBLE,
  INDEX `product_code_idx` (`product_code` ASC) VISIBLE,
  PRIMARY KEY (`customer_id`, `sales_executive_id`, `product_code`, `purchase_date`),
  CONSTRAINT `customer_id`
    FOREIGN KEY (`customer_id`)
    REFERENCES `accolite`.`customer` (`customer_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `sales_executive_id`
    FOREIGN KEY (`sales_executive_id`)
    REFERENCES `accolite`.`sales_executive` (`sales_executive_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `product_code`
    FOREIGN KEY (`product_code`)
    REFERENCES `accolite`.`product` (`product_code`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

