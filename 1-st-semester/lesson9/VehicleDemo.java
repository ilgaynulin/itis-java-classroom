class Vehicle {
	// данные, fields, поля
	String model; // По умолчанию null
	double gasTankVolume; // 0.0
	int passangers; // 0
	int maxSpeed; // 0
	double avgGasPer100Km; // 0.0

	// Vehicle(String modelName, int maxSpeed) {
	// 	model = modelName;
	// 	this.maxSpeed = maxSpeed;
	// }

	Vehicle(String model, int passangers, int maxSpeed, double avgGasPer100Km) {
		this.model = model;
		this.maxSpeed = maxSpeed;
	}

	double avgDistance(double gasVolume) {
		return gasVolume / avgGasPer100Km * 100;
	}
}

class VehicleDemo {
	public static void main(String[] args) {
		Vehicle minivan;			// переменная которая может хранить ссылку на объект класса Vehicle
		minivan = new Vehicle(); 
		minivan.model = "VolksWagen multivan";
		minivan.gasTankVolume = 80;
		minivan.passangers = 8;
		minivan.maxSpeed = 100;
		minivan.avgGasPer100Km = 6;

		Vehicle sportCar = new Vehicle();
		sportCar.model = "Buggati";
		sportCar.gasTankVolume = 80;
		sportCar.passangers = 2;
		sportCar.maxSpeed = 300;
		sportCar.avgGasPer100Km = 12;

		double gasVolume = 15;

		System.out.println("Модель автомобиля: " + minivan.model + ", его максимальная скорость: " + minivan.maxSpeed);
		System.out.println("На " + gasVolume + " литров бензина, мы проедем " + minivan.avgDistance(gasVolume) + " км");


		System.out.println("Модель автомобиля: " + sportCar.model + ", его максимальная скорость: " + sportCar.maxSpeed);
		System.out.println("На " + gasVolume + " литров бензина, мы проедем " + sportCar.avgDistance(gasVolume) + " км");
	
		Vehicle car = new Vehicle("Kia Rio", 200);
		System.out.println("Модель автомобиля: " + minivan.model + ", его максимальная скорость: " + minivan.maxSpeed);
	}
}