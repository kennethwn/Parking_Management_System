create database parkir_system;
use parkir_system;

# drop database parkir_system;

create table admin_table (
	id_admin varchar(255) primary key not null,
    username varchar(255) not null,
    pass varchar(255) not null
);

create table jenis_kendaraan (
	id_jenis_kendaraan varchar(255) primary key not null,
    tipe_kendaraan varchar(255) not null,
    tarif int not null
);

create table kendaraan(
	nopol varchar(255) primary key not null,
    id_membership  varchar(255) not null,
    id_jenis_kendaraan varchar(255) not null,
    merk varchar(255) not null,
    jam_masuk time not null,
    jam_keluar time default null
);

create table payment(
	id_payment varchar(255) primary key null,
    metode_pembayaran varchar(255) not null
);

create table status_payment(
	id_status_payment varchar(255) primary key not null,
	keterangan varchar(255) not null
);

create table membership(
	id_membership varchar(255) primary key not null,
	status_member varchar(255) not null
);

create table kendaraan_payment(
	id_kendaraan_payment int primary key not null auto_increment,
    nopol varchar(255) not null,
    id_payment varchar(255) not null,
    id_status_payment varchar(255) not null
);

insert into admin_table value
	('admin1', 'adminpark', 'admin12345');
    
insert into jenis_kendaraan value
	('TYPE1', 'Mobil', 5000),
    ('TYPE2', 'Motor', 3000),
    ('TYPE3', 'Truk', 10000),
    ('TYPE4', 'Bus', 12000);
    
insert into membership value
	('1', 'Member'),
    ('0', 'Nonmember');

insert into kendaraan value
	('D l645 UCO', '1', 'TYPE2', 'Honda', "10:00:00", null),
    ('E 1992 ICA', '0', 'TYPE1', 'Avanza', "11:50:00", "13:00:00"),
    ('D 5512 ABD', '1', 'TYPE1', 'Avanza', "10:45:00", null),
    ('E 2231 POW', '1', 'TYPE2', 'Mio', "10:00:00", null),
    ('E 5192 AZZ', '0', 'TYPE2', 'BMW', "07:00:00", "12:00:00"),
    ('F 1945 OF', '0', 'TYPE3', 'Mitsubishi', "08:00:00", null),
    ('B 0706 BCL', '0', 'TYPE4', 'Mercedes Benz', "06:00:00", null);
    
insert into payment value
	('001', 'Cash'),
    ('002', 'Flazz'),
    ('003', 'Member Card');

insert into status_payment value
	('L', 'Lunas'),
    ('BL', 'Belum Lunas');
    
insert into kendaraan_payment (
	nopol,
    id_payment,
    id_status_payment
) value
	('D l645 UCO', '001', 'BL'),
    ('E 1992 ICA', '002', 'L'),
    ('D 5512 ABD', '003', 'BL'),
    ('E 2231 POW', '001', 'BL'),
    ('E 5192 AZZ', '001', 'L'),
    ('F 1945 OF', '001', 'BL'),
    ('B 0706 BCL', '002', 'BL');