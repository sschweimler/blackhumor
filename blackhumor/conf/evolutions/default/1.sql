# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table galery (
  galery_id                 bigint not null,
  name                      varchar(255),
  description               varchar(255),
  constraint pk_galery primary key (galery_id))
;

create table galery_picture (
  galery_picure_id          bigint not null,
  image                     varchar(255),
  description               varchar(255),
  galery                    bigint,
  constraint pk_galery_picture primary key (galery_picure_id))
;

create sequence galery_seq;

create sequence galery_picture_seq;

alter table galery_picture add constraint fk_galery_picture_galery_1 foreign key (galery) references galery (galery_id) on delete restrict on update restrict;
create index ix_galery_picture_galery_1 on galery_picture (galery);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists galery;

drop table if exists galery_picture;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists galery_seq;

drop sequence if exists galery_picture_seq;

