public abstract class CNCMachine {

    final void startMachine() {
        startElectricity();
        loadCNC();
        startCondition();
        startHydroSystem();
        startOilSystem();
        startDriversSystem();
        startSpindle();
        startExternalSystem();
    }

    abstract void loadCNC();

    abstract void startDriversSystem();

    abstract void startSpindle();

    final void startElectricity() {
        System.out.println("Электропитание подано на все системы станка");
    }

    final void startCondition() {
        System.out.println("Включено кондиционирование");
    }

    final void startHydroSystem() {
        System.out.println("Включена гидросистема");
    }

    final void startOilSystem() {
        System.out.println("Включена система обеспечения смазки");
    }

    void startExternalSystem() {};

}
