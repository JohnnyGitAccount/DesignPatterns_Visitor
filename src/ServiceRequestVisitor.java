
public class ServiceRequestVisitor implements Visitor {

    @Override
    public void visitEnterpriseCustomer(EnterpriseCustomer enterpriseCustomer) {
        if (enterpriseCustomer == null) {
            return;
        }
        System.out.println(enterpriseCustomer.getName() + "企业提出服务要求");
    }

    @Override
    public void visitPersonalCustomer(PersonalCustomer personalCustomer) {
        if (personalCustomer == null) {
            return;
        }
        System.out.println(personalCustomer.getName() + "个人客户提出服务要求");
    }

}
