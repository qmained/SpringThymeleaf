package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.List;

@Component
public interface CarDao {
    List<Car> index(int count);

}
