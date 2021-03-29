/*==============================================================*/
/* DBMS name:      Sybase SQL Anywhere 12                       */
/* Created on:     2021/3/29 15:38:00                           */
/*==============================================================*/

/*
if exists(select 1 from sys.sysforeignkey where role='FK_ACTIVITY_REFERENCE_COUPON_I') then
    alter table activity_info
       delete foreign key FK_ACTIVITY_REFERENCE_COUPON_I
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ACTIVITY_REFERENCE_ACTIVITY') then
    alter table activity_product
       delete foreign key FK_ACTIVITY_REFERENCE_ACTIVITY
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ACTIVITY_REFERENCE_PRODUCT_') then
    alter table activity_product
       delete foreign key FK_ACTIVITY_REFERENCE_PRODUCT_
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ADDRESS__REFERENCE_CUSTOMER') then
    alter table address_info
       delete foreign key FK_ADDRESS__REFERENCE_CUSTOMER
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ASSESSES_REFERENCE_CUSTOMER') then
    alter table assesses
       delete foreign key FK_ASSESSES_REFERENCE_CUSTOMER
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ASSESSES_REFERENCE_ORDER_IN') then
    alter table assesses
       delete foreign key FK_ASSESSES_REFERENCE_ORDER_IN
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ASSESSES_REFERENCE_DELIVERY') then
    alter table assesses
       delete foreign key FK_ASSESSES_REFERENCE_DELIVERY
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_COMBINAT_REFERENCE_COMBINAT') then
    alter table combination_item
       delete foreign key FK_COMBINAT_REFERENCE_COMBINAT
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_COMBINAT_REFERENCE_PRODUCT_') then
    alter table combination_item
       delete foreign key FK_COMBINAT_REFERENCE_PRODUCT_
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ORDER_IN_REFERENCE_CUSTOMER') then
    alter table order_info
       delete foreign key FK_ORDER_IN_REFERENCE_CUSTOMER
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ORDER_IT_REFERENCE_ORDER_IN') then
    alter table order_item
       delete foreign key FK_ORDER_IT_REFERENCE_ORDER_IN
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ORDER_IT_REFERENCE_PRODUCT_') then
    alter table order_item
       delete foreign key FK_ORDER_IT_REFERENCE_PRODUCT_
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ORDER_LO_REFERENCE_ORDER_IN') then
    alter table order_logistics
       delete foreign key FK_ORDER_LO_REFERENCE_ORDER_IN
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ORDER_LO_REFERENCE_DELIVERY') then
    alter table order_logistics
       delete foreign key FK_ORDER_LO_REFERENCE_DELIVERY
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_STOCK_PU_REFERENCE_PRODUCT_') then
    alter table stock_purchase
       delete foreign key FK_STOCK_PU_REFERENCE_PRODUCT_
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_STOCK_PU_REFERENCE_ADMIN_IN') then
    alter table stock_purchase
       delete foreign key FK_STOCK_PU_REFERENCE_ADMIN_IN
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_USER_COU_REFERENCE_CUSTOMER') then
    alter table user_coupon
       delete foreign key FK_USER_COU_REFERENCE_CUSTOMER
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_USER_COU_REFERENCE_COUPON_I') then
    alter table user_coupon
       delete foreign key FK_USER_COU_REFERENCE_COUPON_I
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_VIP_INFO_REFERENCE_CUSTOMER') then
    alter table vip_info
       delete foreign key FK_VIP_INFO_REFERENCE_CUSTOMER
end if;
*/

drop table if exists activity_info;

drop table if exists activity_product;

drop table if exists address_info;

drop table if exists admin_info;

drop table if exists assesses;

drop table if exists combination;

drop table if exists combination_item;

drop table if exists coupon_info;

drop table if exists customer_info;

drop table if exists deliveryman;

drop table if exists order_info;

drop table if exists order_item;

drop table if exists order_logistics;

drop table if exists product_info;

drop table if exists stock_purchase;

drop table if exists user_coupon;

drop table if exists vip_info;

/*==============================================================*/
/* Table: activity_info                                         */
/*==============================================================*/
create table activity_info
(
   id                   int                            not null,
   name                 varchar(50)                    null,
   start_time           datetime                       null,
   end_start            datetime                       null,
   coupon_id            int                            null,
   constraint PK_ACTIVITY_INFO primary key clustered (id)
);

/*==============================================================*/
/* Table: activity_product                                      */
/*==============================================================*/
create table activity_product
(
   id                   int                            not null,
   product_id           int                            null,
   activity_id          int                            null,
   constraint PK_ACTIVITY_PRODUCT primary key clustered (id)
);

