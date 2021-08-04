package zuul.auth.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zuul.auth.payload.UserSumary;
import zuul.auth.repository.UserRepository;
import zuul.auth.security.CurrentUser;
import zuul.auth.security.UserPrincipal;

@RestController
@RequestMapping
public class UserController {
    @Autowired
    private UserRepository userRepository;

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/user/me")
    @PreAuthorize("hasRole('ROLE_USER')")
    public UserSumary getCurrentUser(@CurrentUser UserPrincipal currentUser) {
        UserSumary userSumary = new UserSumary(currentUser.getId(), currentUser.getUsername(), currentUser.getName());
        return userSumary;
    }

}
