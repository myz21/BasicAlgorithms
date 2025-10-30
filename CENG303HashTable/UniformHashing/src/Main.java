import java.util.*;
import java.io.*;
import java.security.KeyStore.TrustedCertificateEntry;

class Node{
    public double key;
    public int value;
    public Node next;

    public Node(double key, int value){
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

class LinkList{
    public Node head;

    public void insert(double key, int value){
        Node newNode = new Node(key,value);
        newNode.next = head;
        head = newNode;
    }

    public Node search(double key){
        Node curr = head;
        while(curr != null){
            if(Double.doubleToRawLongBits(curr.key) == Double.doubleToRawLongBits(key))
                return curr;
            curr = curr.next;
        }
        return null;
    }

    public boolean delete(double key){
        Node curr = head, previous = null;
        
        while(curr != null){
            if(Double.doubleToRawLongBits(curr.key) == Double.doubleToRawLongBits(key)){
                if (previous == null){
                    head = curr.next;
                } else{
                    previous.next = curr.next;
                }
                return true;
            }
            previous = curr;
            curr = curr.next;
        }
        return false;

    }

    public int length(){
        int len = 0;
        Node curr = head;

        while(curr != null){
            len++;
            curr = curr.next;
        }
        return len;
    }
}
class HashTable {
    private LinkList[] table;
    private int M;       // bucket sayısı
    private int size;    // toplam eleman sayısı

    public HashTable(int M) {
        // TODO: M kadar boş LinkList oluştur, size=0 yap
    }

    private int hash(double key) {
        // TODO: Double.doubleToRawLongBits(key) ile bitlere çevir
        // TODO: Bit karıştırma (mixing) stratejisi uygula
        // TODO: Hash değerini [0, M-1] aralığına indir (mod M)
        return 0;
    }

    public void put(double key, int value) {
        // TODO: hash(key) hesapla
        // TODO: O bucket içinde varsa güncelle, yoksa yeni Node ekle
        // TODO: Yeni eleman eklenirse size++ yap
    }

    public Integer get(double key) {
        // TODO: hash(key) hesapla, bucket’ta ara
        // TODO: Bulamazsan null döndür
        return null;
    }

    public boolean remove(double key) {
        // TODO: hash(key) hesapla, bucket’tan sil
        // TODO: Silinirse size-- yap
        return false;
    }

    public double loadFactor() {
        // TODO: size / M olarak döndür
        return 0.0;
    }

    public int maxChainLength() {
        // TODO: En uzun zinciri bul
        return 0;
    }

    public double meanChainLength() {
        // TODO: Ortalama zincir uzunluğunu hesapla
        return 0.0;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        // TODO: HashTable nesnesi oluştur (örneğin M=1000)
        // TODO: Rastgele sayı üretici oluştur (baseSeed=1234)
        // TODO: 3 dağılım (Uniform, Gaussian, Rayleigh veya Triangular) üret
        // TODO: Farklı n değerleri için (10^3, 10^3.5, ... 10^6) test yap

        // === Build-only workload ===
        // TODO: Sadece insert işlemleri yap
        // TODO: Zamanı System.nanoTime() ile ölç

        // === Mixed workload ===
        // TODO: %50 insert, %25 get, %25 remove olacak şekilde işlemleri karıştır

        // === HashMap<Double, Integer> ile karşılaştırma ===
        // TODO: Aynı veri ve seed ile HashMap testini yap
        // TODO: Ortalama süreyi 5 denemede al

        // === CSV çıktısı ===
        // TODO: Sonuçları bir CSV dosyasına ekle
        // TODO: Format:
        // distribution,params,n,workload,impl,avg_time_ns,ops,throughput_ops_per_s,max_chain,mean_chain,load_factor
    }
}
