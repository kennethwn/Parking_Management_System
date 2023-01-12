USE parkir_system;

-- Query uji
-- Uji 1
SELECT 
	kendaraan.nopol as Nomor_Polisi,
    tipe_kendaraan as Tipe,
    status_member as Status_Member,
    metode_pembayaran as Metode,
    concat("Rp",tarif) as Tarif,
    keterangan as Status_Payment
FROM kendaraan_payment
inner join kendaraan on kendaraan_payment.nopol = kendaraan.nopol
inner join membership on kendaraan.id_membership = membership.id_membership
inner join jenis_kendaraan on kendaraan.id_jenis_kendaraan = jenis_kendaraan.id_jenis_kendaraan
inner join payment on kendaraan_payment.id_payment = payment.id_payment
inner join status_payment on kendaraan_payment.id_status_payment = status_payment.id_status_payment;


-- uji 2
update kendaraan_payment
set id_status_payment = 'L'
where nopol = 'D 5512 ABD';

update kendaraan
set jam_keluar = "15:00:00"
where nopol = 'D 5512 ABD';

SELECT 
	kendaraan.nopol as Nomor_Polisi,
    tipe_kendaraan as Tipe,
    status_member as Status_Member,
    metode_pembayaran as Metode,
    concat("Rp",tarif) as Tarif,
    keterangan as Status_Payment
FROM kendaraan_payment
inner join kendaraan on kendaraan_payment.nopol = kendaraan.nopol
inner join membership on kendaraan.id_membership = membership.id_membership
inner join jenis_kendaraan on kendaraan.id_jenis_kendaraan = jenis_kendaraan.id_jenis_kendaraan
inner join payment on kendaraan_payment.id_payment = payment.id_payment
inner join status_payment on kendaraan_payment.id_status_payment = status_payment.id_status_payment
where keterangan IN ("Lunas");

-- uji 3
SELECT 
	kendaraan.nopol as No_Polisi,
    tipe_kendaraan as Tipe,
    merk as Merk,
    jam_masuk as Jam_Masuk
FROM kendaraan_payment
inner join kendaraan on kendaraan_payment.nopol = kendaraan.nopol
inner join membership on kendaraan.id_membership = membership.id_membership
inner join jenis_kendaraan on kendaraan.id_jenis_kendaraan = jenis_kendaraan.id_jenis_kendaraan
inner join payment on kendaraan_payment.id_payment = payment.id_payment
inner join status_payment on kendaraan_payment.id_status_payment = status_payment.id_status_payment
where kendaraan.jam_keluar is null AND status_payment.id_status_payment = 'BL';

-- uji 4
SELECT
	COUNT(kendaraan.nopol) as Mobil_Parkir
FROM kendaraan_payment
inner join kendaraan on kendaraan_payment.nopol = kendaraan.nopol
inner join jenis_kendaraan on kendaraan.id_jenis_kendaraan = jenis_kendaraan.id_jenis_kendaraan
inner join status_payment on kendaraan_payment.id_status_payment = status_payment.id_status_payment
where tipe_kendaraan = 'Mobil' AND (jam_keluar is null AND status_payment.id_status_payment = 'BL');

-- uji 5
SELECT
	50 - COUNT(kendaraan.nopol) as Mobil_Kosong
FROM kendaraan_payment
inner join kendaraan on kendaraan_payment.nopol = kendaraan.nopol
inner join jenis_kendaraan on kendaraan.id_jenis_kendaraan = jenis_kendaraan.id_jenis_kendaraan
inner join status_payment on kendaraan_payment.id_status_payment = status_payment.id_status_payment
where tipe_kendaraan = 'Mobil' AND (jam_keluar is null AND status_payment.id_status_payment = 'BL');

-- uji 6
SELECT
	COUNT(kendaraan.nopol) as Motor_Parkir
FROM kendaraan_payment
inner join kendaraan on kendaraan_payment.nopol = kendaraan.nopol
inner join jenis_kendaraan on kendaraan.id_jenis_kendaraan = jenis_kendaraan.id_jenis_kendaraan
inner join status_payment on kendaraan_payment.id_status_payment = status_payment.id_status_payment
where tipe_kendaraan = 'Motor' AND (jam_keluar is null AND status_payment.id_status_payment = 'BL');

