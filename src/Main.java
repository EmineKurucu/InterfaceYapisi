public class Main {

    public static void main(String[] args) {
        // interfaceler uygulamalarda bağımlılığı yönettiğimiz yapılardan biri
        // interfaceler class kabul edilmez ama referans tutabilirler
        // interfaceler new'lenemez ama onu implement eden class'ın referansını tutabilir
        // Bir class birden fazla interface'i implement edebilir
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();

        CustomerManager customerManager1 = new CustomerManager(new MySqlCustomerDal());
        customerManager1.add();

    }

}