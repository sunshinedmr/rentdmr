create database zufang;
select * from house
delete from house where id=1
--�û���


create table users
(
  id        int primary key auto_increment,   ---�û�id
  name      varchar(50),       --��¼��   
  password  varchar(50),       --�û�����
  telephone varchar(15),       --�绰
  username  varchar(50),       --��ʵ��
  isadmin   varchar(5)         --�Ƿ��ǹ���Ա
);
--������
create table district
(
  id   int primary key,          
  name varchar(50) 
);
--�ֵ���
create table street
(
  id        int primary key, --�ֵ�id     
  name        varchar(50),   --�ֵ���
  district_id int            --����id
);
--�������ͱ�
create table housetype
(
  id   int primary key auto_increment,            
  name varchar(20) 
)
--������Ϣ��
create table house
(
  id          int primary key auto_increment,     --��Ϣid       
  user_id     int,                 --����Ϣ��id
  type_id     int,                 --��������id
  title       nvarchar(50),        --��Ϣ����
  description text,                --����
  price       double,              --�۸�
  pubdate     date,                --��������
  floorage    int,                 --���
  contact     varchar(100),        --��ϵ��ʽ
  street_id   int                 --�ֵ�id
);

