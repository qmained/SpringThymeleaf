package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.List;

@Component
public interface CarService {
    List<Car> index(int count);
}
