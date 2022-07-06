package Gun32._02_Ornek;

public class Soru {
    // bir yetkilendirme modulu yapilmasi isteniyor
    // User rolu : ADMIN, MUDUR, SATIS, PERSONEL
    // User statusu: AKTIF, PASIF
    // yukaridaki sekilde bir user class i tanimlayiniz
    // farkli yetki ve statude 2 kullanici ve bir de admin
    // kullanicisi tanimlayiniz. Admin yetkili kullaniciya SILME islemi kontrolu yapiniz bir method icin

    public static void main(String[] args) {
        User user1 = new User("ismet",Status.AKTIF,Role.ADMIN);
        User user2 = new User("mehmet",Status.AKTIF,Role.PERSONEL);
        User user3 = new User("ayse",Status.PASIF,Role.MUDUR);

        UserSil(user1);

    }
    public static void UserSil (User user){
        if (user.role == Role.ADMIN){
            System.out.println("Admin silinemez");
        }

    }

}
