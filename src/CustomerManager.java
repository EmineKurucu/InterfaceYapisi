public class CustomerManager {

    private ICustomerDal iCustomerDal;
    public CustomerManager(ICustomerDal customerDal){
        this.iCustomerDal = customerDal;
    }

    public void add(){
        // iş kodları yazılır
        // herhangi bir database'e bağlı kalmamak için ilk yol strateji
        // 2. yol constructor ile
        iCustomerDal.add();

    }
}

