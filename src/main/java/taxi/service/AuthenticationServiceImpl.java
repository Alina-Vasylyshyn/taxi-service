package taxi.service;

import java.util.Optional;
import taxi.exception.AuthenticationException;
import taxi.lib.Injector;
import taxi.lib.Service;
import taxi.model.Driver;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private static final Injector injector = Injector.getInstance("taxi");
    private DriverService driverService =
            (DriverService) injector.getInstance(DriverService.class);

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        Optional<Driver> driverWithInputLogin = driverService.findByLogin(login);
        if (driverWithInputLogin.isPresent() && driverWithInputLogin.get()
                .getPassword().equals(password)) {
            return driverWithInputLogin.get();
        }
        throw new AuthenticationException("Username or password is incorrect");
    }
}
