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