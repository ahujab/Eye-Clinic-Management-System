
package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.Role.AdminRole;
import Business.Role.DoctorRole;
import Business.Role.PatientRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;


public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        Network net = system.createAndAddNetwork();
        net.setName("MA");
        
        Enterprise e1 = net.getEnterpriseDirectory().createAndAddEnterprise("MA general Hospital" , Enterprise.EnterpriseType.Hospital);
        Employee emp1=e1.getEmployeeDirectory().createEmployee("MA-Admin");
        UserAccount ua1 = e1.getUserAccountDirectory().createUserAccount();
        ua1.setUsername("admin1");
        ua1.setPassword("admin1");
        ua1.setName("MA-admin");
        ua1.setRole(new AdminRole());
        
        Organization organization1 = e1.getOrganizationDirectory().createOrganization(Organization.Type.Doctor);
        organization1.setName("Doctor Department");
        Employee emp11 = organization1.getEmployeeDirectory().createEmployee("Doc1");
        UserAccount ua2 = organization1.getUserAccountDirectory().createUserAccount();
        ua2.setUsername("doc1");
        ua2.setPassword("doc1");
        ua2.setName("doc1");
        ua2.setEmployee(emp11);
        ua2.setRole(new DoctorRole());
        
        Organization organization2 = e1.getOrganizationDirectory().createOrganization(Organization.Type.Patient);
        organization2.setName("Patient Department");
        Patient pat1 = organization2.getPatientDirectory().addPatient("Pat1");
        UserAccount ua3 = organization2.getUserAccountDirectory().createUserAccount();
        ua3.setUsername("pat1");
        ua3.setPassword("pat1");
        ua3.setName("pat1");
        ua3.setPatient(pat1);
        ua3.setRole(new PatientRole());
        
        return system;
    }
    
}
