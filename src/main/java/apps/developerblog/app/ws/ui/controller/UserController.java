package apps.developerblog.app.ws.ui.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping
    public String getUser(){
        return "get user requested";
    }

    @PostMapping
    public String createUser(){
        return "create user requested";
    }

    @PutMapping
    public String updateUser(){
        return "update user requested";
    }

    @DeleteMapping
    public String deleteUser(){
        return "delete user requested";
    }
}
