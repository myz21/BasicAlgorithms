# CENG114 HAS-A 2

Bu proje, bir **Car (Araba)** ve **Engine (Motor)** sınıflarını kullanarak nesne yönelimli programlamanın temel özelliklerini uygulayan basit bir Java uygulamasıdır. Projede, araba nesnesi ve motor nesnesi arasındaki ilişkiyi (HAS-A) modellemekteyiz. Bu, **Motor** nesnesinin **Araba** nesnesine ait olduğunu temsil eder.

## Proje Özeti

Bu program, **Car** ve **Engine** sınıflarını kullanarak bir arabanın motoruyla birlikte bilgilerini ekrana yazdıran bir sistemdir. **Car** sınıfı, bir **Engine** nesnesine sahip (HAS-A ilişkisi) ve motor bilgilerini arabaya entegre etmiştir.

### Temel Sınıflar

1. **Engine (Motor)**:
   - Bir motorun güç (beygir gücü) ve tipi (örneğin, sedan tipi) gibi özelliklerini tutar.

2. **Car (Araba)**:
   - Bir arabanın marka, model gibi bilgilerini tutar.
   - Bir **Engine** nesnesiyle ilişkili olduğu için arabanın motor bilgilerine de sahiptir.
   
3. **Main**:
   - Uygulamanın ana sınıfıdır ve araba ile motor nesnelerini oluşturup bilgilerini ekrana yazdırır.

## Özellikler

- **Motor**: Motor, güç (beygir gücü) ve tipi gibi bilgileri içerir.
- **Araba**: Araba markası, modeli ve motoru ile ilişkilidir. Arabaya ait tüm bilgileri yazdırabiliriz.

## Kod Açıklamaları

- **Engine Sınıfı**: Motorun beygir gücü ve tipi gibi bilgileri tutar. Bu sınıf bir arabaya ait motoru temsil eder.
  
- **Car Sınıfı**: Araba markası, modeli ve arabaya ait motor bilgilerini tutar. Motor nesnesi, arabanın özelliklerini tamamlar.

- **Main Sınıfı**: Ana sınıf olup, burada bir **Engine** nesnesi oluşturulup, bir **Car** nesnesine motor eklenir ve arabanın tüm bilgileri yazdırılır.

## Örnek Çıktı

Program çalıştırıldığında şu şekilde bir çıktı üretir:

```
Car Info:
Brand: Opel
Model: Astra
Engine Power: 140 HP
Engine Type: sedan
```

### Sınıfların Tanımları

#### Engine Sınıfı

```java
public class Engine {
    int power;  // Motor gücü (beygir gücü)
    String type;  // Motor tipi (örneğin, sedan)

    // Constructor
    public Engine(int power, String type) {
        this.power = power;
        this.type = type;
    }

    // Getter metodları
    public int getPower() {
        return power;
    }

    public String getType() {
        return type;
    }
}
```

#### Car Sınıfı

```java
public class Car {
    String brand;  // Araba markası
    String model;  // Araba modeli
    Engine engine;  // Araba motoru (HAS-A ilişkisi)

    // Constructor
    public Car(String brand, String model, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    // Araba bilgilerini yazdıran metod
    public void printCarInfo() {
        System.out.println("Car Info:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Engine Power: " + engine.getPower() + " HP");
        System.out.println("Engine Type: " + engine.getType());
    }
}
```

#### Main Sınıfı

```java
public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(140, "sedan");  // Motor nesnesi oluşturulur
        Car car = new Car("Opel", "Astra", engine);  // Araba nesnesi, motorla ilişkilendirilir

        car.printCarInfo();  // Araba bilgileri yazdırılır
    }
}
```

## Gereksinimler

Bu program, **Java 8** veya daha yeni bir sürümde çalıştırılabilir. Ayrıca, temel Java dil bilgisi ve nesne yönelimli programlama (OOP) kavramları (sınıflar, nesneler, metotlar, constructor'lar) hakkında bilgi gereklidir.

## Sonuç

Bu proje, nesne yönelimli programlamanın temel özelliklerini kullanarak araba ve motor arasındaki **HAS-A** ilişkisinin nasıl modellenebileceğini göstermektedir. Araba nesnesi, motor nesnesini içerir ve motor bilgileri araba bilgileriyle birlikte yazdırılır. Bu örnek, basit bir araç ve motor ilişkisini simüle eder.
