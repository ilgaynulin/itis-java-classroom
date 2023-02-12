package com.company.nested;

public class Car {
    Engine engine;
    Wheel[] wheels = new Wheel[4];
    Lights[] lights = new Lights[2];

    public Car() {
        this.engine = new Engine();
        wheels[0] = new Wheel();
        wheels[1] = new Wheel();
        wheels[2] = new Wheel();
        wheels[3] = new Wheel();
        lights[0] = new Lights();
        lights[1] = new Lights();
    }

    /**
     * Заводим машину
     */
    public void start() {
        engine.start();
        lights[0].turnOn();
        lights[1].turnOn();
    }

    class Engine {
        public Engine() {
            isOn = false;
        }

        boolean isOn;
        public void start() {
            isOn = true;
            System.out.println("Двигатель запустился");
        }

        public void stop() {
            isOn = false;
            System.out.println("Двигатель выключился");
        }
    }

    class Wheel {
        public void pump() {
            System.out.println("Накачиваем колесо");
        }
    }

    class Lights {
        boolean isOn;

        public Lights() {
            isOn = false;
        }

        public void turnOn() {
            isOn = true;
            System.out.println("Фары включились");
        }
        public void turnOff() {
            isOn = false;
            System.out.println("Фары выключены");
        }
    }
}
