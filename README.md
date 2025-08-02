
# 📚 Java Mini Projeler Özeti

Bu depo, Java programlama diliyle geliştirilmiş çeşitli temel projeleri içerir.  
Projeler; çoklu iş parçacığı yönetimi, generic yapılar, dosya işlemleri ve nesne yönelimli programlama gibi konuları kapsar.

---

## 1️⃣ Banka Hesabı Takibi (Thread Senkronizasyonu)

- Çoklu kullanıcıların aynı banka hesabından eş zamanlı para çekmesini simüle eder.  
- `synchronized` metodu ile veri tutarlılığı sağlanır.  
- Thread kullanılarak işlemler paralel yapılır.

---

## 2️⃣ Generic Liste Yöneticisi (`MyListManager<T>`)

- Java `ArrayList` yapısını generic olarak kullanır.  
- Farklı veri tiplerinde liste oluşturup yönetmeye imkan verir.  
- Listeye eleman ekleme, tüm listeyi ve ilk elemanı yazdırma fonksiyonları vardır.

---

## 3️⃣ Not Defteri Uygulaması

- Konsol tabanlı not alma ve okuma uygulamasıdır.  
- Kullanıcının notları `notlar.txt` dosyasına kaydedilir.  
- Dosya okuma/yazma işlemleri yapılır.

---

## 4️⃣ Öğrenci Bilgi Sistemi

- Öğrenci adı ve soyadı konsoldan alınarak `ogrenci.txt` dosyasına kaydedilir.  
- Kayıtlı öğrenciler listelenir.  
- Basit dosya tabanlı veri yönetimi örneğidir.

---

## 5️⃣ Kişi Bilgisi Formatlama

- `Kisi` sınıfı ile kişi bilgileri tutulur (ad, soyad, yaş).  
- `KisiFormatter` sınıfı, kişi bilgilerini okunabilir `String` olarak formatlar.  
- Yaşa göre yetişkinlik durumu belirtilir.

---

## 6️⃣ Basit Thread Örneği (`CustomThread`)

- Java `Thread` sınıfı genişletilerek özel bir thread oluşturulur.  
- Thread kendi ismi ve sistem thread adıyla 3 kez mesaj yazdırır.  
- `Thread.sleep()` kullanılarak gecikme sağlanır.

---

## 7️⃣ Senkronize Banka Hesabı İşlemleri

- Başka bir thread senkronizasyon örneğidir.  
- Aynı banka hesabından para çekme işlemlerinde veri bütünlüğü korunur.  
- İşlemler thread olarak yapılır ve yetersiz bakiye durumları kontrol edilir.
