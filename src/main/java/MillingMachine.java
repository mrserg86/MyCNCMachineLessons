public class MillingMachine extends CNCMachine{

    public void loadCNC() {
        System.out.println("Загрузка ЧПУ-системы фрезерной модификации");
    }

    public void startDriversSystem() {
        System.out.println("Запуск системы приводов фрезерной модификации");
    }

    public void startSpindle() {
        System.out.println("Запуск фрзереного шпинделя");
    }

    void startExternalSystem() {
        System.out.println("Запуск привода поворотного стола");
    }


}
