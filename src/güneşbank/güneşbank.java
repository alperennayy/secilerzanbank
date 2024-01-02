package güneşbank;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

public class güneşbank {

    public static void main(String[] args) throws ParseException {

        Date Zaman = new Date();
        System.out.println(Zaman.toString());
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(df.format(Zaman));

        boolean a1 = true;
        Scanner input = new Scanner(System.in);
        Bank account = new Bank();
        Random random = new Random();
        Bank hesaplar = new Bank();
        Bank achistory = new Bank();
        do {
            System.out.println("|------------------------------|");
            System.out.println("|*****SEÇİL ERZAN BANK****|");
            System.out.println("|***HOŞ GELDİNİZ****|");
            System.out.println("|------------------------------|");
            System.out.println("PARANIZ BİZİMLE GÜVENCE ALTINDA 😉");
            System.out.println();
            System.out.println("LUTFEN ISLEM SECINIZ: \n"
                    + "YENI HESAP VE ISLEMLER ICIN [1]\n"
                    + "KAYITLI HESAP VE ISLEMLER ICIN [2] \n"
                    + "GECMIS ISLEMLERI GORMEK ICIN [3] \n"
                    + "CIKIS YAPMAK ICIN [0] TUSLAYINIZ:\n");
            Bank bank = new Bank();

            int sayi = input.nextInt();
            if (sayi == 0) {
                System.out.println("CIKIS YAPILDI");
                break;
            }
            switch (sayi) {
                case 1: {
                 
                    System.out.println("KISA VADELI HESAP ICIN [1]\n"
                            + "UZUN VADELI HESAP ICIN [2]\n"
                            + "VADESIZ HESAP ICIN [3] TUSLAYINIZ\n"
                            + "CIKIS YAPMAK ICIN [0] TUSLAYINIZ\n"
                            + ": ");
                    int islem = input.nextInt();
                    if (islem == 0) {
                        System.out.println("CIKIS YAPILIYOR");
                        a1 = false;
                    }
                    if (islem == 1) {
                        int customerID = (int) (100000 + Math.random() * 999999);// 6 HANELI ID 
                        System.out.println("MUSTERI ID'NIZ : " + customerID);
                        System.out.println();
                        System.out.print("SIFRENIZI GIRINIZ: ");
                        int password = input.nextInt();
                        while (password <= 1000 && password >= 9999) {
                            System.out.println();
                            System.out.println("LÜTFEN SİFRENİZİ EN AZ 4 HANELI GİRİNİZ");
                            password = input.nextInt();
                        }
                        System.out.println();
                        System.out.println("EN AZ 1000 TL İLE İSLEM YAPABİLİRSİNİZ !");
                        System.out.println("");
                        System.out.print("BAKİYENİZİ GİRİNİZ :");
                        int balance = input.nextInt();
                        if (balance >= 1000) {
                            System.out.println();
                            System.out.println("HESABINIZ ONAYLANMISTIR ");
                            System.out.println("HESAP ID 'NIZ: " + customerID);
                            System.out.println("LUTFEN ID'NIZI UNUTMAYIN !");

                            ShortTerm obj = new ShortTerm(balance,customerID, password );
                            hesaplar.account.add(obj);
                            System.out.println();
                            System.out.println("GIRIS BASARILI");
                            while (true) {
                                System.out.println("LUTFEN ISLEM SECINIZ:\n"
                                        + "PARA CEKMEK ICIN [1]\n"
                                        + "PARA YATIRMAK ICIN [2]\n"
                                        + "KAR HESAPLAMA ICIN [3]\n"
                                        + "ANA MENUYE DONMEK ICIN [0] TUSLAYINIZ"
                                        + ": ");

                                int sayi3 = input.nextInt();
                                if (sayi3 == 1) {
                                    System.out.println("Çekmek istediğiniz miktarı giriniz: ");
                                    int DEGER = input.nextInt();

                                    if (obj.getBalance() >= DEGER) { 
                                        hesaplar.withdraw(customerID, DEGER); // PARA ÇEKME İŞLEMİ
                                        System.out.println("Güncel bakiye: " + obj.getBalance() + " TL");

                                    } else { 
                                        System.out.println("Yeterli miktarda bakiye bulunmuyor");
                                    }
                                }
                                if (sayi3 == 2) {
                                    System.out.println("YATIRKMAK ISTEDIGINIZ MIKTARI GIRIN: ");
                                    int DEGER = input.nextInt();

                                    hesaplar.Deposit(customerID, DEGER); 
                                    System.out.println("YENI BAKIYE: " + obj.getBalance() + " TL'DİR");

                                }
                                if (sayi3 == 3) {
                                    System.out.println("GUNLUK KAZANC: " + ((obj.getBalance() * 17) / 36500));
                                    System.out.println();
                                    System.out.println("\nAYLIK KAZANC: " + ((obj.getBalance() * 17) / 1200));
                                    System.out.println();
                                    System.out.println("\nYILLIK KAZANC: " + ((obj.getBalance() * 17) / 100));
                                    System.out.println();
                                }

                                if (sayi3 == 0) {
                                    System.out.println("CIKIS YAPILIYOR:");
                                    a1 = false;
                                    break;
                                }
                            }

                        } else {
                            System.out.println("YETERLI BAKIYENIZ BULUNMAMAKTADIR ");
                        }

                    }
                    if (islem == 2) {

                        int customerID = (int) (100000 + Math.random() * 999999);// 6 HANELI ID 
                        System.out.println("MUSTERI ID'NIZ : " + customerID);
                        System.out.println();
                        System.out.print("SIFRENIZI GIRINIZ: ");
                        int password = input.nextInt();
                        while (password <= 1000 && password >= 9999) {
                            System.out.println();
                            System.out.println("LÜTFEN SİFRENİZİ EN AZ 4 HANELI GİRİNİZ");
                            password = input.nextInt();
                        }
                        System.out.println();
                        System.out.println("EN AZ 1500 TL İLE İSLEM YAPABİLİRSİNİZ !");
                        System.out.println("");
                        System.out.print("BAKIYENIZI GIRINIZ:");
                        int balance = input.nextInt();
                        if (balance >= 1500) {
                            System.out.println();
                            System.out.println("HESABINIZ ONAYLANMISTIR ");
                            System.out.println("HESAP ID 'NIZ: " + customerID);
                            System.out.println("LUTFEN ID'NIZI UNUTMAYIN !");

                            LongTerm obj = new LongTerm( balance,customerID,password);
                            hesaplar.account.add(obj);
                            System.out.println();
                            System.out.println("GIRIS BASARILI");
                            while (true) {
                                System.out.println("LUTFEN ISLEM SECINIZ:\n"
                                        + "PARA CEKMEK ICIN [1]\n"
                                        + "PARA YATIRMAK ICIN [2]\n"
                                        + "KAR HESAPLAMA ICIN [3]\n"
                                        + "ANA MENUYE DONMEK ICIN [0] TUSLAYINIZ"
                                        + ": ");

                                int sayi3 = input.nextInt();
                                if (sayi3 == 1) {
                                    System.out.println("CEKMEK ISTEDIGINIZ MIKTARI GIRIN: ");
                                    int DEGER = input.nextInt();

                                    if (obj.getBalance() >= DEGER) { 
                                        hesaplar.withdraw(customerID, DEGER); 
                                        System.out.println("YENI BAKIYE: " + obj.getBalance() + " TL'DİR");

                                    } else { 
                                        System.out.println("YETERLI BAKIYENIZ YOK !");
                                    }
                                }
                                if (sayi3 == 2) {
                                    System.out.println("YATIRKMAK ISTEDIGINIZ MIKTARI GIRIN: ");
                                    int DEGER = input.nextInt();

                                    hesaplar.Deposit(customerID, DEGER); 
                                    System.out.println("YENI BAKIYE: " + obj.getBalance() + " TL'DİR");

                                }
                                if (sayi3 == 3) {
                                    System.out.println("GUNLUK KAZANC: " + ((obj.getBalance() * 24) / 36500));
                                    System.out.println();
                                    System.out.println("\nAYLIK KAZANC: " + ((obj.getBalance() * 24) / 1200));
                                    System.out.println();
                                    System.out.println("\nYILLIK KAZANC: " + ((obj.getBalance() * 24) / 100));
                                    System.out.println();
                                }

                                if (sayi3 == 0) {
                                    System.out.println("CIKIS YAPILIYOR:");
                                    a1 = false;
                                    break;
                                }
                            }

                        } else {
                            System.out.println("YETERLI BAKIYENIZ BULUNMAMAKTADIR ");
                        }
                    }

                    if (islem == 3) { 
                        int customerID = random.nextInt(999999999); 
                        System.out.println("Hesabınız oluşturuldu. Hesap numaranız: " + customerID);
                        System.out.println();
                        System.out.println("SIFRE OLUSTURUN: ");
                        int password = input.nextInt();
                        while (password <= 1000 && password >= 9999) {
                            System.out.println();
                            System.out.println("LÜTFEN SİFRENİZİ EN AZ 4 HANELI GİRİNİZ");
                            password = input.nextInt();
                        }

                        System.out.println("BAKIYE GIRINIZ: ");
                        int bakiye = input.nextInt();
                        System.out.println("YENI HESAP ID'NIZ: " + customerID);
                        Current hesap3 = new Current(bakiye,customerID, password );
                        hesaplar.account.add(hesap3);
                        achistory.acmovement.add(hesap3);
                        while (true) {
                            System.out.println("\n"
                                    + "PARA CEKMEK İCİN [1]\n"
                                    + "Para yatırma [2]\n"
                                    + "CIKIS YAPMAK ICIN [0]\n"
                                    + ": ");

                            int sayi3 = input.nextInt();
                            if (sayi3 == 1) {
                                System.out.println("CEKMEK ISTEDIGINIZ TUTARI GIRINIZ: ");
                                int DEGER = input.nextInt();

                                if (hesap3.getBalance() >= DEGER) {
                                    hesaplar.withdraw(customerID, DEGER);
                                    System.out.println("Güncel bakiye: " + hesap3.getBalance() + " TL");

                                } else {
                                    System.out.println("YETERLI BAKIYENIZ YOK");
                                }
                            }
                            if (sayi3 == 2) {
                                System.out.println("YATIRMAK ISTEDIGINIZ TUTARI GIRIN: ");
                                int DEGER = input.nextInt();

                                hesaplar.Deposit(customerID, DEGER);
                                System.out.println("YENI BAKIYE: " + hesap3.getBalance());
                            }
                            if(sayi3==0){
                                a1=false;
                                System.out.println("CIKIS YAPILIYOR");
                                break;
                            }
                        }
                    }//
                }
                case 2: {
                    
                    System.out.println("YAPACAĞINIZ İŞLEMİ SEÇİNİZ:\n"
                            + "HESAP NUMARASINA PARA YATIRMA [1]\n"
                            + "HESAP NUMARASINDAN PARA ÇEKME [2]\n"
                            + "AÇILMIŞ OLAN HESAPLARI GÖRME [3]\n"
                            + "CIKIS YAPMAK ICIN [0] TUSLAYINIZ");

                    int sayi4 = input.nextInt();
                    if (sayi4 == 1) {
                        System.out.println("HESAP ID'SI GIRINIZ: ");
                        int customerID = input.nextInt();
                        while (customerID <= 100000 && customerID >= 999999) {
                            System.out.println();
                            System.out.println("LÜTFEN SİFRENİZİ EN AZ 4 HANELI GİRİNİZ");
                            customerID = input.nextInt();
                        }

                        System.out.println("YATIRMAK ISTEDIGINIZ MIKTARI GIRINIZ: ");
                        int cash = input.nextInt();
                        for (int i = 0; i < hesaplar.account.size(); i++) {
                            if (customerID == hesaplar.account.get(i).getCustomerID()) { 
                                hesaplar.Deposit(customerID, cash);
                                System.out.println("Yeni bakiyeniz: " + hesaplar.account.get(i).getBalance());
                                break;
                            } else {
                                System.out.println("BU ID'İ HESABA KAYITLI DEGIL");
                            }
                        }
                    }
                    if (sayi4 == 2) {
                        System.out.println("HESAP ID'Sİ GIRINIZ: ");
                        int customerID = input.nextInt();
                        System.out.println();
                        System.out.println("CEKMEK ISTEDIGINIZ MIKTARI GIRINIZ: ");
                        int cash = input.nextInt();

                        for (Account accountlist : hesaplar.account) {
                            if (customerID == accountlist.getCustomerID()) {
                                
                                hesaplar.withdraw(customerID, cash);
                                System.out.println();
                                System.out.println("YENI BAKIYENIZ: " + accountlist.getBalance() + " TL");
                                break;
                            } else {
                                System.out.println();
                                System.out.println("BU ID'İ HESABA KAYITLI DEGIL");
                            }
                        }

                    }
                    if (sayi4 == 3) {
                        hesaplar.getAccount();
                    }
                    if (sayi4 == 5) {
                        System.out.println();
                        System.out.println("CIKIS YAPILIYOR:");
                        a1 = false;
                        break;
                    }

                   
                }

                case 3: {
                    
                    if (achistory.acmovement.size() > 0) {
                        achistory.showAccount();
                    } else {
                        System.out.println("SON HESAP HAREKETLERİNİ GÖRMEK İÇİN \n");
                        System.out.println("EN AZ 5 HESAP HAREKETİ GEREKLİ:");
                    }
                    break;
                }
                case 0: {
                   
                    System.out.println();
                    System.out.println("CIKIS YAPILDI:");
                    break;
                }
                default: {
                    break;
                }
            }
        } while (a1);
    }
}