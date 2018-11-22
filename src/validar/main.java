package validar;

public class main {
    
    public static void main(String[] args) {
        XMLManagement teste = new XMLManagement("CompanyData.xml","CompanyData.xsd");
        teste.validate(true);
    }
    
}
