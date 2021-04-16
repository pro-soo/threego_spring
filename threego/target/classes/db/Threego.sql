select * from rider;
select * from DELIVERY_LIST;
select * from ratings;
select * from NOTICE;

DROP TABLE rider CASCADE CONSTRAINTS;
DROP TABLE delivery_list CASCADE CONSTRAINTS;
DROP TABLE ratings CASCADE CONSTRAINTS;
DROP TABLE ads CASCADE CONSTRAINTS;
DROP TABLE notice CASCADE CONSTRAINTS;

DROP SEQUENCE notice_seq;
DROP SEQUENCE ra_reviewnum_seq;
DROP SEQUENCE delivery_seq;

CREATE TABLE ads (
    r_id        VARCHAR2(15) NOT NULL,
    a_name       VARCHAR2(10),
    a_necessary  BLOB,
    a_shop       BLOB,
    a_time       DATE
);

CREATE TABLE delivery_list (
    dl_number     NUMBER NOT NULL,
    dl_date       DATE,
    r_id          VARCHAR2(15) NOT NULL,
    dl_shop       VARCHAR2(20),
    dl_food       VARCHAR2(20),
    dl_price      NUMBER(10),
    dl_cooktime   DATE,
    dl_address    VARCHAR2(30),
    dl_call       NUMBER(10),
    dl_status     VARCHAR2(15),
    dl_now        VARCHAR2(15),
    dl_shoploc    VARCHAR2(15),
    dl_distoshop  VARCHAR2(10),
    dl_distoadd   VARCHAR2(10),
    dl_dltime     VARCHAR2(10)
);

CREATE SEQUENCE delivery_seq START WITH 1;

ALTER TABLE delivery_list ADD CONSTRAINT delivery_list_pk PRIMARY KEY ( dl_number );

CREATE TABLE notice (
    r_id       VARCHAR2(15) NOT NULL,
    n_title    VARCHAR2(20),
    n_content  VARCHAR2(40),
    n_date     DATE,
    n_postnum  NUMBER(5) NOT NULL
);

CREATE SEQUENCE notice_seq START WITH 1;

ALTER TABLE notice ADD CONSTRAINT postnum_pk PRIMARY KEY ( n_postnum );

CREATE TABLE ratings (
    r_id          VARCHAR2(15) NOT NULL,
    dl_number     NUMBER NOT NULL,
    ra_rating     NUMBER(5),
    ra_evals      VARCHAR2(30),
    ra_reviewnum  NUMBER(5) NOT NULL
);

CREATE SEQUENCE ra_reviewnum_seq START WITH 1;

ALTER TABLE ratings ADD CONSTRAINT reviewnum_pk PRIMARY KEY ( ra_reviewnum );

CREATE TABLE rider (
    r_id      VARCHAR2(15) NOT NULL,
    r_pw      VARCHAR2(15),
    r_box     NUMBER(10) NOT NULL,
    r_name    VARCHAR2(30),
    r_age     NUMBER(3),
    r_gender  VARCHAR2(10),
    r_phone   VARCHAR2(15),
    r_money   NUMBER(10) default 0
);

ALTER TABLE rider ADD CONSTRAINT rider_pk PRIMARY KEY ( r_id );

ALTER TABLE ads
    ADD CONSTRAINT ads_rider_fk FOREIGN KEY ( r_id )
        REFERENCES rider ( r_id );

ALTER TABLE delivery_list
    ADD CONSTRAINT delivery_rider_fk FOREIGN KEY ( r_id )
        REFERENCES rider ( r_id );

ALTER TABLE notice
    ADD CONSTRAINT notice_rider_fk FOREIGN KEY ( r_id )
        REFERENCES rider ( r_id );

ALTER TABLE ratings
    ADD CONSTRAINT ratings_delivery_fk FOREIGN KEY ( dl_number )
        REFERENCES delivery_list ( dl_number );

ALTER TABLE ratings
    ADD CONSTRAINT ratings_rider_fk FOREIGN KEY ( r_id )
        REFERENCES rider ( r_id );

insert into rider values('admin','admin',1000,'ㅇㅇ',27,'남여','010-1111-1111',1500);

insert into delivery_list values(1234, sysdate,'admin', '교촌치킨','허니레드콤보',22000,sysdate,'광주 진월동',2000,'신규','35.22, 22.11','35.33, 22.11','20km','3km','60분');

insert into ratings values('admin', 1234, 3.5, '배송이 빨랐어요.',ra_reviewnum_seq.nextval);
commit

