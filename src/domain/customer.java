package domain;

public class customer {


    public void setID(int ID) {
        if (ID > 0) {
            this.ID = ID;
        }

    }

    private int ID;

    public void setNew(boolean isNew) {
        this.isNew = isNew;

    }


    private boolean isNew;

    public void setTotal(float total) {
        if (total > 0) {
            this.total = total;
        }

    }

    private float total;

    public customer() {
        ID = 1;
        isNew = true;
        total = 1000;
    }

    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + ID);
        System.out.println("New customer: " + isNew);
        System.out.println("Total purchases are: " + total);

    }


}
