
public class PersonalCustomer extends Customer {

    private String mTelephone = null;
    private int mAge;

    public String getTelephone() {
        return mTelephone;
    }

    public void setTelephone(String mTelephone) {
        this.mTelephone = mTelephone;
    }

    public int getAge() {
        return mAge;
    }

    public void setAge(int mAge) {
        this.mAge = mAge;
    }

    @Override
    public void accept(Visitor visitor) {
        if (visitor != null) {
            visitor.visitPersonalCustomer(this);
        }
    }
}
