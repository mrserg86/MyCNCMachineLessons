public class LatheMachine extends  CNCMachine{

    public void loadCNC() {
        System.out.println("Загрузка ЧПУ-системы токарной модификации");
    }

    public void startDriversSystem() {
        System.out.println("Запуск системы приводов токарной модификации");
    }

    public void startSpindle() {
        System.out.println("Запуск токарного шпинделя");
    }

    void startExternalSystem() {
        System.out.println("Запуск привода следящего люнета");
    }

}
