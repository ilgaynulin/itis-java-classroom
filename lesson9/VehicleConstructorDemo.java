class Vehicle {
	// данные, fields, поля
	String model; // По умолчанию null
	double gasTankVolume; // 0.0
	int passangers; // 0
	int maxSpeed; // 0
	double avgGasPer100Km; // 0.0
	Date createdDay;

	RussianVehicle(String model, double gasTankVolume, int passangers, int maxSpeed, double avgGasPer100Km) {
		// Могут быть валидации входных данных
		if(passangers < 0) {
			this.passangers = 0;
		} else {
			this.passangers = passangers;
		}
		this.model = model;
		this.gasTankVolume = gasTankVolume;
		this.maxSpeed = maxSpeed;
		this.avgGasPer100Km = avgGasPer100Km;
		// Можно указывать значения по умолчанию
		this.createdDay = new Date();
	}


	double avgDistance(double gasVolume) {
		return gasVolume / avgGasPer100Km * 100;
	}
}

class VehicleConstructorDemo {
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle("VolksWagen multivan", 80, 8, 100, 6);

		double gasVolume = 20;

		System.out.println("Модель автомобиля: " + minivan.model + ", его максимальная скорость: " + minivan.maxSpeed);
		System.out.println("На " + gasVolume + " литров бензина, мы проедем " + minivan.avgDistance(gasVolume) + " км");
	}
}