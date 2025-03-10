# CENG114 HAS-A

Bu proje, **CENG114** dersinde **HAS-A** ilişkisini modelleyen bir Java programı içermektedir. Bu kod, çeşitli **Person** (kişi) ve **Society** (topluluk) nesneleri arasında yapılan kayıtları ve bu nesneler arasındaki ilişkileri simüle etmektedir.

## Proje Özeti

Proje, **Person** (Kişi) sınıfı ile **Society** (Topluluk) sınıfının birbirine bağlı olduğu bir sistem kurar. Kişiler, bir veya daha fazla topluluğa kaydolabilirler ve topluluklar da kendi üyelerini tutar. Kişiler ve topluluklar arasındaki bu ilişki, **Registration** sınıfı ile yönetilmektedir.

### Temel Sınıflar

1. **Person (Kişi)**
   - Kişinin adı, soyadı, doğum yılı ve ölüm yılı gibi temel bilgilerini tutar.
   - Kişiler, bir veya daha fazla topluluğa kaydolabilir.

2. **Society (Topluluk)**
   - Topluluğun adı ve topluluk üyelerinin (kayıtlı kişilerin) listesi bulunur.
   - Topluluklar, üyelerinin listesini tutar.

3. **Registration (Kayıt)**
   - Bu sınıf, bir kişinin bir topluluğa kaydını temsil eder. Kayıt, bir **Person** ile bir **Society** arasındaki ilişkiyi tanımlar.
   
4. **Test (Ana Program)**
   - Bu sınıf, örnek nesneleri oluşturur ve sistemdeki kişilerin ve toplulukların bilgilerini ekrana yazdırır.
   - `seeSocities` ve `seeMembers` gibi metotlar aracılığıyla topluluklar ve kişilere ait bilgiler ekrana basılır.

## Özellikler

- **Kişiler**: Ali, Veli, Figen, Burcu, Mehmet gibi örnek kişiler oluşturulmuştur.
- **Topluluklar**: "Book Lovers" ve "Movie Lovers" gibi topluluklar tanımlanmıştır.
- **Kayıtlar**: Kişiler, çeşitli topluluklara kaydedilmiştir.
- **Çıktılar**: Program çalıştırıldığında:
  - Kişilerin kayıtlı olduğu topluluklar yazdırılır.
  - Her topluluğun üyeleri yazdırılır.

## Kod Açıklamaları

- **Person Sınıfı**: Kişilerin ad, soyad, doğum yılı ve ölüm yılı gibi bilgilerini tutan ve topluluklara kayıt yapan nesneleri tanımlar.
- **Society Sınıfı**: Toplulukların adlarını tutar ve üyelerini kayıtlar üzerinden yönetir.
- **Registration Sınıfı**: Bir kişinin bir topluluğa kaydını tutar. Kişi ile topluluk arasındaki ilişkiyi temsil eder.
- **Test Sınıfı**: Örnek kişiler ve topluluklar oluşturulur, ardından kişilerin kayıtlı oldukları topluluklar ve toplulukların üyeleri yazdırılır.

## Örnek Çıktı

```
Book Lovers
Movie Lovers

Burcu
Veli
Ali

Ali
Mehmet
Burcu
```

### Fonksiyonlar

1. **seeSocities(Person p)**: Bir kişiye ait tüm toplulukları ekrana yazdırır.
2. **seeMembers(Society s)**: Bir topluluğa ait tüm üyeleri ekrana yazdırır.

## Kullanılan Veri Yapıları

- **Array (Dizi)**: `registrations` dizisi, kişilerin ve toplulukların kayıtlarını tutar.
- **String**: Kişilerin adları, soyadları ve toplulukların isimleri gibi metinsel veriler.

## Sınıfların Tanımları

### Person Sınıfı

```java
public class Person {
    String name;
    String surname;
    int birthYear;
    int deathYear;
    Registration[] registrations;
    
    // Constructor, getter, setter metotları vb.
}
```

### Society Sınıfı

```java
public class Society {
    String name;
    Registration[] registrations;
    
    // Constructor, getter, setter metotları vb.
}
```

### Registration Sınıfı

```java
public class Registration {
    Person person;
    Society society;
    
    // Constructor, getter, setter metotları vb.
}
```

### Test Sınıfı

```java
public class Test {
    public static void main(String[] args) {
        // Kişiler ve topluluklar oluşturulur
    }
    
    static void seeSocities(Person p) {
        // Kişinin kayıtlı olduğu topluluklar yazdırılır
    }

    static void seeMembers(Society s) {
        // Topluluğun üyeleri yazdırılır
    }
}
```

## Gereksinimler

Bu program, **Java 8** veya daha yeni bir sürümde çalıştırılabilir. Ayrıca, temel Java dil bilgisi ve nesne yönelimli programlama (OOP) kavramları (sınıflar, nesneler, metotlar, diziler) hakkında bilgi gereklidir.

## Sonuç

Bu proje, **HAS-A** ilişkisini kullanarak, bir kişinin bir veya daha fazla topluluğa ait olabileceğini ve her topluluğun üyelerini tutabileceğini simüle eder. Kişi ve topluluklar arasındaki bu ilişki, **Registration** sınıfı üzerinden yönetilmektedir.


