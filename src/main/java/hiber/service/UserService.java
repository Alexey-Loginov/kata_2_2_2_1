package hiber.service;

import hiber.model.User;
import hiber.model.Car;

import java.util.List;

public interface UserService {
    void addUser(User user);

    void addCar(Car car);

    List<Car> listCars();

    List<User> listUsers();

    User getUserByCar(String model, int series);
}
