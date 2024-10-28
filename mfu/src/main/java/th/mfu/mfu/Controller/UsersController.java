package th.mfu.mfu.Controller;

import th.mfu.mfu.domain.*;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import th.mfu.mfu.Repository.UserRepository;

@RestController
public class UsersController {

    @Autowired
    private UserRepository userrepo;

    @GetMapping("/getAllUsers")
    public ResponseEntity<List<Users>> getAllUsers() {
        return new ResponseEntity<List<Users>>(userrepo.findAll(), HttpStatus.OK);
    }

    @GetMapping("/getAllUsers/{id}")
    public ResponseEntity<Users> getUsersById(@PathVariable Long id) {
        Optional<Users> userdata = userrepo.findById(id);

        if (userdata.isPresent()) {
            return new ResponseEntity<Users>(userdata.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/addUser")
    public ResponseEntity<?> addUsers(@RequestBody Users users) {
        if (users.getUser_name() == null || users.getUser_name().isEmpty()) {
            return new ResponseEntity<>("user_name cannot be null", HttpStatus.BAD_REQUEST);
        }
        Users usersObj = userrepo.save(users);
        return new ResponseEntity<>(usersObj, HttpStatus.OK);
    }

    @PostMapping("/updateUsersByid/{id}")
    public ResponseEntity<Users> UpdateUsersById(@PathVariable Long id, @RequestBody Users newUsersData) {
        Optional<Users> Olduserdata = userrepo.findById(id);

        if (Olduserdata.isPresent()) {
            Users updateusersdata = Olduserdata.get();
            updateusersdata.setUser_name(newUsersData.getUser_name());
            updateusersdata.setUser_mail(newUsersData.getUser_mail());
            updateusersdata.setUser_phone(newUsersData.getUser_phone());

            Users usersobj = userrepo.save(updateusersdata);

            return new ResponseEntity<>(usersobj,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/deleteByid/{id}")
    public ResponseEntity<HttpStatus> DeleteUserById(@PathVariable Long id) {
        userrepo.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
