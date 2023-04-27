package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.List;

@Service
public interface CarService {
    List<Car> getCarList(int count);
}
