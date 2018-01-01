
public class PredilectionAnalyzeVisitor implements Visitor {

    @Override
    public void visitEnterpriseCustomer(EnterpriseCustomer enterpriseCustomer) {
        if (enterpriseCustomer == null) {
            return;
        }
        System.out.println("对企业客户" + enterpriseCustomer.getName() + "进行产品偏好分析");
    }

    @Override
    public void visitPersonalCustomer(PersonalCustomer personalCustomer) {
        if (personalCustomer == null) {
            return;
        }
        System.out.println("对个人客户" + personalCustomer.getName() + "进行产品偏好分析");
    }
}