-- uji 7
SELECT
	100 - COUNT(kendaraan.nopol) as Motor_Kosong
FROM kendaraan_payment
inner join kendaraan on kendaraan_payment.nopol = kendaraan.nopol
inner join jenis_kendaraan on kendaraan.id_jenis_kendaraan = jenis_kendaraan.id_jenis_kendaraan
inner join status_payment on kendaraan_payment.id_status_payment = status_payment.id_status_payment
where tipe_kendaraan = 'Motor' AND (jam_keluar is null AND status_payment.id_status_payment = 'BL');

-- uji 8
SELECT
	COUNT(kendaraan.nopol) as Truk_Parkir
FROM kendaraan_payment
inner join kendaraan on kendaraan_payment.nopol = kendaraan.nopol
inner join jenis_kendaraan on kendaraan.id_jenis_kendaraan = jenis_kendaraan.id_jenis_kendaraan
inner join status_payment on kendaraan_payment.id_status_payment = status_payment.id_status_payment
where tipe_kendaraan = 'Truk' AND (jam_keluar is null AND status_payment.id_status_payment = 'BL');

-- uji 9
SELECT
	10 - COUNT(kendaraan.nopol) as Truk_Kosong
FROM kendaraan_payment
inner join kendaraan on kendaraan_payment.nopol = kendaraan.nopol
inner join jenis_kendaraan on kendaraan.id_jenis_kendaraan = jenis_kendaraan.id_jenis_kendaraan
inner join status_payment on kendaraan_payment.id_status_payment = status_payment.id_status_payment
where tipe_kendaraan = 'Truk' AND (jam_keluar is null AND status_payment.id_status_payment = 'BL');

-- uji 10
SELECT
	COUNT(kendaraan.nopol) as Bus_Parkir
FROM kendaraan_payment
inner join kendaraan on kendaraan_payment.nopol = kendaraan.nopol
inner join jenis_kendaraan on kendaraan.id_jenis_kendaraan = jenis_kendaraan.id_jenis_kendaraan
inner join status_payment on kendaraan_payment.id_status_payment = status_payment.id_status_payment
where tipe_kendaraan = 'Bus' AND (jam_keluar is null AND status_payment.id_status_payment = 'BL');

-- uji 11
SELECT
	5 - COUNT(kendaraan.nopol) as Bus_Kosong
FROM kendaraan_payment
inner join kendaraan on kendaraan_payment.nopol = kendaraan.nopol
inner join jenis_kendaraan on kendaraan.id_jenis_kendaraan = jenis_kendaraan.id_jenis_kendaraan
inner join status_payment on kendaraan_payment.id_status_payment = status_payment.id_status_payment
where tipe_kendaraan = 'Bus' AND (jam_keluar is null AND status_payment.id_status_payment = 'BL');

-- uji 12
SELECT
	COUNT(kendaraan.nopol) as Lainnya
FROM kendaraan_payment
inner join kendaraan on kendaraan_payment.nopol = kendaraan.nopol
inner join jenis_kendaraan on kendaraan.id_jenis_kendaraan = jenis_kendaraan.id_jenis_kendaraan
inner join status_payment on kendaraan_payment.id_status_payment = status_payment.id_status_payment
where tipe_kendaraan IN ('Bus', 'Truk') AND (jam_keluar is null AND status_payment.id_status_payment = 'BL');

-- uji 13
SELECT 
	kendaraan.nopol as No_Polisi,
    tipe_kendaraan as Tipe,
    merk as Merk,
    jam_masuk as Jam_Masuk,
    jam_keluar as Jam_Keluar
FROM kendaraan_payment
inner join kendaraan on kendaraan_payment.nopol = kendaraan.nopol
inner join membership on kendaraan.id_membership = membership.id_membership
inner join jenis_kendaraan on kendaraan.id_jenis_kendaraan = jenis_kendaraan.id_jenis_kendaraan
inner join payment on kendaraan_payment.id_payment = payment.id_payment
inner join status_payment on kendaraan_payment.id_status_payment = status_payment.id_status_payment
where jam_keluar is not null AND status_payment.id_status_payment = 'L';