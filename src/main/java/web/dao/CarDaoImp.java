package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImp implements CarDao {
    private long carCount;
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car(++carCount, "model", 123, "qmained"));
        cars.add(new Car(++carCount, "NewModel", 345, "randomOwner"));
        cars.add(new Car(++carCount, "OldModel", 111, "AnotherRandomOwner"));
    }

    public List<Car> getCarList(int count) {
        return count < 5 ? cars.stream().limit(count).collect(Collectors.toList()) : cars;
    }


}
