package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImp;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private CarDao carDao = new CarDaoImp();

    @Override
    public List<Car> getCarList(int count) {
        return carDao.getCarList(count);
    }
}