/*==============================================================*/
/* Table: address_info                                          */
/*==============================================================*/
create table address_info
(
   id                   int                            not null,
   customer_id          int                            null,
   address              varchar(255)                   null,
   constraint PK_ADDRESS_INFO primary key clustered (id)
);

/*==============================================================*/
/* Table: admin_info                                            */
/*==============================================================*/
create table admin_info
(
   id                   int                            not null,
   name                 varchar(50)                    null,
   sex                  char                           null,
   username             varchar(50)                    null,
   password             varchar(50)                    null,
   constraint PK_ADMIN_INFO primary key clustered (id)
);

/*==============================================================*/
/* Table: assesses                                              */
/*==============================================================*/
create table assesses
(
   id                   int                            not null,
   order_id             int                            null,
   customer_id          int                            null,
   deliveryman_id       int                            null,
   deliveryman_grade    int                            null,
   order_grade          int                            null,
   writing              varchar(255)                   null,
   constraint PK_ASSESSES primary key clustered (id)
);

/*==============================================================*/
/* Table: combination                                           */
/*==============================================================*/
create table combination
(
   id                   int                            not null,
   name                 varchar(50)                    null,
   primary_price        double                         null,
   price                double                         null,
   stock_quantity       int                            null,
   sale_quantity        int                            null,
   grade                double                         null,
   constraint PK_COMBINATION primary key clustered (id)
);

/*==============================================================*/
/* Table: combination_item                                      */
/*==============================================================*/
create table combination_item
(
   id                   int                            not null,
   combination_id       int                            null,
   product_id           int                            null,
   price                double                         null,
   num                  int                            null,
   constraint PK_COMBINATION_ITEM primary key clustered (id)
);

/*==============================================================*/
/* Table: coupon_info                                           */
/*==============================================================*/
create table coupon_info
(
   id                   int                            not null,
   description          varchar(255)                   null,
   target_amount        double                         null,
   discount_amount      double                         null,
   constraint PK_COUPON_INFO primary key clustered (id)
);

/*==============================================================*/
/* Table: customer_info                                         */
/*==============================================================*/
create table customer_info
(
   id                   int                            not null,
   name                 varchar(50)                    null,
   sex                  char(1)                        null,
   age                  int                            null,
   phone                varchar(50)                    null,
   address              varchar(255)                   null,
   username             varchar(50)                    null,
   password             varchar(50)                    null,
   constraint PK_CUSTOMER_INFO primary key clustered (id)
);

/*==============================================================*/
/* Table: deliveryman                                           */
/*==============================================================*/
create table deliveryman
(
   id                   int                            not null,
   name                 varchar(50)                    null,
   sex                  char                           null,
   age                  int                            null,
   phone                varchar(50)                    null,
   status               char                           null,
   grade                double                         null,
   num                  int                            null,
   constraint PK_DELIVERYMAN primary key clustered (id)
);

/*==============================================================*/
/* Table: order_info                                            */
/*==============================================================*/
create table order_info
(
   id                   int                            not null,
   customer_id          int                            null,
   order_time           datetime                       null,
   pay_time             datetime                       null,
   logistics_fee        double                         null,
   product_count        int                            null,
   product_amount_total double                         null,
   order_amount_total   double                         null,
   status               char                           null,
   constraint PK_ORDER_INFO primary key clustered (id)
);

/*==============================================================*/
/* Table: order_item                                            */
/*==============================================================*/
create table order_item
(
   id                   int                            not null,
   order_id             int                            null,
   product_id           int                            null,
   price                double                         null,
   num                  int                            null,
   constraint PK_ORDER_ITEM primary key clustered (id)
);

/*==============================================================*/
/* Table: order_logistics                                       */
/*==============================================================*/
create table order_logistics
(
   id                   int                            not null,
   order_id             int                            null,
   deliveryman_id       int                            null,
   express_no           char                           null,
   name                 varchar(50)                    null,
   address              varchar(255)                   null,
   phone                varchar(50)                    null,
   predict_arrive_time  datetime                       null,
   constraint PK_ORDER_LOGISTICS primary key clustered (id)
);

/*==============================================================*/
/* Table: product_info                                          */
/*==============================================================*/
create table product_info
(
   id                   int                            not null,
   name                 varchar(50)                    null,
   price                double                         null,
   components           varchar(255)                   null,
   stock_quantity       int                            null,
   sale_quantity        int                            null,
   grade                double                         null,
   manufacture_date     datetime                       null,
   guarantee_period     datetime                       null,
   isbn                 char                           null,
   sugar                int                            null,
   temperature          double                         null,
   constraint PK_PRODUCT_INFO primary key clustered (id)
);

