
public class EnterpriseCustomer extends Customer {

    private String mLinkman = null;
    private String mLinkTelephone = null;
    private String mReisterAddress = null;

    public String getLinkman() {
        return mLinkman;
    }

    public void setLinkman(String mLinkman) {
        this.mLinkman = mLinkman;
    }

    public String getLinkTelephone() {
        return mLinkTelephone;
    }

    public void setLinkTelephone(String mLinkTelephone) {
        this.mLinkTelephone = mLinkTelephone;
    }

    public String getReisterAddress() {
        return mReisterAddress;
    }

    public void setReisterAddress(String mReisterAddress) {
        this.mReisterAddress = mReisterAddress;
    }

    @Override
    public void accept(Visitor visitor) {
        if (visitor != null) {
            visitor.visitEnterpriseCustomer(this);
        }
    }

}
