package bitcamp.java100.ch20.ex6;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.config.AbstractFactoryBean;

public class CarFactoryBean extends AbstractFactoryBean<Car> {

    private Tire[] tires;
    private String model;

    public void setModel(String model) {
        this.model = model;
    }

    public void setTires(Tire[] tires) {
        this.tires = tires;
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    protected Car createInstance() throws Exception {
        Car car = null;

        switch (model) {
        case "티코":
            car = createTico();
            break;
        case "티코 골드":
            car = createTicoGold();
            break;
        case "소나타":
            car = createSonata();
            break;
        case "에쿠스":
            car = createEquus();
            break;
        default:
            car = createBasic();
        }

        car.setTires(tires);
        return car;
    }

    private Car createBasic() {
        Car c = new Car();
        Engine engine = new Engine();
        engine.setCc(1500);
        engine.setName("bit_engine");
        engine.setValve(16);
        c.setEngine(engine);

        return c;
    }

    private Car createEquus() {
        Car c = new Car();
        Engine engine = new Engine();
        engine.setCc(3500);
        engine.setName("bit_special_engine");
        engine.setValve(32);
        c.setEngine(engine);

        return c;
    }

    private Car createSonata() {
        Car c = new Car();
        Engine engine = new Engine();
        engine.setCc(1980);
        engine.setName("bit_standard_engine");
        engine.setValve(16);
        c.setEngine(engine);

        return c;
    }

    private Car createTicoGold() {
        Car c = new Car();
        Engine engine = new Engine();
        engine.setCc(900);
        engine.setName("bit_engine");
        engine.setValve(16);
        c.setEngine(engine);

        Map<String, String> options = new HashMap<>();
        options.put("sunroof", "yes");
        options.put("airbag", "yes");
        options.put("blackbox", "yes");
        c.setOptions(options);

        return c;
    }

    private Car createTico() {
        Car c = new Car();
        Engine engine = new Engine();
        engine.setCc(900);
        engine.setName("bit_engine");
        engine.setValve(16);
        c.setEngine(engine);

        return c;
    }

}
