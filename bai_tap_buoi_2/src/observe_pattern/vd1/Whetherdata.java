package observe_pattern.vd1;

import java.util.ArrayList;
import java.util.List;

public class Whetherdata implements Subject {

    private List<Observer> listObserver;
    private float temp;
    private float humidity;
    private float pressure;
    public Whetherdata(){
        this.listObserver = new ArrayList<>();
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    @Override
    public void registerObserver( Observer observer) {
        this.listObserver.add(observer);
    }

    @Override
    public void removeObserver( Observer observer) {
        this.listObserver.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer:listObserver){
            observer.update(temp,humidity,pressure);
        }
    }

    public void measurementsChanged() {
        // Chúng ta thông báo cho các Observer một khi chúng ta đã cập nhật thành công các thông tin từ Weather Station.
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        // Chúng ta có phương thức này để tạm thời có thể thay đổi trạng thái của WeaterData.
        this.temp = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }
}
