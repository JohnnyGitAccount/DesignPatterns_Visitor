
public class Main {

    public static void main(String[] args) {
        EnterpriseCustomer enterpriseCustomerA = new EnterpriseCustomer();
        enterpriseCustomerA.setName("腾讯");
        EnterpriseCustomer enterpriseCustomerB = new EnterpriseCustomer();
        enterpriseCustomerB.setName("阿里巴巴");

        PersonalCustomer personalCustomerA = new PersonalCustomer();
        personalCustomerA.setName("马化腾");
        PersonalCustomer personalCustomerB = new PersonalCustomer();
        personalCustomerB.setName("马云");

        ObjectStructure.addCustomer(enterpriseCustomerA);
        ObjectStructure.addCustomer(enterpriseCustomerB);
        ObjectStructure.addCustomer(personalCustomerA);
        ObjectStructure.addCustomer(personalCustomerB);

        ServiceRequestVisitor serviceRequestVisitor = new ServiceRequestVisitor();
        ObjectStructure.handlerRequest(serviceRequestVisitor);

        PredilectionAnalyzeVisitor predilectionAnalyzeVisitor = new PredilectionAnalyzeVisitor();
        ObjectStructure.handlerRequest(predilectionAnalyzeVisitor);
    }
}
