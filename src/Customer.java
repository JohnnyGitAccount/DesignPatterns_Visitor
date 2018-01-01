
public abstract class Customer {
    private String mCustomerId;
    private String mName;

    public String getCustomerId() {
        return mCustomerId;
    }

    public void setCustomerId(String mCustomerId) {
        this.mCustomerId = mCustomerId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }
    
    public abstract void accept(Visitor visitor);
}
