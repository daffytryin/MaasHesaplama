Employee Sınıfı

Bu Java programı, fabrika çalışanlarını temsil etmek için "Employee" sınıfını içerir. Sınıf, çalışanların maaşlarını hesaplamak için çeşitli metotlara sahiptir.

Sınıf Nitelikleri

name: Çalışanın adı ve soyadı
salary: Çalışanın maaşı
workHours: Haftalık çalışma saati
hireYear: İşe başlangıç yılı

Sınıf Metotları

Employee(name, salary, workHours, hireYear): Kurucu metot olup 4 parametre alır ve çalışanın bilgilerini alarak bir "Employee" nesnesi oluşturur.
tax(): Maaşa uygulanan vergiyi hesaplar.
Çalışanın maaşı 1000 TL'den az ise vergi uygulanmaz.
Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanır.
bonus(): Fazla çalışma saatlerine göre bonus ücretlerini hesaplar.
Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL bonus verilir.
raiseSalary(): Çalışanın işe başlangıç yılına göre maaş artışını hesaplar.
Şu anki yıl 2021 olarak kabul edilir.
Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılır.
Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılır.
Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılır.
calculateTotalSalary(): Vergi, bonus ve maaş artışını kullanarak çalışanın toplam maaşını hesaplar ve sonuçları ekrana bastırır.
toString(): Çalışana ait bilgileri ekrana bastırmak için kullanılır.
