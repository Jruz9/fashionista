-- CREATE SCHEMA `fashionista` ;
CREATE SCHEMA  if not  exists `fashionista` ;
    id int auto_increment,
    name varchar(255) not null default '',
    type varchar (255) not null,
    color varchar(255) default '',
    pattern varchar(255) default '' ,
    material varchar(255) default '',
    size int default 0,
    primary key (id)
    );

create table if not exists Looks(
    lookid  int auto_increment,
    lookname varchar(255) not null,
    clothes int references Cloths(id),
    primary key (lookid)
    );


create table if not exists Collections(
    collectionid int auto_increment,
    collectionname varchar(255) not null,
    look int  references  Looks(lookid),
    primary key(collectionid)

    );

create table if not exists User(
    id int auto_increment,
    email varchar(255) not null,
    password varchar(255) not null,
    description varchar (255) default  '',
    status enum("inactive","active") not null default 'inactive',
    cloths int references Cloths(id),
    collection int references Collections(collectionid),
    primary key(id)
    );