/*==============================================================*/
/* Table: stock_purchase                                        */
/*==============================================================*/
create table stock_purchase
(
   id                   int                            not null,
   product_id           int                            null,
   quantity             int                            null,
   pdate                datetime                       null,
   admin_id             int                            null,
   manufacture_date     datetime                       null,
   constraint PK_STOCK_PURCHASE primary key clustered (id)
);

/*==============================================================*/
/* Table: user_coupon                                           */
/*==============================================================*/
create table user_coupon
(
   id                   int                            not null,
   customer_id          int                            null,
   coupon_id            int                            null,
   constraint PK_USER_COUPON primary key clustered (id)
);

/*==============================================================*/
/* Table: vip_info                                              */
/*==============================================================*/
create table vip_info
(
   id                   int                            not null,
   customer_id          int                            null,
   card_id              int                            null,
   vip_intergal         int                            null,
   reminder             double                         null,
   start_time           datetime                       null,
   crad_intergal        int                            null,
   constraint PK_VIP_INFO primary key clustered (id)
);

alter table activity_info
   add constraint FK_ACTIVITY_REFERENCE_COUPON_I foreign key (coupon_id)
      references coupon_info (id)
      on update restrict
      on delete restrict;

alter table activity_product
   add constraint FK_ACTIVITY_REFERENCE_ACTIVITY foreign key (activity_id)
      references activity_info (id)
      on update restrict
      on delete restrict;

alter table activity_product
   add constraint FK_ACTIVITY_REFERENCE_PRODUCT_ foreign key (product_id)
      references product_info (id)
      on update restrict
      on delete restrict;

alter table address_info
   add constraint FK_ADDRESS__REFERENCE_CUSTOMER foreign key (customer_id)
      references customer_info (id)
      on update restrict
      on delete restrict;

alter table assesses
   add constraint FK_ASSESSES_REFERENCE_CUSTOMER foreign key (customer_id)
      references customer_info (id)
      on update restrict
      on delete restrict;

alter table assesses
   add constraint FK_ASSESSES_REFERENCE_ORDER_IN foreign key (order_id)
      references order_info (id)
      on update restrict
      on delete restrict;

alter table assesses
   add constraint FK_ASSESSES_REFERENCE_DELIVERY foreign key (deliveryman_id)
      references deliveryman (id)
      on update restrict
      on delete restrict;

alter table combination_item
   add constraint FK_COMBINAT_REFERENCE_COMBINAT foreign key (combination_id)
      references combination (id)
      on update restrict
      on delete restrict;

alter table combination_item
   add constraint FK_COMBINAT_REFERENCE_PRODUCT_ foreign key (product_id)
      references product_info (id)
      on update restrict
      on delete restrict;

alter table order_info
   add constraint FK_ORDER_IN_REFERENCE_CUSTOMER foreign key (customer_id)
      references customer_info (id)
      on update restrict
      on delete restrict;

alter table order_item
   add constraint FK_ORDER_IT_REFERENCE_ORDER_IN foreign key (order_id)
      references order_info (id)
      on update restrict
      on delete restrict;

alter table order_item
   add constraint FK_ORDER_IT_REFERENCE_PRODUCT_ foreign key (product_id)
      references product_info (id)
      on update restrict
      on delete restrict;

alter table order_logistics
   add constraint FK_ORDER_LO_REFERENCE_ORDER_IN foreign key (order_id)
      references order_info (id)
      on update restrict
      on delete restrict;

alter table order_logistics
   add constraint FK_ORDER_LO_REFERENCE_DELIVERY foreign key (deliveryman_id)
      references deliveryman (id)
      on update restrict
      on delete restrict;

alter table stock_purchase
   add constraint FK_STOCK_PU_REFERENCE_PRODUCT_ foreign key (product_id)
      references product_info (id)
      on update restrict
      on delete restrict;

alter table stock_purchase
   add constraint FK_STOCK_PU_REFERENCE_ADMIN_IN foreign key (admin_id)
      references admin_info (id)
      on update restrict
      on delete restrict;

alter table user_coupon
   add constraint FK_USER_COU_REFERENCE_CUSTOMER foreign key (customer_id)
      references customer_info (id)
      on update restrict
      on delete restrict;

alter table user_coupon
   add constraint FK_USER_COU_REFERENCE_COUPON_I foreign key (coupon_id)
      references coupon_info (id)
      on update restrict
      on delete restrict;

alter table vip_info
   add constraint FK_VIP_INFO_REFERENCE_CUSTOMER foreign key (customer_id)
      references customer_info (id)
      on update restrict
      on delete restrict;

