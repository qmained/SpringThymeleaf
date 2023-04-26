package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.List;

@Component
public interface CarDao {
    public List<Car> index(int count);

}
