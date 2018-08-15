create database zufang;
select * from house
delete from house where id=1
--用户表


create table users
(
  id        int primary key auto_increment,   ---用户id
  name      varchar(50),       --登录名   
  password  varchar(50),       --用户密码
  telephone varchar(15),       --电话
  username  varchar(50),       --真实名
  isadmin   varchar(5)         --是否是管理员
);
--地区表
create table district
(
  id   int primary key,          
  name varchar(50) 
);
--街道表
create table street
(
  id        int primary key, --街道id     
  name        varchar(50),   --街道名
  district_id int            --地区id
);
--房屋类型表
create table housetype
(
  id   int primary key auto_increment,            
  name varchar(20) 
)
--房屋信息表
create table house
(
  id          int primary key auto_increment,     --信息id       
  user_id     int,                 --发信息人id
  type_id     int,                 --房屋类型id
  title       nvarchar(50),        --信息标题
  description text,                --描述
  price       double,              --价格
  pubdate     date,                --发布日期
  floorage    int,                 --面积
  contact     varchar(100),        --联系方式
  street_id   int                 --街道id
);

