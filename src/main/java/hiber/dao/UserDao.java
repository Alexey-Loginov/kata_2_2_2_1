package hiber.dao;

import hiber.model.User;
import hiber.model.Car;

import java.util.List;

public interface UserDao {
   void addUser(User user);

   void addCar(Car car);

   List<User> listUsers();

   List<Car> listCars();

   User getUserByCar(String model, int series);
}
