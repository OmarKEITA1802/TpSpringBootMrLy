package sn.edu.isepdiamniadio.dbe.TpSpring_boot.rest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sn.edu.isepdiamniadio.dbe.TpSpring_boot.Service.RoleService;
import sn.edu.isepdiamniadio.dbe.TpSpring_boot.rest.DTO.RoleDTO;

import java.util.List;

@Controller
@RestController
@RequestMapping("/api/roles")
public class RoleController {
    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    public List<RoleDTO> getRoles(){
        return roleService.getRoles();
    }
}
