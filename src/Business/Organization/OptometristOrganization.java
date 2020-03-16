package Business.Organization;

import Business.Role.OptometristRole;
import Business.Role.Role;
import java.util.ArrayList;


public class OptometristOrganization extends Organization {
    public OptometristOrganization(){
        super(Organization.Type.Optometrist.getValue());
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new OptometristRole());
        return roles;
    }
}
