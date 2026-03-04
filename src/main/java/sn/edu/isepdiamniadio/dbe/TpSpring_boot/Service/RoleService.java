package sn.edu.isepdiamniadio.dbe.TpSpring_boot.Service;

import org.springframework.stereotype.Service;
import sn.edu.isepdiamniadio.dbe.TpSpring_boot.Entite.Role;
import sn.edu.isepdiamniadio.dbe.TpSpring_boot.Ripository.RoleRipository;
import sn.edu.isepdiamniadio.dbe.TpSpring_boot.rest.DTO.RoleDTO;
import java.util.ArrayList;
import java.util.List;


@Service
public class RoleService {

    private final RoleRipository roleRipository;

    public RoleService(RoleRipository roleRipository) {
        this.roleRipository = roleRipository;
    }

    public List<RoleDTO> getRoles() {
        List<Role> listRoles = roleRipository.findAll();
        List<RoleDTO> listRoleDTOs = new ArrayList<>();
        for (Role role : listRoles) {
            RoleDTO dto = new RoleDTO();
            dto.setNom(role.getNomRole());
            dto.setUtilisateurs(role.getUtilisateurs());
            listRoleDTOs.add(dto);
        }
        return listRoleDTOs;
    }


}
